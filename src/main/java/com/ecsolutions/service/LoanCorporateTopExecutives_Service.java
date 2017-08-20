package com.ecsolutions.service;

import com.ecsolutions.entity.LoanCorporateTopExecutives_Entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/31.
 */
public interface LoanCorporateTopExecutives_Service {
    LoanCorporateTopExecutives_Entity getCODTYPEInfo();
    Integer countAll(String CustCode);
    boolean save(LoanCorporateTopExecutives_Entity entity);
    boolean update(LoanCorporateTopExecutives_Entity entity);
    List<LoanCorporateTopExecutives_Entity> findAll(String CustCode);
    boolean delete(Integer Id);

}
