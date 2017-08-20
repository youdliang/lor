package com.ecsolutions.service;

import com.ecsolutions.dao.DanBao_Dao;
import com.ecsolutions.entity.DanBao_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017-7-18.
 */
@Service("DanBao_Service")
public class DanBao_ServiceImpl implements DanBao_Service{
    private DanBao_Dao danbao_dao;

    @Autowired
    public DanBao_ServiceImpl(DanBao_Dao danbao_dao) {
        this.danbao_dao = danbao_dao;
    }

    @Override
    public DanBao_Entity getPopupInfo() {
        DanBao_Entity result = new DanBao_Entity();
        System.out.println("begin qian");
        List<HashMap<String,String>> userInfoList = danbao_dao.getUserInfo();
        System.out.println("getid success");
        result.setUserInfoList(userInfoList);
        System.out.println("okkkk");
        return result;
    }
}
