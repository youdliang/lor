package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanApplicantShareholderInfor_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanApplicantShareholderInfor_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanApplicantShareholderInfor_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanApplicantShareholderInfor_Entity entity = (LoanApplicantShareholderInfor_Entity) o;
        if (entity.getType() != null) {
            if (entity.getType().equals("1")) {
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalType", "ValueRequired", "股东类型不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalIDtype", "ValueRequired", "证件类型/登记注册号类型不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalIDNumber", "ValueRequired", "证件号码/登记注册号不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalName", "ValueRequired", "股东名称不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalProportion", "ValueRequired", "持股比例（%）不能为空");
                if (!(entity.getPersonalType().isEmpty() || entity.getPersonalIDtype().isEmpty() || entity.getPersonalIDNumber().isEmpty() || entity.getPersonalName().isEmpty() || entity.getPersonalProportion().isEmpty())) {
                    if (!entity.getPersonalType().matches("^\\d$")) {
                        errors.rejectValue("PersonalType", "Format", "请输入正确的股东类型（整数）");
                    }
                    if (entity.getPersonalType().length() > 2) {
                        errors.rejectValue("PersonalType", "Length", "请输入2位以内的整数");
                    }
                    if (!entity.getPersonalIDtype().matches("^[A-Z]+$")) {
                        errors.rejectValue("PersonalIDtype", "Format", "请输入正确的证件类型/登记注册号类型（大写英文）");
                    }
                    if (entity.getPersonalIDtype().length() > 2) {
                        errors.rejectValue("PersonalIDtype", "Length", "请输入2位以内的字符");
                    }
                    if (!entity.getPersonalIDNumber().matches("^[A-Za-z0-9]+$")) {
                        errors.rejectValue("PersonalIDNumber", "Format", "请输入正确的证件号码/登记注册号（英文或者数字）");
                    }
                    if (entity.getPersonalIDNumber().length() > 20) {
                        errors.rejectValue("PersonalIDNumber", "Length", "请输入20位以内的字符");
                    }
                    if (!entity.getPersonalName().matches("^(?:[\\u4e00-\\u9fa5|a-zA-Z])+?$")) {
                        errors.rejectValue("PersonalName", "Format", "请输入正确的股东名称（中文或者英文）");
                    }
                    if (entity.getPersonalName().length() > 40) {
                        errors.rejectValue("PersonalName", "Length", "请输入40位以内的字符");
                    }
                    if (entity.getPersonalProportion().split("\\.").length == 2) {
                        if (entity.getPersonalProportion().split("\\.")[0].length() > 2 || entity.getPersonalProportion().split("\\.")[1].length() > 2) {
                            if (!(entity.getPersonalProportion().split("\\.")[0].equals("100") && entity.getPersonalProportion().split("\\.")[1].equals("00")))
                                errors.rejectValue("PersonalProportion", "Length", "请输入正确的持股比例（%）（5位以内（可含有两位小数）的数字）");
                        }
                    } else {
                        if (entity.getPersonalProportion().matches("^[0-9]*$")) {
                            if (entity.getPersonalProportion().length() > 2 && !entity.getPersonalProportion().equals("100")) {
                                errors.rejectValue("PersonalProportion", "Length", "请输入正确的持股比例（%）（100以内的数字）");
                            }
                        } else {
                            errors.rejectValue("PersonalProportion", "Length", "请输入正确的持股比例（%）（100以内的数字）");
                        }
                    }
                }
            } else if (entity.getType().equals("2")) {
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseType", "ValueRequired", "股东类型不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseIDtype", "ValueRequired", "证件类型/登记注册号类型不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseIDNumber", "ValueRequired", "证件号码/登记注册号不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseName", "ValueRequired", "股东名称不能为空");
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseProportion", "ValueRequired", "持股比例（%）不能为空");
                if (!(entity.getEnterpriseType().isEmpty() || entity.getEnterpriseIDtype().isEmpty() || entity.getEnterpriseIDNumber().isEmpty() || entity.getEnterpriseName().isEmpty() || entity.getEnterpriseProportion().isEmpty())) {
                    if (!entity.getEnterpriseType().matches("^\\d$")) {
                        errors.rejectValue("EnterpriseType", "Format", "请输入正确的股东类型（整数）");
                    }
                    if (entity.getEnterpriseType().length() > 2) {
                        errors.rejectValue("EnterpriseType", "Length", "请输入2位以内的整数");
                    }
                    if (!entity.getEnterpriseIDtype().matches("^[A-Z]+$")) {
                        errors.rejectValue("EnterpriseIDtype", "Format", "请输入正确的证件类型/登记注册号类型（大写英文）");
                    }
                    if (entity.getEnterpriseIDtype().length() > 2) {
                        errors.rejectValue("EnterpriseIDtype", "Length", "请输入2位以内的字符");
                    }
                    if (!entity.getEnterpriseIDNumber().matches("^[A-Za-z0-9]+$")) {
                        errors.rejectValue("EnterpriseIDNumber", "Format", "请输入正确的证件号码/登记注册号（英文或者数字）");
                    }
                    if (entity.getEnterpriseIDNumber().length() > 20) {
                        errors.rejectValue("EnterpriseIDNumber", "Length", "请输入20位以内的字符");
                    }
                    if (!entity.getEnterpriseName().matches("^(?:[\\u4e00-\\u9fa5|a-zA-Z])+?$")) {
                        errors.rejectValue("EnterpriseName", "Format", "请输入正确的股东名称（中文或者英文）");
                    }
                    if (entity.getEnterpriseName().length() > 40) {
                        errors.rejectValue("EnterpriseName", "Length", "请输入40位以内的字符");
                    }
                    if (entity.getEnterpriseProportion().split("\\.").length == 2) {
                        if (entity.getEnterpriseProportion().split("\\.")[0].length() > 2 || entity.getEnterpriseProportion().split("\\.")[1].length() > 2) {
                            if (!(entity.getEnterpriseProportion().split("\\.")[0].equals("100") && entity.getEnterpriseProportion().split("\\.")[1].equals("00")))
                                errors.rejectValue("EnterpriseProportion", "Length", "请输入正确的持股比例（%）（5位以内（可含有两位小数）的数字）");
                        }
                    } else {
                        if (entity.getEnterpriseProportion().matches("^[0-9]*$")) {
                            if (entity.getEnterpriseProportion().length() > 2 && !entity.getEnterpriseProportion().equals("100")) {
                                errors.rejectValue("EnterpriseProportion", "Length", "请输入正确的持股比例（%）（100以内的数字）");
                            }
                        } else {
                            errors.rejectValue("EnterpriseProportion", "Length", "请输入正确的持股比例（%）（100以内的数字）");
                        }
                    }
                    if (!entity.getEnterpriseOrganizationcode().isEmpty()) {
                        if (!entity.getEnterpriseOrganizationcode().matches("^[A-Za-z0-9]+$")) {
                            errors.rejectValue("EnterpriseOrganizationcode", "Format", "请输入正确的企业重要股东组织机构代码（英文或者数字）");
                        }
                        if (entity.getEnterpriseOrganizationcode().length() > 10) {
                            errors.rejectValue("EnterpriseOrganizationcode", "Length", "请输入10位以内的字符");
                        }
                    }
                    if (!entity.getEnterpriseAgencyCreditcode().isEmpty()) {
                        if (!entity.getEnterpriseAgencyCreditcode().matches("^[A-Za-z0-9]+$")) {
                            errors.rejectValue("EnterpriseAgencyCreditcode", "Format", "请输入正确的企业重要股东机构信用代码（英文或者数字）");
                        }
                        if (entity.getEnterpriseAgencyCreditcode().length() > 18) {
                            errors.rejectValue("EnterpriseAgencyCreditcode", "Length", "请输入18位以内的字符");
                        }
                    }
                }
            } else {
                errors.rejectValue("PersonalType", "Format", "请输入正确的股东类型（整数）");
                errors.rejectValue("PersonalType", "Length", "请输入2位以内的整数");
                errors.rejectValue("EnterpriseType", "Format", "请输入正确的股东类型（整数）");
                errors.rejectValue("EnterpriseType", "Length", "请输入2位以内的整数");
            }
        } else {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "PersonalType", "ValueRequired", "股东类型不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnterpriseType", "ValueRequired", "股东类型不能为空");
        }
    }
}
