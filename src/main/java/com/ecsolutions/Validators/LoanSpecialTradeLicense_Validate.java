package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanSpecialTradeLicense_Entity;
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
public class LoanSpecialTradeLicense_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanSpecialTradeLicense_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanSpecialTradeLicense_Entity entity = (LoanSpecialTradeLicense_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "STlicensename", "ValueRequired", "证件名称不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "STlicensenumber", "ValueRequired", "证件号码不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "STissuedby", "ValueRequired", "发证机关不能为空");
        if (!(entity.getLicensename().isEmpty() || entity.getLicensenumber().isEmpty() || entity.getIssuedby().isEmpty())) {
            if (!entity.getLicensename().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("STlicensename", "Format", "请输入正确的证件名称（中文英文或者数字）");
            }
            if (entity.getLicensename().length() > 10) {
                errors.rejectValue("STlicensename", "Length", "请输入10位以内的字符");
            }
            if (!entity.getLicensenumber().matches("^[A-Za-z0-9]+$")) {
                errors.rejectValue("STlicensenumber", "Format", "请输入正确的证件号码（英文或者数字）");
            }
            if (entity.getLicensenumber().length() > 20) {
                errors.rejectValue("STlicensenumber", "Length", "请输入20位以内的字符");
            }
            if (!entity.getIssuedby().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("STissuedby", "Format", "请输入正确的发证机关（中文英文或者数字）");
            }
            if (entity.getIssuedby().length() > 10) {
                errors.rejectValue("STissuedby", "Length", "请输入10位以内的字符");
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
                    errors.rejectValue("STexpirydate", "format", "请输入正确的时间");
                }
            }
        }
    }
}
