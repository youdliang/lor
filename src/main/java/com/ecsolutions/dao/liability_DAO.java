package com.ecsolutions.dao;

import com.ecsolutions.entity.liability_entity;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface liability_DAO{

    // select by custcode
    @Select("SELECT * FROM loanApplicantLiabilitiesinfo WHERE TRIM(custcode) = TRIM(#{custcode})")
    @ResultType(liability_entity.class)
    List<liability_entity> getLiabilityInfo(String custcode);

    //根据债权人名称Creditorname删除负债信息
    @Delete("delete from loanApplicantLiabilitiesinfo where creditorname=#{creditorname}")
    void delete(String creditorname);

    @Insert("insert into loanApplicantLiabilitiesinfo(custcode,loanamount,balance,creditorname,loandate,duedate,paymentmethod,installmentamount,isoverdue,overdueamount,memo1) "
            +"values(#{custcode,jdbcType=VARCHAR},#{loanamount,jdbcType=VARCHAR},#{balance,jdbcType=VARCHAR},#{creditorname,jdbcType=VARCHAR},to_date(#{loandate,jdbcType=VARCHAR},'yyyymmdd'),"
            +"to_date(#{duedate,jdbcType=VARCHAR},'yyyy-mm-dd'),#{paymentmethod,jdbcType=VARCHAR},#{installmentamount,jdbcType=VARCHAR},#{isoverdue,jdbcType=VARCHAR},"
            +"#{overdueamount,jdbcType=VARCHAR},#{memo1,jdbcType=VARCHAR})")
    void insert(liability_entity liability_entity);
}
