package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateLitigationInfo_DAO;
import com.ecsolutions.dao.TaCCYMas_DAO;
import com.ecsolutions.entity.LoanCorporateLitigationInfo_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
@Service("LoanCorporateLitigationInfo_Service")
public class LoanCorporateLitigationInfo_ServiceImpl implements LoanCorporateLitigationInfo_Service {
    private LoanCorporateLitigationInfo_DAO loanCorporateLitigationInfo_dao;
    private TaCCYMas_DAO taCCYMas_dao;

    public LoanCorporateLitigationInfo_ServiceImpl(LoanCorporateLitigationInfo_DAO loanCorporateLitigationInfo_dao, TaCCYMas_DAO taCCYMas_dao){
        this.loanCorporateLitigationInfo_dao=loanCorporateLitigationInfo_dao;
        this.taCCYMas_dao=taCCYMas_dao;
    }

    @Override
    public LoanCorporateLitigationInfo_Entity getCCYListInfo() {
        LoanCorporateLitigationInfo_Entity entity=new LoanCorporateLitigationInfo_Entity();
        entity.setCcyInfoList(taCCYMas_dao.getCCYInfoList());
        return entity;
    }

    @Override
    public Integer countAll(String custcode) {
        return loanCorporateLitigationInfo_dao.countAll(custcode);
    }

    @Override
    public boolean save(LoanCorporateLitigationInfo_Entity entity) {
        return loanCorporateLitigationInfo_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateLitigationInfo_Entity entity) {
        return loanCorporateLitigationInfo_dao.update(entity);
    }

    @Override
    public List<LoanCorporateLitigationInfo_Entity> findAll(String custcode) {
        return loanCorporateLitigationInfo_dao.findAll(custcode);
    }

    @Override
    public boolean delete(String id) {
        return loanCorporateLitigationInfo_dao.delete(id);
    }

    @Override
    public String getIndictedReason(String Id) {
        return loanCorporateLitigationInfo_dao.getIndictedReason(Id);
    }
}
