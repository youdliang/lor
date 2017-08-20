package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;


/**
 * Created by ecs on 2017/7/28.
 */
public class LoanCorporateForeignInvestment_Entity {
    private String Id;
    private String custCode;
    private String InvesteeCompanyName;
    private String CreditCardNumber;
    private String OrganizationCode;
    private String InvestmentCurrency;
    private String InvestmentAmount;
    private List<HashMap<String, String>> ccyInfoList;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<HashMap<String, String>> getCcyInfoList() {
        return ccyInfoList;
    }

    public void setCcyInfoList(List<HashMap<String, String>> ccyInfoList) {
        this.ccyInfoList = ccyInfoList;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getInvesteeCompanyName() {
        return InvesteeCompanyName;
    }

    public void setInvesteeCompanyName(String investeeCompanyName) {
        InvesteeCompanyName = investeeCompanyName;
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

    public String getInvestmentCurrency() {
        return InvestmentCurrency;
    }

    public void setInvestmentCurrency(String investmentCurrency) {
        InvestmentCurrency = investmentCurrency;
    }

    public String getInvestmentAmount() {
        return InvestmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        InvestmentAmount = investmentAmount;
    }


}
