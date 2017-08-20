package com.ecsolutions.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import com.ecsolutions.entity.coCtrRelaInfo_entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface coCtrRelaInfo_DAO {
    // select idType
    @Select("SELECT distinct (CODTYPE||CSTCOD2) AS CODE,CSTLDES FROM TACSTMAS WHERE CODTYPE = 'CC'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIdType();

    // 根据custcode来显示企业控制关系信息
    @Select("SELECT * FROM loanRelationCorpCtrInfo WHERE custcode = #{custcode}")
    @ResultType(coCtrRelaInfo_entity.class)
    List<coCtrRelaInfo_entity> getCustcode(String custcode);

    //根据enterprisename删除企业控制信息
    @Delete("delete from loanRelationCorpCtrInfo where enterpriseName=#{enterpriseName}")
    void delete(String enterpriseName);

    @Insert("insert into loanRelationCorpCtrInfo(custcode,relationtype,enterpriseName,institutioncreditcode,registrationnumbertype,registrationNumber,organizationCode) values(#{custcode,jdbcType=VARCHAR},#{relationtype,jdbcType=VARCHAR},#{enterpriseName,jdbcType=VARCHAR},"
            +"#{institutioncreditcode,jdbcType=VARCHAR},#{registrationnumbertype,jdbcType=VARCHAR},#{registrationNumber,jdbcType=VARCHAR},#{organizationCode,jdbcType=VARCHAR})")
    void insert(coCtrRelaInfo_entity coctrrelainfo_entity);
}
