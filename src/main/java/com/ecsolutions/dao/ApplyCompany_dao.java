package com.ecsolutions.dao;

import com.ecsolutions.entity.Apply_entity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
@Repository
public interface ApplyCompany_dao {
    @Select("select SUBORNO,BCHNAME from TABCHMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getBanks();
//    @Insert("insert into LoanApplicant(bankcode) values(#{bankCode})")

    @Select("select ACCOFFE,DESCRIP from TAACOMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCustManagerNames();

    @Select("select AREAID,AREANAME from AreaIdText")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getAreaNames();

    @Select("select CCY from TACCYMAS")
    @ResultType(HashMap.class)
    List<String> getFlagTexts();

    @Select("select COUNTRY,COUNNAM from TACTYMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCountryTexts();

    @Select("select CITYID,NAME from CityText")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCityTexts();

    @Select("select distinct MENLEI,LEIBIEMINGCHENG from Hangye where rownum < 100")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIndustryClasses();

    @Select("select REFNO,CSTLDES from TACSTMAS where CODTYPE = 'CC'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getBizRegTypeCorFlagTexts();

    @Select("select name from BizTypeText")
    @ResultType(HashMap.class)
    List<String> getBizTypeTexts();

    @Select("select distinct DALEI from Hangye order by DALEI")
    @ResultType(HashMap.class)
    List<String> getIndustryCategories();

    @Select("select distinct ZHONGLEI,SHUOMING from Hangye where ZHONGLEI is not null and SHUOMING is not null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getSecIndustryCategories();

    @Select("select SECEXCHCODE,NAME from secExchText")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getSecExchTexts();

    //select bmp_no
    @Select("select bpm_no from Utilizationdetail")
    @ResultType(String.class)
    String getBpm_no();

    //select ethnic
    @Select("select count(*) from loanapplicant where ethnic = #{ethnic}")
    @ResultType(String.class)
    String isEthnicExist(String ethnic);

    @Insert("insert into LoanApplicant(personalFlag,bankCode,ACCOFFIC,custcod,BusinessRegistrationType,Lregno,RegistrationDate,Lregdued,ethnic,CreditCardStatus,CreditCardPassword,"
            +"Lcountry,lastName,firstname,custType,bizRegNo,yrsinBiz,LegalRepresentativeName,"
            +"BusinessScope,MainProductDescription,Lgtaxno,Lltaxno,Llocid,BorrowerCharacteristics,registeredAMLCCY,"
            +"registeredAML,paidinCapitalCurrency,PaidinCapitalAmount,NumberOfPractitioners,Lbusspc,Lspcownr,HasImportExportRight,IsListedCompany,StockCode,maritalStatusId,IsGroupClient,"
            +"ParentCompanyName,ParentCreditCardID,ParentOrganizationCode,"
            +"riskLevel,Lcntmth,IsBankShareholder,InvestmentDate,InvestmentCurrency,InvestmentAmount,InvestmentProportion,InvestmentMethod,remarks,raCountry,raCity,ResidenceAddress,"
            +"maCountry,maCity,maPostCode,BorrowerContactNumber,LFAXNO,LEMAILAD,LWEBSITE) "+
            "values("+"#{personalFlag,jdbcType=VARCHAR},"+"#{bankCode,jdbcType=VARCHAR},"+"#{ACCOFFIC,jdbcType=VARCHAR},"+"#{custcod},"+"#{BusinessRegistrationType,jdbcType=VARCHAR},"+ "#{Lregno},"
            +"to_number(#{RegistrationDate,jdbcType=VARCHAR}),"+"to_number(#{Lregdued,jdbcType=VARCHAR})," +"#{ethnic,jdbcType=VARCHAR}," +"to_number(#{CreditCardStatus,jdbcType=VARCHAR}),"
            +"#{CreditCardPassword}," +"#{Lcountry,jdbcType=VARCHAR},"+"#{lastName},"+"#{firstname},"+"#{custType,jdbcType=VARCHAR},"
            +"#{bizRegNo},"+"to_number(#{yrsinBiz,jdbcType=VARCHAR}),"+"#{LegalRepresentativeName},"+"#{BusinessScope},"+"#{MainProductDescription},"
            +"#{Lgtaxno},"+"#{Lltaxno},"+"#{Llocid},"+"#{BorrowerCharacteristics},"+"#{registeredAMLCCY},"
            +"to_number(#{registeredAML,jdbcType=VARCHAR}),"+"#{paidinCapitalCurrency},"+"to_number(#{PaidinCapitalAmount,jdbcType=VARCHAR}),"+"to_number(#{NumberOfPractitioners,jdbcType=VARCHAR}),"
            +"to_number(#{Lbusspc,jdbcType=VARCHAR})," +"#{Lspcownr,jdbcType=VARCHAR},"+"to_number(#{HasImportExportRight,jdbcType=VARCHAR}),"+"to_number(#{IsListedCompany,jdbcType=VARCHAR}),"
            +"#{StockCode,jdbcType=VARCHAR},"+"to_number(#{maritalStatusId,jdbcType=VARCHAR}),"+"to_number(#{IsGroupClient,jdbcType=VARCHAR}),"+"#{ParentCompanyName,jdbcType=VARCHAR},"
            +"#{ParentCreditCardID,jdbcType=VARCHAR},"+ "#{ParentOrganizationCode,jdbcType=VARCHAR}," +"#{riskLevel,jdbcType=VARCHAR},"+"#{Lcntmth},"
            +"to_number(#{IsBankShareholder,jdbcType=VARCHAR})," +"to_number(#{InvestmentDate,jdbcType=VARCHAR}),"+"#{InvestmentCurrency,jdbcType=VARCHAR},"+"to_number(#{InvestmentAmount,jdbcType=VARCHAR}),"
            +"to_number(#{InvestmentProportion,jdbcType=VARCHAR})," +"#{InvestmentMethod},"+"#{remarks,jdbcType=VARCHAR},"+"#{raCountry,jdbcType=VARCHAR},"+"#{raCity,jdbcType=VARCHAR},"
            + "#{ResidenceAddress,jdbcType=VARCHAR}," +"#{maCountry,jdbcType=VARCHAR},"+"#{maCity,jdbcType=VARCHAR},"+"#{maPostCode,jdbcType=VARCHAR},"+"#{BorrowerContactNumber,jdbcType=VARCHAR},"+
            "#{LFAXNO,jdbcType=VARCHAR},"+"#{LEMAILAD,jdbcType=VARCHAR},"+"#{LWEBSITE,jdbcType=VARCHAR})")
    void insert(Apply_entity apply_entity);
}
