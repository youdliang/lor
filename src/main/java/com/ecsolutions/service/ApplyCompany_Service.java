package com.ecsolutions.service;

import com.ecsolutions.entity.Apply_entity;

/**
 * Created by Administrator on 2017/7/4.
 */
public interface ApplyCompany_Service {
    Apply_entity getPopupInfo();
    void saveApplyEntity(Apply_entity apply_entity);
    String ethnicCheck(String ethnic);
}
