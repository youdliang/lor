package com.ecsolutions.service;

import com.ecsolutions.entity.LoanQualificationCertificate_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
public interface LoanQualificationCertificate_Service {
    Integer countAll(String CustCode);
    boolean save(LoanQualificationCertificate_Entity entity);
    boolean update(LoanQualificationCertificate_Entity entity);
    List<LoanQualificationCertificate_Entity> findAll(String CustCode);
    boolean delete(String Id);
}
