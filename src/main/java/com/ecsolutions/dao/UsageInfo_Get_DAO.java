package com.ecsolutions.dao;

import com.ecsolutions.entity.UsageInfo_Get_Entity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/29.
 */
@Repository
public interface UsageInfo_Get_DAO {
//    @Select("")
//    @ResultType(UsageInfo_Get_Entity.class)
//    UsageInfo_Get_Entity getusageinfo(String lineno);

    @Select("Select distinct name from dbo.SchemaText")
    @ResultType(String.class)
    List<String> getproducts();

//    @Select("")
//    @ResultType(Map.class)
//    Map<String,BigDecimal> getrate();
//
    @Select("select distinct Flagtext from dbo.CondIndFlagText")
    @ResultType(String.class)
    List<String> getcollFlag();
//
//    @Select("")
//    @ResultType(String.class)
//    List<String> getdocFlag();
//
    @Select("Select officerId,name from adsuser.accountOfficerText ")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getManagerInfo();
}
