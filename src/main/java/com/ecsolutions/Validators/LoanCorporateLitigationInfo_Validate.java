package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateLitigationInfo_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ecs on 2017/8/16.
 */
@Component
public class LoanCorporateLitigationInfo_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateLitigationInfo_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateLitigationInfo_Entity entity = (LoanCorporateLitigationInfo_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IndictedRecordSeqNo", "ValueRequired", "被起诉记录流水号不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Prosecutor", "ValueRequired", "起诉人名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "JudgmentEnforcementccy", "ValueRequired", "判决执行币种不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "JudgmentEnforcementAmount", "ValueRequired", "判决执行金额不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "JudgmentEnforcementDate", "ValueRequired", "判决执行日期不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "EnforcementResult", "ValueRequired", "执行结果不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IndictedReason", "ValueRequired", "被起诉原因不能为空");
        if (!(entity.getIndictedRecordSeqNo().isEmpty() || entity.getProsecutor().isEmpty() || entity.getJudgmentEnforcementccy().isEmpty() || entity.getJudgmentEnforcementAmount().isEmpty() || entity.getJudgmentEnforcementDate().isEmpty() || entity.getEnforcementResult().isEmpty() || entity.getIndictedReason().isEmpty())) {
            if (!entity.getIndictedRecordSeqNo().matches("^[A-Za-z0-9]+$")) {
                errors.rejectValue("IndictedRecordSeqNo", "Format", "请输入正确的被起诉记录流水号（英文或者数字）");
            }
            if (entity.getIndictedRecordSeqNo().length() > 60) {
                errors.rejectValue("IndictedRecordSeqNo", "Length", "请输入60位以内的字符");
            }
            if (!entity.getProsecutor().matches("^(?:[\\u4e00-\\u9fa5|a-zA-Z])+?$")) {
                errors.rejectValue("Prosecutor", "Format", "请输入正确的被起诉人名称（中文或者英文）");
            }
            if (entity.getProsecutor().length() > 40) {
                errors.rejectValue("Prosecutor", "Length", "请输入40位以内的字符");
            }
            if (!entity.getJudgmentEnforcementccy().matches("^[A-Z]+$")) {
                errors.rejectValue("JudgmentEnforcementccy", "Format", "请输入正确的判决执行币种（大写英文）");
            }
            if (entity.getJudgmentEnforcementccy().length() > 3) {
                errors.rejectValue("JudgmentEnforcementccy", "Length", "请输入3位以内的字符");
            }
            if (!entity.getJudgmentEnforcementAmount().matches("^[0-9]+(.[0-9]{1,2})?$")) {
                errors.rejectValue("JudgmentEnforcementAmount", "Format", "请输入正确的投资金额（15位以内（可含有两位小数）的数字");
            }
            if (entity.getJudgmentEnforcementAmount().contains("\\.")) {
                if ((entity.getJudgmentEnforcementAmount().split("\\.")[0].length() + entity.getJudgmentEnforcementAmount().split("\\.")[1].length()) > 15) {
                    errors.rejectValue("JudgmentEnforcementAmount", "Length", "请输入正确的投资金额（15位以内（可含有两位小数）的数字）");
                }
            } else {
                if (entity.getJudgmentEnforcementAmount().length() > 15) {
                    errors.rejectValue("JudgmentEnforcementAmount", "Length", "请输入正确的投资金额（15位以内（可含有两位小数）的数字）");
                }
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            boolean flag = true;
            try {
                Date eDate = format.parse(entity.getJudgmentEnforcementDate());
            } catch (ParseException e) {
                e.printStackTrace();
                flag = false;
            }
            if (!flag) {
                errors.rejectValue("QCexpirydate", "Format", "请输入正确的时间");
            }
            if (!entity.getEnforcementResult().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("EnforcementResult", "Format", "请输入正确的执行结果(中文英文或者数字)");
            }
            if (entity.getEnforcementResult().length() > 50) {
                errors.rejectValue("EnforcementResult", "Length", "请输入50位以内的字符");
            }
            if (!entity.getIndictedReason().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("IndictedReason", "Format", "请输入正确的被起诉原因(中文英文或者数字)");
            }
            if (entity.getIndictedReason().length() > 150) {
                errors.rejectValue("IndictedReason", "Length", "请输入150位以内的字符");
            }

        }
    }
}
