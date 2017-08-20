package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanCorporateTopExecutives_Entity;
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
public class LoanCorporateTopExecutives_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanCorporateTopExecutives_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanCorporateTopExecutives_Entity entity = (LoanCorporateTopExecutives_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Category", "ValueRequired", "关系人类型不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "TopExecutiveName", "ValueRequired", "高管人员姓名不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IDType", "ValueRequired", "证件类型不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "IDNumber", "ValueRequired", "证件号码不能为空");
        if (!(entity.getTopExecutiveName().isEmpty() || entity.getCategory().isEmpty() || entity.getIDType().isEmpty() || entity.getIDNumber().isEmpty())) {
            if (!entity.getCategory().matches("^[0-9]*$")) {
                errors.rejectValue("Category", "Format", "请输入正确的关系人类型（整数）");
            }
            if (!entity.getTopExecutiveName().matches("^[\\u4E00-\\u9FA5A-Za-z]+$")) {
                errors.rejectValue("TopExecutiveName", "Format", "请输入正确的高管人员姓名（中文或者英文）");
            }
            if (entity.getTopExecutiveName().length() > 15) {
                errors.rejectValue("TopExecutiveName", "Length", "请输入15位以内的字符");
            }
            if (!entity.getSex().isEmpty()) {
                if (!entity.getSex().matches("^\\d$")) {
                    errors.rejectValue("Sex", "Format", "请输入正确的性别（整数）");
                }
            }
            if (!entity.getIDType().matches("^[A-Z]+$")) {
                errors.rejectValue("IDType", "Format", "请输入正确的证件类型（大写英文）");
            }
            if (entity.getIDType().length() > 1) {
                errors.rejectValue("IDType", "Length", "请输入1位以内的字符");
            }
            if (!entity.getIDNumber().matches("^[A-Za-z0-9]+$")) {
                errors.rejectValue("getIDNumber", "Format", "请输入正确的证件号码（英文和数字）");
            }
            if (entity.getIDNumber().length() > 18) {
                errors.rejectValue("getIDNumber", "Length", "请输入18位以内的字符");
            }
            if(!entity.getBirthday().isEmpty()){
//                Birthday
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                boolean flag = true;
                try {
                    Date eDate = format.parse(entity.getBirthday());
                } catch (ParseException e) {
                    e.printStackTrace();
                    flag = false;
                }
                if (!flag) {
                    errors.rejectValue("Birthday", "Format", "请输入正确的时间");
                }
            }
            if(!entity.getHighestEducationQualification().isEmpty()){
                if(!entity.getHighestEducationQualification().matches("^\\d$")){
                    errors.rejectValue("HighestEducationQualification","Format","请输入正确的最高学历（整数）");
                }
            }


        }
    }
}
