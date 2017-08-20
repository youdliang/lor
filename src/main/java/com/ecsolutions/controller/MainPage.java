package com.ecsolutions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/6/30.
 */
@Controller
public class MainPage {

    public MainPage() {
    }

    @GetMapping("/lor")
    public String getMainPage() {
        return "mainPage";
    }
}
