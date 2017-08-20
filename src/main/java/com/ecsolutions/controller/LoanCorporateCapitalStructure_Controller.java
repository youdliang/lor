package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateCapitalStructure_Validate;
import com.ecsolutions.entity.LoanCorporateCapitalStructure_Entity;
import com.ecsolutions.service.LoanCorporateCapitalStructure_Service;
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
 * Created by ecs on 2017/7/27.
 */
@Controller
public class LoanCorporateCapitalStructure_Controller {
    private String CustCode;

    @Autowired
    private LoanCorporateCapitalStructure_Service loanCorporateCapitalStructure_service;

    public LoanCorporateCapitalStructure_Service getLoanCorporateCapitalStructure_service() {
        return loanCorporateCapitalStructure_service;
    }

    @InitBinder("loanCorporateCapitalStructure_entity")
    public void initBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateCapitalStructure_Validate());
    }


    @GetMapping("/LoanCorporateCapitalStructure")
    public String getLoanCorporateCapitalStructure(Model model) {
        CustCode = "000001";
        model.addAttribute("loanCorporateCapitalStructure_entity", new LoanCorporateCapitalStructure_Entity());
        return "ClientInformation/LoanCorporateCapitalStructure";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateCapitalStructure/getCustCode")
    public String getCustCode() {
        return CustCode;
    }

    @ResponseBody
    @GetMapping("/LoanCorporateCapitalStructure/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateCapitalStructure_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateCapitalStructure_Entity> list = loanCorporateCapitalStructure_service.findAll(CustCode);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

//    @PostMapping(value = "/LoanCorporateCapitalStructure/update")
//    public String updateLoanCorporateCapitalStructure(
//            @ModelAttribute LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity,
//            Model model
//    ) {
//        model.addAttribute("loanCorporateCapitalStructure_entity", loanCorporateCapitalStructure_entity);
//        loanCorporateCapitalStructure_entity.setCustcode(CustCode);
//        loanCorporateCapitalStructure_service.update(loanCorporateCapitalStructure_entity);
//        return "ClientInformation/LoanCorporateCapitalStructure";
//    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateCapitalStructure/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateCapitalStructure(
            @RequestParam String Id
    ) {
        if (loanCorporateCapitalStructure_service.delete(Id))
            return "success";
        else return "fail";
    }

    @PostMapping("/LoanCorporateCapitalStructure")
    public String saveLoanCorporateCapitalStructure(@Valid @ModelAttribute("loanCorporateCapitalStructure_entity") LoanCorporateCapitalStructure_Entity loanCorporateCapitalStructure_entity,
                                                    BindingResult result,
                                                    Model model) {
        model.addAttribute("loanCorporateCapitalStructure_entity", loanCorporateCapitalStructure_entity);
        if (!result.hasErrors())
            if (loanCorporateCapitalStructure_entity.getId() .equals( "")) {
                loanCorporateCapitalStructure_entity.setCustcode(CustCode);
                loanCorporateCapitalStructure_service.save(loanCorporateCapitalStructure_entity);
            } else {
                loanCorporateCapitalStructure_service.update(loanCorporateCapitalStructure_entity);
            }
        return "ClientInformation/LoanCorporateCapitalStructure";
    }

}
