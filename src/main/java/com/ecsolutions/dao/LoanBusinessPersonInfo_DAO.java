package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanBusinessPersonInfo_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/8/17.
 */
@Repository
public interface LoanBusinessPersonInfo_DAO {

    @Insert("insert into LoanBusinessPersonInfo(" +
            "custCode," +
            "BusinessCerficateID," +
            "BusinessDescription," +
            "BusinessOpeningDate," +
            "BusinessRegisterDate," +
            "BusinessRegisterLocation," +
            "InformationChannelCategory," +
            "InformationChannelDescription," +
            "NumberOfEmployee) " +
            "values (" +
            "#{custCode,jdbcType=VARCHAR}," +
            "#{BusinessCerficateID,jdbcType=VARCHAR}," +
            "#{BusinessDescription,jdbcType=VARCHAR}," +
            "to_date(#{BusinessOpeningDate,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "to_date(#{BusinessRegisterDate,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "#{BusinessRegisterLocation,jdbcType=VARCHAR}," +
            "#{InformationChannelCategory,jdbcType=VARCHAR}," +
            "#{InformationChannelDescription,jdbcType=VARCHAR}," +
            "#{NumberOfEmployee,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    public boolean save(LoanBusinessPersonInfo_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanBusinessPersonInfo WHERE custCode=" + "#{custCode,jdbcType=VARCHAR}")
    @ResultType(Integer.class)
    Integer countAll(String custCode);

    @Select("SELECT * FROM LoanBusinessPersonInfo Where custCode=" + "#{custCode,jdbcType=VARCHAR}" + " Order By custCode Asc")
    @ResultType(LoanBusinessPersonInfo_Entity.class)
    List<LoanBusinessPersonInfo_Entity> findAll(String custCode);

    @Update("Update LoanBusinessPersonInfo " +
            "SET " +
            "NumberOfEmployee=" + "#{NumberOfEmployee,jdbcType=VARCHAR}," +
            "BusinessCerficateID=" + "#{BusinessCerficateID,jdbcType=VARCHAR}," +
            "BusinessDescription=" + "#{BusinessDescription,jdbcType=VARCHAR}," +
            "BusinessOpeningDate=" + "to_date(#{BusinessOpeningDate,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "BusinessRegisterDate= " + "to_date(#{BusinessRegisterDate,jdbcType=VARCHAR},'yyyy-mm-dd')," +
            "BusinessRegisterLocation= " + "#{BusinessRegisterLocation,jdbcType=VARCHAR}," +
            "InformationChannelCategory= " + "#{InformationChannelCategory,jdbcType=VARCHAR}," +
            "InformationChannelDescription= " + "#{InformationChannelDescription,jdbcType=VARCHAR}" +
            "Where custCode=" + "#{custCode,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanBusinessPersonInfo_Entity entity);

    @Delete("DELETE FROM LoanBusinessPersonInfo Where custCode=" + "#{custCode,jdbcType=VARCHAR}")
    boolean delete(String custCode);
}
