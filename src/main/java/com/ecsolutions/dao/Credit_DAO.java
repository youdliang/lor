package com.ecsolutions.dao;

import com.ecsolutions.entity.Credit_Entity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Repository
public interface Credit_DAO {
    @Select("SELECT financing,line_no as lineNumber,linedesc as lineDescription,linegrade,linestatus,linelimitamt as lineAmount,lineosamt as remainingLineAmount,lineholdamt as freezingLineAmount,totalusedamt as usedLineAmount,availableamt as availableLineAmount FROM adsuser.LoanApplicantFacilityInfo WHERE LTRIM(RTRIM(custcode)) = LTRIM(RTRIM(#{customer_code})) ORDER BY line_no")
    @ResultType(Credit_Entity.class)
    List<Credit_Entity> getCreditInfoList(@Param("customer_code")String customerCode);

    // for new credit
    @Select("SELECT DISTINCT line_no FROM adsuser.Loanapplicantfacilityinfo WHERE LTRIM(RTRIM(custCode)) = LTRIM(RTRIM(#{customer_code})) ORDER BY line_no")
    @ResultType(String.class)
    List<String> getLineNumberList(@Param("customer_code")String customerCode);

    // for edit credit
    @Select("SELECT financing,line_no as lineNumber,linedesc as lineDescription,linegrade,linestatus,linelimitamt as lineAmount,lineosamt as remainingLineAmount,lineholdamt as freezingLineAmount,totalusedamt as usedLineAmount,availableamt as availableLineAmount FROM adsuser.LoanApplicantFacilityInfo WHERE LTRIM(RTRIM(custcode)) = LTRIM(RTRIM(#{customer_code})) AND LTRIM(RTRIM(line_no)) = LTRIM(RTRIM(#{line_no}))")
    @ResultType(Credit_Entity.class)
    List<Credit_Entity> getCreditInfo(@Param("customer_code")String customerCode, @Param("line_no")String lineNo);

//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getFinancingList();

    @Select("SELECT DISTINCT flagtext, linerrflag FROM dbo.LineRRFlagText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY linerrflag")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getLineGradeList();

    @Select("SELECT DISTINCT ccytext, ccyid FROM dbo.ccyText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY ccyid")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCurrencyList();

//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getCollateralMethodList();

    @Select("SELECT DISTINCT flagtext, condindflag FROM dbo.CondIndFlagText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY condindflag")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getDocumentMarkList();

    @Select("SELECT DISTINCT name, code FROM adsuser.CountryText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY code")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCountryRiskList();

//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{financing})")
//    @ResultType(String.class)
//    List<String> findFinancing(@Param("financing") String financing);
//
//    @Select("SELECT   FROM   WHERE TRIM() = TRIM(#{line_grade})")
//    @ResultType(String.class)
//    List<String> findLineGrade(@Param("line_grade") String lineGrade);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{collateral_method})")
//    @ResultType(String.class)
//    List<String> findCollateralMethod(@Param("collateral_method") String collateralMethod);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{document_mark})")
//    @ResultType(String.class)
//    List<String> findDocumentMark(@Param("document_mark") String documentMark);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{country_risk})")
//    @ResultType(String.class)
//    List<String> findCountryRisk(@Param("country_risk") String countryRisk);
}
