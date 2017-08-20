package com.ecsolutions.controller;

import com.ecsolutions.entity.contactInfo_entity;
import com.ecsolutions.service.contactInfo_Service;
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
public class contactInfo_Controller{

    @Autowired
    private contactInfo_Service contactinfo_service;

    public contactInfo_Service getContactinfo_service() {
        return contactinfo_service;
    }

    //    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/contactInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("contactinfo_entity", new contactInfo_entity());
        model.addAttribute("contact_info", contactinfo_service.getPopupInfo());
        return "contactInformation";
    }

    @PostMapping("/contactInfo")
    public String saveApplyInfo(@ModelAttribute contactInfo_entity contactinfo_entity, Model model) {
        model.addAttribute("contactinfo_entity", contactinfo_entity);
        model.addAttribute("contact_info", contactinfo_service.getPopupInfo());
        contactinfo_service.saveContactEntity(contactinfo_entity);
        return "contactInformation";
    }

    // 根据客户号显示联系信息
    @ResponseBody
    @RequestMapping(value = "/contactInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<contactInfo_entity> findByCustcode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<contactInfo_entity> result = contactinfo_service.contactInfoSearch(custcode);
        return result;
    }

    // 新增联系信息
    @ResponseBody
    @RequestMapping(value = "/contactInfo_add",method = RequestMethod.POST)
    public contactInfo_entity getNewContactinfoForm(){
        contactInfo_entity contactinfo_entity = new contactInfo_entity();
        return contactinfo_entity;
    }

    //通过title删除联系信息
    @ResponseBody
    @RequestMapping(value = "/deleteContactInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByTitle(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String title : list){
                contactinfo_service.deleteContactinfo(title);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
