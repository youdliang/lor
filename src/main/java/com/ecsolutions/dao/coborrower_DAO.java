package com.ecsolutions.dao;

import com.ecsolutions.entity.coborrower_entity;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface coborrower_DAO {

    // select idType
    @Select("SELECT distinct CODTYPE||CSTCOD2 AS CODE,CSTLDES FROM TACSTMAS WHERE CODTYPE = 'ID'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIdType();

    //check line_no
    @Select("SELECT count(*) FROM Loanapplicantfacilityinfo WHERE custcod = #{custcode} and lineno = #{line_no}")
    @ResultType(String.class)
    String checklineno(@Param("line_no") String line_no, @Param("custcode") String custcode);

    // select perCoBorrower by custcode
    @Select("SELECT * FROM LoanJointApplicant_New WHERE TRIM(custcode) = TRIM(#{custcode}) and personalflag = '1'")
    @ResultType(coborrower_entity.class)
    List<coborrower_entity> getPerCoBorrowerInfo(String custcode);

    // select comCoBorrower by custcode
    @Select("SELECT * FROM LoanJointApplicant_New WHERE TRIM(custcode) = TRIM(#{custcode}) and personalflag = '2'")
    @ResultType(coborrower_entity.class)
    List<coborrower_entity> getComCoBorrowerInfo(String custcode);

    //根据证件号码pIdNo删除共同借款人（个人）信息
    @Delete("delete from LoanJointApplicant_New where pIdNo=#{pIdNo}")
    void delete_per(String pIdNo);

    //根据贷款卡编号ethnic删除共同借款人（企业）信息
    @Delete("delete from LoanJointApplicant_New where ethnic=#{ethnic}")
    void delete_com(String ethnic);

    @Insert("insert into LoanJointApplicant_New(custcode,LoanJointApplicantID,OwnerCustCode,LoanID,personalflag,line_no,name,firstName,lastName,pidtypeid,pIdNo,ethnic,CreateDateTime,remark) "
            + "values(#{custcode,jdbcType=VARCHAR},#{LoanJointApplicantID,jdbcType=VARCHAR},#{OwnerCustCode,jdbcType=VARCHAR},#{LoanID,jdbcType=VARCHAR},#{personalflag,jdbcType=VARCHAR},"
            +"#{line_no,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR},#{firstName,jdbcType=VARCHAR},#{lastName,jdbcType=VARCHAR},#{pidtypeid,jdbcType=VARCHAR},#{pIdNo,jdbcType=VARCHAR},#{ethnic,jdbcType=VARCHAR},"
            +"to_date(#{CreateDateTime,jdbcType=VARCHAR},'yyyymmdd'),#{remark,jdbcType=VARCHAR})")
    void insert(coborrower_entity coborrower_entity);
}
