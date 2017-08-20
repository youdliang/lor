package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateRepresentative_DAO;
import com.ecsolutions.dao.TacstMas_DAO;
import com.ecsolutions.entity.LoanCorporateRepresentative_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
@Service("LoanCorporateRepresentative_Service")
public class LoanCorporateRepresentative_ServiceImpl implements LoanCorporateRepresentative_Service {
    private TacstMas_DAO tacstMas_dao;
    private LoanCorporateRepresentative_DAO loanCorporateRepresentative_dao;

    public LoanCorporateRepresentative_ServiceImpl(LoanCorporateRepresentative_DAO loanCorporateRepresentative_dao, TacstMas_DAO tacstMas_dao){
        this.loanCorporateRepresentative_dao=loanCorporateRepresentative_dao;
        this.tacstMas_dao=tacstMas_dao;
    }

    @Override
    public LoanCorporateRepresentative_Entity getCODTYPEInfo() {
        LoanCorporateRepresentative_Entity entity=new LoanCorporateRepresentative_Entity();
        entity.setIDTypeInfoList(tacstMas_dao.getCODTYPEInfoList());
        return entity;
    }

    @Override
    public Integer countAll(String custcode) {
        return loanCorporateRepresentative_dao.countAll(custcode);
    }

    @Override
    public boolean save(LoanCorporateRepresentative_Entity entity) {
        return loanCorporateRepresentative_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateRepresentative_Entity entity) {
        return loanCorporateRepresentative_dao.update(entity);
    }

    @Override
    public List<LoanCorporateRepresentative_Entity> findAll(String custcode) {
        return loanCorporateRepresentative_dao.findAll(custcode);
    }

    @Override
    public boolean delete(String id) {
        return loanCorporateRepresentative_dao.delete(id);
    }
}
