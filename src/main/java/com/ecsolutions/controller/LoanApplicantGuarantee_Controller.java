package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanApplicantGuarantee_Validate;
import com.ecsolutions.entity.LoanApplicantGuarantee_Entity;
import com.ecsolutions.service.LoanApplicantGuarantee_Service;
import com.github.pagehelper.PageHelper;
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
 * Created by ecs on 2017/7/26.
 */
@Controller
public class LoanApplicantGuarantee_Controller {
    private String custCode;

    @Autowired
    private LoanApplicantGuarantee_Service loanApplicantGuarantee_service;

    public LoanApplicantGuarantee_Service getLoanApplicantGuarantee_service() {
        return loanApplicantGuarantee_service;
    }

    @InitBinder("loanApplicantGuarantee_entity")
    public void initBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanApplicantGuarantee_Validate());
    }

    @GetMapping("/LoanApplicantGuarantee")
    public String getLoanApplicantGuarantee(Model model) {
        custCode = "000001";
        LoanApplicantGuarantee_Entity entity = new LoanApplicantGuarantee_Entity();
        model.addAttribute("loanApplicantGuarantee_entity", entity);
        return "ClientInformation/LoanApplicantGuarantee";
    }

    @ResponseBody
    @GetMapping("/LoanApplicantGuarantee/getCustCode")
    public String getCustCode() {
        return custCode;
    }

    @ResponseBody
    @GetMapping("/LoanApplicantGuarantee/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanApplicantGuarantee_service.countAll(custCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanApplicantGuarantee_Entity> list = loanApplicantGuarantee_service.findAll(custCode);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanApplicantGuarantee/delete",method = RequestMethod.GET)
    public String deleteLoanApplicantGuarantee(
           @RequestParam String GuaranteeID
    ) {
        if(loanApplicantGuarantee_service.delete(Integer.parseInt(GuaranteeID)))
        return "success";
        else return "fail";
    }

    @PostMapping("/LoanApplicantGuarantee")
    public String saveLoanApplicantGuarantee(@Valid @ModelAttribute("loanApplicantGuarantee_entity") LoanApplicantGuarantee_Entity loanApplicantGuarantee_entity, BindingResult result, Model model) {
        model.addAttribute("loanApplicantGuarantee_entity", loanApplicantGuarantee_entity);
        if (!result.hasErrors()) {
            if (loanApplicantGuarantee_entity.getGuaranteeID() == null) {
                loanApplicantGuarantee_entity.setCustCode(custCode);
                loanApplicantGuarantee_entity.getCustCode();
                loanApplicantGuarantee_service.save(loanApplicantGuarantee_entity);
            }
            else{
                loanApplicantGuarantee_service.update(loanApplicantGuarantee_entity);
            }
        }
        return "ClientInformation/LoanApplicantGuarantee";
    }
}
