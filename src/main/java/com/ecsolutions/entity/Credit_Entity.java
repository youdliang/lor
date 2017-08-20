package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Credit_Entity {
//    private List<String> financingList;
    private String lineNumber;
    private List<HashMap<String,String>> lineGradeList;
    private String lineStatus;
    private List<HashMap<String,String>> currencyList;
    private BigDecimal usedLineAmount;
    private BigDecimal remainingLineAmount;
    private BigDecimal freezingLineAmount;
    private BigDecimal availableLineAmount;
//    private List<String> collateralMethodList;
    private List<HashMap<String,String>> documentMarkList;
    private List<HashMap<String,String>> countryRiskList;

    private String customerCode;
    private String bmpNumber;
    private String financing;
    private String purpose_loan;
    private String purpose_acceptance;
    private String purpose_LG;
    private String purpose_LC;
    private String purpose_others;
//    private String lineNumber;
    private String lineDescription;
    private String lineGrade;
//    private String lineStatus;
    private String currency;
    private BigDecimal lineAmount;
//    private BigDecimal usedLineAmount;
//    private BigDecimal remainingLineAmount;
//    private BigDecimal freezingLineAmount;
//    private BigDecimal availableLineAmount;
    private String hasBail;
    private BigDecimal acceptanceBail;
    private BigDecimal LGBail;
    private BigDecimal LCBail;
    private String collateralMethod;
    private String documentMark;
    private String createDate;
    private String loopFlag;
    private String dueDate;
    private String countryRisk;
    private String remark;
    private BigDecimal originalAmount;
    private String operatorId;

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public List<HashMap<String, String>> getLineGradeList() {
        return lineGradeList;
    }

    public void setLineGradeList(List<HashMap<String, String>> lineGradeList) {
        this.lineGradeList = lineGradeList;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public List<HashMap<String, String>> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<HashMap<String, String>> currencyList) {
        this.currencyList = currencyList;
    }

    public BigDecimal getUsedLineAmount() {
        return usedLineAmount;
    }

    public void setUsedLineAmount(BigDecimal usedLineAmount) {
        this.usedLineAmount = usedLineAmount;
    }

    public BigDecimal getRemainingLineAmount() {
        return remainingLineAmount;
    }

    public void setRemainingLineAmount(BigDecimal remainingLineAmount) {
        this.remainingLineAmount = remainingLineAmount;
    }

    public BigDecimal getFreezingLineAmount() {
        return freezingLineAmount;
    }

    public void setFreezingLineAmount(BigDecimal freezingLineAmount) {
        this.freezingLineAmount = freezingLineAmount;
    }

    public BigDecimal getAvailableLineAmount() {
        return availableLineAmount;
    }

    public void setAvailableLineAmount(BigDecimal availableLineAmount) {
        this.availableLineAmount = availableLineAmount;
    }

    public List<HashMap<String, String>> getDocumentMarkList() {
        return documentMarkList;
    }

    public void setDocumentMarkList(List<HashMap<String, String>> documentMarkList) {
        this.documentMarkList = documentMarkList;
    }

    public List<HashMap<String, String>> getCountryRiskList() {
        return countryRiskList;
    }

    public void setCountryRiskList(List<HashMap<String, String>> countryRiskList) {
        this.countryRiskList = countryRiskList;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBmpNumber() {
        return bmpNumber;
    }

    public void setBmpNumber(String bmpNumber) {
        this.bmpNumber = bmpNumber;
    }

    public String getFinancing() {
        return financing;
    }

    public void setFinancing(String financing) {
        this.financing = financing;
    }

    public String getPurpose_loan() {
        return purpose_loan;
    }

    public void setPurpose_loan(String purpose_loan) {
        this.purpose_loan = purpose_loan;
    }

    public String getPurpose_acceptance() {
        return purpose_acceptance;
    }

    public void setPurpose_acceptance(String purpose_acceptance) {
        this.purpose_acceptance = purpose_acceptance;
    }

    public String getPurpose_LG() {
        return purpose_LG;
    }

    public void setPurpose_LG(String purpose_LG) {
        this.purpose_LG = purpose_LG;
    }

    public String getPurpose_LC() {
        return purpose_LC;
    }

    public void setPurpose_LC(String purpose_LC) {
        this.purpose_LC = purpose_LC;
    }

    public String getPurpose_others() {
        return purpose_others;
    }

    public void setPurpose_others(String purpose_others) {
        this.purpose_others = purpose_others;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public String getLineGrade() {
        return lineGrade;
    }

    public void setLineGrade(String lineGrade) {
        this.lineGrade = lineGrade;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(BigDecimal lineAmount) {
        this.lineAmount = lineAmount;
    }

    public String getHasBail() {
        return hasBail;
    }

    public void setHasBail(String hasBail) {
        this.hasBail = hasBail;
    }

    public BigDecimal getAcceptanceBail() {
        return acceptanceBail;
    }

    public void setAcceptanceBail(BigDecimal acceptanceBail) {
        this.acceptanceBail = acceptanceBail;
    }

    public BigDecimal getLGBail() {
        return LGBail;
    }

    public void setLGBail(BigDecimal LGBail) {
        this.LGBail = LGBail;
    }

    public BigDecimal getLCBail() {
        return LCBail;
    }

    public void setLCBail(BigDecimal LCBail) {
        this.LCBail = LCBail;
    }

    public String getCollateralMethod() {
        return collateralMethod;
    }

    public void setCollateralMethod(String collateralMethod) {
        this.collateralMethod = collateralMethod;
    }

    public String getDocumentMark() {
        return documentMark;
    }

    public void setDocumentMark(String documentMark) {
        this.documentMark = documentMark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLoopFlag() {
        return loopFlag;
    }

    public void setLoopFlag(String loopFlag) {
        this.loopFlag = loopFlag;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCountryRisk() {
        return countryRisk;
    }

    public void setCountryRisk(String countryRisk) {
        this.countryRisk = countryRisk;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
}
