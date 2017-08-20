package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateCapitalStructure_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanCorporateCapitalStructure_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateCapitalStructure_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateCapitalStructure_Entity entity = (LoanCorporateCapitalStructure_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InvestmentPartyType", "ValueRequired", "出资方类型不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InvestmentPartyName", "ValueRequired", "出资方名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "CreditCardNumber", "ValueRequired", "贷款卡编码不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "OrganizationCode", "ValueRequired", "组织机构代码不能为空");
        if (!(entity.getInvestmentPartyType().isEmpty() || entity.getInvestmentPartyName().isEmpty() || entity.getCreditCardNumber().isEmpty() || entity.getOrganizationCode().isEmpty())) {
            if(!entity.getInvestmentPartyType().matches("^[A-Z]+$")){
                errors.rejectValue("InvestmentPartyType","Format","请输入正确的出资方类型（大写英文）");
            }
            if(entity.getInvestmentPartyType().length()>3){
                errors.rejectValue("InvestmentPartyType","Length","请输入3位以内的字符");
            }
            if(!entity.getInvestmentPartyName().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")){
                errors.rejectValue("InvestmentPartyName","Format","请输入正确的出资方名称（中文英文或者数字）");
            }
            if(entity.getInvestmentPartyName().length()>40){
                errors.rejectValue("InvestmentPartyName","Length","请输入40位以内的字符");
            }
            if(!entity.getCreditCardNumber().matches("^[A-Za-z0-9]+$")){
                errors.rejectValue("CreditCardNumber","Format","请输入正确的贷款卡编码（英文或者数字）");
            }
            if(entity.getCreditCardNumber().length()>16){
                errors.rejectValue("CreditCardNumber","Length","请输入16位以内的字符");
            }
            if(!entity.getOrganizationCode().matches("^[A-Za-z0-9]+$")){
                errors.rejectValue("OrganizationCode","Format","请输入正确的组织机构代码（英文或者数字）");
            }
            if(entity.getOrganizationCode().length()>10){
                errors.rejectValue("OrganizationCode","Length","请输入10位以内的字符");
            }
            if(!entity.getRegistrationID().isEmpty()){
                if(!entity.getRegistrationID().matches("^[A-Za-z0-9]+$")){
                    errors.rejectValue("RegistrationID","Format","请输入正确的登记注册号（英文或者数字）");
                }
                if(entity.getRegistrationID().length()>20){
                    errors.rejectValue("RegistrationID","Length","请输入20位以内的字符");
                }
            }

        }
    }
}
