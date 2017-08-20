package com.ecsolutions.service;

import com.ecsolutions.entity.LoanApplicantSpouseNameInfo_Entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/11.
 */
public interface LoanApplicantSpouseNameInfo_Service {
    List<HashMap<String,String>> getIDTypeInfo();
    Integer countAll(String custCode);
    boolean save(LoanApplicantSpouseNameInfo_Entity entity);
    boolean update(LoanApplicantSpouseNameInfo_Entity entity);
    List<LoanApplicantSpouseNameInfo_Entity> findAll(String custCode);
    boolean delete(String custCode);
}
