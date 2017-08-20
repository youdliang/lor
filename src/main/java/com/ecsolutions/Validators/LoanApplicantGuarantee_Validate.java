package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanApplicantGuarantee_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/14.
 */
@Component
public class LoanApplicantGuarantee_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanApplicantGuarantee_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanApplicantGuarantee_Entity entity = (LoanApplicantGuarantee_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "GuaranteeAmount", "ValueRequired", "担保金额不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Balance", "ValueRequired", "担保余额不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "NameOfCreditors", "ValueRequired", "债权人名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BeAGuarantor", "ValueRequired", "被担保人不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ByWayOfGuarantor", "ValueRequired", "担保方式不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "MaturityDate", "ValueRequired", "担保到期日期不能为空");
        if (!(entity.getBalance().isEmpty() || entity.getBeAGuarantor().isEmpty() || entity.getByWayOfGuarantor().isEmpty() || entity.getGuaranteeAmount().isEmpty() || entity.getMaturityDate().isEmpty() || entity.getNameOfCreditors().isEmpty())) {
            if (!entity.getGuaranteeAmount().matches("^\\d{0,18}$")) {
                errors.rejectValue("GuaranteeAmount", "Format", "请输入正确的金额");
            }
            if (entity.getGuaranteeAmount().length() > 18) {
                errors.rejectValue("GuaranteeAmount", "Length", "请输入18位以内的金额");
            }
//            if(!entity.getBalance().matches("^\\d{0,18}$")){
//                errors.rejectValue("Balance","Format","请输入正确的金额");
//            }
//            if(entity.getBalance().length()>18){
//                errors.rejectValue("Balance","Length","请输入18位以内的金额");
//            }
            if (!entity.getNameOfCreditors().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("NameOfCreditors", "Format", "请输入正确的债权人名称");
            }
            if (entity.getNameOfCreditors().length() > 18) {
                errors.rejectValue("NameOfCreditors", "Length", "请输入15位以内的字符");
            }
            if (!entity.getBeAGuarantor().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("BeAGuarantor", "Format", "请输入正确的被担保人名称");
            }
            if (entity.getBeAGuarantor().length() > 18) {
                errors.rejectValue("BeAGuarantor", "Length", "请输入15位以内的字符");
            }
            if (!entity.getByWayOfGuarantor().matches("^[\\u4e00-\\u9fa5]{0,}$")) {
                errors.rejectValue("ByWayOfGuarantor", "Format", "请输入正确的担保方式");
            }
            if (entity.getByWayOfGuarantor().length() > 25) {
                errors.rejectValue("ByWayOfGuarantor", "Length", "请输入25位以内的字符");
            }
//            if(!entity.getMaturityDate().matches("^[\\u4e00-\\u9fa5]{0,}$")){
//                errors.rejectValue("MaturityDate","Format","请输入正确的担保到期日期");
//            }
            if (entity.getMaturityDate().length() > 8) {
                errors.rejectValue("MaturityDate", "Length", "请输入正确的担保到期日期");
            }
            if (!entity.getRemark().matches("^.{0,50}$")) {
                errors.rejectValue("Remark", "Format", "请输入正确的备注");
            }
            if (entity.getRemark().length() > 50) {
                errors.rejectValue("Remark", "Length", "请输入50位以内的字符");
            }
        }
    }

}
