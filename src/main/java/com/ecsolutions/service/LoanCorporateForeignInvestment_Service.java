package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateForeignInvestment_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface LoanCorporateForeignInvestment_Service {
    LoanCorporateForeignInvestment_Entity getCCYListInfo();
    Integer countAll(String CustCode);
    boolean save(LoanCorporateForeignInvestment_Entity entity);
    boolean update(LoanCorporateForeignInvestment_Entity entity);
    List<LoanCorporateForeignInvestment_Entity> findAll(String CustCode);
    boolean delete(String Id);

}
