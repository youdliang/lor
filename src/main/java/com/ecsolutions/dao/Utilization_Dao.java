package com.ecsolutions.dao;

import com.ecsolutions.entity.Facility_Entity;
import com.ecsolutions.entity.Utilization_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Repository
public interface Utilization_Dao {

    //币种类型
    @Select("select distinct ccy,ccyname from TACCYMAS")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCcyList();

    //文档标识类型
    @Select("select distinct flagtext,CondIndflag from condindflagtext")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getFlagList();

    //额度号类型
    @Select("select distinct lineno,linedesc from loanapplicantfacilityinfo where osamt>0 And expirydate>=trunc(sysdate)")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getLinenoList();

    //方案类型
    @Select("select distinct schetyp,schedes from hkbinsch")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getFanganList();

    //利率类型
    @Select("select ratetyp,intrtpa from tainrmas where TRIM(ccycode) = TRIM(#{drawccy}) and effdate=(select max(effdate) from tainrmas)")
    @ResultType(HashMap.class)
    List<HashMap<String,Object>> getLilvList(@Param("drawccy") String drawccy);

    //年利率
    @Select("select intrtpa from tainrmas where TRIM(ccycode) = TRIM(#{drawccy}) And TRIM(ratetyp) = TRIM(#{ratetype}) and effdate=(select max(effdate) from tainrmas)")
    @ResultType(String.class)
    String getNianLilvInfo(@Param("drawccy") String drawccy,@Param("ratetype") String ratetype);

    //经理名称
    @Select("select descrip from taacomas where TRIM(accoffe) = TRIM(#{accoffic})")
    @ResultType(String.class)
    String getJingLiInfo(String accoffic);

    //门类
    @Select("SELECT MENLEI,LEIBIEMINGCHENG FROM HANGYE WHERE DALEI is null AND ZHONGLEI is null AND XIAOLEI is null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getMengleiList();

    //大类
    @Select("SELECT DALEI,LEIBIEMINGCHENG FROM HANGYE WHERE TRIM(MENLEI) = TRIM(#{dircflag1}) AND DALEI is not null AND ZHONGLEI is null AND XIAOLEI is null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getDaleiList(@Param("dircflag1") String dircflag1);

    //中类
    @Select("SELECT ZHONGLEI,LEIBIEMINGCHENG FROM HANGYE WHERE TRIM(MENLEI) = TRIM(#{dircflag1}) AND TRIM(DALEI) = TRIM(#{dircflag2}) AND ZHONGLEI is not null AND XIAOLEI is null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhongleiList(@Param("dircflag1") String dircflag1,@Param("dircflag2") String dircflag2);

    //小类
    @Select("SELECT XIAOLEI,LEIBIEMINGCHENG FROM HANGYE WHERE TRIM(MENLEI) = TRIM(#{dircflag1}) AND TRIM(DALEI) = TRIM(#{dircflag2}) AND TRIM(ZHONGLEI) = TRIM(#{dircflag3}) AND XIAOLEI is not null")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getXiaoleiList(@Param("dircflag1") String dircflag1,@Param("dircflag2") String dircflag2,@Param("dircflag3") String dircflag3);

    //通过custcod查询出的信息
    @Select("select * from utilizationdetail where TRIM(custcod) = TRIM(#{custcod})")
    @ResultType(Utilization_Entity.class)
    List<Utilization_Entity> getByCustcodInfo(String custcod);

    //通过custcod和lineno查询出的Facility_Entity信息
    @Select("select * from loanapplicantfacilityinfo where TRIM(custcod) = TRIM(#{custcod}) AND TRIM(lineno) = TRIM(#{lineno})")
    @ResultType(Facility_Entity.class)
    Facility_Entity getByCustcodAndLinenoInfo(@Param("custcod") String custcod,@Param("lineno") String lineno);

    //通过custcod和lineno和loanref查询出的Utilization_Entity信息
    @Select("select * from utilizationdetail where TRIM(custcod) = TRIM(#{custcod}) AND TRIM(lineno) = TRIM(#{lineno}) AND TRIM(loanref) = TRIM(#{loanref})")
    @ResultType(Utilization_Entity.class)
    Utilization_Entity getUtilizationByCustcodAndLineno(@Param("custcod") String custcod,@Param("lineno") String lineno,@Param("loanref") String loanref);

    //保存授信信息
    @Insert({"insert into utilizationdetail(loanref,lineno,custcod,bpm_no,linedesc,lineccy,lineamt,avliamt,drawdate,anndate,schetype,drawccy,drawamt,ratetype,rate,spread,percent,schemarate,overdurate,paymentmethod,tenor,fixflag,payfreq,payper,firstpaydate,collflag,docflag,dircflag1,dircflag2,dircflag3,dircflag4,dircdesc,loanfreq,micprod,eduyear,marginamt,chgtype,chgamt,chgdate,accoffic,accofname,contractsymbol,signeddate,inaccname,inaccno,outacname,outaccno,fluserid,Duedate)","values(#{loanref,jdbcType=VARCHAR},#{lineno,jdbcType=VARCHAR},#{custcod,jdbcType=VARCHAR},#{bpm_no,jdbcType=VARCHAR},#{linedesc,jdbcType=VARCHAR},#{lineccy,jdbcType=VARCHAR},#{lineamt,jdbcType=NUMERIC},#{avliamt,jdbcType=NUMERIC},#{drawdate,jdbcType=TIMESTAMP},#{anndate,jdbcType=TIMESTAMP},#{schetype,jdbcType=VARCHAR},#{drawccy,jdbcType=VARCHAR},#{drawamt,jdbcType=NUMERIC},#{ratetype,jdbcType=VARCHAR},#{rate,jdbcType=NUMERIC},#{spread,jdbcType=NUMERIC},#{percent,jdbcType=NUMERIC},#{schemarate,jdbcType=NUMERIC},#{overdurate,jdbcType=NUMERIC},#{paymentmethod,jdbcType=VARCHAR},#{tenor,jdbcType=NUMERIC},#{fixflag,jdbcType=VARCHAR},#{payfreq,jdbcType=NUMERIC},#{payper,jdbcType=VARCHAR},#{firstpaydate,jdbcType=TIMESTAMP},#{collflag,jdbcType=VARCHAR},#{docflag,jdbcType=VARCHAR},#{dircflag1,jdbcType=VARCHAR},#{dircflag2,jdbcType=VARCHAR},#{dircflag3,jdbcType=VARCHAR},#{dircflag4,jdbcType=VARCHAR},#{dircdesc,jdbcType=VARCHAR},#{loanfreq,jdbcType=VARCHAR},#{micprod,jdbcType=VARCHAR},#{eduyear,jdbcType=NUMERIC},#{marginamt,jdbcType=NUMERIC},#{chgtype,jdbcType=VARCHAR},#{chgamt,jdbcType=NUMERIC},#{chgdate,jdbcType=TIMESTAMP},#{accoffic,jdbcType=VARCHAR},#{accofname,jdbcType=VARCHAR},#{contractsymbol,jdbcType=VARCHAR},#{signeddate,jdbcType=TIMESTAMP},#{inaccname,jdbcType=VARCHAR},#{inaccno,jdbcType=VARCHAR},#{outacname,jdbcType=VARCHAR},#{outaccno,jdbcType=VARCHAR},#{fluserid,jdbcType=VARCHAR},#{Duedate,jdbcType=TIMESTAMP})"})
    void saveUtilizationInfo(Utilization_Entity utilization_entity);

}
