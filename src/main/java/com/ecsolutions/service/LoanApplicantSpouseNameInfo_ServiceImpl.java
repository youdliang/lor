package com.ecsolutions.service;

import com.ecsolutions.dao.LoanApplicantSpouseNameInfo_DAO;
import com.ecsolutions.dao.TacstMas_DAO;
import com.ecsolutions.entity.LoanApplicantSpouseNameInfo_Entity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/11.
 */
@Service("LoanApplicantSpouseNameInfo_Service")
public class LoanApplicantSpouseNameInfo_ServiceImpl implements LoanApplicantSpouseNameInfo_Service {
    private LoanApplicantSpouseNameInfo_DAO loanApplicantSpouseNameInfo_dao;
    private TacstMas_DAO tacstMas_dao;

    public LoanApplicantSpouseNameInfo_ServiceImpl(LoanApplicantSpouseNameInfo_DAO loanApplicantSpouseNameInfo_dao, TacstMas_DAO tacstMas_dao) {
        this.loanApplicantSpouseNameInfo_dao = loanApplicantSpouseNameInfo_dao;
        this.tacstMas_dao = tacstMas_dao;
    }

    @Override
    public List<HashMap<String,String>> getIDTypeInfo() {
        LoanApplicantSpouseNameInfo_Entity entity = new LoanApplicantSpouseNameInfo_Entity();
        return tacstMas_dao.getCODTYPEInfoList();
    }

    @Override
    public Integer countAll(String custCode) {
        return loanApplicantSpouseNameInfo_dao.countAll(custCode);
    }

    @Override
    public boolean save(LoanApplicantSpouseNameInfo_Entity entity) {
        return loanApplicantSpouseNameInfo_dao.save(entity);
    }

    @Override
    public boolean update(LoanApplicantSpouseNameInfo_Entity entity) {
        return loanApplicantSpouseNameInfo_dao.update(entity);
    }

    @Override
    public List<LoanApplicantSpouseNameInfo_Entity> findAll(String custCode) {
        return loanApplicantSpouseNameInfo_dao.findAll(custCode);
    }

    @Override
    public boolean delete(String custCode) {
        return loanApplicantSpouseNameInfo_dao.delete(custCode);
    }
}
