package com.ecsolutions.soaClient;

/**
 * Created by tim on 2017/7/17.
 */

import com.ecsolutions.common.CinfigInfo;
import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ta.workflow.wcf.WorkflowStub;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import org.apache.log4j.Logger;

import org.json.simple.*;
import org.json.simple.parser.*;

@Component
public class WorkFlowServiceManager {

    private static Logger logger = Logger
            .getLogger(WorkFlowServiceManager.class);

    private String workflowWebServiceAddress;

    @Autowired
    private CinfigInfo baseConfig;

    // 5.LockWorkItemResponse
    public  HashMap<String, Object> lockWorkItem(String userName,
                                                       int taskStepId, int currentState, int newState,String roleName) {
        HashMap<String, Object> hRet = new HashMap();

        hRet.put("isSuc", "false");
        boolean bRet = false;

        WorkflowStub wfsstub;
        try {
            workflowWebServiceAddress=baseConfig.getWorkFlowUrl();
            wfsstub = new WorkflowStub(workflowWebServiceAddress);
            WorkflowStub.LockWorkItem gwcf = new WorkflowStub.LockWorkItem();
            // 这里对调用前代理对像赋值
            gwcf.setUserName(userName);
            gwcf.setTaskStepId(taskStepId);
            gwcf.setCurrentState(currentState);

            gwcf.setRoleName(roleName);

            gwcf.setNewState(newState);

            try {
                WorkflowStub.LockWorkItemResponse ret;

                ret = wfsstub.lockWorkItem(gwcf).get_return();
                if (ret.getReturnResult()) {
                    hRet.put("isSuc", "true");
                    //hRet.put("dataObj", ret);
                } else {
                    logger.error("[lockWorkItem][ERR]" + ret.getErrorMessage());
                    hRet.put("errMsg", ret.getErrorMessage());
                }
                return hRet;
            } catch (RemoteException e) {
                e.printStackTrace();
                logger.error("[lockWorkItem][ERR]" + e.getMessage());
                hRet.put("errMsg", e.getMessage());
            }

        } catch (AxisFault e) {
            e.printStackTrace();
            logger.error("[lockWorkItem][ERR]" + e.getMessage());
            hRet.put("errMsg", e.getMessage());
        }

        return hRet;

    }


