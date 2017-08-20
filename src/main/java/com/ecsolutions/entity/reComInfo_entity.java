package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public class reComInfo_entity {
    private String ethnic;
    private String hierarchy;
    private String holdcustomershareratio;
    private String customerholdshareratio;
    private String custcod; //loanapplicant客户号
    private String custNo; //关联方企业客户号
    private String custcode = "20000"; //客户号
    private String lastName;

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHoldcustomershareratio() {
        return holdcustomershareratio;
    }

    public void setHoldcustomershareratio(String holdcustomershareratio) {
        this.holdcustomershareratio = holdcustomershareratio;
    }

    public String getCustomerholdshareratio() {
        return customerholdshareratio;
    }

    public void setCustomerholdshareratio(String customerholdshareratio) {
        this.customerholdshareratio = customerholdshareratio;
    }
}
