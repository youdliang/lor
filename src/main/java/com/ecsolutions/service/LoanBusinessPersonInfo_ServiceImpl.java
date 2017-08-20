package com.ecsolutions.service;

import com.ecsolutions.dao.LoanBusinessPersonInfo_DAO;
import com.ecsolutions.entity.LoanBusinessPersonInfo_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/17.
 */
@Service("LoanBusinessPersonInfo_Service")
public class LoanBusinessPersonInfo_ServiceImpl implements LoanBusinessPersonInfo_Service {
    private LoanBusinessPersonInfo_DAO dao;

    public LoanBusinessPersonInfo_ServiceImpl(LoanBusinessPersonInfo_DAO dao){
        this.dao=dao;
    }

    @Override
    public Integer countAll(String custCode) {
        return dao.countAll(custCode);
    }

    @Override
    public boolean save(LoanBusinessPersonInfo_Entity entity) {
        return dao.save(entity);
    }

    @Override
    public boolean update(LoanBusinessPersonInfo_Entity entity) {
        return dao.update(entity);
    }

    @Override
    public List<LoanBusinessPersonInfo_Entity> findAll(String custCode) {
        return dao.findAll(custCode);
    }

    @Override
    public boolean delete(String custCode) {
        return dao.delete(custCode);
    }
}
