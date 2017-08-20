package com.ecsolutions.service;

import com.ecsolutions.entity.liability_entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/16.
 */
public interface liability_Service {
    liability_entity getPopupInfo();
    void saveLiabilityEntity(liability_entity liability_entity);
    List<liability_entity> liabilityInfoSearch(String custcode);
    void deleteLiabilityInfo(String creditorname);
}
