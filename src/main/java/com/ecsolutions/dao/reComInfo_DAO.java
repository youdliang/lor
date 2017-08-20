package com.ecsolutions.dao;

import com.ecsolutions.entity.reComInfo_entity;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface reComInfo_DAO {
    // get custcod and lastname
    @Select("SELECT custcod as custNo,lastname FROM loanapplicant WHERE ethnic = #{ethnic}")
    @ResultType(reComInfo_entity.class)
    reComInfo_entity getCustCodAndName(String ethnic);

    //check ethnic
    @Select("SELECT count(*) FROM loanapplicant WHERE custcod = #{custcode} and ethnic = #{ethnic}")
    @ResultType(String.class)
    String checkethnic(@Param("ethnic") String ethnic,@Param("custcode") String custcode);

    // select by custcode
    @Select("SELECT * FROM loanApplicantRelationCorpInfo WHERE TRIM(custcode) = TRIM(#{custcode})")
    @ResultType(reComInfo_entity.class)
    List<reComInfo_entity> getReComInfo(String custcode);

    //根据关系类型ethnic删除关联方企业信息
    @Delete("delete from loanApplicantRelationCorpInfo where ethnic=#{ethnic}")
    void delete(String ethnic);

    @Insert("insert into loanApplicantRelationCorpInfo(custcode,lastName,hierarchy,custNo,ethnic,holdcustomershareratio,customerholdshareratio) values(#{custcode,jdbcType=VARCHAR},#{lastName,jdbcType=VARCHAR},#{hierarchy,jdbcType=VARCHAR},"
            +"#{custNo,jdbcType=VARCHAR},#{ethnic,jdbcType=VARCHAR},#{holdcustomershareratio,jdbcType=VARCHAR},#{customerholdshareratio,jdbcType=VARCHAR})")
    void insert(reComInfo_entity recominfo_entity);
}
