package com.ecsolutions.service;

import com.ecsolutions.dao.LoanSpecialTradeLicense_DAO;
import com.ecsolutions.entity.LoanSpecialTradeLicense_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
@Service("LoanSpecialTradeLicense_Service")
public class LoanSpecialTradeLicense_ServiceImpl implements LoanSpecialTradeLicense_Service {

    private LoanSpecialTradeLicense_DAO loanSpecialTradeLicense_dao;

    @Autowired
    public LoanSpecialTradeLicense_ServiceImpl(LoanSpecialTradeLicense_DAO loanSpecialTradeLicense_dao) {
        this.loanSpecialTradeLicense_dao = loanSpecialTradeLicense_dao;
    }

    @Override
    public Integer countAll(String CustCode) {
        return loanSpecialTradeLicense_dao.countAll(CustCode);
    }

    @Override
    public boolean save(LoanSpecialTradeLicense_Entity entity) {
        return loanSpecialTradeLicense_dao.save(entity);
    }

    @Override
    public boolean update(LoanSpecialTradeLicense_Entity entity) {
        return loanSpecialTradeLicense_dao.update(entity);
    }

    @Override
    public List<LoanSpecialTradeLicense_Entity> findAll(String CustCode) {
        return loanSpecialTradeLicense_dao.findAll(CustCode);
    }

    @Override
    public boolean delete(String Id) {
        return loanSpecialTradeLicense_dao.delete(Id);
    }
}
