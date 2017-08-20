package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanQualificationCertificate_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ecs on 2017/8/15.
 */
@Component
public class LoanQualificationCertificate_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanQualificationCertificate_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanQualificationCertificate_Entity entity = (LoanQualificationCertificate_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "QClicensename", "ValueRequired", "证件名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "QClicensenumber", "ValueRequired", "证件号码不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "QCissuedby", "ValueRequired", "发证机关不能为空");
        if (!(entity.getQClicensename().isEmpty() && entity.getQClicensenumber().isEmpty() && entity.getQCissuedby().isEmpty())) {
            if (!entity.getQClicensename().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("QClicensename", "Format", "请输入正确的证件名称（中文英文或者数字）");
            }
            if (entity.getQClicensename().length() > 10) {
                errors.rejectValue("QClicensename", "Length", "请输入10位以内的字符");
            }
            if (!entity.getQClicensenumber().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("QClicensenumber", "Format", "请输入正确的证件名称（中文英文或者数字）");
            }
            if (entity.getQClicensenumber().length() > 20) {
                errors.rejectValue("QClicensenumber", "Length", "请输入20位以内的字符");
            }
            if (!entity.getIssuedby().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("QCissuedby", "Format", "请输入正确的发证机关（中文英文或者数字）");
            }
            if (entity.getIssuedby().length() > 10) {
                errors.rejectValue("QCissuedby", "Length", "请输入10位以内的字符");
            }
            if (!entity.getQCqualificationlevel().isEmpty()) {
                if (!entity.getQCqualificationlevel().matches("^[0-9]*$")) {
                    errors.rejectValue("QCqualificationlevel", "Format", "请输入正确的资质等级（数字）");
                }
                if (entity.getQCqualificationlevel().length() > 2) {
                    errors.rejectValue("QCqualificationlevel", "Length", "请输入2位以内的字符");
                }
            }
            if (!entity.getExpirydate().isEmpty()) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                boolean flag = true;
                try {
                    Date eDate = format.parse(entity.getExpirydate());
                } catch (ParseException e) {
                    e.printStackTrace();
                    flag = false;
                }
                if (!flag) {
                    errors.rejectValue("QCexpirydate", "format", "请输入正确的时间");
                }
            }
        }

    }
}
