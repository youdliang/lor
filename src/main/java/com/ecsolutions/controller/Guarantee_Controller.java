package com.ecsolutions.controller;

import com.ecsolutions.entity.Guarantee_Entity;
import com.ecsolutions.service.Guarantee_Service;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/7/18.
 */
@Controller
public class Guarantee_Controller {
    @Autowired
    private Guarantee_Service guarantee_service;
    public Guarantee_Service getCredit_service() {
        return guarantee_service;
    }

    @GetMapping("/guarantee")
    public String getGuaranteePage(Model model,@RequestParam("custcode") String custcode) {
        model.addAttribute("custcode",custcode);
        model.addAttribute("guarantee_entity1", new Guarantee_Entity(custcode,"N"));//新增企业担保
        model.addAttribute("guarantee_entity2", new Guarantee_Entity(custcode,"Y"));//新增个人担保
        model.addAttribute("guarantee_entity3", new Guarantee_Entity(custcode,"N"));//更新企业担保
        model.addAttribute("guarantee_entity4", new Guarantee_Entity(custcode,"Y"));//更新个人担保
        model.addAttribute("guarantee_info", guarantee_service.getPopupInfo(custcode));
        model.addAttribute("List_LoanApplicantGuarantor",guarantee_service.getLoanApplicantGuarantor(custcode));
        return "Guarantee/guarantee";
    }

    @PostMapping("/guarantee")
    public String saveGuaranteeInfo(@ModelAttribute Guarantee_Entity guarantee_entity, Model model, @RequestParam("custcode") String custcode) {
        guarantee_service.savaGuaranteeEntity(guarantee_entity);
        model.addAttribute("custcode",custcode);
        model.addAttribute("guarantee_entity1", new Guarantee_Entity(custcode,"N"));//更新新增企业担保
        model.addAttribute("guarantee_entity2", new Guarantee_Entity(custcode,"Y"));//更新新增个人担保
        model.addAttribute("guarantee_entity3", new Guarantee_Entity(custcode,"N"));//更新企业担保
        model.addAttribute("guarantee_entity4", new Guarantee_Entity(custcode,"Y"));//更新个人担保
        model.addAttribute("guarantee_info", guarantee_service.getPopupInfo(custcode));
        model.addAttribute("List_LoanApplicantGuarantor",guarantee_service.getLoanApplicantGuarantor(custcode));
        return "Guarantee/guarantee";
    }

    @PostMapping("/guaranteeUpdate")
    public String updateGuaranteeInfo(@ModelAttribute Guarantee_Entity guarantee_entity3or4, Model model, @RequestParam("custcode") String custcode) {
        guarantee_service.updateGuaranteeEntity(guarantee_entity3or4);
        model.addAttribute("custcode",custcode);
        model.addAttribute("guarantee_entity1", new Guarantee_Entity(custcode,"N"));//更新新增企业担保
        model.addAttribute("guarantee_entity2", new Guarantee_Entity(custcode,"Y"));//更新新增个人担保
        model.addAttribute("guarantee_entity3", new Guarantee_Entity(custcode,"N"));//更新企业担保
        model.addAttribute("guarantee_entity4", new Guarantee_Entity(custcode,"Y"));//更新个人担保
        model.addAttribute("guarantee_info", guarantee_service.getPopupInfo(custcode));
        model.addAttribute("List_LoanApplicantGuarantor",guarantee_service.getLoanApplicantGuarantor(custcode));
        return "Guarantee/guarantee";
    }

    @ResponseBody
    @RequestMapping(value = "/ethnicForOthers1",method = RequestMethod.POST)
    public String findByEthnic1(String Ethnic){
        Guarantee_Entity Result = guarantee_service.ethnicForOthers1( Ethnic);
        System.out.println(JSONArray.fromObject(Result).toString());
        return JSONArray.fromObject(Result).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/ethnicForOthers2",method = RequestMethod.POST)
    public String findByEthnic2(String pIdNo){
        Guarantee_Entity Result = guarantee_service.ethnicForOthers2( pIdNo);
        System.out.println(JSONArray.fromObject(Result).toString());
        return JSONArray.fromObject(Result).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/GuaranteeSearchById",method = RequestMethod.POST)
    public String SearchById(String id){
        Guarantee_Entity Result = guarantee_service.SearchById( id);
        System.out.println(JSONArray.fromObject(Result).toString());
        return JSONArray.fromObject(Result).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/guaranteeDelete",method = RequestMethod.POST)
    public String DeleteguaranteeEntity(String deleteId) {
        guarantee_service.deleteById(deleteId);
        return "success";
    }

}
