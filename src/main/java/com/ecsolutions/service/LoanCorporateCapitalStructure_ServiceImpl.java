package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateCapitalStructure_DAO;
import com.ecsolutions.entity.LoanCorporateCapitalStructure_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/2.
 */
@Service("LoanCorporateCapitalStructure_Service")
public class LoanCorporateCapitalStructure_ServiceImpl implements LoanCorporateCapitalStructure_Service {
    private LoanCorporateCapitalStructure_DAO loanCorporateCapitalStructure_dao;

    @Autowired
    public LoanCorporateCapitalStructure_ServiceImpl(LoanCorporateCapitalStructure_DAO loanCorporateCapitalStructure_dao){
        this.loanCorporateCapitalStructure_dao=loanCorporateCapitalStructure_dao;
    }

    @Override
    public Integer countAll(String custcode) {
        return loanCorporateCapitalStructure_dao.countAll(custcode);
    }

    @Override
    public boolean save(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity) {
        return loanCorporateCapitalStructure_dao.save(loanCorporateCapitalStructure_entity);
    }

    @Override
    public boolean update(LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity) {
        return loanCorporateCapitalStructure_dao.update(loanCorporateCapitalStructure_entity);
    }

    @Override
    public List<LoanCorporateCapitalStructure_Entity> findAll(String custcode) {
        return loanCorporateCapitalStructure_dao.findAll(custcode);
    }

    @Override
    public boolean delete(String costcode) {
        return loanCorporateCapitalStructure_dao.delete(costcode);
    }

}
