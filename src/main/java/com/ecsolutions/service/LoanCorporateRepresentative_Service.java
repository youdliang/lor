package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateRepresentative_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
public interface LoanCorporateRepresentative_Service {
    LoanCorporateRepresentative_Entity getCODTYPEInfo();
    Integer countAll(String custcode);
    boolean save(LoanCorporateRepresentative_Entity entity);
    boolean update(LoanCorporateRepresentative_Entity entity);
    List<LoanCorporateRepresentative_Entity> findAll(String custcode);
    boolean delete(String id);
}
