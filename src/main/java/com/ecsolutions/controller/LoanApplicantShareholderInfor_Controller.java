package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanApplicantShareholderInfor_Validate;
import com.ecsolutions.entity.LoanApplicantShareholderInfor_Entity;
import com.ecsolutions.service.LoanApplicantShareholderInfor_Service;
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
public class LoanApplicantShareholderInfor_Controller {
    private String CustCod;
    private Integer state = 1;
    @Autowired
    private LoanApplicantShareholderInfor_Service loanApplicantShareholderInfor_service;

    public LoanApplicantShareholderInfor_Service getLoanApplicantShareholderInfor() {
        return loanApplicantShareholderInfor_service;
    }

    @InitBinder("loanApplicantShareholderInfor_Personal_entity")
    public void initPersonalBinder(WebDataBinder binder) {
        binder.setValidator(new LoanApplicantShareholderInfor_Validate());
    }

    @InitBinder("loanApplicantShareholderInfor_Enterprise_entity")
    public void initEnterpriseBinder(WebDataBinder binder) {
        binder.setValidator(new LoanApplicantShareholderInfor_Validate());
    }


    @GetMapping("/LoanApplicantShareholderInfor")
    public String getLoanApplicantShareholderInfor(Model model) {
        CustCod = "000001";
        model.addAttribute("loanApplicantShareholderInfor_Personal_entity", new LoanApplicantShareholderInfor_Entity());
        model.addAttribute("loanApplicantShareholderInfor_Enterprise_entity", new LoanApplicantShareholderInfor_Entity());
        model.addAttribute("CCYInfoList", loanApplicantShareholderInfor_service.getIDTypeInfo().getIDTypeInfoList());
        return "ClientInformation/LoanApplicantShareholderInfor";
    }

    @PostMapping("/LoanApplicantShareholderInforPersonal")
    public String savePersonalLoanApplicantShareholderInfor(Model model,
                                                            @Valid @ModelAttribute("loanApplicantShareholderInfor_Personal_entity") LoanApplicantShareholderInfor_Entity loanApplicantShareholderInfor_Personal_entity, BindingResult resultP,
                                                            @Valid @ModelAttribute("loanApplicantShareholderInfor_Enterprise_entity") LoanApplicantShareholderInfor_Entity loanApplicantShareholderInfor_Enterprise_entity, BindingResult resultE) {
        model.addAttribute("loanApplicantShareholderInfor_Personal_entity", loanApplicantShareholderInfor_Personal_entity);
        model.addAttribute("loanApplicantShareholderInfor_Enterprise_entity", loanApplicantShareholderInfor_Enterprise_entity);
        model.addAttribute("CCYInfoList", loanApplicantShareholderInfor_service.getIDTypeInfo().getIDTypeInfoList());
        if (!resultP.hasErrors()) {
            loanApplicantShareholderInfor_Personal_entity.setType(loanApplicantShareholderInfor_Personal_entity.getType().trim());
            if (loanApplicantShareholderInfor_Personal_entity.getId().equals("")) {
                loanApplicantShareholderInfor_Personal_entity.setCustCod(CustCod);
                loanApplicantShareholderInfor_service.save(loanApplicantShareholderInfor_Personal_entity);
            } else {
                loanApplicantShareholderInfor_service.update(loanApplicantShareholderInfor_Personal_entity);
            }
        }
        state = 1;
        return "ClientInformation/LoanApplicantShareholderInfor";
    }

    @PostMapping("/LoanApplicantShareholderInforEnterprise")
    public String saveEnterpriseLoanApplicantShareholderInfor(Model model,
                                                              @Valid @ModelAttribute("loanApplicantShareholderInfor_Personal_entity") LoanApplicantShareholderInfor_Entity loanApplicantShareholderInfor_Personal_entity, BindingResult resultP,
                                                              @Valid @ModelAttribute("loanApplicantShareholderInfor_Enterprise_entity") LoanApplicantShareholderInfor_Entity loanApplicantShareholderInfor_Enterprise_entity, BindingResult resultE) {
        model.addAttribute("loanApplicantShareholderInfor_Personal_entity", loanApplicantShareholderInfor_Personal_entity);
        model.addAttribute("loanApplicantShareholderInfor_Enterprise_entity", loanApplicantShareholderInfor_Enterprise_entity);
        model.addAttribute("CCYInfoList", loanApplicantShareholderInfor_service.getIDTypeInfo().getIDTypeInfoList());
        if (!resultE.hasErrors()) {
            loanApplicantShareholderInfor_Enterprise_entity.setType(loanApplicantShareholderInfor_Enterprise_entity.getType().trim());
            if (loanApplicantShareholderInfor_Enterprise_entity.getId().equals("")) {
                loanApplicantShareholderInfor_Enterprise_entity.setCustCod(CustCod);
                loanApplicantShareholderInfor_service.save(loanApplicantShareholderInfor_Enterprise_entity);
            } else {
                loanApplicantShareholderInfor_service.update(loanApplicantShareholderInfor_Enterprise_entity);
            }
        }
        state = 2;
        return "ClientInformation/LoanApplicantShareholderInfor";
    }

    @ResponseBody
    @GetMapping("/LoanApplicantShareholderInfor/getState")
    public Integer getState() {
        return state;
    }

    @ResponseBody
    @GetMapping("/LoanApplicantShareholderInfor/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex, String Type) {
        Gson gson = new Gson();
        int total = loanApplicantShareholderInfor_service.countAll(CustCod, Type);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanApplicantShareholderInfor_Entity> list = loanApplicantShareholderInfor_service.findAll(CustCod, Type);
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanApplicantShareholderInfor/delete", method = RequestMethod.GET)
    public String deleteLoanApplicantShareholderInfor(@RequestParam String id) {
        if (loanApplicantShareholderInfor_service.delete(id))
            return "success";
        else return "fail";
    }
}
