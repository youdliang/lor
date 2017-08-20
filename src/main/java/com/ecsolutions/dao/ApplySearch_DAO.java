package com.ecsolutions.dao;

import com.ecsolutions.dao.SqlProvider.ApplySearch_Provider;
import com.ecsolutions.entity.ApplySearch_Entity;
import com.ecsolutions.entity.Credit_Entity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Repository
public interface ApplySearch_DAO {
    @Select("SELECT financing,line_no as lineNumber,linedesc as lineDescription,linegrade,linestatus,linelimitamt as lineAmount,lineosamt as remainingLineAmount,lineholdamt as freezingLineAmount,totalusedamt as usedLineAmount,availableamt as availableLineAmount FROM adsuser.LoanApplicantFacilityInfo WHERE LTRIM(RTRIM(custcode)) = LTRIM(RTRIM(#{customer_code})) ORDER BY line_no")
    @ResultType(Credit_Entity.class)
    List<Credit_Entity> getCreditInfoList(@Param("customer_code") String customerCode);

    @SelectProvider(type=ApplySearch_Provider.class, method="search")
    @ResultType(HashMap.class)
    List<ApplySearch_Entity> search(String startDate, String endDate, String personalFlag, String status, String manager, String custCod, String lastName, String lregno);

}
