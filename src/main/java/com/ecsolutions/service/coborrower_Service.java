package com.ecsolutions.service;

import com.ecsolutions.entity.coborrower_entity;

import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface coborrower_Service {
    coborrower_entity getPopupInfo();
    void saveCoborrowerEntity(coborrower_entity coborrower_entity);
    String ChcekLineno(String line_no,String custcode);
    List<coborrower_entity> perCoBorrowerInfoSearch(String custcode);
    void deletePerCoBorrowerinfo(String pIdNo);
    List<coborrower_entity> comCoBorrowerInfoSearch(String custcode);
    void deleteComCoBorrowerinfo(String ethnic);
}
