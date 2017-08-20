package com.ecsolutions.service;

import com.ecsolutions.dao.Customer_DAO;
import com.ecsolutions.entity.Customer_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("Customer_Service")
public class Customer_ServiceImpl implements  Customer_Service {
    private Customer_DAO customer_dao;

    @Autowired
    public Customer_ServiceImpl(Customer_DAO customer_dao) {
        this.customer_dao= customer_dao;
    }

    @Override
    public Customer_entity getPopupInfo(){
        Customer_entity result = new Customer_entity();
        System.out.println("begin qian");
        List<HashMap<String,String>> bankList = customer_dao.getBanks();
        List<HashMap<String,String>> custManagerList = customer_dao.getCustManagerNames();
        List<HashMap<String,String>> industryClassList = customer_dao.getIndustryClassList();
        List<String> industryCategoryList = customer_dao.getIndustryCategoryList();
        List<HashMap<String,String>> secIndustryCategoryList = customer_dao.getSecIndustryCategoryList();
        List<HashMap<String,String>> idTypeList = customer_dao.getIdType();
        List<HashMap<String,String>> MaritalStatusList=customer_dao.getMaritalStatus();
        List<HashMap<String,String>> JuzhuStatusList=customer_dao.getJuzhuStatus();
        List<HashMap<String,String>> ZhiYeList=customer_dao.getZhiye();
        List<HashMap<String,String>> ZhiWuList=customer_dao.getZhiWu();
        List<HashMap<String,String>> ZhiChenList=customer_dao.getZhiChen();
        List<String> CcyList=customer_dao.getCcy();
        List<HashMap<String,String>> XueLiList=customer_dao.getXueli();
        List<HashMap<String,String>> XueWeiList=customer_dao.getXueWei();
        List<HashMap<String,String>> GuoJiaList=customer_dao.getGuoJia();
        List<HashMap<String,String>> ShengShiList=customer_dao.getShengShi();
        System.out.println("getid success");
//        List<HashMap<String,String>> lineGradeList = credit_dao.getLineGradeList();
//        List<HashMap<String,String>> currencyList = credit_dao.getCurrencyList();
//        List<HashMap<String,String>> documentMarkList = credit_dao.getDocumentMarkList();
//        List<HashMap<String,String>> countryRiskList = credit_dao.getCountryRiskList();
//        result.setLineGradeList(lineGradeList);
//        result.setCurrencyList(currencyList);
//        result.setDocumentMarkList(documentMarkList);
//        result.setCountryRiskList(countryRiskList);
        result.setBankList(bankList);
        result.setCustManagerList(custManagerList);
        result.setIndustryClassList(industryClassList);
        result.setIndustryCategoryList(industryCategoryList);
        result.setSecIndustryCategoryList(secIndustryCategoryList);
        result.setIdTypeList(idTypeList);
        result.setMaritalStatusList(MaritalStatusList);
        result.setJuzhuStatusList(JuzhuStatusList);
        result.setZhiYeList(ZhiYeList);
        result.setZhiWuList(ZhiWuList);
        result.setZhiChenList(ZhiChenList);
        result.setCcyList(CcyList);
        result.setXueLiList(XueLiList);
        result.setXueWeiList(XueWeiList);
        result.setGuoJiaList(GuoJiaList);
        result.setShengShiList(ShengShiList);
        System.out.println("okkkk");
        return result;
    }

    @Override
    public void saveCustomerEntity(Customer_entity customer_entity){
        customer_dao.insert(customer_entity);
    }

    @Override
    public String pIdNoCheck(String pIdNo){
        String result = customer_dao.ispIdNoExist(pIdNo);
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
