package com.ecsolutions.service;

import com.ecsolutions.entity.coCtrRelaInfo_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface coCtrRelaInfo_Service {
    coCtrRelaInfo_entity getPopupInfo();
    void saveCoCtrRelaEntity(coCtrRelaInfo_entity coctrrelainfo_entity);
    List<coCtrRelaInfo_entity> coCtrRelaInfoSearch(String custcode);
    void deleteCoCtrRelaInfo(String enterpriseName);
}
