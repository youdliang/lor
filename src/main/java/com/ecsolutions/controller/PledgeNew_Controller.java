package com.ecsolutions.controller;

import com.ecsolutions.Validators.PledgeNewValidate;
import com.ecsolutions.entity.Pledge_Entity;
import com.ecsolutions.service.PledgeNew_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/24.
 */
@SuppressWarnings("all")
@Controller
public class PledgeNew_Controller {

    public PledgeNew_Controller(){}

    @Autowired
    private PledgeNew_Service pledgeNew_service;

    @InitBinder("pledge_entity")
    public void initBinder(WebDataBinder binder){
        binder.setValidator(new PledgeNewValidate());
    }

    /*进入抵押信息页面*/
    @GetMapping("/PledgeNewList")
    public String getPledgeNewList(Model model){
        String custcod = "188688000007";
        Pledge_Entity pledge_entity = new Pledge_Entity();
        pledge_entity.setCustcod(custcod);
        model.addAttribute("pledge_entity", pledge_entity);
        model.addAttribute("pledge_info", pledgeNew_service.getPopupInfo());
        return "Pledge/pledgeTable";
    }

    /*通过custcod查询信息到Table表格中*/
    @ResponseBody
    @RequestMapping(value = "/PledgeNewListInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<Pledge_Entity> getPledgeInfoList(@RequestBody Map<String, Object> map ){
        Map<String, Object> resultMap = new HashMap<>();
        String custcod = map.get("custcod").toString();
        List<Pledge_Entity> pledgeInfoList = pledgeNew_service.getByCustcod(custcod);
//        resultMap.put("rows",pledgeInfoList);
//        resultMap.put("total",pledgeInfoList.size());
        return pledgeInfoList;
    }

    /*通过id删除抵押品信息*/
    @ResponseBody
    @RequestMapping(value = "/deletePledgeInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteById(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String id : list){
                pledgeNew_service.deletePledgeInfo(id);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }

    /*通过ID查询出的信息*/
    @ResponseBody
    @RequestMapping(value = "/PledgeQueryInfo",method = RequestMethod.POST)
    public Pledge_Entity getPledge_EntityById(String id,Model model){
        Pledge_Entity pledge_entity= pledgeNew_service.getById(id);
        return pledge_entity;
    }

    /*点击新增按钮传递一个空对象到form表单*/
    @ResponseBody
    @RequestMapping(value = "/NewPledgeInfo",method = RequestMethod.POST)
    public Pledge_Entity getNewPldgeInfo(){
        Pledge_Entity pledge_entity= new Pledge_Entity();
        return pledge_entity;
    }

    /*form表单信息提交,submit方式*/
    @PostMapping("/PledgeInfo")
    public String savePledgeInfo(@Valid @ModelAttribute("pledge_entity") Pledge_Entity pledge_entity, BindingResult result, Model model){
        int num = 0;
        model.addAttribute("pledge_info", pledgeNew_service.getPopupInfo());
        if(!result.hasErrors()){
            if(pledge_entity.getId()==""){
                //setNum
                String line_no = pledge_entity.getLine_no();
                List<Pledge_Entity> pledgelist = pledgeNew_service.getByLine_no(line_no);

                if(pledgelist.size()==0){
                    pledge_entity.setNum(1);
                    num = 1;
                }else{
                   pledge_entity.setNum(pledgeNew_service.getByLineno(line_no)+1);
                   num = pledgeNew_service.getByLineno(line_no)+1;
                }
                pledgeNew_service.savePledgeInfo(pledge_entity);
                String id = pledgeNew_service.getByLine_noAndNum(pledge_entity.getLine_no(),num);
                pledge_entity.setId(id);
            }else{
                pledgeNew_service.updatePledgeInfo(pledge_entity);
            }
            return "Pledge/pledgeTable";
        }
        model.addAttribute("pledge_entity",pledge_entity);
        return "Pledge/pledgeTable";
    }

    /*form表单信息提交,ajax方式*/
    @ResponseBody
    @RequestMapping(value = "/PledgeFormSubmit",method = RequestMethod.POST)
    public Map<String,Object> insertPledgeInfo(@Valid @ModelAttribute("pledge_entity") Pledge_Entity pledge_entity, BindingResult result,Model model){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if(!result.hasErrors()){
            //pledge_entity.setNum(1);
            //pledge_entity.setId("2");
            //pledgeNew_service.savePledgeInfo(pledge_entity);
            System.out.println("你好，进来了");
            System.out.println(pledge_entity.getOthername());
            resultMap.put("message",true);
            return resultMap;
        }
        resultMap.put("message",false);
        return resultMap;
    }

    /*输入贷款卡编号查询出的信息*/
    @ResponseBody
    @RequestMapping(value = "/QueryInfo",method = RequestMethod.POST)
    public Pledge_Entity findByEthnic(String ethnic){
        System.out.println("hello"+ethnic);
        Pledge_Entity pledge_entity = pledgeNew_service.getByEthnic(ethnic);
        return pledge_entity;
    }

}