package com.ecsolutions.service;

import com.ecsolutions.entity.rePerInfo_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
public interface rePerInfo_Service {
    rePerInfo_entity getPopupInfo();
    void saveRePerEntity(rePerInfo_entity reperinfo_entity);
    void deleteReperInfo(String hierarchy);
    rePerInfo_entity pIdNoCheck(String pIdNo);
    List<rePerInfo_entity> rePerInfoSearch(String custcode);
}
