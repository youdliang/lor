package com.ecsolutions.controller;

import com.ecsolutions.entity.coborrower_entity;
import com.ecsolutions.service.coborrower_Service;
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
public class coborrower_Controller {

    @Autowired
    private coborrower_Service coborrower_service;

    public coborrower_Service getCoborrower_service() {
        return coborrower_service;
    }

//    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/coborrowerInfo")
    public String getCoBorrowerPage(Model model) {
        model.addAttribute("coborrower_entity", new coborrower_entity());
        model.addAttribute("coborrower_info", coborrower_service.getPopupInfo());
        return "coborrower";
    }

    @PostMapping("/coborrowerInfo")
    public String saveCoBorrowerInfo(@ModelAttribute coborrower_entity coborrower_entity, Model model) {
        model.addAttribute("coborrower_entity", coborrower_entity);
        model.addAttribute("coborrower_info", coborrower_service.getPopupInfo());
        coborrower_service.saveCoborrowerEntity(coborrower_entity);
        return "coborrower";
    }

    //校验额度号
    @ResponseBody
    @RequestMapping(value = "/coborrowerInfo_CheckLineno",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public String checkLineno(@RequestBody Map<String, Object> map){
        String line_no = map.get("line_no").toString();
        String custcode = map.get("custcode").toString();
        String result = coborrower_service.ChcekLineno(line_no,custcode);
        return result;
    }

    //根据客户号显示共同借款人（个人）信息
    @ResponseBody
    @RequestMapping(value = "/perCoBorrowerInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<coborrower_entity> findPerByCustCode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<coborrower_entity> result = coborrower_service.perCoBorrowerInfoSearch(custcode);
        return result;
    }

    //新增共同借款人（个人）信息
    @ResponseBody
    @RequestMapping(value = "/perCoBorrowerInfo_add",method = RequestMethod.POST)
    public coborrower_entity getNewPerCoBorrowerForm(){
        coborrower_entity coborrower_entity = new coborrower_entity();
        return coborrower_entity;
    }

    //通过证件号码pIdNo删除共同借款人（个人）信息
    @ResponseBody
    @RequestMapping(value = "/deletePerCoBorrowerInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByPIdNo(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String pIdNo : list){
                coborrower_service.deletePerCoBorrowerinfo(pIdNo);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }

    //根据客户号显示共同借款人（企业）信息
    @ResponseBody
    @RequestMapping(value = "/comCoBorrowerInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<coborrower_entity> findComByCustCode(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<coborrower_entity> result = coborrower_service.comCoBorrowerInfoSearch(custcode);
        return result;
    }

    //新增共同借款人（企业）信息
    @ResponseBody
    @RequestMapping(value = "/comCoBorrowerInfo_add",method = RequestMethod.POST)
    public coborrower_entity getNewComCoBorrowerForm(){
        coborrower_entity coborrower_entity = new coborrower_entity();
        return coborrower_entity;
    }

    //通过贷款卡编码ethnic删除共同借款人（企业）信息
    @ResponseBody
    @RequestMapping(value = "/deleteComCoBorrowerInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByEthnic(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String ethnic : list){
                coborrower_service.deleteComCoBorrowerinfo(ethnic);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
