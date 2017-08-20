package com.ecsolutions.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.StringWriter;

/**
 * Created by tim on 2017/7/7.
 */
public class ObjectHelp {

    public static <T>  String ObjectToJsonStr(T tmpKbj)
    {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer=new StringWriter();
        try {
            mapper.writeValue(writer, tmpKbj);
        }
        catch (Exception ee)
        {
            //ee.printStackTrace();
        }
        String objStr=writer.toString();
        return objStr;
    }

    public static <T>  String InitTransferData(String className,T tmpKbj)
    {
        JSONObject main=new JSONObject();
        try {
            main.put("className", className);
            //main.put("transferData", pleage_entity);
            String message= ObjectToJsonStr(tmpKbj);
            main.put("transferData", message);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return main.toString();
    }
}
