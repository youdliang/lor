package com.ecsolutions.service;

import com.ecsolutions.dao.Credit_DAO;
import com.ecsolutions.entity.Credit_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("Credit_Service")
public class Credit_ServiceImpl implements  Credit_Service {
    private Credit_DAO credit_dao;

    @Autowired
    public Credit_ServiceImpl(Credit_DAO credit_dao) {
        this.credit_dao = credit_dao;
    }

    @Override
    public List<Credit_Entity> getCreditInfoList(String customerCode){
        return credit_dao.getCreditInfoList(customerCode);
    }

    @Override
    public Credit_Entity getPopupInfo(){
        Credit_Entity result = new Credit_Entity();
        List<HashMap<String,String>> lineGradeList = credit_dao.getLineGradeList();
        List<HashMap<String,String>> currencyList = credit_dao.getCurrencyList();
        List<HashMap<String,String>> documentMarkList = credit_dao.getDocumentMarkList();
        List<HashMap<String,String>> countryRiskList = credit_dao.getCountryRiskList();
        result.setLineGradeList(lineGradeList);
        result.setCurrencyList(currencyList);
        result.setDocumentMarkList(documentMarkList);
        result.setCountryRiskList(countryRiskList);
        return result;
    }

    @Override
    public Credit_Entity getNewCreditInfo(String customerCode){
        Credit_Entity result = getPopupInfo();
        String lineNo = "00001";
        List<String> lineNumberList = credit_dao.getLineNumberList(customerCode);
        if (lineNumberList != null && lineNumberList.size() > 0){
            lineNo = calculateLineNo(lineNumberList.get(lineNumberList.size() - 1));
        }
        result.setLineNumber(lineNo);
        result.setLineStatus("等候");
        result.setUsedLineAmount(new BigDecimal(0.00));
        result.setFreezingLineAmount(new BigDecimal(0.00));
        return result;
    }

    @Override
    public Credit_Entity getOldCreditInfo(String customerCode, String lineNo){
        Credit_Entity result = new Credit_Entity();
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
