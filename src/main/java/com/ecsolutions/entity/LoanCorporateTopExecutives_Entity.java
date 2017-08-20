package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
public class LoanCorporateTopExecutives_Entity {
    private String Birthday;
    private String Category;
    private String custCode;
    private String HighestEducationQualification;
    private String id;//primary key
    private String IDNumber;
    private String IDType;
    private String Sex;
    private String TopExecutiveName;
    private String WorkingHistory;
    private List<HashMap<String,String>> IDTypeInfoList;

    public List<HashMap<String, String>> getIDTypeInfoList() {
        return IDTypeInfoList;
    }

    public void setIDTypeInfoList(List<HashMap<String, String>> IDTypeInfoList) {
        this.IDTypeInfoList = IDTypeInfoList;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getHighestEducationQualification() {
        return HighestEducationQualification;
    }

    public void setHighestEducationQualification(String highestEducationQualification) {
        HighestEducationQualification = highestEducationQualification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getTopExecutiveName() {
        return TopExecutiveName;
    }

    public void setTopExecutiveName(String topExecutiveName) {
        TopExecutiveName = topExecutiveName;
    }

    public String getWorkingHistory() {
        return WorkingHistory;
    }

    public void setWorkingHistory(String workingHistory) {
        WorkingHistory = workingHistory;
    }
}
