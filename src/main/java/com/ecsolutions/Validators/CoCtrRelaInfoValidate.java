package com.ecsolutions.Validators;

import com.ecsolutions.entity.coCtrRelaInfo_entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Created by tim on 2017/7/4.
 */

@Component
public class CoCtrRelaInfoValidate implements Validator {

    @Override
    public void validate(Object target, Errors errors) {
        coCtrRelaInfo_entity coCtrRelaInfoForm = (coCtrRelaInfo_entity) target;
        String registrationNumberReg = "[A-Za-z0-9]{20}";
        if (!(coCtrRelaInfoForm.getRegistrationNumber().isEmpty())){
            if (!(coCtrRelaInfoForm.getRegistrationNumber().matches(registrationNumberReg))) {
                errors.rejectValue("registrationNumber", "ddd", "登记注册号必须满足20位长度.");
            }
        }

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return coCtrRelaInfo_entity.class.isAssignableFrom(clazz);
    }

}
