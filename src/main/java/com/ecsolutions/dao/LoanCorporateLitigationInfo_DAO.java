package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateLitigationInfo_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
@Repository
public interface LoanCorporateLitigationInfo_DAO {

    @Insert("insert into LoanCorporateLitigationInfo(" +
            "IndictedRecordSeqNo," +
            "custCode," +
            "EnforcementResult," +
            "JudgmentEnforcementccy," +
            "JudgmentEnforcementAmount," +
            "JudgmentEnforcementDate," +
            "Prosecutor," +
            "IndictedReason) " +
            "values (" +
            "#{IndictedRecordSeqNo,jdbcType=VARCHAR}," +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{EnforcementResult,jdbcType=VARCHAR}," +
            "#{JudgmentEnforcementccy,jdbcType=VARCHAR}," +
            "#{JudgmentEnforcementAmount,jdbcType=VARCHAR}," +
            "to_date(#{JudgmentEnforcementDate,jdbcType=VARCHAR},'YYYY-MM-DD')," +
            "#{Prosecutor,jdbcType=VARCHAR}," +
            "#{IndictedReason,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanCorporateLitigationInfo_Entity entity);

    @Select("Select IndictedReason FROM LoanCorporateLitigationInfo Where Id="+"#{Id,jdbcType=VARCHAR}")
    @ResultType(String.class)
    String getIndictedReason(String Id);

    @Select("SELECT COUNT(*) FROM LoanCorporateLitigationInfo Where custcode="+"#{custcode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custcode);

    @Select("SELECT * FROM LoanCorporateLitigationInfo Where custcode="+"#{custcode,jdbcType=VARCHAR}"+" Order By Id Asc")
    @ResultType(LoanCorporateLitigationInfo_Entity.class)
    List<LoanCorporateLitigationInfo_Entity> findAll(String custcode);

    @Update("Update LoanCorporateLitigationInfo " +
            "SET " +
            "IndictedRecordSeqNo=" + "#{IndictedRecordSeqNo,jdbcType=VARCHAR},"+
            "custCode=" +"#{custCode,jdbcType=VARCHAR}," +
            "EnforcementResult=" +"#{EnforcementResult,jdbcType=VARCHAR}," +
            "JudgmentEnforcementccy=" +"#{JudgmentEnforcementccy,jdbcType=VARCHAR}," +
            "JudgmentEnforcementAmount=" + "#{JudgmentEnforcementAmount,jdbcType=VARCHAR}," +
            "JudgmentEnforcementDate= " +"to_date(#{JudgmentEnforcementDate,jdbcType=VARCHAR},'YYYY-MM-DD'),"+
            "Prosecutor= " +"#{Prosecutor,jdbcType=VARCHAR},"+
            "IndictedReason= " +"#{IndictedReason,jdbcType=VARCHAR}"+
            " Where Id=" + "#{Id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateLitigationInfo_Entity entity);

    @Delete("DELETE FROM LoanCorporateLitigationInfo Where Id=#{Id,jdbcType=VARCHAR}")
    @ResultType(Boolean.class)
    boolean delete(String Id);
    
}
