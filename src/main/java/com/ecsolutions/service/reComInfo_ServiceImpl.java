package com.ecsolutions.service;

import com.ecsolutions.dao.reComInfo_DAO;
import com.ecsolutions.entity.reComInfo_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("reComInfo_Service")
public class reComInfo_ServiceImpl implements  reComInfo_Service {
    private reComInfo_DAO recominfo_dao;

    @Autowired
    public reComInfo_ServiceImpl(reComInfo_DAO recominfo_dao) {
        this.recominfo_dao= recominfo_dao;
    }

    @Override
    public reComInfo_entity getPopupInfo(){
        reComInfo_entity result = new reComInfo_entity();
        System.out.println("begin qian");
        System.out.println("getid success");
        System.out.println("okkkk");
        return result;
    }

    @Override
    public void saveReComEntity(reComInfo_entity recominfo_entity){
        recominfo_dao.insert(recominfo_entity);
    }

    @Override
    public reComInfo_entity QueryByEthnic(String ethnic){
        reComInfo_entity result = recominfo_dao.getCustCodAndName(ethnic);
        return result;
    }

    @Override
    public List<reComInfo_entity> reComInfoSearch(String custcode){
        List<reComInfo_entity> result = recominfo_dao.getReComInfo(custcode);
        return result;
    }

    @Override
    public void deleteRecominfo(String ethnic){
        recominfo_dao.delete(ethnic);
    }

    @Override
    public String ChcekEthnic(String ethnic,String custcode){
        String result = recominfo_dao.checkethnic(ethnic,custcode);
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
