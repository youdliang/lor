package com.ecsolutions.Validators;

import com.ecsolutions.entity.document_entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Created by tim on 2017/7/4.
 */

@Component
public class DocumentValidate implements Validator {

    @Override
    public void validate(Object target, Errors errors) {
        document_entity documentForm = (document_entity) target;
        int effectiveDate = Integer.parseInt(documentForm.getEffectivedate());
        int expiryDate = Integer.parseInt(documentForm.getExpirydate());
        if (!(documentForm.getEffectivedate().isEmpty()) || !(documentForm.getExpirydate().isEmpty())){
            if (effectiveDate > expiryDate) {
                errors.rejectValue("effectivedate", "ddd", "生效日期不应晚于到期日期.");
                errors.rejectValue("expirydate", "ddd", "到期日期不应早于生效日期.");
            }
        }

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return document_entity.class.isAssignableFrom(clazz);
    }

}
