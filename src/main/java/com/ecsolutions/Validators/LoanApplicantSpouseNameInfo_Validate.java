package com.ecsolutions.Validators;


import com.ecsolutions.entity.LoanApplicantSpouseNameInfo_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/14.
 */
@Component
public class LoanApplicantSpouseNameInfo_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanApplicantSpouseNameInfo_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanApplicantSpouseNameInfo_Entity entity = (LoanApplicantSpouseNameInfo_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "SpouseName", "ValueRequired", "配偶姓名不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "SpouseIDType", "ValueRequired", "配偶证件类型不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "SpouseIDNo", "ValueRequired", "配偶证件号码不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "SpouseContactNo", "ValueRequired", "配偶联系电话不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "SpouseCompanyName", "ValueRequired", "配偶工作单位不能为空");
        if (!(entity.getSpouseCompanyName().isEmpty() || entity.getSpouseContactNo().isEmpty() || entity.getSpouseIDNo().isEmpty() || entity.getSpouseIDType().isEmpty() || entity.getSpouseName().isEmpty())) {
            if (!entity.getSpouseName().matches("^(?:[\\u4e00-\\u9fa5|a-zA-Z])+?$")) {
                errors.rejectValue("SpouseName", "Format", "请输入正确的姓名（中文或者英文）");
            }
            if (entity.getSpouseName().length() > 15) {
                errors.rejectValue("SpouseName", "Length", "请输入15位以内的字符");
            }
            if (!entity.getSpouseIDNo().matches("^[A-Za-z0-9]+$")) {
                errors.rejectValue("SpouseIDNo", "Format", "请输入正确的证件编号（英文或者数字）");
            }
            if (entity.getSpouseName().length() > 18) {
                errors.rejectValue("SpouseIDNo", "Length", "请输入18位以内的字符");
            }
            if (!entity.getSpouseCompanyName().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("SpouseCompanyName", "Format", "请输入正确的工作单位（中文英文或者数字）");
            }
            if (entity.getSpouseCompanyName().length() > 30) {
                errors.rejectValue("SpouseCompanyName", "Length", "请输入30位以内的字符");
            }
            if (!entity.getSpouseContactNo().matches("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$")) {
                errors.rejectValue("SpouseContactNo", "Format", "请输入正确的联系电话");
            }
            if (entity.getSpouseContactNo().length() > 25) {
                errors.rejectValue("SpouseContactNo", "Length", "请输入25位以内的字符");
            }
        }
    }
}
