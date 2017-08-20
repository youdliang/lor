package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateMajorIssues_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
public interface LoanCorporateMajorIssues_Service {
    Integer countAll(String custcode);
    boolean save(LoanCorporateMajorIssues_Entity entity);
    boolean update(LoanCorporateMajorIssues_Entity entity);
    List<LoanCorporateMajorIssues_Entity> findAll(String custcode);
    boolean delete(String id);
}
