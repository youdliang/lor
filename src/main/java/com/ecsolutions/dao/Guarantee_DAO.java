package com.ecsolutions.dao;

import com.ecsolutions.entity.Guarantee_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
@Repository
public interface Guarantee_DAO {

    @Select("SELECT lineno FROM loanapplicantfacilityinfo")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getLine_no(String custcode);

    @Select("SELECT CSTCOD2,CSTCDES FROM TACSTMAS WHERE CODTYPE='ID' ")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getpidTypeList();

    @Select("SELECT ID,custcod,personalFlag, pIdNo,Ethnic,lastName,ShareScale,Amount FROM LoanApplicantGuarantor where custcod=#{custcode}")
    @ResultType(Guarantee_Entity.class)
    List<Guarantee_Entity> getDataTable(String custcode);

    @Select("SELECT id,custcod,personalFlag,line_no, ContractSymbol,to_char(SignedDate,'YYYY-MM-DD') AS SignedDate, Ethnic,lastName,bizRegNo,pIdNo,registeredAMLCCY,registeredAML ,custType,Mode1,AmountCCY,Amount,Type,to_char(BeginDate,'YYYY-MM-DD')AS BeginDate,TO_CHAR(EndDate,'YYYY-MM-DD') as EndDate,ShareScale,Remark,WorkUnits,WorkUnitsCharacter FROM LoanApplicantGuarantor where id=#{id}")
    @ResultType(Guarantee_Entity.class)
    Guarantee_Entity SearchById(String id);

    @Insert("insert into LoanApplicantGuarantor(custcod,personalFlag,line_no,ContractSymbol,SignedDate,Ethnic,lastName,bizRegNo,pIdNo,registeredAMLCCY,registeredAML,custType,Mode1,AmountCCY,Amount,Type,BeginDate,EndDate,ShareScale,Remark,WorkUnits,WorkUnitsCharacter) " +
            "values (" +
            "#{custcod},"+
            "#{personalFlag}," +
            "#{line_no,jdbcType=VARCHAR}," +
            "#{ContractSymbol,jdbcType=VARCHAR}," +
            "to_date(#{SignedDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "#{Ethnic,jdbcType=VARCHAR}," +
            "#{lastName,jdbcType=VARCHAR}," +
            "#{bizRegNo,jdbcType=VARCHAR}," +
            "#{pIdNo,jdbcType=VARCHAR}," +
            "#{registeredAMLCCY,jdbcType=VARCHAR}," +
            "#{registeredAML,jdbcType=VARCHAR}," +
            "#{custType,jdbcType=VARCHAR}," +
            "#{Mode1,}," +
            "#{AmountCCY}," +
            "#{Amount}," +
            "#{Type}," +
            "to_date(#{BeginDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "to_date(#{EndDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "#{ShareScale}," +
            "#{Remark,jdbcType=VARCHAR}," +
            "#{WorkUnits,jdbcType=VARCHAR}," +
            "#{WorkUnitsCharacter,jdbcType=VARCHAR})")
    void insert(Guarantee_Entity guarantee_entity);

    @Select("SELECT Ethnic,lastName,OrganizationCode as bizRegNo,bizRegNo as pIdNo,registeredAMLCCY as registeredAMLCCY,registeredAML as registeredAML,BorrowerCharacteristics as custType FROM LoanApplicant where Ethnic =#{Ethnic}")
    @ResultType(Guarantee_Entity.class)
    Guarantee_Entity ethnicForOthers1(String Ethnic);

    @Select("SELECT pIdNo,pIdTypeId as custType,lastName,ethnic,unitsName as WorkUnits FROM LoanApplicant where pIdNo =#{pIdNo}")
    @ResultType(Guarantee_Entity.class)
    Guarantee_Entity ethnicForOthers2(String pIdNo);

    @Update("update LoanApplicantGuarantor set " +
            "ContractSymbol=#{ContractSymbol,jdbcType=VARCHAR}," +
            "SignedDate=to_date(#{SignedDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "Ethnic=#{Ethnic,jdbcType=VARCHAR}," +
            "lastName=#{lastName,jdbcType=VARCHAR}," +
            "bizRegNo=#{bizRegNo,jdbcType=VARCHAR}," +
            "pIdNo=#{pIdNo,jdbcType=VARCHAR}," +
            "registeredAMLCCY=#{registeredAMLCCY,jdbcType=VARCHAR}," +
            "registeredAML=#{registeredAML,jdbcType=VARCHAR}," +
            "custType=#{custType,jdbcType=VARCHAR}," +
            "Mode1=#{Mode1}," +
            "AmountCCY=#{AmountCCY}," +
            "Amount=#{Amount}," +
            "Type=#{Type}," +
            "BeginDate=to_date(#{BeginDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "EndDate=to_date(#{EndDate,jdbcType=DATE},'YYYY-MM-DD')," +
            "ShareScale=#{ShareScale}," +
            "Remark=#{Remark,jdbcType=VARCHAR}," +
            "WorkUnits=#{WorkUnits,jdbcType=VARCHAR}," +
            "WorkUnitsCharacter=#{WorkUnitsCharacter,jdbcType=VARCHAR} " +
            "where id=#{id}")
    void update(Guarantee_Entity guarantee_entity);

    @Delete("delete from LoanApplicantGuarantor where ID= #{deleteId}")
    void daleteById(String deleteId);
}
