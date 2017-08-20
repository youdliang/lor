package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanSpecialTradeLicense_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Repository
public interface LoanSpecialTradeLicense_DAO{
    @Insert("insert into LoanSpecialTradeLicense(custcode,speciallicensenumber,licensename,licensenumber,issuedby,expirydate) " +
            "values (" +
            "#{custcode,jdbcType=VARCHAR},"+
            "#{speciallicensenumber,jdbcType=VARCHAR}," +
            "#{licensename,jdbcType=VARCHAR}," +
            "#{licensenumber,jdbcType=VARCHAR}," +
            "#{issuedby,jdbcType=VARCHAR}," +
            "to_date(#{expirydate,jdbcType=VARCHAR},'YYYY-MM-DD')"+
            ")")
    @ResultType(Boolean.class)
    public boolean save(LoanSpecialTradeLicense_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanSpecialTradeLicense WHERE custcode="+ "#{CustCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String CustCode);

//     WHERE custcode="+ "#{CustCode,jdbcType=VARCHAR}
    @Select("SELECT * FROM LoanSpecialTradeLicense WHERE custcode="+ "#{CustCode,jdbcType=VARCHAR}"+" Order By id Asc")
    @ResultType(LoanSpecialTradeLicense_Entity.class)
    List<LoanSpecialTradeLicense_Entity> findAll(String CustCode);

    @Update("Update LoanSpecialTradeLicense " +
            "SET " +
            "custcode=" +"#{custcode,jdbcType=VARCHAR}," +
            "speciallicensenumber=" +"#{speciallicensenumber,jdbcType=VARCHAR}," +
            "licensename=" +"#{licensename,jdbcType=VARCHAR}," +
            "licensenumber=" +"#{licensenumber,jdbcType=VARCHAR}," +
            "issuedby=" + "#{issuedby,jdbcType=VARCHAR}," +
            "expirydate= " + "to_date(#{expirydate,jdbcType=VARCHAR},'YYYY-MM-DD')"+
            "  Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanSpecialTradeLicense_Entity entity);

    @Delete("DELETE FROM LoanSpecialTradeLicense Where id=" + "#{id,jdbcType=VARCHAR}")
    boolean delete(String id);
}