package com.ecsolutions.entity;

/**
 * Created by ecs on 2017/7/27.
 */
public class LoanCorporateCertificates_Entity {
    //主键
    private String Id;
    private String CustCode;
    //国税登记证
    private String NTRegistraCertificateNum;
    private String NTRegistraCertificatePeriod;
    private String NTRegistraCertificateStartDate;
    private String NTRegistraCertificateEndDate;
    //地税登记证
    private String GRRegistraCertificateNumber;
    private String GRRegistraCertificatePeriod;
    private String GRRegistraCertificateStartDate;
    private String GRRegistraCertificateEndDate;
    //机构登记证
    private String OCCertificateNumber;
    private String OCCertificateRegisterNumber;
    private String OCCertificateExpiryDate;
    //基本账户开户许可证
    private String BAOpenPermissionNumber;
    private String BAOpenPermissionApprovalNumber;
    private String BAOpenPermissionIssueDate;
    private String BAOpenPermissionBank;
    private String BAOpenPermissionAccountNumber;
    //事业单位法人证
    private String PSUAPCertificateNumber;
    private String PSUAPCertificateIssuedBy;
    private String PSUAPCertificateCertificateNum;
    private String PSUAPCertificateLegalRepresen;
    private String PSUAPCertificateFundSource;
    private String PSUAPCertificateInitialFund;
    private String PSUAPCertificateOrganizer;
    private String PSUAPCertificateAddress;
    private String PSUAPCertificateRMOrganization;
    private String PSUAPCertificatePeriod;
    private String PSUAPCertificateStartDate;
    private String PSUAPCertificateEndDate;
    private String PSUAPCertificatePurposeASOfB;
    //外企证书
    private String FCompanyCertificateNumber;
    private String FCApprovalNumber;
    private String FCImportExportEnterpriseCode;
    private String FCApprovalDate;
    private String FCYearsOfBusiness;
    private String FCTotalInvestment;
    //进出口许可证
    private String IExportLicenceNumber;
    private String IExportRecordNumber;
    private String IExportEnterpriseCode;
    private String IExportRegistrationAuthority;
    //外汇登记证
    private String FERegistrationCertificateNum;
    private String FERegistrationNumber;
    private String FERegistrationDate;
    private String FERegistrationOrganization;
    private String FExchangeAccountType;
    private String FExchangeCeilingAmount;
    private String FExchangeApprovalNumber;
    private String FExchangeBankOfAccount;
    private String FExchangeOpenDate;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustCode() {
        return CustCode;
    }

    public void setCustCode(String custCode) {
        CustCode = custCode;
    }

    public String getNTRegistraCertificateNum() {
        return NTRegistraCertificateNum;
    }

    public void setNTRegistraCertificateNum(String NTRegistraCertificateNum) {
        this.NTRegistraCertificateNum = NTRegistraCertificateNum;
    }

    public String getNTRegistraCertificatePeriod() {
        return NTRegistraCertificatePeriod;
    }

    public void setNTRegistraCertificatePeriod(String NTRegistraCertificatePeriod) {
        this.NTRegistraCertificatePeriod = NTRegistraCertificatePeriod;
    }

    public String getNTRegistraCertificateStartDate() {
        return NTRegistraCertificateStartDate;
    }

    public void setNTRegistraCertificateStartDate(String NTRegistraCertificateStartDate) {

        this.NTRegistraCertificateStartDate = NTRegistraCertificateStartDate.replace("-","");;
    }

    public String getNTRegistraCertificateEndDate() {
        return NTRegistraCertificateEndDate;
    }

    public void setNTRegistraCertificateEndDate(String NTRegistraCertificateEndDate) {
        this.NTRegistraCertificateEndDate = NTRegistraCertificateEndDate.replace("-","");;
    }

    public String getGRRegistraCertificateNumber() {
        return GRRegistraCertificateNumber;
    }

