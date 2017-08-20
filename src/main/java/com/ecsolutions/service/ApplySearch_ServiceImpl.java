package com.ecsolutions.service;

import com.ecsolutions.dao.ApplySearch_DAO;
import com.ecsolutions.entity.ApplySearch_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service("ApplySearch_Service")
public class ApplySearch_ServiceImpl implements ApplySearch_Service {
    private ApplySearch_DAO applysearch_dao ;
    @Autowired
    public ApplySearch_ServiceImpl(ApplySearch_DAO applysearch_dao) {
        this.applysearch_dao= applysearch_dao;
    }

    @Override
    public List<ApplySearch_Entity> Search(@RequestParam(value="startDate") String startDate, @RequestParam(value="endDate")String endDate, @RequestParam(value="personalFlag") String personalFlag, @RequestParam(value="status") String status, @RequestParam(value="manager") String manager, @RequestParam(value="custCod") String custCod, @RequestParam(value="lastName") String lastName, @RequestParam(value="lregno") String lregno) {
        List<ApplySearch_Entity> searchResult =applysearch_dao.search( startDate, endDate, personalFlag, status, manager, custCod, lastName, lregno);
        return searchResult;

    };
}
