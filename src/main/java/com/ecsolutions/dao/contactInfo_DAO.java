package com.ecsolutions.dao;

import com.ecsolutions.entity.contactInfo_entity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface contactInfo_DAO {
//    // select custcod
//    @Select("SELECT distinct custcod FROM LoanApplicant where rownum = 1")
//    @ResultType(String.class)
//    String getCustcod();

    // select by custcode
    @Select("SELECT * FROM contactDetails WHERE TRIM(custcode) = TRIM(#{custcode})")
    @ResultType(contactInfo_entity.class)
    List<contactInfo_entity> getContactInfo(String custcode);

    //根据title删除联系信息
    @Delete("delete from contactDetails where title=#{title}")
    void delete(String title);

    @Insert("insert into contactDetails(custcode,lastName,firstName,telOffice,telHome,mobile1,mobile2,fax,email,title,address,remarks) values(#{custcode,jdbcType=VARCHAR},#{lastName,jdbcType=VARCHAR},#{firstName,jdbcType=VARCHAR},"
            +"#{telOffice,jdbcType=VARCHAR},#{telHome,jdbcType=VARCHAR},#{mobile1,jdbcType=VARCHAR},#{mobile2,jdbcType=VARCHAR},#{fax,jdbcType=VARCHAR},#{email,jdbcType=VARCHAR},#{title,jdbcType=VARCHAR},#{address,jdbcType=VARCHAR},#{remarks,jdbcType=VARCHAR})")
    void insert(contactInfo_entity contactinfo_entity);
}