    // 1.启动工作流
    public String StartWorkflow(String jsonStr) {

        HashMap<String, Object> hRet;
        Object dataObj;
        String isSuc = "";
        String errMsg = "";

        String sRet = "";
        JSONObject jObj;
        logger.debug("start work flow data:["+jsonStr+"]");
        try {
            // To do : 这里从request中获取param1,param2
            WorkflowStub.StartWorkFlowInfo param1 = new WorkflowStub.StartWorkFlowInfo();
//			KeyValueVariable[] param2 = new KeyValueVariable[]{};
            ArrayList<WorkflowStub.KeyValueVariable> lst=new ArrayList<WorkflowStub.KeyValueVariable>();

            String strUserName = "";
            String strRoleName = "";
            String strTaskName = "";
            String strDescription = "";
            String templateName = "";


            JSONParser parser = new JSONParser();
            StringReader read=new StringReader(jsonStr);
            JSONObject jsonData = (JSONObject) parser.parse(read);

            /*
            templateName =  _requestHTTPObject.getParameter("TemplateName");

            strUserName =  _requestHTTPObject.getParameter("SysUSERID");

            strDescription = (String) _requestHTTPObject
                    .getParameter("TaskDesc");

            strTaskName =  _requestHTTPObject.getParameter("TaskName");
            */
            templateName = (String)jsonData.get("TemplateName");

            strUserName =  (String)jsonData.get("USERID");

            strDescription = (String)jsonData.get("TaskDesc");

            strTaskName = (String)jsonData.get("TaskName");



            if(strRoleName==null || strRoleName.equals(""))
                strRoleName = "role1";

            if(strUserName==null || strUserName.equals(""))
                strUserName="1";

            strRoleName=this.getUserRole(strUserName);
            param1.setTemplateName(templateName);
            param1.setDescription(strDescription);
            param1.setUserName(strUserName);
            param1.setTaskName(strTaskName);
            param1.setRoleName(strRoleName);


            // 获取模板的参数列表
            hRet = this.getTemplateVariables(templateName,strUserName,strRoleName);

            isSuc = (String) hRet.get("isSuc");

            if (isSuc.equals("true")) {
                dataObj = hRet.get("dataObj");
                WorkflowStub.GlobalVariable[] paramList = ((WorkflowStub.GetTemplateVariablesResponse) dataObj).getGlobalVariableList();//.getGlobalVariable();
                if (paramList != null) {
                    // 获取参数名->到request中获取参数值
                    String fldName = "";
                    String fldVal = "";
                    for (int i = 0; i < paramList.length; i++) {

                        fldName = paramList[i].getVariableKey();

                        if(fldName.equalsIgnoreCase("Global.ocr_filename"))
                        {

                            String locName=(String)jsonData.get("ocr_filename");
                            fldVal=locName;
                        }
                        else if(fldName.equalsIgnoreCase("Global.ocr_image"))
                        {
                            String locCont=(String)jsonData.get("ocr_image");
                            fldVal=locCont;
                        }
                        else
                        {

                            fldVal = (String)jsonData.get("fld" + fldName);
                        }

                        if (fldVal == null) {
                            fldVal = "";
                        }

                        if (fldVal.toString().equals("")) {
                            fldVal = paramList[i].getDefaultValue();
                        }

                        WorkflowStub.KeyValueVariable k_val = new WorkflowStub.KeyValueVariable();
                        k_val.setVariableKey(fldName);
                        k_val.setVariableValue(fldVal);


                        lst.add(k_val);
                        //param2.addKeyValueVariable(k_val);

                    }
                }

            }




            //
            JSONArray json = new JSONArray();

            // /////////////////////////

            //KeyValueVariable[] param2 =(KeyValueVariable[]) lst.toArray();
            WorkflowStub.KeyValueVariable[] param2=new WorkflowStub.KeyValueVariable[lst.size()];
            //lst.toArray(param2);


            hRet = startWorkflow(param1, param2);

            isSuc = (String) hRet.get("isSuc");
            errMsg = (String) hRet.get("errMsg");

            JSONObject jObjMain = new JSONObject();

            if (isSuc.equals("false")) {
                jObjMain.put("isSuc", "false");
                jObjMain.put("errMsg", errMsg);
                sRet = "[" + jObjMain.toString() + "]";

                return sRet;
            } else {

                jObjMain.put("isSuc", "true");

            }

            dataObj = hRet.get("dataObj");

            int iTaskId = 0;
            iTaskId = ((WorkflowStub.StartWorkflowResponse) dataObj).getTaskId();

            // ///////////////////////////////////
            jObjMain.put("taskId", Integer.toString(iTaskId));
            json.add(jObjMain);
            sRet = json.toString();
            return sRet;

        } catch (Exception e) {
            sRet = "[StartWorkflow][ERR]-" + e.toString();
            jObj = new JSONObject();
            jObj.put("isSuc", "false");
            jObj.put("errMsg", sRet);
            sRet = "[" + jObj.toString() + "]";
            logger.error(sRet);

        } finally {
            return sRet;
        }

    }

