
/**
 * WorkflowCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package ta.workflow.wcf;

    /**
     *  WorkflowCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WorkflowCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WorkflowCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WorkflowCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for startWorkflowNative2 method
            * override this method for handling normal response from startWorkflowNative2 operation
            */
           public void receiveResultstartWorkflowNative2(
                    ta.workflow.wcf.WorkflowStub.StartWorkflowNative2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from startWorkflowNative2 operation
           */
            public void receiveErrorstartWorkflowNative2(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateTAFAPPSMREData method
            * override this method for handling normal response from updateTAFAPPSMREData operation
            */
           public void receiveResultupdateTAFAPPSMREData(
                    ta.workflow.wcf.WorkflowStub.UpdateTAFAPPSMREDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateTAFAPPSMREData operation
           */
            public void receiveErrorupdateTAFAPPSMREData(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateWorkItem method
            * override this method for handling normal response from updateWorkItem operation
            */
           public void receiveResultupdateWorkItem(
                    ta.workflow.wcf.WorkflowStub.UpdateWorkItemResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateWorkItem operation
           */
            public void receiveErrorupdateWorkItem(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for lockWorkItem method
            * override this method for handling normal response from lockWorkItem operation
            */
           public void receiveResultlockWorkItem(
                    ta.workflow.wcf.WorkflowStub.LockWorkItemResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from lockWorkItem operation
           */
            public void receiveErrorlockWorkItem(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRunnableTemplates method
            * override this method for handling normal response from getRunnableTemplates operation
            */
           public void receiveResultgetRunnableTemplates(
                    ta.workflow.wcf.WorkflowStub.GetRunnableTemplatesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRunnableTemplates operation
           */
            public void receiveErrorgetRunnableTemplates(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateTAFAPPSMainData method
            * override this method for handling normal response from updateTAFAPPSMainData operation
            */
           public void receiveResultupdateTAFAPPSMainData(
                    ta.workflow.wcf.WorkflowStub.UpdateTAFAPPSMainDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateTAFAPPSMainData operation
           */
            public void receiveErrorupdateTAFAPPSMainData(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for startWorkflowNative method
            * override this method for handling normal response from startWorkflowNative operation
            */
           public void receiveResultstartWorkflowNative(
                    ta.workflow.wcf.WorkflowStub.StartWorkflowNativeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from startWorkflowNative operation
           */
            public void receiveErrorstartWorkflowNative(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for helloWCF method
            * override this method for handling normal response from helloWCF operation
            */
           public void receiveResulthelloWCF(
                    ta.workflow.wcf.WorkflowStub.HelloWCFResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from helloWCF operation
           */
            public void receiveErrorhelloWCF(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkItemList method
            * override this method for handling normal response from getWorkItemList operation
            */
           public void receiveResultgetWorkItemList(
                    ta.workflow.wcf.WorkflowStub.GetWorkItemListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkItemList operation
           */
            public void receiveErrorgetWorkItemList(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkItemParameters method
            * override this method for handling normal response from getWorkItemParameters operation
            */
           public void receiveResultgetWorkItemParameters(
                    ta.workflow.wcf.WorkflowStub.GetWorkItemParametersResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkItemParameters operation
           */
            public void receiveErrorgetWorkItemParameters(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateWorkItemParameters method
            * override this method for handling normal response from updateWorkItemParameters operation
            */
           public void receiveResultupdateWorkItemParameters(
                    ta.workflow.wcf.WorkflowStub.UpdateWorkItemParametersResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateWorkItemParameters operation
           */
            public void receiveErrorupdateWorkItemParameters(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for assignTaskStepToUserOrRole method
            * override this method for handling normal response from assignTaskStepToUserOrRole operation
            */
           public void receiveResultassignTaskStepToUserOrRole(
                    ta.workflow.wcf.WorkflowStub.AssignTaskStepToUserOrRoleResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from assignTaskStepToUserOrRole operation
           */
            public void receiveErrorassignTaskStepToUserOrRole(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for startWorkflow method
            * override this method for handling normal response from startWorkflow operation
            */
           public void receiveResultstartWorkflow(
                    ta.workflow.wcf.WorkflowStub.StartWorkflowResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from startWorkflow operation
           */
            public void receiveErrorstartWorkflow(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkflows method
            * override this method for handling normal response from getWorkflows operation
            */
           public void receiveResultgetWorkflows(
                    ta.workflow.wcf.WorkflowStub.GetWorkflowsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkflows operation
           */
            public void receiveErrorgetWorkflows(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setWorkflowState method
            * override this method for handling normal response from setWorkflowState operation
            */
           public void receiveResultsetWorkflowState(
                    ta.workflow.wcf.WorkflowStub.SetWorkflowStateResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setWorkflowState operation
           */
            public void receiveErrorsetWorkflowState(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setWorkItemActive method
            * override this method for handling normal response from setWorkItemActive operation
            */
           public void receiveResultsetWorkItemActive(
                    ta.workflow.wcf.WorkflowStub.SetWorkItemActiveResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setWorkItemActive operation
           */
            public void receiveErrorsetWorkItemActive(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTemplateVariables method
            * override this method for handling normal response from getTemplateVariables operation
            */
           public void receiveResultgetTemplateVariables(
                    ta.workflow.wcf.WorkflowStub.GetTemplateVariablesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTemplateVariables operation
           */
            public void receiveErrorgetTemplateVariables(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOrcImage method
            * override this method for handling normal response from getOrcImage operation
            */
           public void receiveResultgetOrcImage(
                    ta.workflow.wcf.WorkflowStub.GetOrcImageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOrcImage operation
           */
            public void receiveErrorgetOrcImage(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTaskStateByVariable method
            * override this method for handling normal response from getTaskStateByVariable operation
            */
           public void receiveResultgetTaskStateByVariable(
                    ta.workflow.wcf.WorkflowStub.GetTaskStateByVariableResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTaskStateByVariable operation
           */
            public void receiveErrorgetTaskStateByVariable(Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getTaskStepUserAndRoles method
            * override this method for handling normal response from getTaskStepUserAndRoles operation
            */
           public void receiveResultgetTaskStepUserAndRoles(
                    ta.workflow.wcf.WorkflowStub.GetTaskStepUserAndRolesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTaskStepUserAndRoles operation
           */
            public void receiveErrorgetTaskStepUserAndRoles(Exception e) {
            }
                


    }
    