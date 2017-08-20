package com.ecsolutions.entity;

/**
 * Created by ecs on 2017/7/28.
 */
public class LoanQualificationCertificate_Entity {
    //资质证表
    private String id;
    private String custcode;
    private String qualificationnumber;
    private String licensename;
    private String qualificationlevel;
    private String licensenumber;
    private String issuedby;
    private String expirydate;

    private String QCid;
    private String QCcustcode;
    private String QCqualificationnumber;
    private String QClicensename;
    private String QCqualificationlevel;
    private String QClicensenumber;
    private String QCissuedby;
    private String QCexpirydate;

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

    public String getQualificationnumber() {
        return qualificationnumber;
    }

    public void setQualificationnumber(String qualificationnumber) {
        this.qualificationnumber = qualificationnumber;
    }

    public String getLicensename() {
        return licensename;
    }

    public void setLicensename(String licensename) {
        this.licensename = licensename;
    }

    public String getQualificationlevel() {
        return qualificationlevel;
    }

    public void setQualificationlevel(String qualificationlevel) {
        this.qualificationlevel = qualificationlevel;
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

    public String getQCid() {
        return QCid;
    }

    public void setQCid(String QCid) {
        this.QCid = QCid;
        id=QCid;
    }

    public String getQCcustcode() {
        return QCcustcode;
    }

    public void setQCcustcode(String QCcustcode) {
        this.QCcustcode = QCcustcode;
        custcode = QCcustcode;
    }

    public String getQCqualificationnumber() {
        return QCqualificationnumber;
    }

    public void setQCqualificationnumber(String QCqualificationnumber) {
        this.QCqualificationnumber = QCqualificationnumber;
        qualificationnumber = QCqualificationnumber;
    }

    public String getQClicensename() {
        return QClicensename;
    }

    public void setQClicensename(String QClicensename) {
        this.QClicensename = QClicensename;
        licensename = QClicensename;
    }

    public String getQCqualificationlevel() {
        return QCqualificationlevel;
    }

    public void setQCqualificationlevel(String QCqualificationlevel) {
        this.QCqualificationlevel = QCqualificationlevel;
        qualificationlevel = QCqualificationlevel;
    }

    public String getQClicensenumber() {
        return QClicensenumber;
    }

    public void setQClicensenumber(String QClicensenumber) {
        this.QClicensenumber = QClicensenumber;
        licensenumber = QClicensenumber;
    }

    public String getQCissuedby() {
        return QCissuedby;
    }

    public void setQCissuedby(String QCissuedby) {
        this.QCissuedby = QCissuedby;
        issuedby = QCissuedby;
    }

    public String getQCexpirydate() {
        return QCexpirydate;
    }

    public void setQCexpirydate(String QCexpirydate) {
        this.QCexpirydate = QCexpirydate;
        expirydate = QCexpirydate;
    }
}
