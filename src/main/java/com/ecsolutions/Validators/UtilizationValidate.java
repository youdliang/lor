package com.ecsolutions.Validators;

import com.ecsolutions.entity.Utilization_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2017/7/26.
 * 使用信息校验
 */
@Component
public class UtilizationValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Utilization_Entity.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Utilization_Entity utilization_entity = (Utilization_Entity) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lineno", "amountrequired", "不能为空");
    }
}
