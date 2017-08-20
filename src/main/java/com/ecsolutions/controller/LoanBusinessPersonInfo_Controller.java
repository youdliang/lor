package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanBusinessPersonInfo_Validate;
import com.ecsolutions.entity.LoanBusinessPersonInfo_Entity;
import com.ecsolutions.service.LoanBusinessPersonInfo_Service;
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
 * Created by ecs on 2017/8/17.
 */
@Controller
public class LoanBusinessPersonInfo_Controller {

    private String custCode;

    @Autowired
    private LoanBusinessPersonInfo_Service loanBusinessPersonInfo_service;

    public LoanBusinessPersonInfo_Service getLoanBusinessPersonInfo_service() {
        return loanBusinessPersonInfo_service;
    }

    @InitBinder("loanBusinessPersonInfo_entity")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoanBusinessPersonInfo_Validate());
    }

    @GetMapping("/LoanBusinessPersonInfo")
    public String getLoanBusinessPersonInfo(Model model) {
        custCode = "000001";
        model.addAttribute("loanBusinessPersonInfo_entity", new LoanBusinessPersonInfo_Entity());
        return "ClientInformation/LoanBusinessPersonInfo";
    }

    @PostMapping("/LoanBusinessPersonInfo")
    public String postLoanBusinessPersonInfo(Model model, @Valid @ModelAttribute("loanBusinessPersonInfo_entity") LoanBusinessPersonInfo_Entity loanBusinessPersonInfo_entity, BindingResult result) {
        model.addAttribute("loanBusinessPersonInfo_entity", loanBusinessPersonInfo_entity);
        if (!result.hasErrors()) {
            if (loanBusinessPersonInfo_entity.getCustCode().equals("")) {
                loanBusinessPersonInfo_entity.setCustCode(custCode);
                loanBusinessPersonInfo_service.save(loanBusinessPersonInfo_entity);
            } else {
                loanBusinessPersonInfo_service.update(loanBusinessPersonInfo_entity);
            }
        }
        return "ClientInformation/LoanBusinessPersonInfo";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanBusinessPersonInfo/delete", method = RequestMethod.GET)
    public String deleteLoanBusinessPersonInfo(@RequestParam String custCode) {
        if (loanBusinessPersonInfo_service.delete(custCode)) {
            return "success";
        } else
            return "fail";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanBusinessPersonInfo/getHistoryListisRecord", method = RequestMethod.GET)
    public String getLoanBusinessPersonInfoHistoryisRecord() {
        Gson gson = new Gson();
        Integer count = loanBusinessPersonInfo_service.countAll(custCode);
        if (count > 0)
            return "true";
        else
            return "false";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanBusinessPersonInfo/getHistoryList", method = RequestMethod.GET)
    public String getLoanBusinessPersonInfoHistory() {
        Gson gson = new Gson();
        List<LoanBusinessPersonInfo_Entity> list = loanBusinessPersonInfo_service.findAll(custCode);
        if (list.size() > 0 ) {
            list.get(0).setBusinessRegisterDate(list.get(0).getBusinessRegisterDate().substring(0, 10));
            list.get(0).setBusinessOpeningDate(list.get(0).getBusinessOpeningDate().substring(0, 10));
        }
        return gson.toJson(list);
    }

}
