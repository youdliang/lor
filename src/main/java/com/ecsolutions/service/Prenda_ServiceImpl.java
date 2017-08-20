package com.ecsolutions.service;

import com.ecsolutions.dao.Pledge_DAO;
import com.ecsolutions.dao.Prenda_DAO;
import com.ecsolutions.entity.Pledge_Entity;
import com.ecsolutions.entity.Prenda_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */
@Service("Prenda_Service")
public class Prenda_ServiceImpl implements Prenda_Service {

    private Prenda_DAO prenda_dao;

    @Autowired
    public Prenda_ServiceImpl(Prenda_DAO prenda_dao) {
        this.prenda_dao = prenda_dao;
    }

    @Override
    public Prenda_Entity getPopupInfo() {
        Prenda_Entity result = new Prenda_Entity();
        System.out.println("start");
        List<HashMap<String,String>> idTypeList = prenda_dao.getIdType();
        List<HashMap<String,String>> ccyList = prenda_dao.getCcy();
        result.setIdTypeList(idTypeList);
        List<HashMap<String,String>> insuranceList = prenda_dao.getinsuranceList();
        result.setCcyList(ccyList);
        result.setInsuranceList(insuranceList);
        System.out.println("ok end");
        return result;
    }

    @Override
    public Prenda_Entity getByEthnic(String ethnic) {
        return prenda_dao.getByEthnic(ethnic);
    }

    @Override
    public List<Prenda_Entity> getByCustcod(String custcod) {
        return prenda_dao.getByCustcod(custcod);
    }

    @Override
    public Prenda_Entity getById(String id) {
        return prenda_dao.getById(id);
    }

    @Override
    public List<Prenda_Entity> getByLine_no(String line_no) {
        return prenda_dao.getByLine_no(line_no);
    }

    @Override
    public int getByLineno(String line_no) {
        return prenda_dao.getByLineno(line_no);
    }

    @Override
    public String getByLine_noAndNum(String line_no, int num) {
        return prenda_dao.getByLine_noAndNum(line_no,num);
    }

    @Override
    public void savePrendaInfo(Prenda_Entity prenda_entity) {
        prenda_dao.savePrendaInfo(prenda_entity);
    }

    @Override
    public void updatePrendaInfo(Prenda_Entity prenda_entity) {
        prenda_dao.updatePrendaInfo(prenda_entity);
    }

    @Override
    public void deletePrendaInfo(String id) {
        prenda_dao.deletePrendaInfo(id);
    }

}