    private String getUserRole(String usrID){
        logger.debug("Get User Role Begin:");
        if (usrID==null)
        {
            logger.debug("usrID is null ");
            usrID="";
        }
        String sql = "select * from TAUEGMAP  where USEID='"+usrID+"'";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String strRet="role1";

        logger.debug("Get User Role: [" + sql + "]");
        strRet="role1";
        return strRet;
        /*
        try {
            conn =null; //DbUtil.getConnection();
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                strRet=rs.getString("USGID");
                if(strRet!=null)
                {
                    strRet=strRet.trim();
                    logger.debug("Get User Role is ["+strRet+"]");
                }
                else
                {
                    logger.debug("Get User Role is null!");
                    strRet="role1";
                }
            }
            rs.close();
        }
        catch(Exception e)
        {
            logger.debug(e.toString());
            e.printStackTrace();
            strRet="role1";
        }
        finally
        {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    logger.error("Conncetion Error: ", ex);
                }
                conn = null;
            }

            try
            {
                stmt.close();
            }
            catch(Exception e)
            {}
            return strRet;
        }
        */

    }

    // 6. 更新工作流参数值 UpdateWorkItem Response
    public String UpdateWorkItem(String userName,String roleName, int taskStepId, int currentState, int newState,WorkflowStub.KeyValueVariable[] pVal) {
        HashMap<String, Object> hRet;
        Object dataObj;
        String isSuc = "";
        String errMsg = "";

        String sRet = "";
        JSONObject jObj;
        try {

            // To do : 这里从request中获取param1,param2
/*			String userName = "";
			String roleName = "role1";
			int taskStepId = 0;
			int currentState = 0;
			int newState = 0;
			ArrayOfKeyValueVariable pVal = new ArrayOfKeyValueVariable();
*/
            // strTaskState=(String)_requestHTTPObject.getParameter("taskState");

            //

            JSONArray json = new JSONArray();

            // /////////////////////////
            hRet = this.updateWorkItem(userName, roleName, taskStepId,
                    currentState, newState, pVal);

            isSuc = (String) hRet.get("isSuc");
            errMsg = (String) hRet.get("errMsg");

            JSONObject jObjMain = new JSONObject();

            if (isSuc.equals("false")) {
                jObjMain.put("isSuc", "false");
                jObjMain.put("errMsg", errMsg);
                sRet = "[" + jObjMain.toString() + "]";
                return sRet;
            } else {
                jObjMain.put("isSuc", "true");
            }
            json.add(jObjMain);
            // ///////////////////////////////////

            sRet = json.toString();
            return sRet;

        } catch (Exception e) {
            sRet = "[UpdateWorkItem][ERR]-" + e.toString();
            jObj = new JSONObject();
            jObj.put("isSuc", "false");
            jObj.put("errMsg", sRet);
            sRet = "[" + jObj.toString() + "]";
            logger.error(sRet);

        } finally {
            return sRet;
        }

    }


    // 2.GetTemplateVariablesResponse
    private HashMap<String, Object> getTemplateVariables(String wkTemplateName,String strUserName,String strRoleName) {
        HashMap<String, Object> hRet = new HashMap();
        hRet.put("isSuc", "false");

        String result = "";
        WorkflowStub wfsstub;


        try {
            workflowWebServiceAddress=baseConfig.getWorkFlowUrl();
            wfsstub = new WorkflowStub(workflowWebServiceAddress);
            WorkflowStub.GetTemplateVariables gwcf = new WorkflowStub.GetTemplateVariables();

            try {

                WorkflowStub.GetTemplateVariablesResponse ret;
                gwcf.setTemplateName(wkTemplateName);

                gwcf.setUserName(strUserName);
                gwcf.setRoleName(strRoleName);

                ret = wfsstub.getTemplateVariables(gwcf)
                        .get_return();

                if (ret.getReturnResult()) {
                    hRet.put("isSuc", "true");
                    hRet.put("dataObj", ret);

                } else {
                    logger.error("[getTemplateVariables][ERR]"
                            + ret.getErrorMessage());
                    hRet.put(
                            "errMsg",
                            "[getTemplateVariables][ERR]"
                                    + ret.getErrorMessage());
                }

                return hRet;
            } catch (RemoteException e) {
                e.printStackTrace();
                logger.error("[getTemplateVariables][ERR]" + e.getMessage());
                hRet.put("errMsg",
                        "[getTemplateVariables][ERR]" + e.getMessage());
            }

        } catch (AxisFault e) {
            e.printStackTrace();
            logger.error("[getTemplateVariables][ERR]" + e.getMessage());
            hRet.put("errMsg", "[getTemplateVariables][ERR]" + e.getMessage());
        }

        return hRet;
    }


