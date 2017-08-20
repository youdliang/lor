package com.ecsolutions.service;

import com.ecsolutions.dao.AccOfficer_Dao;
import com.ecsolutions.entity.AccOfficer_Entity;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/3.
 */
@Service("AccOfficer_Service")
public class AccOfficer_ServiceImpl implements AccOfficer_Service {

    private AccOfficer_Dao dao;

    @Override
    public  AccOfficer_Entity getOfficer(){
        return dao.getOfficer();
    }
}
