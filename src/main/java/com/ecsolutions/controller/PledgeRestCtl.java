package com.ecsolutions.controller;

import com.ecsolutions.entity.PledgeEnt;
import com.ecsolutions.service.Pledge_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tim on 2017/6/28.
 */


@RestController
@RequestMapping("/PledgeRest")
public class PledgeRestCtl {

    @Autowired
    private Pledge_Service pledge_service;



    public Pledge_Service getPledge_Service() {
        return pledge_service;
    }

    @GetMapping("/getList")
    public List<PledgeEnt> getPledgeList(@RequestParam("line_no") String line_no, @RequestParam("CUSTCOD") String CUSTCOD, Model model)
    {
        List<PledgeEnt> ent=pledge_service.getPledgeList(line_no,CUSTCOD);
        //model.addAttribute("list", ent);
        return ent;
    }
}
