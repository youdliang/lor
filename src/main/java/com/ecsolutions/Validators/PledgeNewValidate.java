package com.ecsolutions.Validators;

import com.ecsolutions.entity.Pledge_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/26.
 * 抵押信息校验
 */
@Component
public class PledgeNewValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Pledge_Entity.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Pledge_Entity pledge_entity = (Pledge_Entity)target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "line_no", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contractnumber", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "signeddate", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mode1", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "originalvalueccy", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "originalvalue", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "marketvalueccy", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "marketvalue", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "assessedvalueccy", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "assessedvalue", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "amountccy", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "amount", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "scale", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "owner", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "isinsurance", "amountrequired", "不能为空");

        if(!(pledge_entity.getOriginalvalue().isEmpty()) || !(pledge_entity.getMarketvalue().isEmpty()) || !(pledge_entity.getAssessedvalue().isEmpty()) || !(pledge_entity.getAmount().isEmpty())){
            if(!pledge_entity.getOriginalvalue().matches("[1-9][0-9]*")){
                errors.rejectValue("originalvalue","ddd","金额必须大于0");
            }
            if(!pledge_entity.getMarketvalue().matches("[1-9][0-9]*")){
                errors.rejectValue("marketvalue","ddd","金额必须大于0");
            }
            if(!pledge_entity.getAssessedvalue().matches("[1-9][0-9]*")){
                errors.rejectValue("assessedvalue","ddd","金额必须大于0");
            }
            if(!pledge_entity.getAmount().matches("[1-9][0-9]*")){
                errors.rejectValue("amount","ddd","金额必须大于0");
            }
        }
        //是否保险校验
        if(pledge_entity.getIsinsurance().equals("1")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insuranceno", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insuranceeffectivedate", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insurancematuritydate", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insurancetype", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insurancecompany", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insuranceamountccy", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insuranceamount", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "insurancebeneficiaries", "amountrequired", "不能为空");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
            Date effectivedate = pledge_entity.getInsuranceeffectivedate();
            Date maturitydate = pledge_entity.getInsurancematuritydate();
            if(effectivedate!=null || maturitydate!=null){
                Integer effective=Integer.valueOf(sdf.format(effectivedate));
                Integer maturity=Integer.valueOf(sdf.format(maturitydate));
                if(effective>maturity){
                    errors.rejectValue("insuranceeffectivedate","ddd","生效日不能晚于到期日");
                }
            }
        }
        //土地使用权校验
        if(pledge_entity.getMode1().equals("1")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landuserightsno", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landarea", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landareaunit", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landaddress", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landaccessmethod", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landnature", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landhaveattachment", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landhaveattachmentcertificate", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landattachmentisconsistent", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landisreg", "amountrequired", "不能为空");
        }
        //房产抵押校验
        if(pledge_entity.getMode1().equals("2")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estateno", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estatearea", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estateaddress", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estatebuildingstructure", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estatefloors", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estateatfloor", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estateisreg", "amountrequired", "不能为空");
        }
        //设备抵押
        if(pledge_entity.getMode1().equals("3")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "devicename", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "devicetype", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "deviceunit", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "devicenumber", "amountrequired", "不能为空");
        }
        //车辆抵押
        if(pledge_entity.getMode1().equals("4")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vehiclebrand", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vehicleenginenumber", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vehicletype", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vehiclechassisnumber", "amountrequired", "不能为空");
        }
        //在建工程抵押
        if(pledge_entity.getMode1().equals("5")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectname", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectattathimentarea", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectbuildingarea", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectaddress", "amountrequired", "不能为空");
        }
        //船舶抵押
        if(pledge_entity.getMode1().equals("6")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "shipbrand", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "shiptype", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "shiplicenenumber", "amountrequired", "不能为空");
        }
        //采矿权抵押
        if(pledge_entity.getMode1().equals("7")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "miningperson", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mininglicencenumber", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "miningaddress", "amountrequired", "不能为空");
        }
        //其他抵押
        if(pledge_entity.getMode1().equals("8")){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "othername", "amountrequired", "不能为空");
        }
    }
}
