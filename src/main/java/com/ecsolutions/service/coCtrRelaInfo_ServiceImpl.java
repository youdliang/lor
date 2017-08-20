package com.ecsolutions.service;

import com.ecsolutions.dao.coCtrRelaInfo_DAO;
import com.ecsolutions.entity.coCtrRelaInfo_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("coCtrRelaInfo_Service")
public class coCtrRelaInfo_ServiceImpl implements  coCtrRelaInfo_Service {
    private coCtrRelaInfo_DAO coctrrelainfo_dao;

    @Autowired
    public coCtrRelaInfo_ServiceImpl(coCtrRelaInfo_DAO coctrrelainfo_dao) {
        this.coctrrelainfo_dao= coctrrelainfo_dao;
    }

    @Override
    public coCtrRelaInfo_entity getPopupInfo(){
        coCtrRelaInfo_entity result = new coCtrRelaInfo_entity();
        System.out.println("begin qian");
        List<HashMap<String,String>> idTypeList = coctrrelainfo_dao.getIdType();
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
    public void saveCoCtrRelaEntity(coCtrRelaInfo_entity coctrrelainfo_entity){
        coctrrelainfo_dao.insert(coctrrelainfo_entity);
    }

    @Override
    public List<coCtrRelaInfo_entity> coCtrRelaInfoSearch(String custcode){
        List<coCtrRelaInfo_entity> result = coctrrelainfo_dao.getCustcode(custcode);
        return result;
    }

    @Override
    public void deleteCoCtrRelaInfo(String enterprisename){
        coctrrelainfo_dao.delete(enterprisename);
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
