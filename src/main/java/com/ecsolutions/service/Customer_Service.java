package com.ecsolutions.service;

import com.ecsolutions.entity.Customer_entity;

/**
 * Created by Administrator on 2017/6/28.
 */
public interface Customer_Service {
    Customer_entity getPopupInfo();
    void saveCustomerEntity(Customer_entity customer_entity);
    String pIdNoCheck(String pIdNo);
}
