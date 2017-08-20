package com.ecsolutions.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/31.
 */
@Repository
public interface TacstMas_DAO {
    // SELECT CODTYPE,CSTLDES FROM TACSTMAS WHERE CODTYPE=ID
    @Select("SELECT CSTCOD2,CSTLDES FROM TACSTMAS WHERE CODTYPE='ID'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCODTYPEInfoList();
}
