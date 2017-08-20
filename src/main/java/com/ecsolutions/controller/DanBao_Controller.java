package com.ecsolutions.controller;

import com.ecsolutions.entity.DanBao_Entity;
import com.ecsolutions.service.DanBao_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017-7-18.
 */
@Controller
public class DanBao_Controller {
    @Autowired
    private DanBao_Service danbao_service;

    public DanBao_Service getDanBao_service() {
        return danbao_service;
    }

    @GetMapping("/danbao")
    public String getDanBao(Model model) {
        model.addAttribute("danbao_info", danbao_service.getPopupInfo());
        return "DanBao/DanBao";
    }

    @PostMapping("/danbao")
    public String postDanBao(@ModelAttribute DanBao_Entity danbao_entity, Model model) {
        System.out.println("db_edh:"+danbao_entity.getDb_edh());
        System.out.println("userinfo:"+danbao_entity.getUserInfo());
        model.addAttribute("danbao_entity", danbao_entity);
        model.addAttribute("danbao_info", danbao_service.getPopupInfo());
        return "DanBao/DanBao";
    }


}



