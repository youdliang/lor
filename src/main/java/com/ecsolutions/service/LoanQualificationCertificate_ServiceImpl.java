package com.ecsolutions.service;

import com.ecsolutions.dao.LoanQualificationCertificate_DAO;
import com.ecsolutions.entity.LoanQualificationCertificate_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
@Service("LoanQualificationCertificate_Service")
public class LoanQualificationCertificate_ServiceImpl implements LoanQualificationCertificate_Service {
    private LoanQualificationCertificate_DAO loanQualificationCertificate_dao;

    @Autowired
    public LoanQualificationCertificate_ServiceImpl(LoanQualificationCertificate_DAO loanQualificationCertificate_dao){
        this.loanQualificationCertificate_dao=loanQualificationCertificate_dao;
    }

    @Override
    public Integer countAll(String CustCode) {
        return loanQualificationCertificate_dao.countAll(CustCode);
    }

    @Override
    public boolean save(LoanQualificationCertificate_Entity entity) {
        return loanQualificationCertificate_dao.save(entity);
    }

    @Override
    public boolean update(LoanQualificationCertificate_Entity entity) {
        return loanQualificationCertificate_dao.update(entity);
    }

    @Override
    public List<LoanQualificationCertificate_Entity> findAll(String CustCode) {
        return loanQualificationCertificate_dao.findAll(CustCode);
    }

    @Override
    public boolean delete(String Id) {
        return loanQualificationCertificate_dao.delete(Id);
    }
}
