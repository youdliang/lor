package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
public class LoanApplicantShareholderInfor_Entity{
    //普遍
    private String id;
    private String CustCod;
    private String Type;
    private String IDtype;
    private String IDNum;
    private String IDNumber;
    private String Name;
    private String Proportion;
    private String Organizationcode;
    private String AgencyCreditcode;
    //个人
    private String Personalid;
    private String PersonalCustCod;
    private String PersonalType;
    private String PersonalIDtype;
    private String PersonalIDNum;
    private String PersonalIDNumber;
    private String PersonalName;
    private String PersonalProportion;
    //企业
    private String Enterpriseid;
    private String EnterpriseCustCod;
    private String EnterpriseType;
    private String EnterpriseIDtype;
    private String EnterpriseIDNum;
    private String EnterpriseIDNumber;
    private String EnterpriseName;
    private String EnterpriseProportion;
    private String EnterpriseOrganizationcode;
    private String EnterpriseAgencyCreditcode;
    private List<HashMap<String,String>> IDTypeInfoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustCod() {
        return CustCod;
    }

    public void setCustCod(String custCod) {
        CustCod = custCod;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getIDtype() {
        return IDtype;
    }

    public void setIDtype(String IDtype) {
        this.IDtype = IDtype;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProportion() {
        return Proportion;
    }

    public void setProportion(String proportion) {
        Proportion = proportion;
    }

    public String getOrganizationcode() {
        return Organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        Organizationcode = organizationcode;
    }

    public String getAgencyCreditcode() {
        return AgencyCreditcode;
    }

    public void setAgencyCreditcode(String agencyCreditcode) {
        AgencyCreditcode = agencyCreditcode;
    }

    public String getPersonalid() {
        return Personalid;
    }

    public void setPersonalid(String personalid) {
        Personalid = personalid;
        id=personalid;
    }

    public String getPersonalCustCod() {
        return PersonalCustCod;
    }

    public void setPersonalCustCod(String personalCustCod) {
        PersonalCustCod = personalCustCod;
        CustCod=personalCustCod;
    }

    public String getPersonalType() {
        return PersonalType;
    }

    public void setPersonalType(String personalType) {
        PersonalType = personalType;
        Type=personalType;
    }

    public String getPersonalIDtype() {
        return PersonalIDtype;
    }

    public void setPersonalIDtype(String personalIDtype) {
        PersonalIDtype = personalIDtype;
        IDtype=personalIDtype;
    }

    public String getPersonalIDNum() {
        return PersonalIDNum;
    }

    public void setPersonalIDNum(String personalIDNum) {
        PersonalIDNum = personalIDNum;
        IDNum=personalIDNum;
    }

    public String getPersonalIDNumber() {
        return PersonalIDNumber;
    }

    public void setPersonalIDNumber(String personalIDNumber) {
        PersonalIDNumber = personalIDNumber;
        IDNumber=personalIDNumber;
    }

    public String getPersonalName() {
        return PersonalName;
    }

    public void setPersonalName(String personalName) {
        PersonalName = personalName;
        Name = personalName;
    }

    public String getPersonalProportion() {
        return PersonalProportion;
    }

    public void setPersonalProportion(String personalProportion) {
        PersonalProportion = personalProportion;
        Proportion = personalProportion;
    }


    public String getEnterpriseid() {
        return Enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        Enterpriseid = enterpriseid;
        id = enterpriseid;
    }

    public String getEnterpriseCustCod() {
        return EnterpriseCustCod;
    }

    public void setEnterpriseCustCod(String enterpriseCustCod) {
        EnterpriseCustCod = enterpriseCustCod;
        CustCod = enterpriseCustCod;
    }

    public String getEnterpriseType() {
        return EnterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        EnterpriseType = enterpriseType;
        Type = enterpriseType;
    }

    public String getEnterpriseIDtype() {
        return EnterpriseIDtype;
    }

    public void setEnterpriseIDtype(String enterpriseIDtype) {
        EnterpriseIDtype = enterpriseIDtype;
        IDtype = enterpriseIDtype;
    }

    public String getEnterpriseIDNum() {
        return EnterpriseIDNum;
    }

    public void setEnterpriseIDNum(String enterpriseIDNum) {
        EnterpriseIDNum = enterpriseIDNum;
        IDNum = enterpriseIDNum;
    }

    public String getEnterpriseIDNumber() {
        return EnterpriseIDNumber;
    }

    public void setEnterpriseIDNumber(String enterpriseIDNumber) {
        EnterpriseIDNumber = enterpriseIDNumber;
        IDNumber = enterpriseIDNumber;
    }

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        EnterpriseName = enterpriseName;
        Name = enterpriseName;
    }

    public String getEnterpriseProportion() {
        return EnterpriseProportion;
    }

    public void setEnterpriseProportion(String enterpriseProportion) {
        EnterpriseProportion = enterpriseProportion;
        Proportion = enterpriseProportion;
}

    public String getEnterpriseOrganizationcode() {
        return EnterpriseOrganizationcode;
    }

    public void setEnterpriseOrganizationcode(String enterpriseOrganizationcode) {
        EnterpriseOrganizationcode = enterpriseOrganizationcode;
        Organizationcode = enterpriseOrganizationcode;
    }

    public String getEnterpriseAgencyCreditcode() {
        return EnterpriseAgencyCreditcode;
    }

    public void setEnterpriseAgencyCreditcode(String enterpriseAgencyCreditcode) {
        EnterpriseAgencyCreditcode = enterpriseAgencyCreditcode;
        AgencyCreditcode = enterpriseAgencyCreditcode;
    }

    public List<HashMap<String, String>> getIDTypeInfoList() {
        return IDTypeInfoList;
    }

    public void setIDTypeInfoList(List<HashMap<String, String>> IDTypeInfoList) {
        this.IDTypeInfoList = IDTypeInfoList;
    }
}
