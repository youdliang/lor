package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanApplicantSpouseNameInfo_Validate;
import com.ecsolutions.entity.LoanApplicantSpouseNameInfo_Entity;
import com.ecsolutions.service.LoanApplicantSpouseNameInfo_Service;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ecs on 2017/8/11.
 */
@Controller
public class LoanApplicantSpouseNameInfo_Controller {
    private String custCode;

    @Autowired
    private LoanApplicantSpouseNameInfo_Service loanApplicantSpouseNameInfo_service;

    public LoanApplicantSpouseNameInfo_Service getLoanApplicantSpouseNameInfo_service() {
        return loanApplicantSpouseNameInfo_service;
    }

    @InitBinder("loanApplicantSpouseNameInfo_entity")
    public void initBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanApplicantSpouseNameInfo_Validate());
    }

    @GetMapping("/LoanApplicantSpouseNameInfo")
    public String getLoanApplicantSpouseNameInfo(Model model) {
        custCode = "000001";
        LoanApplicantSpouseNameInfo_Entity entity = new LoanApplicantSpouseNameInfo_Entity();
        model.addAttribute("loanApplicantSpouseNameInfo_entity", entity);
        model.addAttribute("IDTypeInfoList", loanApplicantSpouseNameInfo_service.getIDTypeInfo());
        return "ClientInformation/LoanApplicantSpouseNameInfo";
    }

    @ResponseBody
    @GetMapping("/LoanApplicantSpouseNameInfo/getSpouse")
    public String getSpouse() {
        Gson gson = new Gson();
        List<LoanApplicantSpouseNameInfo_Entity> list = loanApplicantSpouseNameInfo_service.findAll(custCode);
        String historyList = gson.toJson(list);
        return historyList;
    }

    @ResponseBody
    @RequestMapping(value = "/LoanApplicantSpouseNameInfo/delete", method = RequestMethod.GET)
    public String deleteLoanApplicantSpouseNameInfo(@RequestParam String custCode
    ) {
        if (loanApplicantSpouseNameInfo_service.delete(custCode))
            return "success";
        else return "fail";
    }

    @PostMapping("/LoanApplicantSpouseNameInfo")
    public String saveLoanApplicantSpouseNameInfo(@Valid @ModelAttribute("loanApplicantSpouseNameInfo_entity") LoanApplicantSpouseNameInfo_Entity loanApplicantSpouseNameInfo_entity, BindingResult result, Model model) {
        model.addAttribute("loanApplicantSpouseNameInfo_entity", loanApplicantSpouseNameInfo_entity);
        model.addAttribute("IDTypeInfoList", loanApplicantSpouseNameInfo_service.getIDTypeInfo());
        if (!result.hasErrors()) {
            if (loanApplicantSpouseNameInfo_entity.getCustCode().equals("")) {
                loanApplicantSpouseNameInfo_entity.setCustCode(custCode);
                loanApplicantSpouseNameInfo_service.save(loanApplicantSpouseNameInfo_entity);
            } else {
                loanApplicantSpouseNameInfo_service.update(loanApplicantSpouseNameInfo_entity);
            }
        }
        return "ClientInformation/LoanApplicantSpouseNameInfo";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanApplicantSpouseNameInfo/getHistoryListisRecord", method = RequestMethod.GET)
    public String getLoanApplicantSpouseNameInfoHistoryisRecord() {
        Gson gson = new Gson();
        Integer count = loanApplicantSpouseNameInfo_service.countAll(custCode);
        if (count > 0)
            return "true";
        else
            return "false";
    }
}
