package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateCapitalStructure_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/2.
 */
public interface LoanCorporateCapitalStructure_Service {

    Integer countAll(String custcode);
    boolean save(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity);
    boolean update(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity);
    List<LoanCorporateCapitalStructure_Entity> findAll(String custcode);
    boolean delete(String id);
}
