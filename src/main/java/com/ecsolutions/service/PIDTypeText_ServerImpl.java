package com.ecsolutions.service;

import com.ecsolutions.dao.PIDTypeTextDao;
import com.ecsolutions.entity.PIDTypeTextEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tim on 2017/7/4.
 */
@Service("PIDTypeText_Server")
public class PIDTypeText_ServerImpl implements PIDTypeText_Server{

    private PIDTypeTextDao pIDTypeTextDao;

    @Autowired
    public PIDTypeText_ServerImpl(PIDTypeTextDao pledge_dao) {
        this.pIDTypeTextDao = pledge_dao;
    }

   public List<PIDTypeTextEnt> getList()
   {
             return pIDTypeTextDao.getList();
   }
}
