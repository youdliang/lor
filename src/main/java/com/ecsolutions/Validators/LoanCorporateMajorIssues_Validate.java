package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateMajorIssues_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanCorporateMajorIssues_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateMajorIssues_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateMajorIssues_Entity entity = (LoanCorporateMajorIssues_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IssueRecordSeqNo", "ValueRequired", "大事信息记录流水号不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IssueDescription", "ValueRequired", "大事描述不能为空");
        if (!(entity.getIssueDescription().isEmpty() || entity.getIssueRecordSeqNo().isEmpty())) {
            if(!entity.getIssueRecordSeqNo().matches("^[A-Za-z0-9]+$")){
                errors.rejectValue("IssueRecordSeqNo","Format","请输入正确的大事信息记录流水号（英文或者数字）");
            }
            if(entity.getIssueRecordSeqNo().length()>60){
                errors.rejectValue("IssueRecordSeqNo","Length","请输入60位以内的字符");
            }
            if(!entity.getIssueDescription().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")){
                errors.rejectValue("IssueDescription","Format","请输入正确的大事信息描述（中文英文或者数字）");
            }
            if(entity.getIssueDescription().length()>125){
                errors.rejectValue("IssueDescription","Length","请输入125位以内的字符");
            }
        }
    }
}
