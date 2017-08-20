package com.ecsolutions.service;

import com.ecsolutions.dao.LoanApplicantGuarantee_DAO;
import com.ecsolutions.entity.LoanApplicantGuarantee_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/7.
 */
@Service("LoanApplicantGuarantee_Service")
public class LoanApplicantGuarantee_ServiceImpl implements LoanApplicantGuarantee_Service {
    private LoanApplicantGuarantee_DAO loanApplicantGuarantee_dao;

    public LoanApplicantGuarantee_ServiceImpl(LoanApplicantGuarantee_DAO loanApplicantGuarantee_dao){
        this.loanApplicantGuarantee_dao=loanApplicantGuarantee_dao;
    }
    @Override
    public Integer countAll(String CustCode) {
        return loanApplicantGuarantee_dao.countAll(CustCode);
    }

    @Override
    public boolean save(LoanApplicantGuarantee_Entity entity) {
        return loanApplicantGuarantee_dao.save(entity);
    }

    @Override
    public boolean update(LoanApplicantGuarantee_Entity entity) {
        return loanApplicantGuarantee_dao.update(entity);
    }

    @Override
    public List<LoanApplicantGuarantee_Entity> findAll(String CustCode) {
        return loanApplicantGuarantee_dao.findAll(CustCode);
    }

    @Override
    public boolean delete(Integer Id) {
        return loanApplicantGuarantee_dao.delete(Id);
    }
}
