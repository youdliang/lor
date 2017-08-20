package com.ecsolutions.controller;

import com.ecsolutions.entity.PledgeEnt;
import com.ecsolutions.service.Pledge_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by tim on 2017/6/27.
 */


@Controller
public class IndexCtl {

    @Autowired
    private Pledge_Service pledge_service;


    public Pledge_Service getPledge_Service() {
        return pledge_service;
    }
    @GetMapping("/index")
    public String loginPage() {
        String a="asdf";
        String bb=a;
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        String a="asdf";
        String bb=a;
        return "test2/test";
    }

    @GetMapping("/table1")
    public String table1() {
        String a="asdf";
        String bb=a;
        return "test2/table";
    }

    @GetMapping("/table2")
    public String table2() {
        String a="asdf";
        String bb=a;
        return "test2/tableList";
    }

    @GetMapping("/table3")
    public String table3() {
        String a="asdf";
        String bb=a;
        return "forms-3";
    }
}
