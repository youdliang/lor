package com.ecsolutions.controller;

import com.ecsolutions.Validators.PrendaValidate;
import com.ecsolutions.entity.Prenda_Entity;
import com.ecsolutions.service.Prenda_Service;
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
 * Created by Administrator on 2017/7/24.
 */
@SuppressWarnings("all")
@Controller
public class Prenda_Controller {

    public Prenda_Controller(){}

    @Autowired
    private Prenda_Service prenda_service;

    @InitBinder("prenda_entity")
    public void initBinder(WebDataBinder binder){
        binder.setValidator(new PrendaValidate());
    }

    /*进入抵押信息页面*/
    @GetMapping("/PrendaList")
    public String getPledgeNewList(Model model){
        String custcod = "188688000007";
        Prenda_Entity prenda_entity = new Prenda_Entity();
        prenda_entity.setCustcod(custcod);
        model.addAttribute("prenda_entity", prenda_entity);
        model.addAttribute("prenda_info", prenda_service.getPopupInfo());
        return "Pledge/prendaTable";
    }

    /*通过custcod查询信息到Table表格中*/
    @ResponseBody
    @RequestMapping(value = "/PrendaListInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<Prenda_Entity> getPrendaInfoList(@RequestBody Map<String, Object> map ){
        Map<String, Object> resultMap = new HashMap<>();
        String custcod = map.get("custcod").toString();
        List<Prenda_Entity> prendaInfoList = prenda_service.getByCustcod(custcod);
//        resultMap.put("rows",pledgeInfoList);
//        resultMap.put("total",pledgeInfoList.size());
        return prendaInfoList;
    }

    /*通过id删除抵押品信息*/
    @ResponseBody
    @RequestMapping(value = "/deletePrendaInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public Map<String,String> deleteById(@RequestBody List<String> list){
        Map<String, String> resultMap = new HashMap<>();
        if(list == null){
            resultMap.put("message","删除失败");
        }else {
            for(String id : list){
                prenda_service.deletePrendaInfo(id);
            }
            resultMap.put("message","删除成功");
        }
        return resultMap;
    }

    /*通过ID查询出的信息*/
    @ResponseBody
    @RequestMapping(value = "/PrendaQueryInfo",method = RequestMethod.POST)
    public Prenda_Entity getPrenda_EntityById(String id,Model model){
        Prenda_Entity prenda_entity= prenda_service.getById(id);
        return prenda_entity;
    }

    /*点击新增按钮传递一个空对象到form表单*/
    @ResponseBody
    @RequestMapping(value = "/NewPrendaInfo",method = RequestMethod.POST)
    public Prenda_Entity getNewPrendaInfo(){
        Prenda_Entity prenda_entity= new Prenda_Entity();
        return prenda_entity;
    }

    /*form表单信息提交,submit方式*/
    @PostMapping("/PrendaInfo")
    public String savePledgeInfo(@Valid @ModelAttribute("prenda_entity") Prenda_Entity prenda_entity, BindingResult result, Model model){
        int num = 0;
        model.addAttribute("prenda_info", prenda_service.getPopupInfo());
        System.out.println("有错误");
        if(!result.hasErrors()){
            System.out.println("没有错误");
            if(prenda_entity.getId()==""){
                //setNum
                String line_no = prenda_entity.getLine_no();
                List<Prenda_Entity> prendalist = prenda_service.getByLine_no(line_no);

                if(prendalist.size()==0){
                    prenda_entity.setNum(1);
                    num = 1;
                }else{
                    prenda_entity.setNum(prenda_service.getByLineno(line_no)+1);
                   num = prenda_service.getByLineno(line_no)+1;
                }
                prenda_service.savePrendaInfo(prenda_entity);
                String id = prenda_service.getByLine_noAndNum(prenda_entity.getLine_no(),num);
                prenda_entity.setId(id);
            }else{
                prenda_service.updatePrendaInfo(prenda_entity);
            }
            return "Pledge/prendaTable";
        }
        model.addAttribute("prenda_entity",prenda_entity);
        return "Pledge/prendaTable";
    }

    /*输入贷款卡编号查询出的信息*/
    @ResponseBody
    @RequestMapping(value = "/QueryInfoByethnic",method = RequestMethod.POST)
    public Prenda_Entity findByEthnic(String ethnic){
        System.out.println("hello"+ethnic);
        Prenda_Entity prenda_entity = prenda_service.getByEthnic(ethnic);
        return prenda_entity;
    }

}