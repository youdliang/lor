package com.ecsolutions.dao;

import com.ecsolutions.entity.Customer_entity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Repository
public interface Customer_DAO {
    // select bankcod
    @Select("SELECT distinct SUBORNO,BCHNAME FROM TABCHMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getBanks();

//    // select custcod
//    @Select("SELECT custcod FROM LoanApplicant where rownum <= 1")
//    @ResultType(String.class)
//    String getCustcod();

    // select managername
    @Select("SELECT distinct ACCOFFE,DESCRIP FROM TAACOMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCustManagerNames();

//    //select custtype
//    @Select("SELECT (CODTYPE||CSTCOD2) AS CODE,CSTLDES FROM TACSTMAS WHERE CODTYPE = 'ID'")
//    @ResultType(HashMap.class)
//    List<HashMap<String,String>>  getpIdTypeId();

    // select idType
    @Select("SELECT (CODTYPE||CSTCOD2) AS CODE,CSTLDES FROM TACSTMAS WHERE CODTYPE = 'ID'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIdType();

    // select 婚姻状况
    @Select("SELECT distinct maritalStatusId,name FROM MaritalStatusText")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getMaritalStatus();

    //select 居住状况
    @Select("select distinct typeid,name from LivingConditionsText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getJuzhuStatus();

    //select 职业
    @Select("select distinct typeid,name from VocationalText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiye();

    //select 职务
    @Select("select distinct typeid,name from DutyText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiWu();

    //select 职称
    @Select("select distinct typeid,name from DutyTitleText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiChen();

    //select 年收入币种
    @Select("select distinct CCY from TACCYMAS")
    @ResultType(HashMap.class)
    List<String> getCcy();

    //select 最高学历
    @Select("select distinct educationLevelId,name from EducationLevelText where localeid=1 order by educationLevelId desc")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getXueli();

    //select 最高学位
    @Select("select distinct TypeId,name from HighestDegreeText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getXueWei();

    //select 国家
    @Select("select distinct COUNTRY,COUNNAM from TACTYMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getGuoJia();

    //select 省市
    @Select("select distinct cityid,name from CityText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getShengShi();

    //select 门类
    @Select("select distinct menlei,leibiemingcheng from Hangye where rownum < 100")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIndustryClassList();

    //select 大类
    @Select("select distinct dalei from Hangye where rownum < 100")
    @ResultType(HashMap.class)
    List<String> getIndustryCategoryList();

    //select 中类
    @Select("select distinct zhonglei,shuoming from Hangye where rownum < 100 and ZHONGLEI is not null and SHUOMING is not null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getSecIndustryCategoryList();

    //select pIdNo
    @Select("select count(*) from loanapplicant where pIdNo = #{pIdNo}")
    @ResultType(String.class)
    String ispIdNoExist(String pIdNo);
//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getFinancingList();

    @Insert("insert into LoanApplicant(personalFlag,bankCode,ACCOFFIC,custcod,pIdNo,nationality,birthDate,gender,OrginalName,"
            +"CreditCardNumber,lastname,firstname,PoliticalStatus,residentIndicator,LEMAILAD,"
            +"NumberOfFamilyMembers,livingConditions,unitsName,startYear,vocational,duty,dutyTitle,revenueYearCCY,"
            +"revenueYear,wagesAccount,waDepositaryBank,"
            +"educationLevelId,highestDegree,ethnic,CreditCardPassword,ShareholderID,InvestmentCurrency,InvestmentAmount,InvestmentDate,InvestmentProportion,InvestmentMethod,"
            +"BankDuty,Remarks,macountry,maCity,CommunicationAddress,maPostCode,LHOMETEL,LHPHUM,hjCountry,hjCity,domicileAddress,hjPostCode,HJSTREET,HJBUILDING,HJFLOOR,ResidenceCountry,"+
            "ResidenceCity,ResidenceAddress,CommunicationAddressPostalCode) "+
            "values("+"#{personalFlag,jdbcType=VARCHAR},"+"#{bankCode,jdbcType=VARCHAR},"+"#{ACCOFFIC,jdbcType=VARCHAR},"+"#{custcod},"+"#{pIdNo,jdbcType=VARCHAR},"+ "#{nationality},"
            +"to_number(#{birthDate,jdbcType=VARCHAR}),"+"#{gender,jdbcType=VARCHAR}," +"#{OrginalName,jdbcType=VARCHAR}," +"#{CreditCardNumber,jdbcType=VARCHAR},"
            +"#{lastname,jdbcType=VARCHAR},"+"#{firstname,jdbcType=VARCHAR},"+"#{PoliticalStatus}," +"#{residentIndicator,jdbcType=VARCHAR},"+"#{LEMAILAD,jdbcType=VARCHAR},"
            +"to_number(#{NumberOfFamilyMembers,jdbcType=VARCHAR}),"+"#{livingConditions},"+"#{unitsName},"
            +"to_number(#{startYear,jdbcType=VARCHAR}),"+"#{vocational},"+"#{duty},"
            +"#{dutyTitle,jdbcType=VARCHAR},"+"#{revenueYearCCY},"+"to_number(#{revenueYear,jdbcType=VARCHAR}),"+"#{wagesAccount,jdbcType=VARCHAR},"
            +"#{waDepositaryBank,jdbcType=VARCHAR}," +"#{educationLevelId,jdbcType=VARCHAR},"+"#{highestDegree,jdbcType=VARCHAR},"+"#{ethnic,jdbcType=VARCHAR},"
            +"#{CreditCardPassword,jdbcType=VARCHAR},"+"#{ShareholderID,jdbcType=VARCHAR},"
            +"#{InvestmentCurrency,jdbcType=VARCHAR},"+ "to_number(#{InvestmentAmount,jdbcType=VARCHAR})," +"to_number(#{InvestmentDate,jdbcType=VARCHAR}),"+"to_number(#{InvestmentProportion}),"
            +"#{InvestmentMethod,jdbcType=VARCHAR},"+"#{BankDuty,jdbcType=VARCHAR},"+"#{Remarks,jdbcType=VARCHAR},"
            +"#{macountry,jdbcType=VARCHAR}," +"#{maCity},"+"#{CommunicationAddress,jdbcType=VARCHAR},"+"#{maPostCode,jdbcType=VARCHAR},"+"#{LHOMETEL,jdbcType=VARCHAR},"
            + "#{LHPHUM,jdbcType=VARCHAR}," +"#{hjCountry,jdbcType=VARCHAR},"+"#{hjCity,jdbcType=VARCHAR},"+"#{domicileAddress,jdbcType=VARCHAR},"+"#{hjPostCode,jdbcType=VARCHAR},"
            + "#{HJSTREET,jdbcType=VARCHAR},"+"#{HJBUILDING,jdbcType=VARCHAR},"+"#{HJFLOOR,jdbcType=VARCHAR},"+"#{ResidenceCountry,jdbcType=VARCHAR},"+"#{ResidenceCity,jdbcType=VARCHAR},"
            +"#{ResidenceAddress,jdbcType=VARCHAR},"+"#{CommunicationAddressPostalCode,jdbcType=VARCHAR})")
    void insert(Customer_entity customer_entity);
}
