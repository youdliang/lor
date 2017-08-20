package com.ecsolutions.service;

import com.ecsolutions.entity.PledgeEnt;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecsolutions.dao.PledgeDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tim on 2017/6/27.
 */
@Service("Pledge_Service")
public class Pledge_ServiceImp implements  Pledge_Service{

    private PledgeDao pledge_dao;

    @Autowired
    public Pledge_ServiceImp(PledgeDao pledge_dao) {
        this.pledge_dao = pledge_dao;
    }

    @Override
   public  PledgeEnt getPledge(String id)
    {
        return pledge_dao.getPledge(id);
    }

    @Override
    public List<PledgeEnt> getPledgeList(String line_no, String CUSTCOD)
    {
        return pledge_dao.getPledgeList(line_no,CUSTCOD);
    }

}
