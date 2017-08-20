package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateRepresentative_Validate;
import com.ecsolutions.entity.LoanCorporateRepresentative_Entity;
import com.ecsolutions.service.LoanCorporateRepresentative_Service;
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
 * Created by ecs on 2017/8/10.
 */
@Controller
public class LoanCorporateRepresentative_Controller {
    private String CustCode;
    @Autowired
    private LoanCorporateRepresentative_Service loanCorporateRepresentative_service;

    public LoanCorporateRepresentative_Service getLoanCorporateRepresentative() {
        return loanCorporateRepresentative_service;
    }

    @InitBinder("loanCorporateRepresentative_entity")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateRepresentative_Validate());
    }

    @GetMapping("/LoanCorporateRepresentative")
    public String getLoanCorporateRepresentative(Model model) {
        CustCode = "000001";
        model.addAttribute("loanCorporateRepresentative_entity", new LoanCorporateRepresentative_Entity());
        model.addAttribute("CCYInfoList", loanCorporateRepresentative_service.getCODTYPEInfo().getIDTypeInfoList());
        return "ClientInformation/LoanCorporateRepresentative";
    }

    @PostMapping("/LoanCorporateRepresentative")
    public String saveLoanCorporateRepresentative(Model model, @Valid @ModelAttribute("loanCorporateRepresentative_entity") LoanCorporateRepresentative_Entity loanCorporateRepresentative_entity, BindingResult result) {
        model.addAttribute("loanCorporateRepresentative_entity", loanCorporateRepresentative_entity);
        model.addAttribute("CCYInfoList", loanCorporateRepresentative_service.getCODTYPEInfo().getIDTypeInfoList());
        if (!result.hasErrors()) {
            if (loanCorporateRepresentative_entity.getId() .equals( "")) {
                loanCorporateRepresentative_entity.setCustCode(CustCode);
                loanCorporateRepresentative_service.save(loanCorporateRepresentative_entity);
            } else {
                loanCorporateRepresentative_service.update(loanCorporateRepresentative_entity);
            }
        }
        return "ClientInformation/LoanCorporateRepresentative";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateRepresentative/getCustCode")
    public String getCustCode() {
        return CustCode;
    }

    @ResponseBody
    @GetMapping("/LoanCorporateRepresentative/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateRepresentative_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateRepresentative_Entity> list = loanCorporateRepresentative_service.findAll(CustCode);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateRepresentative/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateRepresentative(@RequestParam String id) {
        if (loanCorporateRepresentative_service.delete(id))
            return "success";
        else return "fail";
    }

}
