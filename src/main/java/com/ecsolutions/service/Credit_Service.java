package com.ecsolutions.service;

import com.ecsolutions.entity.Credit_Entity;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */
public interface Credit_Service {
    List<Credit_Entity> getCreditInfoList(String customerCode);

    Credit_Entity getPopupInfo();

    Credit_Entity getNewCreditInfo(String customerCode);

    Credit_Entity getOldCreditInfo(String customerCode, String lineNo);

//    boolean validateFinancing(String financing);
//
//    boolean validateLineGrade(String lineGrade);
//
//    boolean validateCollateralMethod(String collateralMethod);
//
//    boolean validateDocumentMark(String documentMark);
//
//    boolean validateCountryRisk(String countryRisk);
}
