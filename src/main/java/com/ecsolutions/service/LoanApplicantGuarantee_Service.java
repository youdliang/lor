package com.ecsolutions.service;

import com.ecsolutions.entity.LoanApplicantGuarantee_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
public interface LoanApplicantGuarantee_Service {
    Integer countAll(String CustCode);
    boolean save(LoanApplicantGuarantee_Entity entity);
    boolean update(LoanApplicantGuarantee_Entity entity);
    List<LoanApplicantGuarantee_Entity> findAll(String CustCode);
    boolean delete(Integer Id);
}
