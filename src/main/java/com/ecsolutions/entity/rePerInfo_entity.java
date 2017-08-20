package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
public class rePerInfo_entity {
    private String pIdTypeId;
    private String pIdNo;
    private String custcod; //loanapplicant客户号
    private String custNo;  //关联方个人客户号
    private String custcode = "10000"; //客户号
    private String lastName;
    private String hierarchy;
    private String holdcustomershareratio;
    private String customerholdshareratio;
    List<HashMap<String,String>> idTypeList;

    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getpIdTypeId() {
        return pIdTypeId;
    }

    public void setpIdTypeId(String pIdTypeId) {
        this.pIdTypeId = pIdTypeId;
    }

    public String getpIdNo() {
        return pIdNo;
    }

    public void setpIdNo(String pIdNo) {
        this.pIdNo = pIdNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
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

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }
}
