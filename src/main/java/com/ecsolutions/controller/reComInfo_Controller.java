package com.ecsolutions.controller;

import com.ecsolutions.entity.reComInfo_entity;
import com.ecsolutions.service.reComInfo_Service;
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
public class reComInfo_Controller{

    @Autowired
    private reComInfo_Service recominfo_service;

    public reComInfo_Service getRecominfo_service() {
        return recominfo_service;
    }

//    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/reComInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("recominfo_entity", new reComInfo_entity());
        model.addAttribute("recom_info", recominfo_service.getPopupInfo());
        return "reComInformation";
    }

    @PostMapping("/reComInfo")
    public String saveApplyInfo(@ModelAttribute reComInfo_entity recominfo_entity, Model model) {
        model.addAttribute("recominfo_entity", recominfo_entity);
        model.addAttribute("recom_info", recominfo_service.getPopupInfo());
        recominfo_service.saveReComEntity(recominfo_entity);
        return "reComInformation";
    }

    //根据贷款卡编码查询出关联企业客户号和中文名字
    @ResponseBody
    @RequestMapping(value = "/reComInfo_QueryByEthnic",method = RequestMethod.POST)
    public reComInfo_entity findByEthnic(String ethnic){
        reComInfo_entity result = recominfo_service.QueryByEthnic(ethnic);
        return result;
    }

    //校验贷款卡编码
    @ResponseBody
    @RequestMapping(value = "/reComInfo_CheckEthnic",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public String checkEthnic(@RequestBody Map<String, Object> map){
        String ethnic = map.get("ethnic").toString();
        String custcode = map.get("custcode").toString();
        String result = recominfo_service.ChcekEthnic(ethnic,custcode);
        return result;
    }

    //根据客户号显示关联方企业信息
    @ResponseBody
    @RequestMapping(value = "/reComInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<reComInfo_entity> findByRecomInfo(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<reComInfo_entity> result = recominfo_service.reComInfoSearch(custcode);
        return result;
    }

    //    新增关联方企业信息
    @ResponseBody
    @RequestMapping(value = "/reComInfo_add",method = RequestMethod.POST)
    public reComInfo_entity getNewReperinfoForm(){
        reComInfo_entity recominfo_entity = new reComInfo_entity();
        return recominfo_entity;
    }

    //通过贷款卡编码ethnic删除关联方企业信息
    @ResponseBody
    @RequestMapping(value = "/deleteReComInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByEthnic(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String ethnic : list){
                recominfo_service.deleteRecominfo(ethnic);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
