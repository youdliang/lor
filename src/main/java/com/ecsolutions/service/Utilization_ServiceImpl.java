package com.ecsolutions.service;

import com.ecsolutions.dao.Utilization_Dao;
import com.ecsolutions.entity.Facility_Entity;
import com.ecsolutions.entity.Utilization_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Service("Utilization_Service")
public class Utilization_ServiceImpl implements Utilization_Service {

    private Utilization_Dao utilization_dao;

    @Autowired
    public Utilization_ServiceImpl(Utilization_Dao utilization_dao) {
        this.utilization_dao = utilization_dao;
    }

    @Override
    public Utilization_Entity getPopupInfo() {
        Utilization_Entity utilization_entity = new Utilization_Entity();
        List<HashMap<String, String>> linenoList = utilization_dao.getLinenoList();
        List<HashMap<String, String>> biaoshiList = utilization_dao.getFlagList();
        List<HashMap<String, String>> ccyList = utilization_dao.getCcyList();
        List<HashMap<String, String>> fanganList = utilization_dao.getFanganList();
        List<HashMap<String, String>> meileiList = utilization_dao.getMengleiList();

        utilization_entity.setLinenoList(linenoList);
        utilization_entity.setBiaoshiList(biaoshiList);
        utilization_entity.setCcyList(ccyList);
        utilization_entity.setFanganList(fanganList);
        utilization_entity.setMeileiList(meileiList);

        return utilization_entity;
    }

    @Override
    public List<Utilization_Entity> getByCustcodInfo(String custcod) {
        return utilization_dao.getByCustcodInfo(custcod);
    }

    @Override
    public List<HashMap<String, String>> getByMenleiInfo(String dircflag1) {
        return utilization_dao.getDaleiList(dircflag1);
    }

    @Override
    public List<HashMap<String, String>> getByMenleiAndDaleiInfo(String dircflag1, String dircflag2) {
        return utilization_dao.getZhongleiList(dircflag1,dircflag2);
    }

    @Override
    public List<HashMap<String, String>> getByMenleiAndDaleiAndZhongleiInfo(String dircflag1, String dircflag2, String dircflag3) {
        return utilization_dao.getXiaoleiList(dircflag1,dircflag2,dircflag3);
    }

    @Override
    public Facility_Entity getFacilityInfoByCustcodAndLineno(String custcod, String lineno) {
        return utilization_dao.getByCustcodAndLinenoInfo(custcod,lineno);
    }

    @Override
    public List<HashMap<String, Object>> getByLiLvInfo(String drawccy) {
        return utilization_dao.getLilvList(drawccy);
    }

    @Override
    public String getNianlilvInfo(String drawccy, String ratetype) {
        return utilization_dao.getNianLilvInfo(drawccy,ratetype);
    }

    @Override
    public String getJingLiMingChenInfo(String accoffic) {
        return utilization_dao.getJingLiInfo(accoffic);
    }

    @Override
    public Utilization_Entity getUtilizationByCustcodAndLineno(String custcod, String lineno,String loanref) {
        return utilization_dao.getUtilizationByCustcodAndLineno(custcod,lineno,loanref);
    }

    @Override
    public void saveUtilizationInfo(Utilization_Entity utilization_entity) {
        utilization_dao.saveUtilizationInfo(utilization_entity);
    }

    @Override
    public List<HashMap<String, Object>> getRatetypeList(String drawccy) {
        return utilization_dao.getLilvList(drawccy);
    }

    @Override
    public List<HashMap<String, String>> getDaleiList(String dorcflag1) {
        return utilization_dao.getDaleiList(dorcflag1);
    }

    @Override
    public List<HashMap<String, String>> getZhongleiList(String dorcflag1, String dorcflag2) {
        return utilization_dao.getZhongleiList(dorcflag1,dorcflag2);
    }

    @Override
    public List<HashMap<String, String>> getXiaoleiList(String dorcflag1, String dorcflag2, String dorcflag3) {
        return utilization_dao.getXiaoleiList(dorcflag1,dorcflag2,dorcflag3);
    }


}
