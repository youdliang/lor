package ta.workflow;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;







import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;


public class SaveOCRData {
	private static Logger logger = Logger.getLogger(SaveOCRData.class);	
	//token- check user privilege ;  refKey-key to determinate OCR data; dataMaster-Master field and value ; dataDetail-Detail field and value;
	 
    public String saveInfo(String token,String refKey,String dataMaster,String dataDetail)
    {
    	String sRet="";
    	JSONObject jObj;
    	jObj = new JSONObject();
    	//save data to db
    	//
    	try
    	{
	
    	}
    	catch(Exception e)
    	{}
    	
    	if(token.equalsIgnoreCase(""))
    	{
			jObj.put("isSuc", "false");
			jObj.put("errMsg", "token is empty!");
    	}
    	else
    	{
			jObj.put("isSuc", "true");
			jObj.put("errMsg", "");
    	}
    	
		sRet = "[" + jObj.toString() + "]";    	
    	return sRet;
    }

    public static void main(String args[])
    {
    	System.out.println("Test OCRService...");
    	
    	
		Object[] results = null;
		String popupWebServiceAddress="http://192.1.10.2:7001/WXSOA/services/";
		String popupWebServiceDefaultNameSpace="http://workflow.ta";

		try {
			RPCServiceClient client = new RPCServiceClient();
			Options options = client.getOptions();
			options.setProperty(org.apache.axis2.Constants.Configuration.CHARACTER_SET_ENCODING, "UTF-8");
			options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);

			
			if (!popupWebServiceAddress.endsWith("/")) {
				popupWebServiceAddress += "/";
			}
			String address = popupWebServiceAddress + "OCRService?wsdl";
			EndpointReference epr = new EndpointReference(address);
			options.setTo(epr);
			QName qname = new QName(popupWebServiceDefaultNameSpace, "saveInfo");
			
			Date dtBegin;
		    Date dtEnd;
		    dtBegin=new Date();

		    String strKey="";
		    String strToken="ab";
		    String strDataMaster="";
		    String strDataDetail="";
		    
			logger.debug("begin callWS...");
			results = client.invokeBlocking(qname, new Object[] { strToken,strKey,strDataMaster,strDataDetail }, new Class[] { String.class,String.class,String.class,String.class });
			logger.debug("end callWS.");
			
			String sRet=(String)results[0];
			logger.debug("Ret="+sRet+"");
			dtEnd=new Date();
			logger.error("callWS Cost="+((dtEnd.getTime()-dtBegin.getTime()) / 1000.000)+" seconds]");			
			
			//popOutput = (PopupDataInfo) results[0];
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("getOCRService Error: " + ex);
			
		}
    	
    	
    }
    
    
}
