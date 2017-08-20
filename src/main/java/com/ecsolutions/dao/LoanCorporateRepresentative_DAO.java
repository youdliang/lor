package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateRepresentative_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
@Repository
public interface LoanCorporateRepresentative_DAO {
    @Insert("insert into LoanCorporateRepresentative(" +
            "custCode," +
            "FamilyMemberName," +
            "CompanyName," +
            "CreditCardNumber," +
            "IDType," +
            "IDNumber," +
            "Relationship) " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{FamilyMemberName,jdbcType=VARCHAR}," +
            "#{CompanyName,jdbcType=VARCHAR}," +
            "#{CreditCardNumber,jdbcType=VARCHAR}," +
            "#{IDType,jdbcType=VARCHAR}," +
            "#{IDNumber,jdbcType=VARCHAR}," +
            "#{Relationship,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanCorporateRepresentative_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateRepresentative Where custCode=" + "#{custCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custCode);

    @Select("SELECT * FROM LoanCorporateRepresentative Where custCode=" + "#{custCode,jdbcType=VARCHAR}"+" Order By id Asc")
    @ResultType(LoanCorporateRepresentative_Entity.class)
    List<LoanCorporateRepresentative_Entity> findAll(String custCode);

    @Update("Update LoanCorporateRepresentative " +
            "SET " +
            "custCode=" + "#{custCode,jdbcType=VARCHAR}," +
            "FamilyMemberName=" + "#{FamilyMemberName,jdbcType=VARCHAR}," +
            "CompanyName=" + "#{CompanyName,jdbcType=VARCHAR}," +
            "CreditCardNumber=" + "#{CreditCardNumber,jdbcType=VARCHAR}," +
            "IDType=" + "#{IDType,jdbcType=VARCHAR}," +
            "IDNumber=" + "#{IDNumber,jdbcType=VARCHAR}," +
            "Relationship=" + "#{Relationship,jdbcType=VARCHAR}" +
            " Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateRepresentative_Entity entity);

    @Delete("DELETE FROM LoanCorporateRepresentative WHERE TRIM(id)=#{id,jdbcType=VARCHAR}")
    @ResultType(Boolean.class)
    boolean delete(String id);
}
