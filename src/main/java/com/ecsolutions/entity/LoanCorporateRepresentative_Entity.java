package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
public class LoanCorporateRepresentative_Entity {
    private String id;
    private String custCode;
    private String FamilyMemberName;
    private String CompanyName;
    private String CreditCardNumber;
    private String IDType;
    private String IDNumber;
    private String Relationship;
    private List<HashMap<String,String>> IDTypeInfoList;

    public List<HashMap<String, String>> getIDTypeInfoList() {
        return IDTypeInfoList;
    }

    public void setIDTypeInfoList(List<HashMap<String, String>> IDTypeInfoList) {
        this.IDTypeInfoList = IDTypeInfoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getFamilyMemberName() {
        return FamilyMemberName;
    }

    public void setFamilyMemberName(String familyMemberName) {
        FamilyMemberName = familyMemberName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String relationship) {
        Relationship = relationship;
    }
}
