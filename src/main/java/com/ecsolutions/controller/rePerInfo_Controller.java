package com.ecsolutions.controller;

import com.ecsolutions.entity.rePerInfo_entity;
import com.ecsolutions.service.rePerInfo_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class rePerInfo_Controller{

    @Autowired
    private rePerInfo_Service reperinfo_service;

    public rePerInfo_Service getReperinfo_service() {
        return reperinfo_service;
    }

    //    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/rePerInfo")
    public String getApplyPage(Model model ) {
        model.addAttribute("reperinfo_entity", new rePerInfo_entity());
        model.addAttribute("reper_info", reperinfo_service.getPopupInfo());
        return "rePerInformation";
    }

    @PostMapping("/rePerInfo")
    public String saveApplyInfo(@Valid @ModelAttribute rePerInfo_entity reperinfo_entity, Model model) {
        model.addAttribute("reperinfo_entity", reperinfo_entity);
        model.addAttribute("reper_info", reperinfo_service.getPopupInfo());
        reperinfo_service.saveRePerEntity(reperinfo_entity);
        return "rePerInformation";
    }

    @ResponseBody
    @RequestMapping(value = "/rePerInfo_pIdNoCheck",method = RequestMethod.POST)
    public rePerInfo_entity findByPIdNo(String pIdNo){
        System.out.print(pIdNo);
        rePerInfo_entity result = reperinfo_service.pIdNoCheck(pIdNo);
        return result;
    }

    //根据客户号custcode显示关联方个人信息
    @ResponseBody
    @RequestMapping(value = "/rePerInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<rePerInfo_entity> findByCustcode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<rePerInfo_entity> result = reperinfo_service.rePerInfoSearch(custcode);
        return result;
    }

//    新增关联方个人信息
    @ResponseBody
    @RequestMapping(value = "/rePerInfo_add",method = RequestMethod.POST)
    public rePerInfo_entity getNewReperinfoForm(){
        rePerInfo_entity reperinfo_entity = new rePerInfo_entity();
        return reperinfo_entity;
    }

    //通过关系类型hierarchy删除关联方个人信息
    @ResponseBody
    @RequestMapping(value = "/deleteReperInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByHierarchy(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String hierarchy : list){
                reperinfo_service.deleteReperInfo(hierarchy);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
