package com.ecsolutions.service;

import com.ecsolutions.entity.LoanSpecialTradeLicense_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
public interface LoanSpecialTradeLicense_Service {
    Integer countAll(String CustCode);
    boolean save(LoanSpecialTradeLicense_Entity entity);
    boolean update(LoanSpecialTradeLicense_Entity entity);
    List<LoanSpecialTradeLicense_Entity> findAll(String CustCode);
    boolean delete(String Id);
}
