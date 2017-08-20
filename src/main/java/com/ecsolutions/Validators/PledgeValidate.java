package com.ecsolutions.Validators;

import com.ecsolutions.entity.PledgeEnt;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by tim on 2017/7/4.
 */

@Component
public class PledgeValidate implements Validator {

    @Override
    public void validate(Object target, Errors errors) {

        PledgeEnt userForm = (PledgeEnt) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Amount", "amountrequired", "金额大于等于0");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "line_no", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Value", "amountrequired", "金额大于等于0");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeName", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeEffectiveDate", "amountrequired", "不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeLastDate", "amountrequired", "不能为空");
        if( !(userForm.getBankPledgeEffectiveDate().isEmpty() || userForm.getBankPledgeLastDate().isEmpty()))
        {
            Integer effectiveDate=Integer.valueOf(userForm.getBankPledgeEffectiveDate());
            Integer lastDate=Integer.valueOf(userForm.getBankPledgeLastDate());
            if(effectiveDate>lastDate)
            {
                errors.rejectValue("BankPledgeEffectiveDate","ddd","质押生效日不能晚于质押到期日");
            }
        }
        if(userForm.getMode1()==1) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecProvePerson", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecOwner", "amountrequired", "不能为空");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecAmount", "amountrequired", "金额大于等于0");
        }

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return PledgeEnt.class.isAssignableFrom(clazz);
    }

}
