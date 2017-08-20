package com.ecsolutions.dao;

import com.ecsolutions.entity.Facility_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Repository
public interface Facility_Dao {
    //额度等级
    @Select("SELECT distinct linerrflag,flagtext FROM linerrflagtext")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getLinegradeList();

    //币种类型
    @Select("select distinct ccy,ccyname from TACCYMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCcyList();

    //文档标识类型
    @Select("select distinct flagtext,CondIndflag from condindflagtext")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getFlagList();

    //国家风险类型
    @Select("select distinct counnam,country from Tactymas")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCountryList();

    //通过custcod查询出的最大lineno
    @Select("select Max(lineno) from loanapplicantfacilityinfo where TRIM(custcod) = TRIM(#{custcod})")
    @ResultType(String.class)
    String getByCustcod(String custcod);

    //通过custcod查询出的信息
    @Select("select * from loanapplicantfacilityinfo where TRIM(custcod) = TRIM(#{custcod})")
    @ResultType(Facility_Entity.class)
    List<Facility_Entity> getByCustcodInfo(String custcod);

    //通过custcod和lineno查询出的信息
    @Select("select * from loanapplicantfacilityinfo where TRIM(custcod) = TRIM(#{custcod}) and TRIM(lineno) = TRIM(#{lineno})")
    @ResultType(Facility_Entity.class)
    Facility_Entity getByCustcodAndLineno(@Param("custcod") String custcod,@Param("lineno") String lineno);

    //保存授信信息
    @Insert({"insert into loanapplicantfacilityinfo(custcod,prodtype,haveloan,haveacceptance,havelg,havelc,haveotherloan,lineno,linedesc,linegrade,linestatus,lineccy,lineamt,usedamt,osamt,holdamt,avliamt,releaseamt,bondflag,acceptamt,letteramt,creditamt,collflag,docflag,createdate,revolflag,expirydate,countryrisk,remark,orgamt,fluserid,appflag)","values(#{custcod,jdbcType=VARCHAR},#{prodtype,jdbcType=VARCHAR},#{haveloan,jdbcType=NUMERIC},#{haveacceptance,jdbcType=NUMERIC},#{havelg,jdbcType=NUMERIC},#{havelc,jdbcType=NUMERIC},#{haveotherloan,jdbcType=NUMERIC},#{lineno,jdbcType=VARCHAR},#{linedesc,jdbcType=VARCHAR},#{linegrade,jdbcType=CHAR},#{linestatus,jdbcType=CHAR},#{lineccy,jdbcType=CHAR},#{lineamt,jdbcType=NUMERIC},#{usedamt,jdbcType=NUMERIC},#{osamt,jdbcType=NUMERIC},#{holdamt,jdbcType=NUMERIC},#{avliamt,jdbcType=NUMERIC},#{releaseamt,jdbcType=NUMERIC},#{bondflag,jdbcType=CHAR},#{acceptamt,jdbcType=NUMERIC},#{letteramt,jdbcType=NUMERIC},#{creditamt,jdbcType=NUMERIC},#{collflag,jdbcType=CHAR},#{docflag,jdbcType=CHAR},#{createdate,jdbcType=TIMESTAMP},#{revolflag,jdbcType=CHAR},#{expirydate,jdbcType=TIMESTAMP},#{countryrisk,jdbcType=CHAR},#{remark,jdbcType=VARCHAR},#{orgamt,jdbcType=NUMERIC},#{fluserid,jdbcType=VARCHAR},#{appflag,jdbcType=CHAR})"})
    void saveFacilityInfo(Facility_Entity facility_entity);

    //更新授信信息通过custcod和lineno
    @Update("update loanapplicantfacilityinfo set prodtype=#{prodtype,jdbcType=VARCHAR},haveloan=#{haveloan,jdbcType=NUMERIC},haveacceptance=#{haveacceptance,jdbcType=NUMERIC},havelg=#{havelg,jdbcType=NUMERIC},havelc=#{havelc,jdbcType=NUMERIC},haveotherloan=#{haveotherloan,jdbcType=NUMERIC},linedesc=#{linedesc,jdbcType=VARCHAR},linegrade=#{linegrade,jdbcType=CHAR},linestatus=#{linestatus,jdbcType=CHAR},lineccy=#{lineccy,jdbcType=CHAR},lineamt=#{lineamt,jdbcType=NUMERIC},usedamt=#{usedamt,jdbcType=NUMERIC},osamt=#{osamt,jdbcType=NUMERIC},holdamt=#{holdamt,jdbcType=NUMERIC},avliamt=#{avliamt,jdbcType=NUMERIC},releaseamt=#{releaseamt,jdbcType=NUMERIC},bondflag=#{bondflag,jdbcType=CHAR},acceptamt=#{acceptamt,jdbcType=NUMERIC},letteramt=#{letteramt,jdbcType=NUMERIC},creditamt=#{creditamt,jdbcType=NUMERIC},collflag=#{collflag,jdbcType=CHAR},docflag=#{docflag,jdbcType=CHAR},createdate=#{createdate,jdbcType=TIMESTAMP},revolflag=#{revolflag,jdbcType=CHAR},expirydate=#{expirydate,jdbcType=TIMESTAMP},countryrisk=#{countryrisk,jdbcType=CHAR},remark=#{remark,jdbcType=VARCHAR},orgamt=#{orgamt,jdbcType=NUMERIC},fluserid=#{fluserid,jdbcType=VARCHAR},appflag=#{appflag,jdbcType=CHAR} where custcod=#{custcod} and lineno=#{lineno}")
    void updateFacilityInfo(Facility_Entity facility_entity);

    //删除授信信息
    @Delete("delete loanapplicantfacilityinfo where TRIM(custcod)=TRIM(#{custcod}) and TRIM(lineno)=TRIM(#{lineno})")
    void deleteFacilityInfo(@Param("custcod") String custcod, @Param("lineno") String lineno);

    //更新模态框信息通过custcod和lineno
    @Update("update loanapplicantfacilityinfo set releaseamt=#{releaseamt,jdbcType=NUMERIC},osamt=#{osamt,jdbcType=NUMERIC},avliamt=#{avliamt,jdbcType=NUMERIC} where custcod=#{custcod} and lineno=#{lineno}")
    void updateFacilityInfoByCustcodAndLineno(Facility_Entity facility_entity);
}