    // 1.StartWorkflowResponse
    private HashMap<String, Object> startWorkflow(WorkflowStub.StartWorkFlowInfo param1,
                                                  WorkflowStub.KeyValueVariable[] param2) {

        HashMap<String, Object> hRet = new HashMap();
        hRet.put("isSuc", "false");

        WorkflowStub wfsstub;
        try {
            workflowWebServiceAddress=baseConfig.getWorkFlowUrl();
            wfsstub = new WorkflowStub(workflowWebServiceAddress);
            WorkflowStub.StartWorkflow gwcf = new WorkflowStub.StartWorkflow();
            // 这里对调用前代理对像赋值
            gwcf.setFlowInfo(param1);
            gwcf.setVarList(param2);

            try {
                WorkflowStub.StartWorkflowResponse ret;
                ret = wfsstub.startWorkflow(gwcf).get_return();
                if (ret.getReturnResult()) {
                    hRet.put("isSuc", "true");
                    hRet.put("dataObj", ret);
                } else {
                    logger.error("[startWorkflow][ERR]" + ret.getErrorMessage());
                    hRet.put("errMsg",
                            "[startWorkflow][ERR]" + ret.getErrorMessage());
                }
                return hRet;
            } catch (RemoteException e) {
                e.printStackTrace();
                logger.error("[startWorkflow][ERR]" + e.getMessage());
                hRet.put("errMsg", "[startWorkflow][ERR]" + e.getMessage());
            }

        } catch (AxisFault e) {
            e.printStackTrace();
            logger.error("[startWorkflow][ERR]" + e.getMessage());
            hRet.put("errMsg", "[startWorkflow][ERR]" + e.getMessage());
        }

        return hRet;

    }

    // 6.UpdateWorkItemResponse
    private HashMap<String, Object> updateWorkItem(String userName,
                                                   String roleName, int taskStepId, int currentState, int newState,
        WorkflowStub.KeyValueVariable[] pVal) {
        HashMap<String, Object> hRet = new HashMap();
        hRet.put("isSuc", "false");
        WorkflowStub wfsstub;
        try {
            workflowWebServiceAddress=baseConfig.getWorkFlowUrl();
            wfsstub = new WorkflowStub(workflowWebServiceAddress);
            WorkflowStub.UpdateWorkItem gwcf = new WorkflowStub.UpdateWorkItem();
            // 这里对调用前代理对像赋值
            gwcf.setUserName(userName);
            gwcf.setTaskStepId(taskStepId);
            gwcf.setCurrentState(currentState);
            gwcf.setNewState(newState);
            gwcf.setRoleName(roleName);
            gwcf.setInputKeyVals(pVal);
            gwcf.setSelectedValue("ok");

            try {
                WorkflowStub.UpdateWorkItemResponse ret;

                ret = wfsstub.updateWorkItem(gwcf).get_return();
                if (ret.getReturnResult()) {
                    hRet.put("isSuc", "true");
                    hRet.put("dataObj", ret);

                } else {
                    logger.error("[updateWorkItem][ERR]"
                            + ret.getErrorMessage());
                    hRet.put("errMsg",
                            "[updateWorkItem][ERR]" + ret.getErrorMessage());
                }
                return hRet;
            } catch (RemoteException e) {
                e.printStackTrace();
                logger.error("[updateWorkItem][ERR]" + e.getMessage());
                hRet.put("errMsg", "[updateWorkItem][ERR]" + e.getMessage());
            }

        } catch (AxisFault e) {
            e.printStackTrace();
            logger.error("[updateWorkItem][ERR]" + e.getMessage());
            hRet.put("errMsg", "[updateWorkItem][ERR]" + e.getMessage());
        }

        return hRet;

    }

}
