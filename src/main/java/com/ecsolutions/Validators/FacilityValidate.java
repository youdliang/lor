package com.ecsolutions.Validators;

import com.ecsolutions.entity.Facility_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2017/7/26.
 * 抵押信息校验
 */
@Component
public class FacilityValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Facility_Entity.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Facility_Entity facility_entity = (Facility_Entity) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prodtype", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "linedesc", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "linegrade", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lineccy", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lineamt", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bondflag", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "docflag", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "createdate", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "revolflag", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expirydate", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryrisk", "amountrequired", "不能为空");
    }
}
