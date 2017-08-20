package com.ecsolutions.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by tim on 2017/7/7.
 */


    @Component
    //@ConfigurationProperties(prefix = "lor.soaserver")
    public  class CinfigInfo {

    @Value("${lor.soaserver.url}")
    private String soaUrl;


    public String getSoaUrl() {
        return soaUrl;
    }

    public void setSoaUrl(String tmpUrl) {
        soaUrl = tmpUrl;
    }

    @Value("${lor.workflowserver.url}")
    private String workFlowUrl;


    public String getWorkFlowUrl() {
        return workFlowUrl;
    }

    public void setWorkFlowUrl(String tmpUrl) {
        workFlowUrl = tmpUrl;
    }


}

