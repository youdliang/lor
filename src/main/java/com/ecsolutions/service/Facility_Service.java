package com.ecsolutions.service;

import com.ecsolutions.entity.Facility_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface Facility_Service {
    public Facility_Entity getPopupInfo();

    public String getByCustcod(String custcod);

    public List<Facility_Entity> getByCustcodInfo(String custcod);

    public Facility_Entity getByCustcodAndLineno(String custcod,String lineno);

    public void saveFacilityInfo(Facility_Entity facility_entity);

    public void updateFacilityInfo(Facility_Entity facility_entity);

    public void deleteFacilityInfo(String custcod,String lineno);

    public void updateFacilityInfoBycustcodAndLineno(Facility_Entity facility_entity);
}
