package com.ecsolutions.dao;

import com.ecsolutions.entity.PIDTypeTextEnt;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tim on 2017/7/4.
 */
@Repository
public interface PIDTypeTextDao {

    @Select("SELECT * FROM dbo.PIDTypeText")
    //@Select("SELECT * FROM adsuser.PIDTypeText")
    @ResultType(PIDTypeTextEnt.class)
    List<PIDTypeTextEnt> getList();
}
