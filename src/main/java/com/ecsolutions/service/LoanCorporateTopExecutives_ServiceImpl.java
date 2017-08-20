package com.ecsolutions.service;

import com.ecsolutions.dao.LoanCorporateTopExecutives_DAO;
import com.ecsolutions.dao.TacstMas_DAO;
import com.ecsolutions.entity.LoanCorporateTopExecutives_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ecs on 2017/7/31.
 */
@Service("LoanCorporateTopExecutives")
public class LoanCorporateTopExecutives_ServiceImpl implements LoanCorporateTopExecutives_Service {
    private TacstMas_DAO tacstMas_dao;
    private LoanCorporateTopExecutives_DAO loanCorporateTopExecutives_dao;

    @Autowired
    public LoanCorporateTopExecutives_ServiceImpl(TacstMas_DAO tacstMas_dao, LoanCorporateTopExecutives_DAO loanCorporateTopExecutives_dao) {
        this.loanCorporateTopExecutives_dao = loanCorporateTopExecutives_dao;
        this.tacstMas_dao = tacstMas_dao;
    }

    @Override
    public LoanCorporateTopExecutives_Entity getCODTYPEInfo() {
        LoanCorporateTopExecutives_Entity result = new LoanCorporateTopExecutives_Entity();
        result.setIDTypeInfoList(tacstMas_dao.getCODTYPEInfoList());
        return result;
    }

    @Override
    public Integer countAll(String CustCode) {
        return loanCorporateTopExecutives_dao.countAll(CustCode);
    }

    @Override
    public boolean save(LoanCorporateTopExecutives_Entity entity) {
        return loanCorporateTopExecutives_dao.save(entity);
    }

    @Override
    public boolean update(LoanCorporateTopExecutives_Entity entity) {
        return loanCorporateTopExecutives_dao.update(entity);
    }

    @Override
    public List<LoanCorporateTopExecutives_Entity> findAll(String CustCode) {
        return loanCorporateTopExecutives_dao.findAll(CustCode);
    }

    @Override
    public boolean delete(Integer Id) {
        return loanCorporateTopExecutives_dao.delete(Id);
    }
}
