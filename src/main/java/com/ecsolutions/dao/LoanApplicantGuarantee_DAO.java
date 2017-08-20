package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanApplicantGuarantee_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
@Repository
public interface LoanApplicantGuarantee_DAO {
    @Insert("insert into LoanApplicantGuarantee(CustCode,GuaranteeID,GuaranteeAmount,Balance,NameOfCreditors,BeAGuarantor,ByWayOfGuarantor,MaturityDate,Remark) " +
            "values (" +
            "#{CustCode,jdbcType=VARCHAR}," +
            "#{GuaranteeID,jdbcType=VARCHAR}," +
            "#{GuaranteeAmount,jdbcType=VARCHAR}," +
            "#{Balance,jdbcType=VARCHAR}," +
            "#{NameOfCreditors,jdbcType=VARCHAR}," +
            "#{BeAGuarantor,jdbcType=VARCHAR}," +
            "#{ByWayOfGuarantor,jdbcType=VARCHAR}," +
            "#{MaturityDate,jdbcType=VARCHAR}," +
            "#{Remark,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    public boolean save(LoanApplicantGuarantee_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanApplicantGuarantee WHERE CustCode="+"#{CustCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String CustCode);

    @Select("SELECT * FROM LoanApplicantGuarantee Where CustCode="+"#{CustCode,jdbcType=VARCHAR}"+" Order By GuaranteeID Asc")
    @ResultType(LoanApplicantGuarantee_Entity.class)
    List<LoanApplicantGuarantee_Entity> findAll(String CustCode);

    @Update("Update LoanApplicantGuarantee " +
            "SET " +
            "CustCode=" + "#{CustCode,jdbcType=VARCHAR}," +
            "GuaranteeAmount=" + "#{GuaranteeAmount,jdbcType=VARCHAR}," +
            "Balance=" + "#{Balance,jdbcType=VARCHAR}," +
            "NameOfCreditors=" + "#{NameOfCreditors,jdbcType=VARCHAR}," +
            "BeAGuarantor= " + "#{BeAGuarantor,jdbcType=VARCHAR}," +
            "ByWayOfGuarantor= " + "#{ByWayOfGuarantor,jdbcType=VARCHAR}," +
            "MaturityDate= " + "#{MaturityDate,jdbcType=VARCHAR}," +
            "Remark= " + "#{Remark,jdbcType=VARCHAR}" +
            "Where GuaranteeID=" + "#{GuaranteeID,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanApplicantGuarantee_Entity entity);

    @Delete("DELETE FROM LoanApplicantGuarantee Where GuaranteeID=" + "#{GuaranteeID,jdbcType=VARCHAR}")
    boolean delete(Integer GuaranteeID);
}
