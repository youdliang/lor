package com.ecsolutions.service;

import com.ecsolutions.dao.coborrower_DAO;
import com.ecsolutions.entity.coborrower_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("coborrower_Service")
public class coborrower_ServiceImpl implements  coborrower_Service {
    private coborrower_DAO coborrower_dao;

    @Autowired
    public coborrower_ServiceImpl(coborrower_DAO coborrower_dao) {
        this.coborrower_dao= coborrower_dao;
    }

    @Override
    public coborrower_entity getPopupInfo(){
        coborrower_entity result = new coborrower_entity();
        System.out.println("begin qian");
        List<HashMap<String,String>> idTypeList = coborrower_dao.getIdType();
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
    public void saveCoborrowerEntity(coborrower_entity coborrower_entity){
        coborrower_dao.insert(coborrower_entity);
    }

    @Override
    public String ChcekLineno(String line_no,String custcode){
        String result = coborrower_dao.checklineno(line_no,custcode);
        return result;
    }

    @Override
    public List<coborrower_entity> perCoBorrowerInfoSearch(String custcode){
        List<coborrower_entity> result = coborrower_dao.getPerCoBorrowerInfo(custcode);
        return result;
    }

    @Override
    public void deletePerCoBorrowerinfo(String pIdNo){
        coborrower_dao.delete_per(pIdNo);
    }

    @Override
    public List<coborrower_entity> comCoBorrowerInfoSearch(String custcode){
        List<coborrower_entity> result = coborrower_dao.getComCoBorrowerInfo(custcode);
        return result;
    }

    @Override

    public void deleteComCoBorrowerinfo(String ethnic){
        coborrower_dao.delete_com(ethnic);
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
