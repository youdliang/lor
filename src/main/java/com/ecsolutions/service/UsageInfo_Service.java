package com.ecsolutions.service;

import com.ecsolutions.entity.UsageInfo_Get_Entity;
import com.ecsolutions.entity.UsageInfo_Save_Entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/29.
 */
public interface UsageInfo_Service {
    UsageInfo_Get_Entity getCombineInfo();

    String saveUsageInfo(UsageInfo_Save_Entity saveEntity);

}
