package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateMajorIssues_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
@Repository
public interface LoanCorporateMajorIssues_DAO {
    @Insert("insert into LoanCorporateMajorIssues(" +
            "custCode," +
            "IssueRecordSeqNo," +
            "IssueDescription) " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{IssueRecordSeqNo,jdbcType=VARCHAR}," +
            "#{IssueDescription,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanCorporateMajorIssues_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateMajorIssues Where custcode=" + "#{custcode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custcode);

    @Select("SELECT * FROM LoanCorporateMajorIssues Where custcode=" + "#{custcode,jdbcType=VARCHAR}"+" Order By id Asc")
    @ResultType(LoanCorporateMajorIssues_Entity.class)
    List<LoanCorporateMajorIssues_Entity> findAll(String custcode);

    @Update("Update LoanCorporateMajorIssues " +
            "SET " +
            "custCode=" + "#{custCode,jdbcType=VARCHAR}," +
            "IssueRecordSeqNo=" + "#{IssueRecordSeqNo,jdbcType=VARCHAR}," +
            "IssueDescription=" + "#{IssueDescription,jdbcType=VARCHAR}" +
            " Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateMajorIssues_Entity entity);

    @Delete("DELETE FROM LoanCorporateMajorIssues WHERE TRIM(id)=#{id,jdbcType=VARCHAR}")
//@Delete("DELETE FROM LoanCorporateMajorIssues WHERE TRIM(id) = #{id}")
    @ResultType(Boolean.class)
    boolean delete(String id);
}
