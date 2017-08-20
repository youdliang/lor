package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/11.
 */
public class LoanApplicantSpouseNameInfo_Entity {
    private String custCode;
    private String SpouseName;
    private String SpouseIDType;
    private String SpouseIDNo;
    private String SpouseContactNo;
    private String SpouseCompanyName;
    private List<HashMap<String,String>> IDTypeInfoList;

    public List<HashMap<String, String>> getIDTypeInfoList() {
        return IDTypeInfoList;
    }

    public void setIDTypeInfoList(List<HashMap<String, String>> IDTypeInfoList) {
        this.IDTypeInfoList = IDTypeInfoList;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getSpouseName() {
        return SpouseName;
    }

    public void setSpouseName(String spouseName) {
        SpouseName = spouseName;
    }

    public String getSpouseIDNo() {
        return SpouseIDNo;
    }

    public void setSpouseIDNo(String spouseIDNo) {
        SpouseIDNo = spouseIDNo;
    }

    public String getSpouseIDType() {
        return SpouseIDType;
    }

    public void setSpouseIDType(String spouseIDType) {
        SpouseIDType = spouseIDType;
    }

    public String getSpouseContactNo() {
        return SpouseContactNo;
    }

    public void setSpouseContactNo(String spouseContactNo) {
        SpouseContactNo = spouseContactNo;
    }

    public String getSpouseCompanyName() {
        return SpouseCompanyName;
    }

    public void setSpouseCompanyName(String spouseCompanyName) {
        SpouseCompanyName = spouseCompanyName;
    }
}
