package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanQualificationCertificate_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Repository
public interface LoanQualificationCertificate_DAO{

    @Insert("insert into LoanQualificationCertificate("+
            "custcode," +
            "qualificationnumber," +
            "licensename," +
            "qualificationlevel," +
            "licensenumber," +
            "issuedby," +
            "expirydate) " +
            "values (" +
            "#{custcode,jdbcType=VARCHAR}," +
            "#{qualificationnumber,jdbcType=VARCHAR}," +
            "#{licensename,jdbcType=VARCHAR}," +
            "#{qualificationlevel,jdbcType=VARCHAR}," +
            "#{licensenumber,jdbcType=VARCHAR}," +
            "#{issuedby,jdbcType=VARCHAR}," +
            "to_date(#{expirydate,jdbcType=VARCHAR},'YYYY-MM-DD'))")
    @ResultType(Boolean.class)
    public boolean save(LoanQualificationCertificate_Entity entity);

//    WHERE custcode="+ "#{CustCode,jdbcType=VARCHAR}
    @Select("SELECT COUNT(*) FROM LoanQualificationCertificate WHERE custcode="+ "#{CustCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String CustCode);

    @Select("SELECT * FROM LoanQualificationCertificate WHERE custcode="+"#{CustCode,jdbcType=VARCHAR}"+" Order By id Asc")
    @ResultType(LoanQualificationCertificate_Entity.class)
    List<LoanQualificationCertificate_Entity> findAll(String CustCode);

    @Update("Update LoanQualificationCertificate " +
            "SET " +
            "custcode=" +"#{custcode,jdbcType=VARCHAR}," +
            "qualificationnumber=" +"#{qualificationnumber,jdbcType=VARCHAR}," +
            "licensename=" +"#{licensename,jdbcType=VARCHAR}," +
            "qualificationlevel=" +"#{qualificationlevel,jdbcType=VARCHAR}," +
            "licensenumber=" + "#{licensenumber,jdbcType=VARCHAR}," +
            "issuedby=" +"#{issuedby,jdbcType=VARCHAR},"+
            "expirydate=" +  "to_date(#{expirydate,jdbcType=VARCHAR},'YYYY-MM-DD')"+
            "Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanQualificationCertificate_Entity entity);

    @Delete("DELETE FROM LoanQualificationCertificate Where id=" + "#{id,jdbcType=VARCHAR}")
    boolean delete(String id);
}
