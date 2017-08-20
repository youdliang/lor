package com.ecsolutions.service;

import com.ecsolutions.entity.document_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface document_Service {
    document_entity getPopupInfo();
    void saveDocEntity(document_entity document_entity);
    String ChcekLineno(String line_no,String custcode);
    List<document_entity> docInfoSearch(String custcode);
    void deleteDocinfo(String docNo);
}
