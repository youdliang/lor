package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateMajorIssues_Validate;
import com.ecsolutions.entity.LoanCorporateMajorIssues_Entity;
import com.ecsolutions.service.LoanCorporateMajorIssues_Service;
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
 * Created by ecs on 2017/8/9.
 */
@Controller
public class LoanCorporateMajorIssues_Controller {
    private String CustCode;
    @Autowired
    private LoanCorporateMajorIssues_Service loanCorporateMajorIssues_service;

    public LoanCorporateMajorIssues_Service getLoanCorporateMajorIssues_Service() {
        return loanCorporateMajorIssues_service;
    }

    @InitBinder("loanCorporateMajorIssues_entity")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateMajorIssues_Validate());
    }

    @GetMapping("/LoanCorporateMajorIssues")
    public String getLoanCorporateMajorIssues(Model model) {
        CustCode = "000001";
        model.addAttribute("loanCorporateMajorIssues_entity", new LoanCorporateMajorIssues_Entity());
        return "ClientInformation/LoanCorporateMajorIssues";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateMajorIssues/getCustCode")
    public String getCustCode() {
        return CustCode;
    }

    @ResponseBody
    @GetMapping("/LoanCorporateMajorIssues/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateMajorIssues_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateMajorIssues_Entity> list = loanCorporateMajorIssues_service.findAll(CustCode);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateMajorIssues/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateMajorIssues(@RequestParam String id) {
        if (loanCorporateMajorIssues_service.delete(id))
            return "success";
        else return "fail";
    }

    @PostMapping("/LoanCorporateMajorIssues")
    public String saveLoanCorporateMajorIssues(@Valid @ModelAttribute("loanCorporateMajorIssues_entity") LoanCorporateMajorIssues_Entity loanCorporateMajorIssues_entity, BindingResult result, Model model) {
        model.addAttribute("loanCorporateMajorIssues_entity", loanCorporateMajorIssues_entity);
        if (!result.hasErrors()) {
            if (loanCorporateMajorIssues_entity.getId() .equals( "")) {
                loanCorporateMajorIssues_entity.setCustCode(CustCode);
                loanCorporateMajorIssues_service.save(loanCorporateMajorIssues_entity);
            } else {
                loanCorporateMajorIssues_service.update(loanCorporateMajorIssues_entity);
            }
        }
        return "ClientInformation/LoanCorporateMajorIssues";
    }


}
