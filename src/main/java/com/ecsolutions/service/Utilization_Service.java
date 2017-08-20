package com.ecsolutions.service;

import com.ecsolutions.entity.Facility_Entity;
import com.ecsolutions.entity.Utilization_Entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface Utilization_Service {
    public Utilization_Entity getPopupInfo();

    public List<Utilization_Entity> getByCustcodInfo(String custcod);

    public List<HashMap<String,String>> getByMenleiInfo(String dircflag1);

    public List<HashMap<String,String>> getByMenleiAndDaleiInfo(String dircflag1,String dircflag2);

    public List<HashMap<String,String>> getByMenleiAndDaleiAndZhongleiInfo(String dircflag1,String dircflag2,String dircflag3);

    public Facility_Entity getFacilityInfoByCustcodAndLineno(String custcod,String lineno);

    public List<HashMap<String,Object>> getByLiLvInfo(String drawccy);

    public String getNianlilvInfo(String drawccy,String ratetype);

    public String getJingLiMingChenInfo(String accoffic);

    public Utilization_Entity getUtilizationByCustcodAndLineno(String custcod,String lineno,String loanref);

    public void saveUtilizationInfo(Utilization_Entity utilization_entity);

    public List<HashMap<String,Object>> getRatetypeList(String drawccy);

    public List<HashMap<String,String>> getDaleiList(String dorcflag1);

    public List<HashMap<String,String>> getZhongleiList(String dorcflag1,String dorcflag2);

    public List<HashMap<String,String>> getXiaoleiList(String dorcflag1,String dorcflag2,String dorcflag3);


}