    public void setGRRegistraCertificateNumber(String GRRegistraCertificateNumber) {
        this.GRRegistraCertificateNumber = GRRegistraCertificateNumber;
    }

    public String getGRRegistraCertificatePeriod() {
        return GRRegistraCertificatePeriod;
    }

    public void setGRRegistraCertificatePeriod(String GRRegistraCertificatePeriod) {
        this.GRRegistraCertificatePeriod = GRRegistraCertificatePeriod;
    }

    public String getGRRegistraCertificateStartDate() {
        return GRRegistraCertificateStartDate;
    }

    public void setGRRegistraCertificateStartDate(String GRRegistraCertificateStartDate) {
        this.GRRegistraCertificateStartDate = GRRegistraCertificateStartDate.replace("-","");;
    }

    public String getGRRegistraCertificateEndDate() {
        return GRRegistraCertificateEndDate;
    }

    public void setGRRegistraCertificateEndDate(String GRRegistraCertificateEndDate) {
        this.GRRegistraCertificateEndDate = GRRegistraCertificateEndDate.replace("-","");;
    }

    public String getOCCertificateNumber() {
        return OCCertificateNumber;
    }

    public void setOCCertificateNumber(String OCCertificateNumber) {
        this.OCCertificateNumber = OCCertificateNumber;
    }

    public String getOCCertificateRegisterNumber() {
        return OCCertificateRegisterNumber;
    }

    public void setOCCertificateRegisterNumber(String OCCertificateRegisterNumber) {
        this.OCCertificateRegisterNumber = OCCertificateRegisterNumber;
    }

    public String getOCCertificateExpiryDate() {
        return OCCertificateExpiryDate;
    }

    public void setOCCertificateExpiryDate(String OCCertificateExpiryDate) {
        this.OCCertificateExpiryDate = OCCertificateExpiryDate.replace("-","");;
    }

    public String getBAOpenPermissionNumber() {
        return BAOpenPermissionNumber;
    }

    public void setBAOpenPermissionNumber(String BAOpenPermissionNumber) {
        this.BAOpenPermissionNumber = BAOpenPermissionNumber;
    }

    public String getBAOpenPermissionApprovalNumber() {
        return BAOpenPermissionApprovalNumber;
    }

    public void setBAOpenPermissionApprovalNumber(String BAOpenPermissionApprovalNumber) {
        this.BAOpenPermissionApprovalNumber = BAOpenPermissionApprovalNumber;
    }

    public String getBAOpenPermissionIssueDate() {
        return BAOpenPermissionIssueDate;
    }

    public void setBAOpenPermissionIssueDate(String BAOpenPermissionIssueDate) {
        this.BAOpenPermissionIssueDate = BAOpenPermissionIssueDate.replace("-","");;
    }

    public String getBAOpenPermissionBank() {
        return BAOpenPermissionBank;
    }

    public void setBAOpenPermissionBank(String BAOpenPermissionBank) {
        this.BAOpenPermissionBank = BAOpenPermissionBank;
    }

    public String getBAOpenPermissionAccountNumber() {
        return BAOpenPermissionAccountNumber;
    }

    public void setBAOpenPermissionAccountNumber(String BAOpenPermissionAccountNumber) {
        this.BAOpenPermissionAccountNumber = BAOpenPermissionAccountNumber;
    }

    public String getPSUAPCertificateNumber() {
        return PSUAPCertificateNumber;
    }

    public void setPSUAPCertificateNumber(String PSUAPCertificateNumber) {
        this.PSUAPCertificateNumber = PSUAPCertificateNumber;
    }

    public String getPSUAPCertificateIssuedBy() {
        return PSUAPCertificateIssuedBy;
    }

    public void setPSUAPCertificateIssuedBy(String PSUAPCertificateIssuedBy) {
        this.PSUAPCertificateIssuedBy = PSUAPCertificateIssuedBy;
    }

    public String getPSUAPCertificateCertificateNum() {
        return PSUAPCertificateCertificateNum;
    }

