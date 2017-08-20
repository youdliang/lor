package com.ecsolutions.service;

import com.ecsolutions.dao.UsageInfo_Get_DAO;
import com.ecsolutions.entity.UsageInfo_Get_Entity;
import com.ecsolutions.entity.UsageInfo_Save_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */

@Service("UsageInfo_Service")
public class UsageInfo__ServiceImpl implements UsageInfo_Service {
    private UsageInfo_Get_DAO dao;



    @Autowired
    public UsageInfo__ServiceImpl(UsageInfo_Get_DAO dao){
        this.dao = dao;
    }

    @Override
    public UsageInfo_Get_Entity getCombineInfo(){

//        setusageinfo(lineno);
        UsageInfo_Get_Entity entity=new UsageInfo_Get_Entity();
        List<String> prods=this.dao.getproducts();
        entity.setProd_Type(prods);

        List<String> docFlags=this.dao.getcollFlag();
        entity.setDocFlag(docFlags);

        List<HashMap<String,String>> mng=this.dao.getManagerInfo();
        entity.setOfficer(mng);

        return entity;
    }

    @Override
    public String saveUsageInfo(UsageInfo_Save_Entity saveEntity){
        return "Developing";
    }


    private void setusageinfo(String lineno)
    {
       // this.entity=dao.getusageinfo(lineno);
    }


    private void setrate(){

        //rate=dao.getrate();
       // this.entity.setRate(rate);

    }

    private void setcollFlag(){
        List<String> colls;
        //colls=dao.getcollFlag();
        //this.entity.setCollflag(colls);

    }

    private void setdocFlag(){
        List<String> docs;
        //docs=dao.getdocFlag();
       // this.entity.setDocflag(docs);
    }

    private void setManagerInfo(){

       // mng=dao.getManagerInfo();
       // this.entity.setManagers(mng);
    }
}
