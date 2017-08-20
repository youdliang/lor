package com.ecsolutions.service;

import com.ecsolutions.entity.LoanApplicantShareholderInfor_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
public interface LoanApplicantShareholderInfor_Service {
    LoanApplicantShareholderInfor_Entity getIDTypeInfo();
    Integer countAll(String custcode, String Type);
    boolean save(LoanApplicantShareholderInfor_Entity entity);
    boolean update(LoanApplicantShareholderInfor_Entity entity);
    List<LoanApplicantShareholderInfor_Entity> findAll(String CustCod, String Type);
    boolean delete(String id);
}
