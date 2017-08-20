package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Apply_entity {
    private String personalFlag = "N";
    private boolean foreign;
    private String bankCode;
    private String custcod = String.valueOf(new Random().nextInt(10000)%10000 + 1);
    private String ACCOFFIC;
    private String bpm_no = "BP1Y10000130";//贷前流水号

    //注册登记信息
    private String BusinessRegistrationType;
    private String Lregno = "000001";
    private String RegistrationDate = "20170504";
    private String Lregdued = "20180504";

    //贷款卡信息
    private String ethnic = "000001";
    private List<String> ethnicList;//保存数据库中的贷款卡编号记录
    private String CreditCardStatus = "20170504";
    private String CreditCardPassword = "password";

    //基本情况
    private String Lcountry;
    private String lastName = "张三";
    private String firstname = "San Zhang";
    private String accountOpeningLicenseApprovalNumber = "001";
    private String custType;
    private String bizRegNo = "001";
    private String BorrowerNature = "cn";
    private String agencyCreditCode = "001";
    private String organizationTypeSubdivision;
    private String yrsinBiz = "20170504";
    private String LegalRepresentativeName = "张三";
    private String BusinessScope = "银行";
    private String MainProductDescription = "xxx";
    private String Lgtaxno = "001";
    private String Lltaxno = "002";
    private String Llocid = "shanghai";
    private String BorrowerCharacteristics = "0000";
    private String industrialClass;
    private String industrialPrimaryCategory = "23";
    private String industrialSecondaryCategory = "03";
    private String registeredAMLCCY;
    private String registeredAML = "999";
    private String paidinCapitalCurrency;
    private String PaidinCapitalAmount = "999";
    private String NumberOfPractitioners = "001";
    private String Lbusspc = "666";
    private String Lspcownr;
    private String HasImportExportRight = "666";
    private String IsListedCompany = "666";
    private String StockCode;
    private String maritalStatusId = "666";
    private String IsGroupClient = "666";
    private String ParentCompanyName;
    private String superiorCompanyAgencyCreditCode;
    private String ParentCreditCardID;
    private String ParentOrganizationCode;
    private String superiorCompanyRegisterCodeType;
    private String superiorCompanyRegisterCode;

    //其他信息
    private String organizationState;
    private String riskLevel;
    private String Lcntmth = "000000000";
    private String IsBankShareholder = "555";
    private String equityCardNumber;
    private String InvestmentDate = "20170502";
    private String InvestmentCurrency;
    private String InvestmentAmount = "555";
    private String InvestmentProportion = "20";
    private String InvestmentMethod;
    private String remarks;


    //注册地址
    private String raCountry;
    private String raCity;
    private String ResidenceAddress = "xxxxxxxxxx";

    //通讯地址
    private String maCountry;
    private String maCity;
    private String contactAddress = "xxxxx";
    private String maPostCode = "097542";

    //联系信息
    private String BorrowerContactNumber = "1930474526";
    private String LFAXNO = "91383653";
    private String LEMAILAD = "example@email.com";
    private String LWEBSITE = "www.zhangsna.com";

    List<HashMap<String,String>> bankList;
    List<HashMap<String,String>> custManagerList;
    List<HashMap<String,String>> areaIdList;
    List<String> flagList;
    List<HashMap<String,String>> countryList;
    List<HashMap<String,String>> cityList;
    List<HashMap<String,String>> industryClassList;
    List<HashMap<String,String>> bizRegTypeCorFlagList;
    List<String> bizTypeList;
    List<String> industryCategoryList;
    List<HashMap<String,String>> secIndustryCategoryList;
    List<HashMap<String,String>> secExchList;

    /*private String individualCompanyFlag = "企业";
    private boolean foreign;
    private String branch;
    private String customerCode;
    private String customerManager;

    //注册登记信息
    private String registerType;
    private String registerCode;
    private String registerDate;
    private String bussinessLicenseExpireDate;

    //贷款卡信息
    private String loanCardCode;
    private String loanCardState;
    private String loanCardPassword;

    //基本情况
    private String borrowerCountry;
    private String chineseName;
    private String englishName;
    private String accountOpeningLicenseApprovalNumber;
    private String customerType;
    private String organizationCodeCertificate;
    private String borrowerProperty;
    private String agencyCreditCode;
    private String organizationTypeSubdivision;
    private String establishmentYear;
    private String legalRepresentative;
    private String businessScope;
    private String majorProductSituation;
    private String nationalTaxRegistrationNumber;
    private String regionalTaxRegistrationNumber;
    private String administrativeRegion;
    private String borrowerCharacteristics;
    private String industrialClass;
    private String industrialPrimaryCategory;
    private String industrialSecondaryCategory;
    private String registeredCapitalCurrency;
    private String registeredCapitalAmount;
    private String paidinCapitalCurrency;
    private String paidinCapitalAmount;
    private String employeeNumber;
    private String operatingArea;
    private String operatingAreaOwnership;
    private String importExportFlag;
    private String listedCompanyFlag;
    private String stockCode;
    private String listingLocation;
    private String groupCustomerFlag;
    private String superiorCompanyName;
    private String superiorCompanyAgencyCreditCode;
    private String superiorCompanyLoanCardCode;
    private String superiorCompanyOrganizationCode;
    private String superiorCompanyRegisterCodeType;
    private String superiorCompanyRegisterCode;

    //其他信息
    private String organizationState;
    private String riskRanking;
    private String financeDepartmentContactInformation;
    private String ourShareholders;
    private String equityCardNumber;
    private String investmentDate;
    private String investmentCurrency;
    private String investmentAmount;
    private String investmentRatio;
    private String investmentWay;
    private String remarks;

    //注册地址
    private String registerNationality;
    private String registerProvince;
    private String registerAddress;

    //通讯地址
    private String contactNationality;
    private String contactProvince;
    private String contactAddress;
    private String mailcode;

    //联系信息
    private String borrowerPhone;
    private String fax;
    private String email;
    private String website;*/

    public String getBpm_no() {
        return bpm_no;
    }

    public void setBpm_no(String bpm_no) {
        this.bpm_no = bpm_no;
    }

    public List<HashMap<String, String>> getBankList() {
        return bankList;
    }

    public void setBankList(List<HashMap<String, String>> bankList) {
        this.bankList = bankList;
    }

    public List<HashMap<String, String>> getCustManagerList() {
        return custManagerList;
    }

    public void setCustManagerList(List<HashMap<String, String>> custManagerList) {
        this.custManagerList = custManagerList;
    }

    public List<HashMap<String, String>> getAreaIdList() {
        return areaIdList;
    }

    public void setAreaIdList(List<HashMap<String, String>> areaIdList) {
        this.areaIdList = areaIdList;
    }

    public List<String> getFlagList() {
        return flagList;
    }

    public void setFlagList(List<String> flagList) {
        this.flagList = flagList;
    }

    public List<HashMap<String, String>> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<HashMap<String, String>> countryList) {
        this.countryList = countryList;
    }

    public List<HashMap<String, String>> getCityList() {
        return cityList;
    }

    public void setCityList(List<HashMap<String, String>> cityList) {
        this.cityList = cityList;
    }

    public List<HashMap<String, String>> getIndustryClassList() {
        return industryClassList;
    }

    public void setIndustryClassList(List<HashMap<String, String>> industryClassList) {
        this.industryClassList = industryClassList;
    }

    public List<HashMap<String, String>> getBizRegTypeCorFlagList() {
        return bizRegTypeCorFlagList;
    }

    public void setBizRegTypeCorFlagList(List<HashMap<String, String>> bizRegTypeCorFlagList) {
        this.bizRegTypeCorFlagList = bizRegTypeCorFlagList;
    }

    public List<String> getBizTypeList() {
        return bizTypeList;
    }

    public void setBizTypeList(List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
    }

    public List<String> getIndustryCategoryList() {
        return industryCategoryList;
    }

    public void setIndustryCategoryList(List<String> industryCategoryList) {
        this.industryCategoryList = industryCategoryList;
    }

    public List<HashMap<String, String>> getSecIndustryCategoryList() {
        return secIndustryCategoryList;
    }

    public void setSecIndustryCategoryList(List<HashMap<String, String>> secIndustryCategoryList) {
        this.secIndustryCategoryList = secIndustryCategoryList;
    }

    public List<HashMap<String, String>> getSecExchList() {
        return secExchList;
    }

    public void setSecExchList(List<HashMap<String, String>> secExchList) {
        this.secExchList = secExchList;
    }

    public String getPersonalFlag() {
        return personalFlag;
    }

    public void setPersonalFlag(String personalFlag) {
        this.personalFlag = personalFlag;
    }

    public boolean isForeign() {
        return foreign;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getACCOFFIC() {
        return ACCOFFIC;
    }

    public void setACCOFFIC(String ACCOFFIC) {
        this.ACCOFFIC = ACCOFFIC;
    }

    public String getBusinessRegistrationType() {
        return BusinessRegistrationType;
    }

    public void setBusinessRegistrationType(String businessRegistrationType) {
        BusinessRegistrationType = businessRegistrationType;
    }

    public String getLregno() {
        return Lregno;
    }

    public void setLregno(String lregno) {
        Lregno = lregno;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public List<String> getEthnicList() {
        return ethnicList;
    }

    public void setEthnicList(List<String> ethnicList) {
        this.ethnicList = ethnicList;
    }

    public String getCreditCardPassword() {
        return CreditCardPassword;
    }

    public void setCreditCardPassword(String creditCardPassword) {
        CreditCardPassword = creditCardPassword;
    }

    public String getLcountry() {
        return Lcountry;
    }

    public void setLcountry(String lcountry) {
        Lcountry = lcountry;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAccountOpeningLicenseApprovalNumber() {
        return accountOpeningLicenseApprovalNumber;
    }

    public void setAccountOpeningLicenseApprovalNumber(String accountOpeningLicenseApprovalNumber) {
        this.accountOpeningLicenseApprovalNumber = accountOpeningLicenseApprovalNumber;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getBizRegNo() {
        return bizRegNo;
    }

    public void setBizRegNo(String bizRegNo) {
        this.bizRegNo = bizRegNo;
    }

    public String getBorrowerNature() {
        return BorrowerNature;
    }

    public void setBorrowerNature(String borrowerNature) {
        BorrowerNature = borrowerNature;
    }

    public String getAgencyCreditCode() {
        return agencyCreditCode;
    }

    public void setAgencyCreditCode(String agencyCreditCode) {
        this.agencyCreditCode = agencyCreditCode;
    }

    public String getOrganizationTypeSubdivision() {
        return organizationTypeSubdivision;
    }

    public void setOrganizationTypeSubdivision(String organizationTypeSubdivision) {
        this.organizationTypeSubdivision = organizationTypeSubdivision;
    }

    public String getLegalRepresentativeName() {
        return LegalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        LegalRepresentativeName = legalRepresentativeName;
    }

    public String getBusinessScope() {
        return BusinessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.BusinessScope = businessScope;
    }

    public String getMainProductDescription() {
        return MainProductDescription;
    }

    public void setMainProductDescription(String mainProductDescription) {
        MainProductDescription = mainProductDescription;
    }

    public String getLgtaxno() {
        return Lgtaxno;
    }

    public void setLgtaxno(String lgtaxno) {
        Lgtaxno = lgtaxno;
    }

    public String getLltaxno() {
        return Lltaxno;
    }

    public void setLltaxno(String lltaxno) {
        Lltaxno = lltaxno;
    }

    public String getLlocid() {
        return Llocid;
    }

    public void setLlocid(String llocid) {
        Llocid = llocid;
    }

    public String getIndustrialClass() {
        return industrialClass;
    }

    public void setIndustrialClass(String industrialClass) {
        this.industrialClass = industrialClass;
    }

    public String getIndustrialPrimaryCategory() {
        return industrialPrimaryCategory;
    }

    public void setIndustrialPrimaryCategory(String industrialPrimaryCategory) {
        this.industrialPrimaryCategory = industrialPrimaryCategory;
    }

    public String getIndustrialSecondaryCategory() {
        return industrialSecondaryCategory;
    }

    public void setIndustrialSecondaryCategory(String industrialSecondaryCategory) {
        this.industrialSecondaryCategory = industrialSecondaryCategory;
    }

    public String getPaidinCapitalCurrency() {
        return paidinCapitalCurrency;
    }

    public void setPaidinCapitalCurrency(String paidinCapitalCurrency) {
        this.paidinCapitalCurrency = paidinCapitalCurrency;
    }

    public String getRegisteredAMLCCY() {
        return registeredAMLCCY;
    }

    public void setRegisteredAMLCCY(String registeredAMLCCY) {
        this.registeredAMLCCY = registeredAMLCCY;
    }

    public String getLspcownr() {
        return Lspcownr;
    }

    public void setLspcownr(String lspcownr) {
        Lspcownr = lspcownr;
    }

    public String getStockCode() {
        return StockCode;
    }

    public void setStockCode(String stockCode) {
        this.StockCode = stockCode;
    }

    public String getParentCompanyName() {
        return ParentCompanyName;
    }

    public void setParentCompanyName(String parentCompanyName) {
        ParentCompanyName = parentCompanyName;
    }

    public String getSuperiorCompanyAgencyCreditCode() {
        return superiorCompanyAgencyCreditCode;
    }

    public void setSuperiorCompanyAgencyCreditCode(String superiorCompanyAgencyCreditCode) {
        this.superiorCompanyAgencyCreditCode = superiorCompanyAgencyCreditCode;
    }

    public String getParentCreditCardID() {
        return ParentCreditCardID;
    }

    public void setParentCreditCardID(String parentCreditCardID) {
        ParentCreditCardID = parentCreditCardID;
    }

    public String getParentOrganizationCode() {
        return ParentOrganizationCode;
    }

    public void setParentOrganizationCode(String parentOrganizationCode) {
        ParentOrganizationCode = parentOrganizationCode;
    }

    public String getSuperiorCompanyRegisterCodeType() {
        return superiorCompanyRegisterCodeType;
    }

    public void setSuperiorCompanyRegisterCodeType(String superiorCompanyRegisterCodeType) {
        this.superiorCompanyRegisterCodeType = superiorCompanyRegisterCodeType;
    }

    public String getSuperiorCompanyRegisterCode() {
        return superiorCompanyRegisterCode;
    }

    public void setSuperiorCompanyRegisterCode(String superiorCompanyRegisterCode) {
        this.superiorCompanyRegisterCode = superiorCompanyRegisterCode;
    }

    public String getOrganizationState() {
        return organizationState;
    }

    public void setOrganizationState(String organizationState) {
        this.organizationState = organizationState;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getLcntmth() {
        return Lcntmth;
    }

    public void setLcntmth(String lcntmth) {
        Lcntmth = lcntmth;
    }

    public String getEquityCardNumber() {
        return equityCardNumber;
    }

    public void setEquityCardNumber(String equityCardNumber) {
        this.equityCardNumber = equityCardNumber;
    }

    public String getInvestmentCurrency() {
        return InvestmentCurrency;
    }

    public void setInvestmentCurrency(String investmentCurrency) {
        this.InvestmentCurrency = investmentCurrency;
    }

    public String getInvestmentMethod() {
        return InvestmentMethod;
    }

    public void setInvestmentMethod(String investmentMethod) {
        InvestmentMethod = investmentMethod;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRaCountry() {
        return raCountry;
    }

    public void setRaCountry(String raCountry) {
        this.raCountry = raCountry;
    }

    public String getRaCity() {
        return raCity;
    }

    public void setRaCity(String raCity) {
        this.raCity = raCity;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }

    public String getLregdued() {
        return Lregdued;
    }

    public void setLregdued(String lregdued) {
        Lregdued = lregdued;
    }

    public String getCreditCardStatus() {
        return CreditCardStatus;
    }

    public void setCreditCardStatus(String creditCardStatus) {
        CreditCardStatus = creditCardStatus;
    }

    public String getYrsinBiz() {
        return yrsinBiz;
    }

    public void setYrsinBiz(String yrsinBiz) {
        this.yrsinBiz = yrsinBiz;
    }

    public String getBorrowerCharacteristics() {
        return BorrowerCharacteristics;
    }

    public void setBorrowerCharacteristics(String borrowerCharacteristics) {
        BorrowerCharacteristics = borrowerCharacteristics;
    }

    public String getRegisteredAML() {
        return registeredAML;
    }

    public void setRegisteredAML(String registeredAML) {
        this.registeredAML = registeredAML;
    }

    public String getPaidinCapitalAmount() {
        return PaidinCapitalAmount;
    }

    public void setPaidinCapitalAmount(String paidinCapitalAmount) {
        PaidinCapitalAmount = paidinCapitalAmount;
    }

    public String getNumberOfPractitioners() {
        return NumberOfPractitioners;
    }

    public void setNumberOfPractitioners(String numberOfPractitioners) {
        NumberOfPractitioners = numberOfPractitioners;
    }

    public String getLbusspc() {
        return Lbusspc;
    }

    public void setLbusspc(String lbusspc) {
        Lbusspc = lbusspc;
    }

    public String getHasImportExportRight() {
        return HasImportExportRight;
    }

    public void setHasImportExportRight(String hasImportExportRight) {
        HasImportExportRight = hasImportExportRight;
    }

    public String getIsListedCompany() {
        return IsListedCompany;
    }

    public void setIsListedCompany(String isListedCompany) {
        IsListedCompany = isListedCompany;
    }

    public String getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(String maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public String getIsGroupClient() {
        return IsGroupClient;
    }

    public void setIsGroupClient(String isGroupClient) {
        IsGroupClient = isGroupClient;
    }

    public String getIsBankShareholder() {
        return IsBankShareholder;
    }

    public void setIsBankShareholder(String isBankShareholder) {
        IsBankShareholder = isBankShareholder;
    }

    public String getInvestmentDate() {
        return InvestmentDate;
    }

    public void setInvestmentDate(String investmentDate) {
        InvestmentDate = investmentDate;
    }

    public String getInvestmentAmount() {
        return InvestmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        InvestmentAmount = investmentAmount;
    }

    public String getInvestmentProportion() {
        return InvestmentProportion;
    }

    public void setInvestmentProportion(String investmentProportion) {
        InvestmentProportion = investmentProportion;
    }

    public String getResidenceAddress() {
        return ResidenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        ResidenceAddress = residenceAddress;
    }

    public String getMaCountry() {
        return maCountry;
    }

    public void setMaCountry(String maCountry) {
        this.maCountry = maCountry;
    }

    public String getMaCity() {
        return maCity;
    }

    public void setMaCity(String maCity) {
        this.maCity = maCity;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getMaPostCode() {
        return maPostCode;
    }

    public void setMaPostCode(String maPostCode) {
        this.maPostCode = maPostCode;
    }

    public String getBorrowerContactNumber() {
        return BorrowerContactNumber;
    }

    public void setBorrowerContactNumber(String borrowerContactNumber) {
        BorrowerContactNumber = borrowerContactNumber;
    }

    public String getLFAXNO() {
        return LFAXNO;
    }

    public void setLFAXNO(String LFAXNO) {
        this.LFAXNO = LFAXNO;
    }

    public String getLEMAILAD() {
        return LEMAILAD;
    }

    public void setLEMAILAD(String LEMAILAD) {
        this.LEMAILAD = LEMAILAD;
    }

    public String getLWEBSITE() {
        return LWEBSITE;
    }

    public void setLWEBSITE(String LWEBSITE) {
        this.LWEBSITE = LWEBSITE;
    }

}