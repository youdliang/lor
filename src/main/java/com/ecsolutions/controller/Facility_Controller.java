package com.ecsolutions.controller;

import com.ecsolutions.Validators.FacilityValidate;
import com.ecsolutions.entity.Facility_Entity;
import com.ecsolutions.service.Facility_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/31.
 */
@SuppressWarnings("all")
@Controller
public class Facility_Controller {

    public Facility_Controller(){}

    @Autowired
    private Facility_Service facility_service;

    @InitBinder("facility_entity")
    public void initBinder(DataBinder binder) {
        binder.setValidator(new FacilityValidate());
    }

    /*进入授信信息页面*/
    @GetMapping("/FacilityList")
    public String getPledgePage(Model model){
        String custcod = "188688000007";
        Facility_Entity facility_entity = new Facility_Entity();
        facility_entity.setCustcod(custcod);
        facility_entity.setUsedamt(0);
        facility_entity.setHoldamt(0);
        String lineno = facility_service.getByCustcod(custcod);
        if(lineno==null){
            facility_entity.setLineno("00001");
        }else{
            String line_no = String.valueOf(Integer.parseInt(lineno)+1);
            int i = line_no.length();
            String lineNo = "";
            for(int j=1;j<=5-i;j++){
                lineNo = lineNo+"0";
            }
            facility_entity.setLineno(lineNo+line_no);
        }
        model.addAttribute("facility_entity", facility_entity);
        model.addAttribute("facility_info", facility_service.getPopupInfo());
        return "Facility/facility";
    }

    /*通过custcod查询信息到Table表格中*/
    @ResponseBody
    @RequestMapping(value = "/FacilityListInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<Facility_Entity> getFacilityInfoList(@RequestBody Map<String, Object> map ){
        String custcod = map.get("custcod").toString();
        List<Facility_Entity> facility_entityList = facility_service.getByCustcodInfo(custcod);
        return facility_entityList;
    }

    /*保存授信信息*/
    @PostMapping("/FacilityList")
    public String savePledgeInfo(@Valid @ModelAttribute("facility_entity") Facility_Entity facility_entity, BindingResult result, Model model){
        model.addAttribute("facility_entity",facility_entity);
        model.addAttribute("facility_info", facility_service.getPopupInfo());

        if(!result.hasErrors()){
            String custcod = facility_entity.getCustcod();
            String lineno = facility_entity.getLineno();
            Facility_Entity facilityEntity = facility_service.getByCustcodAndLineno(custcod,lineno);
            if(facilityEntity==null){
                facility_entity.setAppflag("N");
                facility_service.saveFacilityInfo(facility_entity);
            }else{
                facility_service.updateFacilityInfo(facility_entity);
            }
            return "Facility/facility";
        }
        return "Facility/facility";
    }

    /*点击新增按钮传递一个空对象到form表单*/
    @ResponseBody
    @RequestMapping(value = "/NewFacilityInfo",method = RequestMethod.POST)
    public Facility_Entity getNewFacilityInfo(String custcod){
        Facility_Entity facility_entity= new Facility_Entity();
        facility_entity.setUsedamt(0);
        facility_entity.setHoldamt(0);
        facility_entity.setLinestatus("1");
        String lineno = facility_service.getByCustcod(custcod);
        if(lineno==null){
            facility_entity.setLineno("00001");
        }else{
            String line_no = String.valueOf(Integer.parseInt(lineno)+1);
            int i = line_no.length();
            String lineNo = "";
            for(int j=1;j<=5-i;j++){
                lineNo = lineNo+"0";
            }
            facility_entity.setLineno(lineNo+line_no);
        }
        return facility_entity;
    }

    /*通过id删除抵押品信息*/
    @ResponseBody
    @RequestMapping(value = "/deleteFacilityInfo",method = RequestMethod.POST)
    public Map<String,String> deleteById(String custcod,String lineno){
        Map<String, String> resultMap = new HashMap<>();
        facility_service.deleteFacilityInfo(custcod,lineno);
        resultMap.put("message","删除成功");
        return resultMap;
    }

    /*通过custcod和lineno更新模态框里的信息*/
    @ResponseBody
    @RequestMapping(value = "/updateFacilityInfo",method = RequestMethod.POST)
    public Map<String,String> updateBycustcodAndLineno(String custcod,String lineno,String releaseamt,String osamt,String avliamt){
        Map<String, String> resultMap = new HashMap<>();
        Facility_Entity facility_entity = new Facility_Entity();
        facility_entity.setCustcod(custcod);
        facility_entity.setLineno(lineno);
        facility_entity.setReleaseamt(Integer.parseInt(releaseamt));
        facility_entity.setOsamt(Integer.parseInt(osamt));
        facility_entity.setAvliamt(Integer.parseInt(avliamt));
        facility_service.updateFacilityInfoBycustcodAndLineno(facility_entity);
        resultMap.put("message","保存成功");
        return resultMap;
    }

}
