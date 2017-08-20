package com.ecsolutions.Validators;

import com.ecsolutions.entity.LoanBusinessPersonInfo_Entity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ecs on 2017/8/17.
 */
@Component
public class LoanBusinessPersonInfo_Validate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return LoanBusinessPersonInfo_Entity.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        LoanBusinessPersonInfo_Entity entity = (LoanBusinessPersonInfo_Entity) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BusinessOpeningDate", "ValueRequired", "开业日期不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "NumberOfEmployee", "ValueRequired", "雇员数量不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BusinessDescription", "ValueRequired", "业务描述不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InformationChannelCategory", "ValueRequired", "信息途径类别不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "InformationChannelDescription", "ValueRequired", "信息途径不能为空");
        if (!(entity.getBusinessOpeningDate().isEmpty() || entity.getNumberOfEmployee().isEmpty() || entity.getBusinessDescription().isEmpty() || entity.getInformationChannelCategory().isEmpty() || entity.getInformationChannelDescription().isEmpty())) {
            if (!entity.getNumberOfEmployee().matches("^[0-9]*$")) {
                errors.rejectValue("NumberOfEmployee", "Format", "请输入正确的雇员数量（数字）");
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Boolean flag = true;
            try {
                Date eDate = format.parse(entity.getBusinessOpeningDate());
            } catch (ParseException e) {
                e.printStackTrace();
                flag = false;
            }
            if (!flag) {
                errors.rejectValue("BusinessOpeningDate", "Format", "请输入正确的时间");
            }
            if (!entity.getBusinessDescription().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("BusinessDescription", "Format", "请输入正确的业务描述（中文英文或者数字）");
            }
            if (entity.getBusinessDescription().length() > 50) {
                errors.rejectValue("BusinessDescription", "Length", "请输入50位以内的字符");
            }
            if (!entity.getInformationChannelCategory().matches("^[0-9]*$")) {
                errors.rejectValue("InformationChannelCategory", "Format", "请输入正确的信息途径类别（数字）");
            }
            if (entity.getInformationChannelCategory().length() > 8) {
                errors.rejectValue("InformationChannelCategory", "Length", "请输入8位以内的字符");
            }
            if (!entity.getInformationChannelDescription().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                errors.rejectValue("InformationChannelDescription", "Format", "请输入正确的信息途径（中文英文或者数字）");
            }
            if (entity.getInformationChannelDescription().length() > 10) {
                errors.rejectValue("InformationChannelDescription", "Length", "请输入10位以内的字符");
            }
            if(!entity.getBusinessRegisterDate().isEmpty()){
                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                Boolean flag1 = true;
                try {
                    Date eDate = format.parse(entity.getBusinessRegisterDate());
                } catch (ParseException e) {
                    e.printStackTrace();
                    flag1 = false;
                }
                if (!flag1) {
                    errors.rejectValue("BusinessRegisterDate", "Format", "请输入正确的时间");
                }
            }
            if(!entity.getBusinessRegisterLocation().isEmpty()){
                if (!entity.getBusinessRegisterLocation().matches("^[\\u4E00-\\u9FA5A-Za-z0-9]+$")) {
                    errors.rejectValue("BusinessRegisterLocation", "Format", "请输入正确的营业执照登记地点（中文英文或者数字）");
                }
                if (entity.getBusinessRegisterLocation().length() > 15) {
                    errors.rejectValue("BusinessRegisterLocation", "Length", "请输入15位以内的字符");
                }
            }

        }
    }
}
