package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateLitigationInfo_Validate;
import com.ecsolutions.entity.LoanCorporateLitigationInfo_Entity;
import com.ecsolutions.service.LoanCorporateLitigationInfo_Service;
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
public class LoanCorporateLitigationInfo_Controller {
    private String CustCode;

    @Autowired
    private LoanCorporateLitigationInfo_Service loanCorporateLitigationInfo_service;

    public LoanCorporateLitigationInfo_Service getLoanCorporateLitigationInfo_service() {
        return loanCorporateLitigationInfo_service;
    }

    @InitBinder("loanCorporateLitigationInfo_entity")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateLitigationInfo_Validate());
    }

    @GetMapping("/LoanCorporateLitigationInfo")
    public String getLoanCorporateLitigationInfo(Model model) {
        CustCode = "000001";
        model.addAttribute("loanCorporateLitigationInfo_entity", new LoanCorporateLitigationInfo_Entity());
        model.addAttribute("CCY", loanCorporateLitigationInfo_service.getCCYListInfo());
        return "ClientInformation/LoanCorporateLitigationInfo";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateLitigationInfo/getCustCode")
    public String getCustCode() {
        return CustCode;
    }


    @ResponseBody
    @GetMapping("/LoanCorporateLitigationInfo/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateLitigationInfo_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateLitigationInfo_Entity> list = loanCorporateLitigationInfo_service.findAll(CustCode);
        for (LoanCorporateLitigationInfo_Entity entity : list) {
            entity.setJudgmentEnforcementDate(entity.getJudgmentEnforcementDate().substring(0, 10));
        }
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateLitigationInfo/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateLitigationInfo(@RequestParam String Id) {
        if (loanCorporateLitigationInfo_service.delete(Id))
            return "success";
        else return "fail";
    }

    @PostMapping("/LoanCorporateLitigationInfo")
    public String saveLoanCorporateLitigationInfo(@Valid @ModelAttribute("loanCorporateLitigationInfo_entity") LoanCorporateLitigationInfo_Entity loanCorporateLitigationInfo_entity,
                                                  BindingResult result,
                                                  Model model) {
        model.addAttribute("loanCorporateLitigationInfo_entity", loanCorporateLitigationInfo_entity);
        model.addAttribute("CCY", loanCorporateLitigationInfo_service.getCCYListInfo());
        if (!result.hasErrors()) {
            if (loanCorporateLitigationInfo_entity.getId().equals("")) {
                loanCorporateLitigationInfo_entity.setCustCode(CustCode);
                loanCorporateLitigationInfo_service.save(loanCorporateLitigationInfo_entity);
            } else {
                loanCorporateLitigationInfo_service.update(loanCorporateLitigationInfo_entity);
            }
        }
        return "ClientInformation/LoanCorporateLitigationInfo";
    }


}
