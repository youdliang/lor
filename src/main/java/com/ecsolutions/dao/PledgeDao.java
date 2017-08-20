package com.ecsolutions.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.ecsolutions.entity.PledgeEnt;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tim on 2017/6/27.
 */

@Repository
public interface PledgeDao {

    @Select("SELECT * FROM LOANAPPLICANTPLEDGE WHERE TRIM(id) = TRIM(#{id}) ")
    @ResultType(PledgeEnt.class)
    PledgeEnt getPledge(@Param("id") String recordId);

    @Select("SELECT * FROM LOANAPPLICANTPLEDGE WHERE TRIM(line_no) = TRIM(#{line_no}) AND TRIM(CUSTCOD) = TRIM(#{CUSTCOD}) ")
    @ResultType(PledgeEnt.class)
    List<PledgeEnt> getPledgeList(@Param("line_no") String line_no, @Param("CUSTCOD") String CUSTCOD);

}
