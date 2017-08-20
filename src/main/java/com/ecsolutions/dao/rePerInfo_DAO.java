package com.ecsolutions.dao;

import com.ecsolutions.entity.rePerInfo_entity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
public interface rePerInfo_DAO {
    // select idType
    @Select("SELECT distinct CODTYPE||CSTCOD2 AS CODE,CSTLDES FROM TACSTMAS WHERE CODTYPE = 'ID'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIdType();

    // get custcod and lastname
    @Select("SELECT custcod as custNo,lastname FROM loanapplicant WHERE pidno = #{pIdNo}")
    @ResultType(rePerInfo_entity.class)
    rePerInfo_entity getCustCodAndName(String pIdNo);

    // select custNo
    @Select("SELECT * FROM loanRelationPersonInfo WHERE custcode = #{custcode}")
    @ResultType(rePerInfo_entity.class)
    List<rePerInfo_entity> getCustNo(String custcode);

    //根据关系类型hierarchy删除关联方个人信息
    @Delete("delete from loanRelationPersonInfo where hierarchy=#{hierarchy}")
    void delete(String hierarchy);

    @Insert("insert into loanRelationPersonInfo(custcode,lastName,hierarchy,custNo,pIdTypeId,pIdNo,holdcustomershareratio,customerholdshareratio) values(#{custcode,jdbcType=VARCHAR},#{lastName,jdbcType=VARCHAR},#{hierarchy,jdbcType=VARCHAR},"
            +"#{custNo,jdbcType=VARCHAR},#{pIdTypeId,jdbcType=VARCHAR},#{pIdNo,jdbcType=VARCHAR},#{holdcustomershareratio,jdbcType=VARCHAR},#{customerholdshareratio,jdbcType=VARCHAR})")
    void insert(rePerInfo_entity reperinfo_entity);
}
