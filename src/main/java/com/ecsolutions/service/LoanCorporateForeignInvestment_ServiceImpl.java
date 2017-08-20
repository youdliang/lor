package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateForeignInvestment_DAO;
import com.ecsolutions.dao.TaCCYMas_DAO;
import com.ecsolutions.entity.LoanCorporateForeignInvestment_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
@Service("LoanCorporateForeignInvestment")
public class LoanCorporateForeignInvestment_ServiceImpl implements LoanCorporateForeignInvestment_Service {
    private TaCCYMas_DAO taCCYMas_dao;
    private LoanCorporateForeignInvestment_DAO loanCorporateForeignInvestment_dao;

    @Autowired
    public LoanCorporateForeignInvestment_ServiceImpl(TaCCYMas_DAO taCCYMas_dao, LoanCorporateForeignInvestment_DAO loanCorporateForeignInvestment_dao) {
        this.taCCYMas_dao = taCCYMas_dao;
        this.loanCorporateForeignInvestment_dao = loanCorporateForeignInvestment_dao;
    }

    @Override
    public LoanCorporateForeignInvestment_Entity getCCYListInfo() {
        LoanCorporateForeignInvestment_Entity result=new LoanCorporateForeignInvestment_Entity();
        result.setCcyInfoList(taCCYMas_dao.getCCYInfoList());
        return result;
    }

    @Override
    public Integer countAll(String custCode) {
        return loanCorporateForeignInvestment_dao.countAll(custCode);
    }

    @Override
    public boolean save(LoanCorporateForeignInvestment_Entity entity) {
        return loanCorporateForeignInvestment_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateForeignInvestment_Entity entity) {
        return loanCorporateForeignInvestment_dao.update(entity);
    }

    @Override
    public List<LoanCorporateForeignInvestment_Entity> findAll(String custCode) {
        return loanCorporateForeignInvestment_dao.findAll(custCode);
    }

    @Override
    public boolean delete(String Id) {
        return loanCorporateForeignInvestment_dao.delete(Id);
    }
}
