package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateForeignInvestment_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanCorporateForeignInvestment_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateForeignInvestment_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateForeignInvestment_Entity entity = (LoanCorporateForeignInvestment_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InvesteeCompanyName", "ValueRequired", "被投资单位名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InvestmentCurrency", "ValueRequired", "投资方币种不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InvestmentAmount", "ValueRequired", "投资方金额不能为空");
        if (!(entity.getInvesteeCompanyName().isEmpty() || entity.getInvestmentCurrency().isEmpty() || entity.getInvestmentAmount().isEmpty())) {
            if (!entity.getInvesteeCompanyName().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("InvesteeCompanyName", "Format", "请输入正确的被投资单位名称（中文英文或者数字）");
            }
            if (entity.getInvesteeCompanyName().length() > 40) {
                errors.rejectValue("InvesteeCompanyName", "Length", "请输入40位以内的字符");
            }
            if (!entity.getCreditCardNumber().isEmpty()) {
                if (!entity.getCreditCardNumber().matches("^[A-Za-z0-9]+$")) {
                    errors.rejectValue("CreditCardNumber", "Format", "请输入正确的贷款卡编码（英文或者数字）");
                }
                if (entity.getCreditCardNumber().length() > 16) {
                    errors.rejectValue("CreditCardNumber", "Length", "请输入16位以内的字符");
                }
            }
            if (!entity.getOrganizationCode().isEmpty()) {
                if (!entity.getOrganizationCode().matches("^[A-Za-z0-9]+$")) {
                    errors.rejectValue("OrganizationCode", "Format", "请输入正确的组织机构代码（英文或者数字）");
                }
                if (entity.getOrganizationCode().length() > 10) {
                    errors.rejectValue("OrganizationCode", "Length", "请输入10位以内的字符");
                }
            }
            if (!entity.getInvestmentCurrency().matches("^[A-Z]+$")) {
                errors.rejectValue("InvestmentCurrency", "Format", "请输入正确的被投资单位名称（大写英文）");
            }
            if (entity.getInvestmentCurrency().length() > 3) {
                errors.rejectValue("InvestmentCurrency", "Length", "请输入3位以内的字符");
            }

            if (!entity.getInvestmentAmount().matches("^[0-9]+(.[0-9]{1,2})?$")) {
                errors.rejectValue("InvestmentAmount", "Format", "请输入正确的投资金额（15位以内（可含有两位小数）的数字）");
            }
            if (entity.getInvestmentAmount().contains("\\.")) {
                if (entity.getInvestmentAmount().split("\\.")[0].length() > 13 || entity.getInvestmentAmount().split("\\.")[1].length() > 2) {
                    errors.rejectValue("InvestmentAmount", "Length", "请输入正确的投资金额（15位以内（可含有两位小数）的数字）");
                }
            } else {
                if (entity.getInvestmentAmount().length() > 15) {
                    errors.rejectValue("InvestmentAmount", "Length", "请输入正确的投资金额（15位以内（可含有两位小数）的数字）");
                }
            }
        }
    }
}
