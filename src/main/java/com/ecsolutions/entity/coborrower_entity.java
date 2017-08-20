package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by ecs on 2017/7/28.
 */
public class coborrower_entity {
    private String custcode = "188688000007";
    private String LoanJointApplicantID = String.valueOf(new Random().nextInt(20000)%20000 + 1);
    private String OwnerCustCode;
    private String LoanID;
    private String personalflag;
    private String ethnic;
    private String firstName;
    private String lastName;
    private String name;
    private String pidtypeid;
    private String CreateDateTime;
    private String remark;
    private String idType;
    private String pIdNo;
    private String line_no;
    List<HashMap<String,String>> idTypeList;

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getLoanJointApplicantID() {
        return LoanJointApplicantID;
    }

    public void setLoanJointApplicantID(String loanJointApplicantID) {
        LoanJointApplicantID = loanJointApplicantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerCustCode() {
        return OwnerCustCode;
    }

    public void setOwnerCustCode(String ownerCustCode) {
        OwnerCustCode = ownerCustCode;
    }

    public String getLoanID() {
        return LoanID;
    }

    public void setLoanID(String loanID) {
        LoanID = loanID;
    }

    public String getPidtypeid() {
        return pidtypeid;
    }

    public void setPidtypeid(String pidtypeid) {
        this.pidtypeid = pidtypeid;
    }

    public String getCreateDateTime() {
        return CreateDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        CreateDateTime = createDateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    public String getPersonalflag() {
        return personalflag;
    }

    public void setPersonalflag(String personalflag) {
        this.personalflag = personalflag;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getpIdNo() {
        return pIdNo;
    }

    public void setpIdNo(String pIdNo) {
        this.pIdNo = pIdNo;
    }

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }
}
