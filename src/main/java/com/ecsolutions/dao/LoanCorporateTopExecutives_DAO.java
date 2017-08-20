package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateTopExecutives_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/31.
 */
@Repository
public interface LoanCorporateTopExecutives_DAO {
    @Insert("insert into LoanCorporateTopExecutives(" +
            "custCode," +
            "IDNumber," +
            "IDType," +
            "Sex," +
            "Birthday," +
            "Category," +
            "HighestEducationQualification," +
            "TopExecutiveName," +
            "WorkingHistory) " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{IDNumber,jdbcType=VARCHAR}," +
            "#{IDType,jdbcType=VARCHAR}," +
            "#{Sex,jdbcType=VARCHAR}," +
            "to_date(#{Birthday,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "#{Category,jdbcType=VARCHAR}," +
            "#{HighestEducationQualification,jdbcType=VARCHAR}," +
            "#{TopExecutiveName,jdbcType=VARCHAR}," +
            "#{WorkingHistory,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanCorporateTopExecutives_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateTopExecutives Where custCode=" + "#{CustCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String CustCode);

    @Select("SELECT * FROM LoanCorporateTopExecutives Where custCode=" + "#{CustCode,jdbcType=VARCHAR}"+" Order By id Asc")
    @ResultType(LoanCorporateTopExecutives_Entity.class)
    List<LoanCorporateTopExecutives_Entity> findAll(String CustCode);

    @Update("Update LoanCorporateTopExecutives " +
            "SET " +
            "custCode=" + "#{custCode,jdbcType=VARCHAR}," +
            "IDNumber=" + "#{IDNumber,jdbcType=VARCHAR}," +
            "IDType=" + "#{IDType,jdbcType=VARCHAR}," +
            "Sex=" + "#{Sex,jdbcType=VARCHAR}," +
            "Birthday=" + "to_date(#{Birthday,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "Category=" + "#{Category,jdbcType=VARCHAR}," +
            "TopExecutiveName=" + "#{TopExecutiveName,jdbcType=VARCHAR}," +
            "HighestEducationQualification=" + "#{HighestEducationQualification,jdbcType=VARCHAR}," +
            "WorkingHistory=" + "#{WorkingHistory,jdbcType=VARCHAR}" +
            " Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateTopExecutives_Entity entity);

    @Delete("DELETE FROM LoanCorporateTopExecutives Where id=" + "#{id,jdbcType=VARCHAR}")
    boolean delete(Integer id);
}