    public void setPSUAPCertificateCertificateNum(String PSUAPCertificateCertificateNum) {
        this.PSUAPCertificateCertificateNum = PSUAPCertificateCertificateNum;
    }

    public String getPSUAPCertificateLegalRepresen() {
        return PSUAPCertificateLegalRepresen;
    }

    public void setPSUAPCertificateLegalRepresen(String PSUAPCertificateLegalRepresen) {
        this.PSUAPCertificateLegalRepresen = PSUAPCertificateLegalRepresen;
    }

    public String getPSUAPCertificateFundSource() {
        return PSUAPCertificateFundSource;
    }

    public void setPSUAPCertificateFundSource(String PSUAPCertificateFundSource) {
        this.PSUAPCertificateFundSource = PSUAPCertificateFundSource;
    }

    public String getPSUAPCertificateInitialFund() {
        return PSUAPCertificateInitialFund;
    }

    public void setPSUAPCertificateInitialFund(String PSUAPCertificateInitialFund) {
        this.PSUAPCertificateInitialFund = PSUAPCertificateInitialFund;
    }

    public String getPSUAPCertificateOrganizer() {
        return PSUAPCertificateOrganizer;
    }

    public void setPSUAPCertificateOrganizer(String PSUAPCertificateOrganizer) {
        this.PSUAPCertificateOrganizer = PSUAPCertificateOrganizer;
    }

    public String getPSUAPCertificateAddress() {
        return PSUAPCertificateAddress;
    }

    public void setPSUAPCertificateAddress(String PSUAPCertificateAddress) {
        this.PSUAPCertificateAddress = PSUAPCertificateAddress;
    }

    public String getPSUAPCertificateRMOrganization() {
        return PSUAPCertificateRMOrganization;
    }

    public void setPSUAPCertificateRMOrganization(String PSUAPCertificateRMOrganization) {
        this.PSUAPCertificateRMOrganization = PSUAPCertificateRMOrganization;
    }

    public String getPSUAPCertificatePeriod() {
        return PSUAPCertificatePeriod;
    }

    public void setPSUAPCertificatePeriod(String PSUAPCertificatePeriod) {
        this.PSUAPCertificatePeriod = PSUAPCertificatePeriod;
    }

    public String getPSUAPCertificateStartDate() {
        return PSUAPCertificateStartDate;
    }

    public void setPSUAPCertificateStartDate(String PSUAPCertificateStartDate) {
        this.PSUAPCertificateStartDate = PSUAPCertificateStartDate.replace("-","");;
    }

    public String getPSUAPCertificateEndDate() {
        return PSUAPCertificateEndDate;
    }

    public void setPSUAPCertificateEndDate(String PSUAPCertificateEndDate) {
        this.PSUAPCertificateEndDate = PSUAPCertificateEndDate.replace("-","");;
    }

    public String getPSUAPCertificatePurposeASOfB() {
        return PSUAPCertificatePurposeASOfB;
    }

    public void setPSUAPCertificatePurposeASOfB(String PSUAPCertificatePurposeASOfB) {
        this.PSUAPCertificatePurposeASOfB = PSUAPCertificatePurposeASOfB;
    }

    public String getFCompanyCertificateNumber() {
        return FCompanyCertificateNumber;
    }

    public void setFCompanyCertificateNumber(String FCompanyCertificateNumber) {
        this.FCompanyCertificateNumber = FCompanyCertificateNumber;
    }

    public String getFCApprovalNumber() {
        return FCApprovalNumber;
    }

    public void setFCApprovalNumber(String FCApprovalNumber) {
        this.FCApprovalNumber = FCApprovalNumber;
    }

    public String getFCImportExportEnterpriseCode() {
        return FCImportExportEnterpriseCode;
    }

    public void setFCImportExportEnterpriseCode(String FCImportExportEnterpriseCode) {
        this.FCImportExportEnterpriseCode = FCImportExportEnterpriseCode;
    }

