package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanApplicantShareholderInfor_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
@Repository
public interface LoanApplicantShareholderInfor_DAO {
    @Insert("insert into LoanApplicantShareholderInfor(" +
            "CustCod," +
            "Type," +
            "IDtype," +
            "IDNum," +
            "IDNumber," +
            "Name," +
            "Proportion," +
            "Organizationcode," +
            "AgencyCreditcode" +
            ") " +
            "values (" +
            "#{CustCod,jdbcType=VARCHAR}," +
            "#{Type,jdbcType=VARCHAR}," +
            "#{IDtype,jdbcType=VARCHAR}," +
            "#{IDNum,jdbcType=VARCHAR}," +
            "#{IDNumber,jdbcType=VARCHAR}," +
            "#{Name,jdbcType=VARCHAR}," +
            "#{Proportion,jdbcType=VARCHAR}," +
            "#{Organizationcode,jdbcType=VARCHAR}," +
            "#{AgencyCreditcode,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    boolean save(LoanApplicantShareholderInfor_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanApplicantShareholderInfor Where CustCod="
            + "#{param1,jdbcType=VARCHAR}"
            + " AND TRIM(Type)="
            + "#{param2,jdbcType=VARCHAR}"
    )
    @ResultType(Integer.class)
    Integer countAll(String CustCod, String Type);

    @Select("SELECT * FROM LoanApplicantShareholderInfor Where CustCod="
            + "#{param1,jdbcType=VARCHAR}"
            + " AND TRIM(Type)="
            + "#{param2,jdbcType=VARCHAR}"
            +" Order By id Asc"
    )
    @ResultType(LoanApplicantShareholderInfor_Entity.class)
    List<LoanApplicantShareholderInfor_Entity> findAll(String CustCod, String Type);

    @Update("Update LoanApplicantShareholderInfor " +
            "SET " +
            "CustCod=" + "#{CustCod,jdbcType=VARCHAR}," +
            "Type=" + "#{Type,jdbcType=VARCHAR}," +
            "IDtype=" + "#{IDtype,jdbcType=VARCHAR}," +
            "IDNum=" + "#{IDNum,jdbcType=VARCHAR}," +
            "IDNumber=" + "#{IDNumber,jdbcType=VARCHAR}," +
            "Name=" + "#{Name,jdbcType=VARCHAR}," +
            "Proportion=" + "#{Proportion,jdbcType=VARCHAR}," +
            "Organizationcode=" + "#{Organizationcode,jdbcType=VARCHAR}," +
            "AgencyCreditcode=" + "#{AgencyCreditcode,jdbcType=VARCHAR}" +
            " Where id=" + "#{id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanApplicantShareholderInfor_Entity entity);

    @Delete("DELETE FROM LoanApplicantShareholderInfor WHERE TRIM(id)=#{id,jdbcType=VARCHAR}")
    @ResultType(Boolean.class)
    boolean delete(String id);
}
