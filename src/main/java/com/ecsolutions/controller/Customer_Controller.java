package com.ecsolutions.controller;

import com.ecsolutions.entity.Customer_entity;
import com.ecsolutions.service.Customer_Service;
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
public class Customer_Controller {

    @Autowired
    private Customer_Service customer_service;

    public Customer_Service getCustomer_service() {
        return customer_service;
    }

    @Autowired
    @Qualifier("customerValidate")
    private Validator validator;

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(validator);
    }

    public Customer_Controller(){

    }

    @GetMapping("/customerInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("customer_entity", new Customer_entity());
        model.addAttribute("customer_info", customer_service.getPopupInfo());
        return "customer";
    }

    @PostMapping("/customerInfo")
    public String saveApplyInfo(@Valid @ModelAttribute Customer_entity customer_entity, BindingResult result, Model model) {
        model.addAttribute("customer_entity", customer_entity);
        model.addAttribute("customer_info", customer_service.getPopupInfo());
        customer_service.saveCustomerEntity(customer_entity);
        return "customer";
    }

    @ResponseBody
    @RequestMapping(value = "/customer_pIdNoCheck",method = RequestMethod.POST)
    public String findBypIdNo(String pIdNo){
        //Pledge_Entity pledge_entity = pledgeNew_service.getByEthnic(ethnic);
        //return pledge_entity;
        String result = customer_service.pIdNoCheck(pIdNo);
        return result;
    }
}
