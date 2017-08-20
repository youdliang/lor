package com.ecsolutions.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Repository
public interface TaCCYMas_DAO{
    // select CCY
    @Select("SELECT CCY,CCYNAME FROM TACCYMAS ")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCCYInfoList();

}
