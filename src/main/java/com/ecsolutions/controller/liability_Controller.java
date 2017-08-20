package com.ecsolutions.controller;

import com.ecsolutions.entity.liability_entity;
import com.ecsolutions.service.liability_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class liability_Controller{

    @Autowired
    private liability_Service liability_service;

    public liability_Service getLiability_service() {
        return liability_service;
    }

    //    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/liabilityInfo")
    public String getLiabilityPage(Model model) {
        model.addAttribute("liability_entity", new liability_entity());
        model.addAttribute("liability_info", liability_service.getPopupInfo());
        return "liabilityInformation";
    }

    @PostMapping("/liabilityInfo")
    public String saveLiabilityInfo( @ModelAttribute liability_entity liability_entity, Model model) {
        model.addAttribute("liability_entity", liability_entity);
        model.addAttribute("liability_info", liability_service.getPopupInfo());
        liability_service.saveLiabilityEntity(liability_entity);
        return "liabilityInformation";
    }

    //根据客户号显示负债信息
    @ResponseBody
    @RequestMapping(value = "/liabilityInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<liability_entity> findByCustecode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<liability_entity> result = liability_service.liabilityInfoSearch(custcode);
        return result;
    }

    //新增负债信息
    @ResponseBody
    @RequestMapping(value = "/liabilityInfo_add",method = RequestMethod.POST)
    public liability_entity getNewLiabilityInfoForm(){
        liability_entity liability_entity = new liability_entity();
        return liability_entity;
    }

    //通过债权人名称Creditorname删除负债信息
    @ResponseBody
    @RequestMapping(value = "/deleteLiabilityInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByCreditorname(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String creditorname : list){
                liability_service.deleteLiabilityInfo(creditorname);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
