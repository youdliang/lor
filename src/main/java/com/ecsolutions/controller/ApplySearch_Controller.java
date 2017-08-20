package com.ecsolutions.controller;

import com.ecsolutions.entity.ApplySearch_Entity;
import com.ecsolutions.service.ApplySearch_Service;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Controller
public class ApplySearch_Controller {
    @Autowired
    private ApplySearch_Service applysearch_service;
    public ApplySearch_Service getApplySearch_Service() {
        return applysearch_service;
    }

    @GetMapping("/applySearch")
    public String getApplyPage(Model model) {
//        model.addAttribute("listresult",new ArrayList<HashMap<String,String>>());
        return "applySearch";
    }

    @GetMapping("/applySearchResult")
    public String getApplySearchResultPage(Model model) {
//        model.addAttribute("listresult",new ArrayList<HashMap<String,String>>());
        return "applySearchResult";
    }


    @ResponseBody
    @RequestMapping(value = "/applySearchSearch",method = RequestMethod.POST)
    public String findByEthnic(String startDate,String endDate,String personalFlag,String status,String manager,String custCod,String lastName,String lregno){
        //Pledge_Entity pledge_entity = pledgeNew_service.getByEthnic(ethnic);
        //return pledge_entity;
        List<ApplySearch_Entity> listResult = applysearch_service.Search( startDate, endDate, personalFlag, status, manager, custCod, lastName, lregno);
        System.out.println(JSONArray.fromObject(listResult).toString());
        return JSONArray.fromObject(listResult).toString();
    }

}
