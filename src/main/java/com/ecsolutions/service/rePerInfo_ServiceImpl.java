package com.ecsolutions.service;

import com.ecsolutions.dao.rePerInfo_DAO;
import com.ecsolutions.entity.rePerInfo_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("rePerInfo_Service")
public class rePerInfo_ServiceImpl implements  rePerInfo_Service {
    private rePerInfo_DAO reperinfo_dao;

    @Autowired
    public rePerInfo_ServiceImpl(rePerInfo_DAO reperinfo_dao) {
        this.reperinfo_dao= reperinfo_dao;
    }

    @Override
    public rePerInfo_entity getPopupInfo(){
        rePerInfo_entity result = new rePerInfo_entity();
        System.out.println("begin qian");
        List<HashMap<String,String>> idTypeList = reperinfo_dao.getIdType();
        System.out.println("getid success");
//        List<HashMap<String,String>> lineGradeList = credit_dao.getLineGradeList();
//        List<HashMap<String,String>> currencyList = credit_dao.getCurrencyList();
//        List<HashMap<String,String>> documentMarkList = credit_dao.getDocumentMarkList();
//        List<HashMap<String,String>> countryRiskList = credit_dao.getCountryRiskList();
//        result.setLineGradeList(lineGradeList);
//        result.setCurrencyList(currencyList);
//        result.setDocumentMarkList(documentMarkList);
//        result.setCountryRiskList(countryRiskList);
        result.setIdTypeList(idTypeList);
        System.out.println("okkkk");
        return result;
    }

    @Override
    public void saveRePerEntity(rePerInfo_entity reperinfo_entity){
        reperinfo_dao.insert(reperinfo_entity);
    }

    @Override
    public void deleteReperInfo(String hierarchy){
        reperinfo_dao.delete(hierarchy);
    }

    @Override
    public rePerInfo_entity pIdNoCheck(String pIdNo){
        rePerInfo_entity result = reperinfo_dao.getCustCodAndName(pIdNo);
        return result;
    }

    @Override
    public List<rePerInfo_entity> rePerInfoSearch(String custcode){
        List<rePerInfo_entity> result = reperinfo_dao.getCustNo(custcode);
        return result;
    }

//    @Override
//    public Credit_Entity getOldCreditInfo(String customerCode, String lineNo){
//        Credit_Entity result = new Credit_Entity();
//        return result;
//    }

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

//    public boolean validateFinancing(String financing){
//        try{
//            List<String> data = credit_dao.findFinancing(financing);
//            if(data.size()>0)
//            {
//                return true;
//            }
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean validateLineGrade(String lineGrade){
//        try{
//            List<String> data = credit_dao.findLineGrade(lineGrade);
//            if(data.size()>0)
//            {
//                return true;
//            }
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean validateCollateralMethod(String collateralMethod){
//        try{
//            List<String> data = credit_dao.findCollateralMethod(collateralMethod);
//            if(data.size()>0)
//            {
//                return true;
//            }
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean validateDocumentMark(String documentMark){
//        try{
//            List<String> data = credit_dao.findDocumentMark(documentMark);
//            if(data.size()>0)
//            {
//                return true;
//            }
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean validateCountryRisk(String countryRisk){
//        try{
//            List<String> data = credit_dao.findCountryRisk(countryRisk);
//            if(data.size()>0)
//            {
//                return true;
//            }
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
