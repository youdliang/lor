package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Customer_entity {
    private String personalFlag = "个人";
    private boolean foreign;
    private String bankCode = "汇茂";
    private String custcod = "12345";
    private String ACCOFFIC;

    //证件信息
    private String pIdTypeId;
    private String pIdNo = "178598555552365";
    private String pIdNo2 = "178598555552365";
    private String lastname = "李四";
    private String firstname = "Si Li";

    //基本情况
    private String nationality;
    private String birthDate = "20170526";
    private String gender;
    private String OrginalName = "李五";
    private String CreditCardNumber = "汉族";
    private String PoliticalStatus = "党员";
    private String residentIndicator;
    private String LEMAILAD = "123456@qq.com";

    //家庭情况
    private String maritalStatusId;
    private String NumberOfFamilyMembers = "5";
    private String livingConditions;

    //工作情况
    private String unitsName = "ecs";
    private String industrialClass;
    private String industrialPrimaryCategory;
    private String industrialSecondaryCategory;
    private String startYear = "20170710";
    private String vocational;
    private String duty;
    private String dutyTitle;
    private String revenueYearCCY;
    private String revenueYear = "50000";
    private String wagesAccount = "12356666";
    private String waDepositaryBank = "boc";

    //教育信息
    private String educationLevelId;
    private String highestDegree;


    //贷款卡信息
    private String ethnic;
    private String ethnic2;
    List<String> ethnicList;
    private String CreditCardStatus = "666";
    private String CreditCardPassword = "555555";

    //其他信息
    private boolean IsBankShareholder = true;
    private String ShareholderID = "255555";
    private String InvestmentCurrency;
    private String InvestmentAmount = "66666";
    private String InvestmentDate = "20170710";
    private String InvestmentProportion = "60";
    private String InvestmentMethod = "vvvv";
    private boolean IsBankStaff;
    private String BankDuty = "zzz";
    private String Remarks = "sss";

    //通讯地址
    private String macountry = "China";
    private String maCity = "1";
    private String CommunicationAddress = "fffff";
    private String CommunicationAddress2;
    private String CommunicationAddress3;
    private String maPostCode = "66666";
    private String LHOMETEL = "22222";
    private String LHPHUM = "66666";

    //户籍地址
    private String hjCountry = "China";
    private String hjCity = "1";
    private String domicileAddress = "2222";
    private String domicileAddress2;
    private String domicileAddress3;
    private String hjPostCode = "210000";

    //单位地址
    private String HJSTREET = "dsad";
    private String HJSTREET2;
    private String HJSTREET3;
    private String HJBUILDING = "655232";
    private String HJFLOOR = "222222";

    //居住地址
    private String ResidenceCountry = "1";
    private String ResidenceCity = "1";
    private String ResidenceAddress = "www";
    private String ResidenceAddress2;
    private String ResidenceAddress3;
    private String CommunicationAddressPostalCode = "522222";

    //popup
    List<HashMap<String,String>> bankList;
    List<HashMap<String,String>> custManagerList;
    List<HashMap<String,String>> industryClassList;
    List<String> industryCategoryList;
    List<HashMap<String,String>> secIndustryCategoryList;
    List<HashMap<String,String>> idTypeList;
    List<HashMap<String,String>> MaritalStatusList;
    List<HashMap<String,String>> JuzhuStatusList;
    List<HashMap<String,String>> ZhiYeList;
    List<HashMap<String,String>> ZhiWuList;
    List<HashMap<String,String>> ZhiChenList;
    List<String> CcyList;
    List<HashMap<String,String>> XueLiList;
    List<HashMap<String,String>> XueWeiList;
    List<HashMap<String,String>> GuoJiaList;
    List<HashMap<String,String>> ShengShiList;

    public List<String> getEthnicList() {
        return ethnicList;
    }

    public void setEthnicList(List<String> ethnicList) {
        this.ethnicList = ethnicList;
    }

    public List<HashMap<String, String>> getShengShiList() {
        return ShengShiList;
    }

    public void setShengShiList(List<HashMap<String, String>> shengShiList) {
        ShengShiList = shengShiList;
    }

    public List<HashMap<String, String>> getGuoJiaList() {
        return GuoJiaList;
    }

    public void setGuoJiaList(List<HashMap<String, String>> guoJiaList) {
        GuoJiaList = guoJiaList;
    }

    public List<HashMap<String, String>> getMaritalStatusList() {
        return MaritalStatusList;
    }

    public void setMaritalStatusList(List<HashMap<String, String>> maritalStatusList) {
        MaritalStatusList = maritalStatusList;
    }

    public List<HashMap<String, String>> getJuzhuStatusList() {
        return JuzhuStatusList;
    }

    public void setJuzhuStatusList(List<HashMap<String, String>> juzhuStatusList) {
        JuzhuStatusList = juzhuStatusList;
    }

    public List<HashMap<String, String>> getZhiYeList() {
        return ZhiYeList;
    }

    public void setZhiYeList(List<HashMap<String, String>> zhiYeList) {
        ZhiYeList = zhiYeList;
    }

    public List<HashMap<String, String>> getZhiWuList() {
        return ZhiWuList;
    }

    public void setZhiWuList(List<HashMap<String, String>> zhiWuList) {
        ZhiWuList = zhiWuList;
    }

    public List<HashMap<String, String>> getZhiChenList() {
        return ZhiChenList;
    }

    public void setZhiChenList(List<HashMap<String, String>> zhiChenList) {
        ZhiChenList = zhiChenList;
    }

    public List<String> getCcyList() {
        return CcyList;
    }

    public void setCcyList(List<String> ccyList) {
        CcyList = ccyList;
    }

    public List<HashMap<String, String>> getXueLiList() {
        return XueLiList;
    }

    public void setXueLiList(List<HashMap<String, String>> xueLiList) {
        XueLiList = xueLiList;
    }

    public List<HashMap<String, String>> getXueWeiList() {
        return XueWeiList;
    }

    public void setXueWeiList(List<HashMap<String, String>> xueWeiList) {
        XueWeiList = xueWeiList;
    }

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }

    public String getPersonalFlag() {
        return personalFlag;
    }

    public void setPersonalFlag(String personalFlag) {
        this.personalFlag = personalFlag;
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

    public List<HashMap<String, String>> getCustManagerList() {
        return custManagerList;
    }

    public void setCustManagerList(List<HashMap<String, String>> custManagerList) {
        this.custManagerList = custManagerList;
    }

    public String getpIdTypeId() {
        return pIdTypeId;
    }

    public void setpIdTypeId(String pIdTypeId) {
        this.pIdTypeId = pIdTypeId;
    }

    public String getpIdNo() {
        return pIdNo;
    }

    public void setpIdNo(String pIdNo) {
        this.pIdNo = pIdNo;
    }

    public String getpIdNo2() {
        return pIdNo2;
    }

    public void setpIdNo2(String pIdNo2) {
        this.pIdNo2 = pIdNo2;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOrginalName() {
        return OrginalName;
    }

    public void setOrginalName(String orginalName) {
        OrginalName = orginalName;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public String getPoliticalStatus() {
        return PoliticalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        PoliticalStatus = politicalStatus;
    }

    public String getHJSTREET() {
        return HJSTREET;
    }

    public void setHJSTREET(String HJSTREET) {
        this.HJSTREET = HJSTREET;
    }

    public String getHJSTREET2() {
        return HJSTREET2;
    }

    public void setHJSTREET2(String HJSTREET2) {
        this.HJSTREET2 = HJSTREET2;
    }

    public String getHJSTREET3() {
        return HJSTREET3;
    }

    public void setHJSTREET3(String HJSTREET3) {
        this.HJSTREET3 = HJSTREET3;
    }

    public String getHJBUILDING() {
        return HJBUILDING;
    }

    public void setHJBUILDING(String HJBUILDING) {
        this.HJBUILDING = HJBUILDING;
    }

    public String getHJFLOOR() {
        return HJFLOOR;
    }

    public void setHJFLOOR(String HJFLOOR) {
        this.HJFLOOR = HJFLOOR;
    }

    public String getResidentIndicator() {
        return residentIndicator;
    }

    public void setResidentIndicator(String residentIndicator) {
        this.residentIndicator = residentIndicator;
    }

    public String getLEMAILAD() {
        return LEMAILAD;
    }

    public void setLEMAILAD(String LEMAILAD) {
        this.LEMAILAD = LEMAILAD;
    }

    public String getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(String maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public String getNumberOfFamilyMembers() {
        return NumberOfFamilyMembers;
    }

    public void setNumberOfFamilyMembers(String numberOfFamilyMembers) {
        NumberOfFamilyMembers = numberOfFamilyMembers;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }

    public String getUnitsName() {
        return unitsName;
    }

    public void setUnitsName(String unitsName) {
        this.unitsName = unitsName;
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

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getVocational() {
        return vocational;
    }

    public void setVocational(String vocational) {
        this.vocational = vocational;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDutyTitle() {
        return dutyTitle;
    }

    public void setDutyTitle(String dutyTitle) {
        this.dutyTitle = dutyTitle;
    }

    public String getRevenueYearCCY() {
        return revenueYearCCY;
    }

    public void setRevenueYearCCY(String revenueYearCCY) {
        this.revenueYearCCY = revenueYearCCY;
    }

    public String getRevenueYear() {
        return revenueYear;
    }

    public void setRevenueYear(String revenueYear) {
        this.revenueYear = revenueYear;
    }

    public String getWagesAccount() {
        return wagesAccount;
    }

    public void setWagesAccount(String wagesAccount) {
        this.wagesAccount = wagesAccount;
    }

    public String getWaDepositaryBank() {
        return waDepositaryBank;
    }

    public void setWaDepositaryBank(String waDepositaryBank) {
        this.waDepositaryBank = waDepositaryBank;
    }

    public String getEducationLevelId() {
        return educationLevelId;
    }

    public void setEducationLevelId(String educationLevelId) {
        this.educationLevelId = educationLevelId;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getEthnic2() {
        return ethnic2;
    }

    public void setEthnic2(String ethnic2) {
        this.ethnic2 = ethnic2;
    }

    public String getCreditCardStatus() {
        return CreditCardStatus;
    }

    public void setCreditCardStatus(String creditCardStatus) {
        CreditCardStatus = creditCardStatus;
    }

    public String getCreditCardPassword() {
        return CreditCardPassword;
    }

    public void setCreditCardPassword(String creditCardPassword) {
        CreditCardPassword = creditCardPassword;
    }

    public boolean isBankShareholder() {
        return IsBankShareholder;
    }

    public void setBankShareholder(boolean bankShareholder) {
        IsBankShareholder = bankShareholder;
    }

    public String getShareholderID() {
        return ShareholderID;
    }

    public void setShareholderID(String shareholderID) {
        ShareholderID = shareholderID;
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

    public String getInvestmentDate() {
        return InvestmentDate;
    }

    public void setInvestmentDate(String investmentDate) {
        InvestmentDate = investmentDate;
    }

    public String getInvestmentProportion() {
        return InvestmentProportion;
    }

    public void setInvestmentProportion(String investmentProportion) {
        InvestmentProportion = investmentProportion;
    }

    public String getInvestmentMethod() {
        return InvestmentMethod;
    }

    public void setInvestmentMethod(String investmentMethod) {
        InvestmentMethod = investmentMethod;
    }

    public boolean isBankStaff() {
        return IsBankStaff;
    }

    public void setBankStaff(boolean bankStaff) {
        IsBankStaff = bankStaff;
    }

    public String getBankDuty() {
        return BankDuty;
    }

    public void setBankDuty(String bankDuty) {
        BankDuty = bankDuty;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getMacountry() {
        return macountry;
    }

    public void setMacountry(String macountry) {
        this.macountry = macountry;
    }

    public String getMaCity() {
        return maCity;
    }

    public void setMaCity(String maCity) {
        this.maCity = maCity;
    }

    public String getCommunicationAddress() {
        return CommunicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        CommunicationAddress = communicationAddress;
    }

    public String getCommunicationAddress2() {
        return CommunicationAddress2;
    }

    public void setCommunicationAddress2(String communicationAddress2) {
        CommunicationAddress2 = communicationAddress2;
    }

    public String getCommunicationAddress3() {
        return CommunicationAddress3;
    }

    public void setCommunicationAddress3(String communicationAddress3) {
        CommunicationAddress3 = communicationAddress3;
    }

    public String getMaPostCode() {
        return maPostCode;
    }

    public void setMaPostCode(String maPostCode) {
        this.maPostCode = maPostCode;
    }

    public String getLHOMETEL() {
        return LHOMETEL;
    }

    public void setLHOMETEL(String LHOMETEL) {
        this.LHOMETEL = LHOMETEL;
    }

    public String getLHPHUM() {
        return LHPHUM;
    }

    public void setLHPHUM(String LHPHUM) {
        this.LHPHUM = LHPHUM;
    }

    public String getHjCountry() {
        return hjCountry;
    }

    public void setHjCountry(String hjCountry) {
        this.hjCountry = hjCountry;
    }

    public String getHjCity() {
        return hjCity;
    }

    public void setHjCity(String hjCity) {
        this.hjCity = hjCity;
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public String getDomicileAddress2() {
        return domicileAddress2;
    }

    public void setDomicileAddress2(String domicileAddress2) {
        this.domicileAddress2 = domicileAddress2;
    }

    public String getDomicileAddress3() {
        return domicileAddress3;
    }

    public void setDomicileAddress3(String domicileAddress3) {
        this.domicileAddress3 = domicileAddress3;
    }

    public String getHjPostCode() {
        return hjPostCode;
    }

    public void setHjPostCode(String hjPostCode) {
        this.hjPostCode = hjPostCode;
    }

    public String getResidenceCountry() {
        return ResidenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        ResidenceCountry = residenceCountry;
    }

    public String getResidenceCity() {
        return ResidenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        ResidenceCity = residenceCity;
    }

    public String getResidenceAddress() {
        return ResidenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        ResidenceAddress = residenceAddress;
    }

    public String getResidenceAddress2() {
        return ResidenceAddress2;
    }

    public void setResidenceAddress2(String residenceAddress2) {
        ResidenceAddress2 = residenceAddress2;
    }

    public String getResidenceAddress3() {
        return ResidenceAddress3;
    }

    public void setResidenceAddress3(String residenceAddress3) {
        ResidenceAddress3 = residenceAddress3;
    }

    public String getCommunicationAddressPostalCode() {
        return CommunicationAddressPostalCode;
    }

    public void setCommunicationAddressPostalCode(String communicationAddressPostalCode) {
        CommunicationAddressPostalCode = communicationAddressPostalCode;
    }

    public List<HashMap<String, String>> getBankList() {
        return bankList;
    }

    public void setBankList(List<HashMap<String, String>> bankList) {
        this.bankList = bankList;
    }

    public List<HashMap<String, String>> getIndustryClassList() {
        return industryClassList;
    }

    public void setIndustryClassList(List<HashMap<String, String>> industryClassList) {
        this.industryClassList = industryClassList;
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

    public boolean isForeign() {
        return foreign;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

}