package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateCertificates_Validate;
import com.ecsolutions.Validators.LoanQualificationCertificate_Validate;
import com.ecsolutions.Validators.LoanSpecialTradeLicense_Validate;
import com.ecsolutions.entity.LoanCorporateCertificates_Entity;
import com.ecsolutions.entity.LoanQualificationCertificate_Entity;
import com.ecsolutions.entity.LoanSpecialTradeLicense_Entity;
import com.ecsolutions.service.LoanCorporateCertificates_Service;
import com.ecsolutions.service.LoanQualificationCertificate_Service;
import com.ecsolutions.service.LoanSpecialTradeLicense_Service;
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
public class LoanCorporateCertificates_Controller {
    private String CustCode;

    @Autowired
    private LoanCorporateCertificates_Service loanCorporateCertificates_service;
    @Autowired
    private LoanQualificationCertificate_Service loanQualificationCertificate_service;
    @Autowired
    private LoanSpecialTradeLicense_Service loanSpecialTradeLicense_service;

    @InitBinder("loanCorporateCertificates_entity")
    public void initLoanCorporateCertificatesBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateCertificates_Validate());
    }

    @InitBinder("loanQualificationCertificate_entity")
    public void initLoanQualificationCertificateBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanQualificationCertificate_Validate());
    }

    @InitBinder("loanSpecialTradeLicense_entity")
    public void initLoanSpecialTradeLicenseBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanSpecialTradeLicense_Validate());
    }


    @GetMapping("/LoanCorporateCertificates")
    public String getLoanCorporateCertificates(Model model) {
        CustCode = "000001";
        model.addAttribute("loanCorporateCertificates_entity", new LoanCorporateCertificates_Entity());
//        LoanQualificationCertificate_Entity loanQualificationCertificate_entity =new LoanQualificationCertificate_Entity();
//        loanQualificationCertificate_entity.setQCqualificationlevel("1");
        model.addAttribute("loanQualificationCertificate_entity", new LoanQualificationCertificate_Entity());
        model.addAttribute("loanSpecialTradeLicense_entity", new LoanSpecialTradeLicense_Entity());
        return "ClientInformation/LoanCorporateCertificates";
    }

    @PostMapping("/LoanCorporateCertificates")
    public String saveLoanCorporateCertificates(@Valid @ModelAttribute("loanCorporateCertificates_entity") LoanCorporateCertificates_Entity loanCorporateCertificates_entity,
                                                BindingResult result1,
                                                @Valid @ModelAttribute("loanQualificationCertificate_entity") LoanQualificationCertificate_Entity loanQualificationCertificate_entity,
                                                BindingResult result2,
                                                @Valid @ModelAttribute("loanSpecialTradeLicense_entity") LoanSpecialTradeLicense_Entity loanSpecialTradeLicense_entity,
                                                BindingResult result3,
                                                Model model) {
        model.addAttribute("loanCorporateCertificates_entity", loanCorporateCertificates_entity);
        model.addAttribute("loanQualificationCertificate_entity", loanQualificationCertificate_entity);
        model.addAttribute("loanSpecialTradeLicense_entity", loanSpecialTradeLicense_entity);

        if (!(result1.hasErrors() || result2.hasErrors() || result3.hasErrors())) {

            if (loanCorporateCertificates_entity.getId() == null) {
                loanCorporateCertificates_entity.setCustCode(CustCode);
                loanCorporateCertificates_service.save(loanCorporateCertificates_entity);
            }
            if (loanSpecialTradeLicense_entity.getId() == null) {
                loanSpecialTradeLicense_entity.setCustcode(CustCode);
                loanSpecialTradeLicense_service.save(loanSpecialTradeLicense_entity);
            }
            if (loanQualificationCertificate_entity.getId() == null) {
                loanQualificationCertificate_entity.setCustcode(CustCode);
                loanQualificationCertificate_service.save(loanQualificationCertificate_entity);
            }
            if (loanCorporateCertificates_entity.getId() != null) {
                loanCorporateCertificates_service.update(loanCorporateCertificates_entity);
            }
            if (loanQualificationCertificate_entity.getId() != null) {
                loanQualificationCertificate_service.update(loanQualificationCertificate_entity);
            }
            if (loanSpecialTradeLicense_entity.getId() != null) {
                loanSpecialTradeLicense_service.update(loanSpecialTradeLicense_entity);
            }
        }
        return "ClientInformation/LoanCorporateCertificates";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateCertificates/getQCHistoryList")
    public String getQCHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanQualificationCertificate_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanQualificationCertificate_Entity> list = loanQualificationCertificate_service.findAll(CustCode);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getExpirydate() != null)
                list.get(i).setExpirydate(list.get(i).getExpirydate().substring(0, 10));
        }
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateCertificates/getSTHistoryList")
    public String getSTHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanSpecialTradeLicense_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanSpecialTradeLicense_Entity> list = loanSpecialTradeLicense_service.findAll(CustCode);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getExpirydate() != null)
                list.get(i).setExpirydate(list.get(i).getExpirydate().substring(0, 10));
        }
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @PostMapping(value = "/LoanSpecialTradeLicense")
    public String updateLoanSpecialTradeLicense(
            @Valid @ModelAttribute("loanCorporateCertificates_entity") LoanCorporateCertificates_Entity loanCorporateCertificates_entity,
            @Valid @ModelAttribute("loanQualificationCertificate_entity") LoanQualificationCertificate_Entity loanQualificationCertificate_entity,
            @Valid @ModelAttribute("loanSpecialTradeLicense_entity") LoanSpecialTradeLicense_Entity loanSpecialTradeLicense_entity,
            BindingResult result,
            Model model
    ) {
        model.addAttribute("loanCorporateCertificates_entity", loanCorporateCertificates_entity);
        model.addAttribute("loanQualificationCertificate_entity", loanQualificationCertificate_entity);
        model.addAttribute("loanSpecialTradeLicense_entity", loanSpecialTradeLicense_entity);
        if (!result.hasErrors()) {
            loanSpecialTradeLicense_entity.setCustcode(CustCode);
            loanSpecialTradeLicense_service.save(loanSpecialTradeLicense_entity);
        }
        return "ClientInformation/LoanCorporateCertificates";
    }

    @PostMapping(value = "/LoanQualificationCertificate")
    public String updateLoanQualificationCertificates(
            @Valid @ModelAttribute("loanCorporateCertificates_entity") LoanCorporateCertificates_Entity loanCorporateCertificates_entity,
            @Valid @ModelAttribute("loanQualificationCertificate_entity") LoanQualificationCertificate_Entity loanQualificationCertificate_entity,
            @Valid @ModelAttribute("loanSpecialTradeLicense_entity") LoanSpecialTradeLicense_Entity loanSpecialTradeLicense_entity,
            BindingResult result,
            Model model
    ) {
        model.addAttribute("loanCorporateCertificates_entity", loanCorporateCertificates_entity);
        model.addAttribute("loanQualificationCertificate_entity", loanQualificationCertificate_entity);
        model.addAttribute("loanSpecialTradeLicense_entity", loanSpecialTradeLicense_entity);
        if (!result.hasErrors()) {
            loanQualificationCertificate_entity.setCustcode(CustCode);
            loanQualificationCertificate_service.save(loanQualificationCertificate_entity);
        }
        return "ClientInformation/LoanCorporateCertificates";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateCertificates/deleteLoanCorporateCertificates", method = RequestMethod.GET)
    public String deleteLoanCorporateCertificates(
            @RequestParam String Id
    ) {
        if (loanCorporateCertificates_service.delete(Id))
            return "success";
        else return "fail";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateCertificates/deleteLoanSpecialTradeLicense", method = RequestMethod.GET)
    public String deleteLoanSpecialTradeLicense(@RequestParam String STid) {
        if (loanSpecialTradeLicense_service.delete(STid))
            return "success";
        else return "fail";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateCertificates/deleteLoanQualificationCertificate", method = RequestMethod.GET)
    public String deleteLoanQualificationCertificate(
            @RequestParam String QCid
    ) {
        if (loanQualificationCertificate_service.delete(QCid))
            return "success";
        else return "fail";
    }
}
