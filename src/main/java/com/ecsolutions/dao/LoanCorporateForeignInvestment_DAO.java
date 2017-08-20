package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateForeignInvestment_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Repository
public interface LoanCorporateForeignInvestment_DAO{
    @Insert("insert into LoanCorporateForeignInvestment(custCode,CreditCardNumber,InvesteeCompanyName,InvestmentAmount,InvestmentCurrency,OrganizationCode) " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{CreditCardNumber,jdbcType=VARCHAR}," +
            "#{InvesteeCompanyName,jdbcType=VARCHAR}," +
            "#{InvestmentAmount,jdbcType=VARCHAR}," +
            "#{InvestmentCurrency,jdbcType=VARCHAR}," +
            "#{OrganizationCode,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    public boolean save(LoanCorporateForeignInvestment_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateForeignInvestment Where CustCode="+"#{custCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custCode);

    @Select("SELECT * FROM LoanCorporateForeignInvestment Where CustCode="+"#{custCode,jdbcType=VARCHAR}"+" Order By Id Asc")
    @ResultType(LoanCorporateForeignInvestment_Entity.class)
    List<LoanCorporateForeignInvestment_Entity> findAll(String custCode);

    @Update("Update LoanCorporateForeignInvestment " +
            "SET " +
            "custCode=" + "#{custCode,jdbcType=VARCHAR},"+
            "CreditCardNumber=" + "#{CreditCardNumber,jdbcType=VARCHAR}," +
            "InvesteeCompanyName=" + "#{InvesteeCompanyName,jdbcType=VARCHAR}," +
            "InvestmentAmount=" + "#{InvestmentAmount,jdbcType=VARCHAR}," +
            "InvestmentCurrency= " + "#{InvestmentCurrency,jdbcType=VARCHAR}," +
            "OrganizationCode= " + "#{OrganizationCode,jdbcType=VARCHAR}" +
            "Where Id=" + "#{Id,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateForeignInvestment_Entity entity);

    @Delete("DELETE FROM LoanCorporateForeignInvestment Where Id="+"#{Id,jdbcType=VARCHAR}")
    boolean delete(String Id);
}
