package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateCertificates_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/15.
 */
@Component
public class LoanCorporateCertificates_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateCertificates_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateCertificates_Entity entity=(LoanCorporateCertificates_Entity) o;

    }
}