    public String getFCApprovalDate() {
        return FCApprovalDate;
    }

    public void setFCApprovalDate(String FCApprovalDate) {
        this.FCApprovalDate = FCApprovalDate.replace("-","");;
    }

    public String getFCYearsOfBusiness() {
        return FCYearsOfBusiness;
    }

    public void setFCYearsOfBusiness(String FCYearsOfBusiness) {
        this.FCYearsOfBusiness = FCYearsOfBusiness;
    }

    public String getFCTotalInvestment() {
        return FCTotalInvestment;
    }

    public void setFCTotalInvestment(String FCTotalInvestment) {
        this.FCTotalInvestment = FCTotalInvestment;
    }

    public String getIExportLicenceNumber() {
        return IExportLicenceNumber;
    }

    public void setIExportLicenceNumber(String IExportLicenceNumber) {
        this.IExportLicenceNumber = IExportLicenceNumber;
    }

    public String getIExportRecordNumber() {
        return IExportRecordNumber;
    }

    public void setIExportRecordNumber(String IExportRecordNumber) {
        this.IExportRecordNumber = IExportRecordNumber;
    }

    public String getIExportEnterpriseCode() {
        return IExportEnterpriseCode;
    }

    public void setIExportEnterpriseCode(String IExportEnterpriseCode) {
        this.IExportEnterpriseCode = IExportEnterpriseCode;
    }

    public String getIExportRegistrationAuthority() {
        return IExportRegistrationAuthority;
    }

    public void setIExportRegistrationAuthority(String IExportRegistrationAuthority) {
        this.IExportRegistrationAuthority = IExportRegistrationAuthority;
    }

    public String getFERegistrationCertificateNum() {
        return FERegistrationCertificateNum;
    }

    public void setFERegistrationCertificateNum(String FERegistrationCertificateNum) {
        this.FERegistrationCertificateNum = FERegistrationCertificateNum;
    }

    public String getFERegistrationNumber() {
        return FERegistrationNumber;
    }

    public void setFERegistrationNumber(String FERegistrationNumber) {
        this.FERegistrationNumber = FERegistrationNumber;
    }

    public String getFERegistrationDate() {
        return FERegistrationDate;
    }

    public void setFERegistrationDate(String FERegistrationDate) {
        this.FERegistrationDate = FERegistrationDate.replace("-","");;
    }

    public String getFERegistrationOrganization() {
        return FERegistrationOrganization;
    }

    public void setFERegistrationOrganization(String FERegistrationOrganization) {
        this.FERegistrationOrganization = FERegistrationOrganization;
    }

    public String getFExchangeAccountType() {
        return FExchangeAccountType;
    }

    public void setFExchangeAccountType(String FExchangeAccountType) {
        this.FExchangeAccountType = FExchangeAccountType;
    }

    public String getFExchangeCeilingAmount() {
        return FExchangeCeilingAmount;
    }

    public void setFExchangeCeilingAmount(String FExchangeCeilingAmount) {
        this.FExchangeCeilingAmount = FExchangeCeilingAmount;
    }

    public String getFExchangeApprovalNumber() {
        return FExchangeApprovalNumber;
    }

    public void setFExchangeApprovalNumber(String FExchangeApprovalNumber) {
        this.FExchangeApprovalNumber = FExchangeApprovalNumber;
    }

    public String getFExchangeBankOfAccount() {
        return FExchangeBankOfAccount;
    }

    public void setFExchangeBankOfAccount(String FExchangeBankOfAccount) {
        this.FExchangeBankOfAccount = FExchangeBankOfAccount;
    }

    public String getFExchangeOpenDate() {
        return FExchangeOpenDate;
    }

    public void setFExchangeOpenDate(String FExchangeOpenDate) {
        this.FExchangeOpenDate = FExchangeOpenDate.replace("-","");;
    }
}
