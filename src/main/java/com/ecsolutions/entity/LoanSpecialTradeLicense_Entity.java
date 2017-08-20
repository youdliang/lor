package com.ecsolutions.entity;



/**
 * Created by ecs on 2017/7/28.
 */

public class LoanSpecialTradeLicense_Entity {
    //特种行业许可证
    private String STid;
    private String STcustcode;
    private String STspeciallicensenumber;
    private String STlicensename;
    private String STlicensenumber;
    private String STissuedby;
    private String STexpirydate;

    private String id;
    private String custcode;
    private String speciallicensenumber;
    private String licensename;
    private String licensenumber;
    private String issuedby;
    private String expirydate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getSpeciallicensenumber() {
        return speciallicensenumber;
    }

    public void setSpeciallicensenumber(String speciallicensenumber) {
        this.speciallicensenumber = speciallicensenumber;
    }

    public String getLicensename() {
        return licensename;
    }

    public void setLicensename(String licensename) {
        this.licensename = licensename;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getIssuedby() {
        return issuedby;
    }

    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getSTid() {
        return STid;
    }

    public void setSTid(String STid) {
        this.STid = STid;
        this.id = STid;
    }

    public String getSTcustcode() {
        return STcustcode;
    }

    public void setSTcustcode(String STcustcode) {
        this.STcustcode = STcustcode;
        this.custcode = STcustcode;
    }

    public String getSTspeciallicensenumber() {
        return STspeciallicensenumber;
    }

    public void setSTspeciallicensenumber(String STspeciallicensenumber) {
        this.STspeciallicensenumber = STspeciallicensenumber;
        this.speciallicensenumber = STspeciallicensenumber;
    }

    public String getSTlicensename() {
        return STlicensename;
    }

    public void setSTlicensename(String STlicensename) {
        this.STlicensename = STlicensename;
        this.licensename = STlicensename;
    }

    public String getSTlicensenumber() {
        return STlicensenumber;
    }

    public void setSTlicensenumber(String STlicensenumber) {
        this.STlicensenumber = STlicensenumber;
        this.licensenumber = STlicensenumber;
    }

    public String getSTissuedby() {
        return STissuedby;
    }

    public void setSTissuedby(String STissuedby) {
        this.STissuedby = STissuedby;
        this.issuedby = STissuedby;
    }

    public String getSTexpirydate() {
        return STexpirydate;
    }

    public void setSTexpirydate(String STexpirydate) {
        this.STexpirydate = STexpirydate;
        this.expirydate = STexpirydate;
    }
}
