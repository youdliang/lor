package com.ecsolutions.service;

import com.ecsolutions.entity.ApplySearch_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface ApplySearch_Service {
    List<ApplySearch_Entity> Search(String startDate, String endDate, String personalFlag, String status, String manager, String custCod, String lastName, String lregno);
}
