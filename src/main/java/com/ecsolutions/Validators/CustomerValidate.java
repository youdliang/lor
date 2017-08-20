package com.ecsolutions.Validators;

import com.ecsolutions.dao.Customer_DAO;
import com.ecsolutions.entity.Customer_entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tim on 2017/7/4.
 */

@Component
public class CustomerValidate implements Validator {

    @Override
    public void validate(Object target, Errors errors) {
        Customer_entity userForm = (Customer_entity) target;
        String amountReg = "0|[1-9]{1}[0-9]{0,6}";
        String pIdNoReg = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
        if (!(userForm.getpIdNo().isEmpty())){
            if (!(userForm.getpIdNo().matches(pIdNoReg))) {
                errors.rejectValue("ethnic", "ddd", "请输入正确的身份证号码.");
            }
        }
        if (!(userForm.getRevenueYear().isEmpty()) || userForm.getInvestmentAmount().isEmpty()){
            if (!(userForm.getRevenueYear().matches(amountReg)))
            {
                errors.rejectValue("revenueYear","ddd","金额必须为非负整数");
            }
            if (!(userForm.getRevenueYear().matches(amountReg)))
            {
                errors.rejectValue("InvestmentAmount","ddd","金额必须为非负整数");
            }
        }
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Amount", "amountrequired", "金额大于等于0");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "line_no", "amountrequired", "不能为空");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Value", "amountrequired", "金额大于等于0");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeName", "amountrequired", "不能为空");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeEffectiveDate", "amountrequired", "不能为空");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BankPledgeLastDate", "amountrequired", "不能为空");
        if( !(userForm.getBirthDate().isEmpty()))
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = new Date();
            Integer curDate=Integer.valueOf(format.format(date));
            Integer BirthDate=Integer.valueOf(userForm.getBirthDate());
            if(BirthDate<curDate)
            {
                errors.rejectValue("BirthDate","ddd","生日不能晚于今天");
            }
        }
//        if(userForm.getMode1()==1) {
//            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecProvePerson", "amountrequired", "不能为空");
//            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecOwner", "amountrequired", "不能为空");
//            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "AccRecAmount", "amountrequired", "金额大于等于0");
//        }

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer_entity.class.isAssignableFrom(clazz);
    }

}
