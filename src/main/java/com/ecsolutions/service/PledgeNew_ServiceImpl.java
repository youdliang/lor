package com.ecsolutions.service;

import com.ecsolutions.dao.Pledge_DAO;
import com.ecsolutions.entity.Pledge_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */
@Service("PledgeNew_Service")
public class PledgeNew_ServiceImpl implements PledgeNew_Service {
    private Pledge_DAO pledge_dao;

    @Autowired
    public PledgeNew_ServiceImpl(Pledge_DAO pledge_dao) {
        this.pledge_dao = pledge_dao;
    }

    @Override
    public Pledge_Entity getPopupInfo() {
        Pledge_Entity result = new Pledge_Entity();
        System.out.println("start");
        List<HashMap<String,String>> idTypeList = pledge_dao.getIdType();
        List<HashMap<String,String>> ccyList = pledge_dao.getCcy();
        result.setIdTypeList(idTypeList);
        List<HashMap<String,String>> insuranceList = pledge_dao.getinsuranceList();
        result.setCcyList(ccyList);
        result.setInsuranceList(insuranceList);
        System.out.println("ok end");
        return result;
    }

    @Override
    public Pledge_Entity getByEthnic(String ethnic) {
        return pledge_dao.getByEthnic(ethnic);
    }

    @Override
    public List<Pledge_Entity> getByCustcod(String custcod) {
        return pledge_dao.getByCustcod(custcod);
    }

    @Override
    public Pledge_Entity getById(String id) {
        return pledge_dao.getById(id);
    }

    @Override
    public List<Pledge_Entity> getByLine_no(String line_no) {
        return pledge_dao.getByLine_no(line_no);
    }

    @Override
    public int getByLineno(String line_no) {
        return pledge_dao.getByLineno(line_no);
    }

    @Override
    public String getByLine_noAndNum(String line_no, int num) {
        return pledge_dao.getByLine_noAndNum(line_no,num);
    }

    @Override
    public void savePledgeInfo(Pledge_Entity pledge_entity) {
        pledge_dao.savePledgeInfo(pledge_entity);
    }

    @Override
    public void updatePledgeInfo(Pledge_Entity pledge_entity) {
        pledge_dao.updatePledgeInfo(pledge_entity);
    }

    @Override
    public void deletePledgeInfo(String id) {
        pledge_dao.deletePledgeInfo(id);
    }

}

