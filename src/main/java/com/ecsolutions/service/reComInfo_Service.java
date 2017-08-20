package com.ecsolutions.service;

import com.ecsolutions.entity.reComInfo_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface reComInfo_Service {
    reComInfo_entity getPopupInfo();
    void saveReComEntity(reComInfo_entity recominfo_entity);
    reComInfo_entity QueryByEthnic(String ethnic);
    List<reComInfo_entity> reComInfoSearch(String custcode);
    void deleteRecominfo(String ethnic);
    String ChcekEthnic(String ethnic,String custcode);
}
