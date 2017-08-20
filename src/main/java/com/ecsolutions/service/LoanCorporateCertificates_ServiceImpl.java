package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateCertificates_DAO;
import com.ecsolutions.entity.LoanCorporateCertificates_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
@Service("LoanCorporateCertificates_Service")
public class LoanCorporateCertificates_ServiceImpl implements LoanCorporateCertificates_Service {
    private LoanCorporateCertificates_DAO loanCorporateCertificates_dao;

    @Autowired
    public LoanCorporateCertificates_ServiceImpl(LoanCorporateCertificates_DAO loanCorporateCertificates_dao){
        this.loanCorporateCertificates_dao=loanCorporateCertificates_dao;
    }

    @Override
    public Integer countAll() {
        return loanCorporateCertificates_dao.countAll();
    }

    @Override
    public boolean save(LoanCorporateCertificates_Entity entity) {
        return loanCorporateCertificates_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateCertificates_Entity entity) {
        return loanCorporateCertificates_dao.update(entity);
    }

    @Override
    public List<LoanCorporateCertificates_Entity> findAll() {
        return loanCorporateCertificates_dao.findAll();
    }

    @Override
    public boolean delete(String CustCode) {
        return loanCorporateCertificates_dao.delete(CustCode);
    }
}
