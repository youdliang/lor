package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanApplicantSpouseNameInfo_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/11.
 */
@Repository
public interface LoanApplicantSpouseNameInfo_DAO {
    @Insert("insert into LoanApplicantSpouseNameInfo(" +
            "custCode," +
            "SpouseName," +
            "SpouseIDType," +
            "SpouseIDNo," +
            "SpouseContactNo," +
            "SpouseCompanyName" +
            ") " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{SpouseName,jdbcType=VARCHAR}," +
            "#{SpouseIDType,jdbcType=VARCHAR}," +
            "#{SpouseIDNo,jdbcType=VARCHAR}," +
            "#{SpouseContactNo,jdbcType=VARCHAR}," +
            "#{SpouseCompanyName,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanApplicantSpouseNameInfo_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanApplicantSpouseNameInfo Where custCode="
            + "#{custCode,jdbcType=VARCHAR}"
    )
    @ResultType(Integer.class)
    Integer countAll(String custCode);

    @Select("SELECT * FROM LoanApplicantSpouseNameInfo Where custCode="
            + "#{custCode,jdbcType=VARCHAR}" +" Order By custCode Asc"
    )
    @ResultType(LoanApplicantSpouseNameInfo_Entity.class)
    List<LoanApplicantSpouseNameInfo_Entity> findAll(String custCode);

    @Update("Update LoanApplicantSpouseNameInfo " +
            "SET " +
            "SpouseName=" + "#{SpouseName,jdbcType=VARCHAR}," +
            "SpouseIDType=" + "#{SpouseIDType,jdbcType=VARCHAR}," +
            "SpouseIDNo=" + "#{SpouseIDNo,jdbcType=VARCHAR}," +
            "SpouseContactNo=" + "#{SpouseContactNo,jdbcType=VARCHAR}," +
            "SpouseCompanyName=" + "#{SpouseCompanyName,jdbcType=VARCHAR}" +
            " Where custCode=" + "#{custCode,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanApplicantSpouseNameInfo_Entity entity);

    @Delete("DELETE FROM LoanApplicantSpouseNameInfo WHERE TRIM(custCode)=#{custCode,jdbcType=VARCHAR}")
    @ResultType(Boolean.class)
    boolean delete(String custCode);

}
