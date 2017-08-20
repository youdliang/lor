package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateLitigationInfo_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
public interface LoanCorporateLitigationInfo_Service {
    LoanCorporateLitigationInfo_Entity getCCYListInfo();
    Integer countAll(String custcode);
    boolean save(LoanCorporateLitigationInfo_Entity entity);
    boolean update(LoanCorporateLitigationInfo_Entity entity);
    List<LoanCorporateLitigationInfo_Entity> findAll(String custcode);
    boolean delete(String id);
    String getIndictedReason(String Id);
}
