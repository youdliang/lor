package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateForeignInvestment_Validate;
import com.ecsolutions.entity.LoanCorporateForeignInvestment_Entity;
import com.ecsolutions.service.LoanCorporateForeignInvestment_Service;
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
 * Created by ecs on 2017/7/28.
 */
@Controller
public class LoanCorporateForeignInvestment_Controller {
    private String CustCode;

    @Autowired
    private LoanCorporateForeignInvestment_Service loanCorporateForeignInvestment_service;

    public LoanCorporateForeignInvestment_Service getLoanCorporateForeignInvestment_service() {
        return loanCorporateForeignInvestment_service;
    }

    @InitBinder("loanCorporateForeignInvestment_entity")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateForeignInvestment_Validate());
    }

    @GetMapping("/LoanCorporateForeignInvestment")
    public String getLoanCorporateForeignInvestment(Model model) {
        CustCode = "000001";
        LoanCorporateForeignInvestment_Entity entity = new LoanCorporateForeignInvestment_Entity();
        entity.setCustCode(CustCode);
        model.addAttribute("loanCorporateForeignInvestment_entity", entity);
        model.addAttribute("CCY", loanCorporateForeignInvestment_service.getCCYListInfo());
        return "ClientInformation/LoanCorporateForeignInvestment";
    }

    @PostMapping("/LoanCorporateForeignInvestment")
    public String saveLoanCorporateForeignInvestment(@Valid @ModelAttribute("loanCorporateForeignInvestment_entity") LoanCorporateForeignInvestment_Entity loanCorporateForeignInvestment_entity,
                                                     BindingResult result, Model model) {
        model.addAttribute("loanCorporateForeignInvestment_entity", loanCorporateForeignInvestment_entity);
        model.addAttribute("CCY", loanCorporateForeignInvestment_service.getCCYListInfo());
        if (!result.hasErrors()) {
            if (loanCorporateForeignInvestment_entity.getId().equals("")) {
                loanCorporateForeignInvestment_entity.setCustCode(CustCode);
                loanCorporateForeignInvestment_service.save(loanCorporateForeignInvestment_entity);
            } else {
                loanCorporateForeignInvestment_service.update(loanCorporateForeignInvestment_entity);
            }
        }
        return "ClientInformation/LoanCorporateForeignInvestment";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateForeignInvestment/getCustCode")
    public String getCustCode() {
        return CustCode;
    }

    @ResponseBody
    @GetMapping("/LoanCorporateForeignInvestment/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateForeignInvestment_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateForeignInvestment_Entity> list = loanCorporateForeignInvestment_service.findAll(CustCode);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }


    @ResponseBody
    @RequestMapping(value = "/LoanCorporateForeignInvestment/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateForeignInvestment(
            @RequestParam String Id
    ) {
        if (loanCorporateForeignInvestment_service.delete(Id))
            return "success";
        else return "fail";
    }

}
