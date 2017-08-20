package com.ecsolutions.entity;

/**
 * Created by ecs on 2017/7/27.
 */
public class LoanCorporateCapitalStructure_Entity {
    private String Id;
    private String custcode;
    private String InvestmentPartyType;
    private String InvestmentPartyName;
    private String CreditCardNumber;
    private String OrganizationCode;
    private String RegistrationID;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getInvestmentPartyType() {
        return InvestmentPartyType;
    }

    public void setInvestmentPartyType(String investmentPartyType) {
        InvestmentPartyType = investmentPartyType;
    }

    public String getInvestmentPartyName() {
        return InvestmentPartyName;
    }

    public void setInvestmentPartyName(String investmentPartyName) {
        InvestmentPartyName = investmentPartyName;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    public String getRegistrationID() {
        return RegistrationID;
    }

    public void setRegistrationID(String registrationID) {
        RegistrationID = registrationID;
    }
}
