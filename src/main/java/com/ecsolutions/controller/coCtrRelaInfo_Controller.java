package com.ecsolutions.controller;

import com.ecsolutions.Validators.CoCtrRelaInfoValidate;
import com.ecsolutions.entity.coCtrRelaInfo_entity;
import com.ecsolutions.service.coCtrRelaInfo_Service;
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
public class coCtrRelaInfo_Controller{

    @Autowired
    private coCtrRelaInfo_Service coctrrelainfo_service;

    public coCtrRelaInfo_Service getCoctrrelainfo_service() {
        return coctrrelainfo_service;
    }

    @InitBinder("coctrrelainfo_entity")
    public void initBinder(WebDataBinder binder){
        binder.setValidator(new CoCtrRelaInfoValidate());
    }

    public coCtrRelaInfo_Controller(){

    }

    //    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/coCtrRelaInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("coctrrelainfo_entity", new coCtrRelaInfo_entity());
        model.addAttribute("coctrrela_info", coctrrelainfo_service.getPopupInfo());
        return "coCtrRelaInformation";
    }

    @PostMapping("/coCtrRelaInfo")
    public String saveApplyInfo(@Valid @ModelAttribute("coctrrelainfo_entity") coCtrRelaInfo_entity coctrrelainfo_entity, BindingResult result, Model model) {
        model.addAttribute("coctrrelainfo_entity", coctrrelainfo_entity);
        model.addAttribute("coctrrela_info", coctrrelainfo_service.getPopupInfo());
        if (!(result.hasErrors())){
            coctrrelainfo_service.saveCoCtrRelaEntity(coctrrelainfo_entity);
        }
        return "coCtrRelaInformation";
    }

    //    根据关联企业名称显示企业控制关系信息
    @ResponseBody
    @RequestMapping(value = "/coCtrRelaInfo_Search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<coCtrRelaInfo_entity> findByCoCtrRelaInfo(@RequestBody Map<String, Object> map){
        String custcode = map.get("custcode").toString();
        List<coCtrRelaInfo_entity> result = coctrrelainfo_service.coCtrRelaInfoSearch(custcode);
        return result;
    }

    //新增关联企业控制信息
    @ResponseBody
    @RequestMapping(value = "/coCtrRelaInfo_add",method = RequestMethod.POST)
    public coCtrRelaInfo_entity getNewReperinfoForm(){
        coCtrRelaInfo_entity coctrrelainfo_entity = new coCtrRelaInfo_entity();
        return coctrrelainfo_entity;
    }

    //通过关联企业名称enterprisename删除企业控制关系信息
    @ResponseBody
    @RequestMapping(value = "/deleteCoCtrRelaInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteByEnterprisename(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String enterprisename : list){
                coctrrelainfo_service.deleteCoCtrRelaInfo(enterprisename);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }
}
