package com.ecsolutions.soaClient;

import com.ecsolutions.common.CinfigInfo;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.Date;


/**
 * Created by tim on 2017/6/30.
 */

@Component
public class TransferClient {

    private static Logger logger = Logger.getLogger(TransferClient.class);

    @Autowired
    private CinfigInfo baseConfig;


    public  String  transfer(String jsonMessage)
    {
        System.out.println("Test OCRService...");

        System.out.println("receive message;["+jsonMessage+"]");
        logger.debug(jsonMessage);
        String sRet="";
        Object[] results = null;
        String popupWebServiceAddress="http://192.1.10.2:7001/WXSOA/services/";
        String popupWebServiceDefaultNameSpace="http://lorServer.ecsolutions.com";

        try {
            RPCServiceClient client = new RPCServiceClient();
            Options options = client.getOptions();
            options.setProperty(org.apache.axis2.Constants.Configuration.CHARACTER_SET_ENCODING, "UTF-8");
            options.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, Boolean.FALSE);


            if (!popupWebServiceAddress.endsWith("/")) {
                popupWebServiceAddress += "/";
            }
            String address ="http://localhost:8001/WebServiceProject/services/Transfer"; //"http://localhost:8001/WebServiceProject/services/Transfer?wsdl"; //popupWebServiceAddress + "OCRService?wsdl";

            //baseConfig=new CinfigInfo();
           // CinfigInfo baseConfig=new CinfigInfo();
            address=baseConfig.getSoaUrl();
//            address="http://192.168.0.224:8001/WebServiceProject/services/Transfer";

            EndpointReference epr = new EndpointReference(address);
            options.setTo(epr);
            QName qname = new QName(popupWebServiceDefaultNameSpace, "transferData");

            Date dtBegin;
            Date dtEnd;
            dtBegin=new Date();

            String strKey="";
            String strToken="ab";
            String strDataMaster="";
            String strDataDetail="";

            logger.debug("begin callWS...");
            //results = client.invokeBlocking(qname, new Object[] { strToken,strKey,strDataMaster,strDataDetail }, new Class[] { String.class,String.class,String.class,String.class });

            results = client.invokeBlocking(qname, new Object[] {jsonMessage}, new Class[] { String.class });
            logger.debug("end callWS.");

             sRet=results[0].toString();
            logger.debug("Ret="+sRet+"");
            dtEnd=new Date();
            logger.error("callWS Cost="+((dtEnd.getTime()-dtBegin.getTime()) / 1000.000)+" seconds]");

            //popOutput = (PopupDataInfo) results[0];
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("getOCRService Error: " + ex);

        }
        return sRet;
    }
}
