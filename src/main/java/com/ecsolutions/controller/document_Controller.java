package com.ecsolutions.controller;

import com.ecsolutions.Validators.DocumentValidate;
import com.ecsolutions.entity.document_entity;
import com.ecsolutions.service.document_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class document_Controller{

    @Autowired
    private document_Service document_service;

    public document_Service getDocument_service() {
        return document_service;
    }

    @InitBinder("document_entity")
    public void initBinder(WebDataBinder binder){
        binder.setValidator(new DocumentValidate());
    }

    public document_Controller(){

    }

    //    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/docInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("document_entity", new document_entity());
        model.addAttribute("document_info", document_service.getPopupInfo());
        return "document";
    }

    @PostMapping("/docInfo")
    public String saveApplyInfo(@Valid @ModelAttribute("document_entity") document_entity document_entity, BindingResult result, Model model) {
        model.addAttribute("document_entity", document_entity);
        model.addAttribute("document_info", document_service.getPopupInfo());
        if (!(result.hasErrors())) {
            document_service.saveDocEntity(document_entity);
        }
        return "document";
    }

    //校验额度号
    @ResponseBody
    @RequestMapping(value = "/documentInfo_CheckLineno",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public String checkLineno(@RequestBody Map<String, Object> map){
        String line_no = map.get("line_no").toString();
        String custcode = map.get("custcode").toString();
        String result = document_service.ChcekLineno(line_no,custcode);
        return result;
    }

    //根据客户号显示文档信息
    @ResponseBody
    @RequestMapping(value = "/documentInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<document_entity> findByCustecode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<document_entity> result = document_service.docInfoSearch(custcode);
        return result;
    }

    //新增文档信息
    @ResponseBody
    @RequestMapping(value = "/documentInfo_add",method = RequestMethod.POST)
    public document_entity getNewReperinfoForm(){
        document_entity document_entity = new document_entity();
        return document_entity;
    }

    //通过文档号docNo删除文档信息
    @ResponseBody
    @RequestMapping(value = "/deleteDocumentInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByDocNo(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String docNo : list){
                document_service.deleteDocinfo(docNo);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
