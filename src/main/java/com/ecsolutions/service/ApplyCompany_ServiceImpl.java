package com.ecsolutions.service;

import com.ecsolutions.dao.ApplyCompany_dao;
import com.ecsolutions.entity.Apply_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
@Service("ApplyCompany_Service")
public class ApplyCompany_ServiceImpl implements ApplyCompany_Service {
    private ApplyCompany_dao applyCompany_dao;

    @Autowired
    public ApplyCompany_ServiceImpl(ApplyCompany_dao applyCompany_dao) {
        this.applyCompany_dao = applyCompany_dao;
    }

    @Override
    public Apply_entity getPopupInfo(){
        Apply_entity result = new Apply_entity();
        String bpm_no = applyCompany_dao.getBpm_no();
        List<HashMap<String,String>> bankList = applyCompany_dao.getBanks();
        List<HashMap<String,String>> custManagerList = applyCompany_dao.getCustManagerNames();
        List<HashMap<String,String>> areaIdList = applyCompany_dao.getAreaNames();
        List<String> flagList = applyCompany_dao.getFlagTexts();
        List<HashMap<String,String>> countryList = applyCompany_dao.getCountryTexts();
        List<HashMap<String,String>> cityList = applyCompany_dao.getCityTexts();
        List<HashMap<String,String>> industryClassList = applyCompany_dao.getIndustryClasses();
        List<HashMap<String,String>> bizRegTypeCorFlagList = applyCompany_dao.getBizRegTypeCorFlagTexts();
        List<String> bizTypeList = applyCompany_dao.getBizTypeTexts();
        List<String> industryCategoryList = applyCompany_dao.getIndustryCategories();
        List<HashMap<String,String>> secIndustryCategoryList = applyCompany_dao.getSecIndustryCategories();
        List<HashMap<String,String>> secExchList = applyCompany_dao.getSecExchTexts();
//        List<HashMap<String,String>> ethnicList = applyCompany_dao.getEthnicList();
        result.setBpm_no(bpm_no);
        result.setBankList(bankList);
        result.setCustManagerList(custManagerList);
        result.setAreaIdList(areaIdList);
        result.setFlagList(flagList);
        result.setCountryList(countryList);
        result.setCityList(cityList);
        result.setIndustryClassList(industryClassList);
        result.setBizRegTypeCorFlagList(bizRegTypeCorFlagList);
        result.setBizTypeList(bizTypeList);
        result.setIndustryCategoryList(industryCategoryList);
        result.setSecIndustryCategoryList(secIndustryCategoryList);
        result.setSecExchList(secExchList);
//        result.setEthnicList(ethnicList);
        System.out.println("okkkk");
        return result;
    }

    @Override
    public void saveApplyEntity(Apply_entity apply_entity){
        applyCompany_dao.insert(apply_entity);
    }

    @Override
    public String ethnicCheck(String ethnic){
        String result = applyCompany_dao.isEthnicExist(ethnic);
        return result;
    }

    private String calculateLineNo(String lineNo){
        String newLineNo = "";
        try {
            newLineNo = fitToLength(String.valueOf(Integer.parseInt(lineNo) + 1),5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return newLineNo;
    }

    private String fitToLength(String str, int length){
        if (str.length() < length) {
            for (int i = str.length(); i < length; ++i) {
                str = "0" + str;
            }
        }
        return str;
    }
}
