package com.ecsolutions.Validators;

import com.ecsolutions.dao.ApplyCompany_dao;
import com.ecsolutions.entity.Apply_entity;
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
public class CompanyValidate implements Validator {
    private ApplyCompany_dao applyCompany_dao;

    @Autowired
    public CompanyValidate(ApplyCompany_dao applyCompany_dao) {
        this.applyCompany_dao = applyCompany_dao;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Apply_entity userForm = (Apply_entity) target;
        String amountReg = "0|[1-9]{1}[0-9]{0,6}";
        String creditnumberReg = "^\\d{16}";
//        List<String> ethnicList = applyCompany_dao.getEthnicList();
//        userForm.setEthnicList(ethnicList);
        if (!(userForm.getEthnic().isEmpty())){
            if (!(userForm.getEthnic().matches(creditnumberReg))) {
                errors.rejectValue("ethnic", "ddd", "请输入16位贷款卡编码.");
            }
        }
        if (!(userForm.getRegisteredAML().isEmpty()) || userForm.getPaidinCapitalAmount().isEmpty() || userForm.getInvestmentAmount().isEmpty()){
            if (!(userForm.getRegisteredAML().matches(amountReg)))
            {
                errors.rejectValue("registeredAML","ddd","金额必须为非负整数");
            }
            if (!(userForm.getPaidinCapitalAmount().matches(amountReg)))
            {
                errors.rejectValue("PaidinCapitalAmount","ddd","金额必须为非负整数");
            }
            if (!(userForm.getInvestmentAmount().matches(amountReg)))
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
        if( !(userForm.getRegistrationDate().isEmpty() || userForm.getLregdued().isEmpty()))
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = new Date();
            Integer curDate=Integer.valueOf(format.format(date));
            Integer RegistrationDate=Integer.valueOf(userForm.getRegistrationDate());
            Integer Lregdued=Integer.valueOf(userForm.getLregdued());
            if(RegistrationDate>curDate)
            {
                errors.rejectValue("RegistrationDate","ddd","注册登记日不能早于今天");
            }
            if(Lregdued<curDate)
            {
                errors.rejectValue("Lregdued","ddd","营业执照到期日不能晚于今天");
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
        return Apply_entity.class.isAssignableFrom(clazz);
    }

}
