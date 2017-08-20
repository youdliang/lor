package com.ecsolutions.service;

import com.ecsolutions.dao.Guarantee_DAO;
import com.ecsolutions.entity.Guarantee_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
@Service("Guarantee_Service")
public class Guarantee_Servicelmpl implements Guarantee_Service {
    private Guarantee_DAO guarantee_dao;


    @Autowired
    public Guarantee_Servicelmpl(Guarantee_DAO guarantee_dao) {
        this.guarantee_dao= guarantee_dao;
    }
    @Override
    public Guarantee_Entity getPopupInfo(String custcode) {
        Guarantee_Entity result = new Guarantee_Entity();

        List<HashMap<String,String>> pidTypeList = guarantee_dao.getpidTypeList();
        result.setPidTypeList(pidTypeList);

        List<HashMap<String,String>> line_noList = guarantee_dao.getLine_no(custcode);
        result.setLine_noList(line_noList);
        return result;
    }
    @Override
    public List<Guarantee_Entity> getLoanApplicantGuarantor(String custcode){
        List<Guarantee_Entity> result = guarantee_dao.getDataTable(custcode);
        return  result;
    }

    @Override
    public Guarantee_Entity ethnicForOthers1(String Ethnic){
        Guarantee_Entity result=guarantee_dao.ethnicForOthers1(Ethnic);
        return  result;
    }

    @Override
    public Guarantee_Entity ethnicForOthers2(String Ethnic){
        Guarantee_Entity result=guarantee_dao.ethnicForOthers2(Ethnic);
        return  result;
    }

    @Override
    public Guarantee_Entity SearchById(String id){
        Guarantee_Entity result=guarantee_dao.SearchById(id);
        return  result;
    }
    @Override
    public void savaGuaranteeEntity(Guarantee_Entity guarantee_entity){
        guarantee_dao.insert(guarantee_entity);
    }

    @Override
    public void updateGuaranteeEntity(Guarantee_Entity guarantee_entity){guarantee_dao.update(guarantee_entity);};

    @Override
    public void deleteById(String deleteId){guarantee_dao.daleteById(deleteId);};
}
