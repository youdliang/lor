package com.ecsolutions.entity;


/**
 * Created by ecs on 2017/7/26.
 */
public class LoanApplicantGuarantee_Entity {
    private Integer GuaranteeID;
    private String CustCode;
    private String GuaranteeAmount;
    private String Balance;
    private String NameOfCreditors;
    private String BeAGuarantor;
    private String ByWayOfGuarantor;
    private String MaturityDate;
    private String Remark;

    public String getCustCode() {
        return CustCode;
    }

    public void setCustCode(String custCode) {
        CustCode = custCode;
    }

    public Integer getGuaranteeID() {
        return GuaranteeID;
    }

    public void setGuaranteeID(Integer guaranteeID) {
        GuaranteeID = guaranteeID;
    }

    public String getGuaranteeAmount() {
        return GuaranteeAmount;
    }

    public void setGuaranteeAmount(String guaranteeAmount) {
        GuaranteeAmount = guaranteeAmount;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getNameOfCreditors() {
        return NameOfCreditors;
    }

    public void setNameOfCreditors(String nameOfCreditors) {
        NameOfCreditors = nameOfCreditors;
    }

    public String getBeAGuarantor() {
        return BeAGuarantor;
    }

    public void setBeAGuarantor(String beAGuarantor) {
        BeAGuarantor = beAGuarantor;
    }

    public String getByWayOfGuarantor() {
        return ByWayOfGuarantor;
    }

    public void setByWayOfGuarantor(String byWayOfGuarantor) {
        ByWayOfGuarantor = byWayOfGuarantor;
    }

    public String getMaturityDate() {
        return MaturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        MaturityDate = maturityDate;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
