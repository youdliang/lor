package com.ecsolutions.controller;

import com.ecsolutions.common.ObjectHelp;
import com.ecsolutions.entity.Apply_entity;
import com.ecsolutions.service.ApplyCompany_Service;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class ApplyCompany {

    @Autowired
    private ApplyCompany_Service applyCompany_service;
    public ApplyCompany_Service getApplyCompany_service() {
        return applyCompany_service;
    }

    @Autowired
    private TransferClient client;

    @Autowired
    @Qualifier("companyValidate")
    private Validator validator;

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(validator);
    }

    public ApplyCompany(){

    }

    @GetMapping("/apply")
    public String getApplyPage(Model model) {
        model.addAttribute("apply_entity", new Apply_entity());
        model.addAttribute("apply_info", applyCompany_service.getPopupInfo());
        return "applyCompany";
    }

    @PostMapping("/apply")
    public String saveApplyInfo(@Valid @ModelAttribute Apply_entity apply_entity, BindingResult result, Model model) {
        model.addAttribute("apply_entity", apply_entity);
        model.addAttribute("apply_info", applyCompany_service.getPopupInfo());
        applyCompany_service.saveApplyEntity(apply_entity);
        //TransferClient.transfer(model);
        if(!result.hasErrors()) {
            System.out.println("call TransferClient.transfer");

            String mess= ObjectHelp.InitTransferData("ApplyCompanyTx",apply_entity);
           // TransferClient client=new TransferClient();
            client.transfer(mess);
        }
        return "applyCompany";
    }

    @ResponseBody
    @RequestMapping(value = "/applyCompany_ethnicCheck",method = RequestMethod.POST)
    public String findByEthnic(String ethnic){
        //Pledge_Entity pledge_entity = pledgeNew_service.getByEthnic(ethnic);
        //return pledge_entity;
        String result = applyCompany_service.ethnicCheck(ethnic);
        return result;
    }

}
