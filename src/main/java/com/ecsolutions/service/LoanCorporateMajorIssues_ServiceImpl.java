package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateMajorIssues_DAO;
import com.ecsolutions.entity.LoanCorporateMajorIssues_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
@Service("LoanCorporateMajorIssues_Service")
public class LoanCorporateMajorIssues_ServiceImpl implements LoanCorporateMajorIssues_Service {
    private LoanCorporateMajorIssues_DAO loanCorporateMajorIssues_dao;

    public LoanCorporateMajorIssues_ServiceImpl(LoanCorporateMajorIssues_DAO loanCorporateMajorIssues_dao){
       this.loanCorporateMajorIssues_dao=loanCorporateMajorIssues_dao;
    }

    @Override
    public Integer countAll(String custcode) {
        return loanCorporateMajorIssues_dao.countAll(custcode);
    }

    @Override
    public boolean save(LoanCorporateMajorIssues_Entity entity) {
        return loanCorporateMajorIssues_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateMajorIssues_Entity entity) {
        return loanCorporateMajorIssues_dao.update(entity);
    }

    @Override
    public List<LoanCorporateMajorIssues_Entity> findAll(String custcode) {
        return loanCorporateMajorIssues_dao.findAll(custcode);
    }

    @Override
    public boolean delete(String id) {
        return loanCorporateMajorIssues_dao.delete(id);
    }
}
