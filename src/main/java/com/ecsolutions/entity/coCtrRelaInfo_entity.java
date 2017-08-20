package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public class coCtrRelaInfo_entity {
    private char relationtype;
    private String custcode = "10000";
    private String enterpriseName;
    private String institutioncreditcode;
    private String registrationnumbertype;
    private String registrationNumber;
    private String organizationCode;
    List<HashMap<String,String>> idTypeList;

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public char getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(char relationtype) {
        this.relationtype = relationtype;
    }

    public String getRegistrationnumbertype() {
        return registrationnumbertype;
    }

    public void setRegistrationnumbertype(String registrationnumbertype) {
        this.registrationnumbertype = registrationnumbertype;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getInstitutioncreditcode() {
        return institutioncreditcode;
    }

    public void setInstitutioncreditcode(String institutioncreditcode) {
        this.institutioncreditcode = institutioncreditcode;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }
}
