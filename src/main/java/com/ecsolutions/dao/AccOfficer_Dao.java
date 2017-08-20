package com.ecsolutions.dao;

import com.ecsolutions.entity.AccOfficer_Entity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/3.
 */
@Repository
public interface AccOfficer_Dao {
    @Select("Select officerId,name from adsuser.accountOfficer")
    @ResultType(AccOfficer_Entity.class)
    AccOfficer_Entity getOfficer();
}
