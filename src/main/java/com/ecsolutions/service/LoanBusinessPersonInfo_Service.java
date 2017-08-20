package com.ecsolutions.service;

import com.ecsolutions.entity.LoanBusinessPersonInfo_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/8/17.
 */
public interface LoanBusinessPersonInfo_Service {
    Integer countAll(String custCode);
    boolean save(LoanBusinessPersonInfo_Entity entity);
    boolean update(LoanBusinessPersonInfo_Entity entity);
    List<LoanBusinessPersonInfo_Entity> findAll(String custCode);
    boolean delete(String custCode);
}
