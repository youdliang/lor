package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateCapitalStructure_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Repository
public interface LoanCorporateCapitalStructure_DAO {

    @Insert("insert into LoanCorporateCapitalStructure(custcode,InvestmentPartyType,InvestmentPartyName,CreditCardNumber,OrganizationCode,RegistrationID) " +
            "values (" +
            "#{custcode,jdbcType=VARCHAR}," +
            "#{InvestmentPartyType,jdbcType=VARCHAR}," +
            "#{InvestmentPartyName,jdbcType=VARCHAR}," +
            "#{CreditCardNumber,jdbcType=VARCHAR}," +
            "#{OrganizationCode,jdbcType=VARCHAR}," +
            "#{RegistrationID,jdbcType=VARCHAR})")
    @ResultType(Boolean.class)
    public boolean save(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateCapitalStructure Where custcode="+"#{custcode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custcode);

    @Select("SELECT * FROM LoanCorporateCapitalStructure Where custcode="+"#{custcode,jdbcType=VARCHAR}"+" Order By Id Asc")
    @ResultType(LoanCorporateCapitalStructure_Entity.class)
    List<LoanCorporateCapitalStructure_Entity> findAll(String custcode);

    @Update("Update LoanCorporateCapitalStructure " +
            "SET " +
            "custcode=" + "#{custcode,jdbcType=VARCHAR},"+
            "InvestmentPartyType=" +"#{InvestmentPartyType,jdbcType=VARCHAR}," +
            "InvestmentPartyName=" +"#{InvestmentPartyName,jdbcType=VARCHAR}," +
            "CreditCardNumber=" +"#{CreditCardNumber,jdbcType=VARCHAR}," +
            "OrganizationCode=" + "#{OrganizationCode,jdbcType=VARCHAR}," +
            "RegistrationID= " +"#{RegistrationID,jdbcType=VARCHAR}"+
            "  Where Id=" + "#{Id,jdbcType=VARCHAR}"
            )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity);

    @Delete("DELETE FROM LoanCorporateCapitalStructure Where Id=" + "#{Id,jdbcType=VARCHAR}")
    boolean delete(String Id);
}
