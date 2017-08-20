package com.ecsolutions.service;

import com.ecsolutions.dao.contactInfo_DAO;
import com.ecsolutions.entity.contactInfo_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("contactInfo_Service")
public class contactInfo_ServiceImpl implements  contactInfo_Service {
    private contactInfo_DAO contactinfo_dao;

    @Autowired
    public contactInfo_ServiceImpl(contactInfo_DAO contactinfo_dao) {
        this.contactinfo_dao= contactinfo_dao;
    }

    @Override
    public contactInfo_entity getPopupInfo(){
        contactInfo_entity result = new contactInfo_entity();
        System.out.println("begin qian");
//        String custcode = contactinfo_dao.getCustcod();
        System.out.println("getid success");
//        List<HashMap<String,String>> lineGradeList = credit_dao.getLineGradeList();
//        List<HashMap<String,String>> currencyList = credit_dao.getCurrencyList();
//        List<HashMap<String,String>> documentMarkList = credit_dao.getDocumentMarkList();
//        List<HashMap<String,String>> countryRiskList = credit_dao.getCountryRiskList();
//        result.setLineGradeList(lineGradeList);
//        result.setCurrencyList(currencyList);
//        result.setDocumentMarkList(documentMarkList);
//        result.setCountryRiskList(countryRiskList);
//        result.setCustcode(custcode);
        System.out.println("okkkk");
        return result;
    }

    @Override
    public void saveContactEntity(contactInfo_entity contactinfo_entity){
        contactinfo_dao.insert(contactinfo_entity);
    }

    @Override
    public List<contactInfo_entity> contactInfoSearch(String custcode){
        List<contactInfo_entity> result = contactinfo_dao.getContactInfo(custcode);
        return result;
    }

    @Override
    public void deleteContactinfo(String title){
        contactinfo_dao.delete(title);
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
