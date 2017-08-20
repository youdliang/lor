package com.ecsolutions.service;

import com.ecsolutions.entity.Guarantee_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface Guarantee_Service {
    Guarantee_Entity getPopupInfo(String custcode);
    List<Guarantee_Entity> getLoanApplicantGuarantor(String custcode);
    Guarantee_Entity ethnicForOthers1(String Ethnic);
    Guarantee_Entity ethnicForOthers2(String Ethnic);
    Guarantee_Entity SearchById(String id);
    void savaGuaranteeEntity(Guarantee_Entity guarantee_entity);
    void updateGuaranteeEntity(Guarantee_Entity guarantee_entity);
    void deleteById(String deleteId);
}
