package com.ecsolutions.controller;

import com.ecsolutions.entity.AccOfficer_Entity;
import com.ecsolutions.service.AccOfficer_Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/7/3.
 */
@Controller
public class AccOfficer {

    private AccOfficer_Service service;

    @GetMapping("/AccOfficer")
    public String getAccOfficer(Model model){
        model.addAttribute("AccOfficer_Entity",service.getOfficer());
        return "";
    }
}
