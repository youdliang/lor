package com.ecsolutions.service;

import com.ecsolutions.dao.Facility_Dao;
import com.ecsolutions.entity.Facility_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Service("Facility_Service")
public class Facility_ServiceImpl implements Facility_Service {

    private Facility_Dao facility_dao;

    @Autowired
    public Facility_ServiceImpl(Facility_Dao facility_dao) {
        this.facility_dao = facility_dao;
    }

    @Override
    public Facility_Entity getPopupInfo() {
        Facility_Entity facility_entity = new Facility_Entity();
        List<HashMap<String,String>> linegradeList = facility_dao.getLinegradeList();
        List<HashMap<String,String>> ccyList = facility_dao.getCcyList();
        List<HashMap<String,String>> flagList = facility_dao.getFlagList();
        List<HashMap<String,String>> countryList = facility_dao.getCountryList();

        facility_entity.setLinegradeList(linegradeList);
        facility_entity.setCcyList(ccyList);
        facility_entity.setFlagList(flagList);
        facility_entity.setCountryList(countryList);

        return facility_entity;
    }

    @Override
    public String getByCustcod(String custcod) {
        return facility_dao.getByCustcod(custcod);
    }

    @Override
    public List<Facility_Entity> getByCustcodInfo(String custcod) {
        return facility_dao.getByCustcodInfo(custcod);
    }

    @Override
    public Facility_Entity getByCustcodAndLineno(String custcod, String lineno) {
        return facility_dao.getByCustcodAndLineno(custcod,lineno);
    }

    @Override
    public void saveFacilityInfo(Facility_Entity facility_entity) {
        facility_dao.saveFacilityInfo(facility_entity);
    }

    @Override
    public void updateFacilityInfo(Facility_Entity facility_entity) {
        facility_dao.updateFacilityInfo(facility_entity);
    }

    @Override
    public void deleteFacilityInfo(String custcod, String lineno) {
        facility_dao.deleteFacilityInfo(custcod,lineno);
    }

    @Override
    public void updateFacilityInfoBycustcodAndLineno(Facility_Entity facility_entity) {
        facility_dao.updateFacilityInfoByCustcodAndLineno(facility_entity);
    }
}
