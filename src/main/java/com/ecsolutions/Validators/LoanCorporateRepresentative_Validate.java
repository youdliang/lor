package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateRepresentative_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanCorporateRepresentative_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateRepresentative_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateRepresentative_Entity entity = (LoanCorporateRepresentative_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Relationship", "ValueRequired", "家族关系不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "FamilyMemberName", "ValueRequired", "家庭成员姓名不能为空");
        if (!(entity.getRelationship().isEmpty() || entity.getFamilyMemberName().isEmpty())) {
            if (!entity.getRelationship().matches("^\\d$")) {
                errors.rejectValue("Relationship", "Format", "请输入正确的家族关系（整数）");
            }
            if (entity.getRelationship().length() > 1) {
                errors.rejectValue("Relationship", "Length", "请输入1位以内的字符");
            }
            if (!entity.getFamilyMemberName().matches("^(?:[\\u4e00-\\u9fa5|a-zA-Z])+?$")) {
                errors.rejectValue("FamilyMemberName", "Format", "请输入正确的家庭成员姓名（中文或者英文）");
            }
            if (entity.getFamilyMemberName().length() > 15) {
                errors.rejectValue("FamilyMemberName", "Length", "请输入15位以内的字符");
            }
            if (!entity.getIDType().isEmpty()) {
                if (!entity.getIDType().matches("^[A-Z]+$")) {
                    errors.rejectValue("IDType", "Format", "请输入正确的家庭成员证件类型（大写英文）");
                }
                if (entity.getIDType().length() > 1) {
                    errors.rejectValue("IDType", "Length", "请输入1位以内的字符");
                }
            }
            if (!entity.getIDNumber().isEmpty()) {
                if (!entity.getIDNumber().matches("^[A-Za-z0-9]+$")) {
                    errors.rejectValue("IDNumber", "Format", "请输入正确的家庭成员证件号码（英文或者数字）");
                }
                if (entity.getIDNumber().length() > 18) {
                    errors.rejectValue("IDNumber", "Length", "请输入18位以内的字符");
                }
            }
            if (!entity.getCompanyName().isEmpty()) {
                if (!entity.getCompanyName().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                    errors.rejectValue("CompanyName", "Format", "请输入正确的单位名称（中文英文或者数字）");
                }
                if (entity.getCompanyName().length() > 40) {
                    errors.rejectValue("CompanyName", "Length", "请输入40位以内的字符");
                }
            }
            if (!entity.getCreditCardNumber().isEmpty()) {
                if (!entity.getCreditCardNumber().matches("^[A-Za-z0-9]+$")) {
                    errors.rejectValue("CreditCardNumber", "Format", "请输入正确的贷款卡编码（英文或者数字）");
                }
                if (entity.getCreditCardNumber().length() > 16) {
                    errors.rejectValue("CreditCardNumber", "Length", "请输入16位以内的字符");
                }
            }

        }

    }
}
