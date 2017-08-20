package com.ecsolutions.service;

import com.ecsolutions.entity.contactInfo_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface contactInfo_Service {
    contactInfo_entity getPopupInfo();
    void saveContactEntity(contactInfo_entity contactinfo_entity);
    List<contactInfo_entity> contactInfoSearch(String custcode);
    void deleteContactinfo(String title);
}
