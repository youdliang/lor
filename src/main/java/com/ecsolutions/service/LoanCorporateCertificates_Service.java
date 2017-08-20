package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateCertificates_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
public interface LoanCorporateCertificates_Service {
    Integer countAll();
    boolean save(LoanCorporateCertificates_Entity entity);
    boolean update(LoanCorporateCertificates_Entity entity);
    List<LoanCorporateCertificates_Entity> findAll();
    boolean delete(String CustCode);
}
