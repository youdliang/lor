package com.ecsolutions.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017-7-18.
 */
@Repository
public interface DanBao_Dao {

    @Select("select userid,username from tblusers where userid='1'")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getUserInfo();
}
