package com.ecsolutions.service;

import com.ecsolutions.dao.LoanApplicantShareholderInfor_DAO;
import com.ecsolutions.dao.TacstMas_DAO;
import com.ecsolutions.entity.LoanApplicantShareholderInfor_Entity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/8/10.
 */
@Service("LoanApplicantShareholderInfor_Service")
public class LoanApplicantShareholderInfor_ServiceImpl implements LoanApplicantShareholderInfor_Service {
    private TacstMas_DAO tacstMas_dao;
    private LoanApplicantShareholderInfor_DAO loanApplicantShareholderInfor_dao;

    public LoanApplicantShareholderInfor_ServiceImpl(LoanApplicantShareholderInfor_DAO loanApplicantShareholderInfor_dao, TacstMas_DAO tacstMas_dao){
        this.loanApplicantShareholderInfor_dao=loanApplicantShareholderInfor_dao;
        this.tacstMas_dao=tacstMas_dao;
    }

    @Override
    public LoanApplicantShareholderInfor_Entity getIDTypeInfo() {
        LoanApplicantShareholderInfor_Entity entity=new LoanApplicantShareholderInfor_Entity();
        entity.setIDTypeInfoList(tacstMas_dao.getCODTYPEInfoList());
        return entity;
    }

    @Override
    public Integer countAll(String CustCod,String Type) {
        return loanApplicantShareholderInfor_dao.countAll(CustCod,Type);
    }

    @Override
    public boolean save(LoanApplicantShareholderInfor_Entity entity) {
        return loanApplicantShareholderInfor_dao.save(entity);
    }

    @Override
    public boolean update(LoanApplicantShareholderInfor_Entity entity) {
        return loanApplicantShareholderInfor_dao.update(entity);
    }

    @Override
    public List<LoanApplicantShareholderInfor_Entity> findAll(String custcode, String Type) {
        return loanApplicantShareholderInfor_dao.findAll(custcode,Type);
    }

    @Override
    public boolean delete(String id) {
        return loanApplicantShareholderInfor_dao.delete(id);
    }
}
