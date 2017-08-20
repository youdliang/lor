package com.ecsolutions.controller;

import com.ecsolutions.Validators.UtilizationValidate;
import com.ecsolutions.entity.Facility_Entity;
import com.ecsolutions.entity.Utilization_Entity;
import com.ecsolutions.service.Utilization_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

/**
 * Created by Administrator on 2017/7/31.
 */
@SuppressWarnings("all")
@Controller
public class Utilization_Controller {

    public Utilization_Controller(){}

    @Autowired
    private Utilization_Service utilization_service;

    @InitBinder("utilization_entity")
    public void initBinder(DataBinder binder) {
        binder.setValidator(new UtilizationValidate());
    }

    /*进入使用信息页面*/
    @GetMapping("/UtilizationList")
    public String getUtilizationPage(Model model){
        String custcod = "188688000007";
        Utilization_Entity utilization_entity = new Utilization_Entity();
        Random random = new Random();
        String loanref = "LN"+String.valueOf(random.nextInt(1000000))+String.valueOf(random.nextInt(100000));
        utilization_entity.setLoanref(loanref);
        utilization_entity.setCustcod(custcod);
        model.addAttribute("utilization_entity", utilization_entity);
        model.addAttribute("utilization_info", utilization_service.getPopupInfo());
        //大类信息
        List<HashMap<String,String>> daleiList = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> daleimap = new HashMap<String,String>();
        daleimap.put("DALEI","");
        daleimap.put("LEIBIEMINGCHENG","");
        daleiList.add(daleimap);
        model.addAttribute("dalei_info",daleiList);
        //中类信息
        List<HashMap<String,String>> zhongleiList = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> zhongleimap = new HashMap<String,String>();
        zhongleimap.put("ZHONGLEI","");
        zhongleimap.put("LEIBIEMINGCHENG","");
        zhongleiList.add(zhongleimap);
        model.addAttribute("zhonglei_info",zhongleiList);
        //小类信息
        List<HashMap<String,String>> xiaoleileiList = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> xiaoleimap = new HashMap<String,String>();
        xiaoleimap.put("XIAOLEI","");
        xiaoleimap.put("LEIBIEMINGCHENG","");
        xiaoleileiList.add(xiaoleimap);
        model.addAttribute("xiaolei_info",xiaoleileiList);

        return "Utilization/utilization";
    }

    /*通过custcod查询信息到Table表格中*/
    @ResponseBody
    @RequestMapping(value = "/UtilizationListInfo",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public List<Utilization_Entity> getUtilizationInfoList(@RequestBody Map<String, Object> map ){
        String custcod = map.get("custcod").toString();
        List<Utilization_Entity> utilization_entitieList = utilization_service.getByCustcodInfo(custcod);
        return utilization_entitieList;
    }

    /*通过custcod和lineno查询出数据*/
    @ResponseBody
    @RequestMapping(value = "/getFacilityInfo",method = RequestMethod.POST)
    public Facility_Entity getFacilityInfoByCustcodAndLineno(String custcod,String lineno){
        Facility_Entity facility_entity = utilization_service.getFacilityInfoByCustcodAndLineno(custcod,lineno);
        return facility_entity;
    }

    /*通过放款币种值查询信息到利率类型下拉框*/
    @ResponseBody
    @RequestMapping(value = "/getliLvLeiXingInfo",method = RequestMethod.POST)
    public List<HashMap<String,Object>> getLiLvLeiXingInfoList(String drawccy){
        System.out.println(drawccy);
        List<HashMap<String,Object>> liLvLeiXingList = utilization_service.getByLiLvInfo(drawccy);
        return liLvLeiXingList;
    }

    /*通过放款币种值和利率类型值查询信息到年利率框*/
    @ResponseBody
    @RequestMapping(value = "/getnianliLvLeiInfo",method = RequestMethod.POST)
    public String getNianLiLvLeiXingInfoList(String drawccy,String ratetype){
        String nianlilv = utilization_service.getNianlilvInfo(drawccy,ratetype);
        return nianlilv;
    }

    /*通过客户经理代码查询出经理名称*/
    @ResponseBody
    @RequestMapping(value = "/getJingLiMingChenInfo",method = RequestMethod.POST)
    public String getJingliMingChen(String accoffic){
        String jingLiMingChen = utilization_service.getJingLiMingChenInfo(accoffic);
        return jingLiMingChen;
    }

    /*通过门类值查询信息到大类下拉框*/
    @ResponseBody
    @RequestMapping(value = "/getDaleiInfo",method = RequestMethod.POST)
    public List<HashMap<String,String>> getDaleiInfoList(String dircflag1){
        List<HashMap<String,String>> daleiList = utilization_service.getByMenleiInfo(dircflag1);
        return daleiList;
    }

    /*通过门类和大类查询信息到中类下拉框*/
    @ResponseBody
    @RequestMapping(value = "/getZhongleiInfo",method = RequestMethod.POST)
    public List<HashMap<String,String>> getZhongleiInfoList(String dircflag1,String dircflag2){
        List<HashMap<String,String>> zhongleiList = utilization_service.getByMenleiAndDaleiInfo(dircflag1,dircflag2);
        return zhongleiList;
    }

    /*通过门类和大类和中类查询信息到小类下拉框*/
    @ResponseBody
    @RequestMapping(value = "/getXiaoleiInfo",method = RequestMethod.POST)
    public List<HashMap<String,String>> getXiaoleiInfoList(String dircflag1,String dircflag2,String dircflag3){
        List<HashMap<String,String>> xiaoleiList = utilization_service.getByMenleiAndDaleiAndZhongleiInfo(dircflag1,dircflag2,dircflag3);
        return xiaoleiList;
    }

    /*保存或更新使用信息*/
    @PostMapping("/UtilizationList")
    public String savePledgeInfo(@Valid @ModelAttribute("utilization_entity") Utilization_Entity utilization_entity, BindingResult result, Model model){
        model.addAttribute("utilization_entity",utilization_entity);
        model.addAttribute("utilization_info", utilization_service.getPopupInfo());
        String custcod = utilization_entity.getCustcod();
        String lineno = utilization_entity.getLineno();
        String loanref = utilization_entity.getLoanref();
        if(!result.hasErrors()){
            if(utilization_service.getUtilizationByCustcodAndLineno(custcod,lineno,loanref)==null){
                System.out.println("对象为空");
                utilization_service.saveUtilizationInfo(utilization_entity);
            }else{
                System.out.println("对象非空");
            }
            String drawccy = utilization_entity.getDrawccy();
            String dorcflag1 = utilization_entity.getDircflag1();
            String dorcflag2 = utilization_entity.getDircflag2();
            String dorcflag3 = utilization_entity.getDircflag3();
            String dorcflag4 = utilization_entity.getDircflag4();
            List<HashMap<String,Object>> ratetypeList = utilization_service.getRatetypeList(drawccy);
            model.addAttribute("ratetype_info",ratetypeList);
            List<HashMap<String,String>> daleiList = utilization_service.getDaleiList(dorcflag1);
            model.addAttribute("dalei_info",daleiList);
            List<HashMap<String,String>> zhongleiList = utilization_service.getZhongleiList(dorcflag1,dorcflag2);
            model.addAttribute("zhonglei_info",zhongleiList);
            List<HashMap<String,String>> xiaoleiList = utilization_service.getXiaoleiList(dorcflag1,dorcflag2,dorcflag3);
            model.addAttribute("xiaolei_info",xiaoleiList);

            return "Utilization/utilization";
        }
        return "Utilization/utilization";
    }

    /*点击新增按钮传递一个空对象到form表单*/
    @ResponseBody
    @RequestMapping(value = "/NewUtilizationInfo",method = RequestMethod.POST)
    public Utilization_Entity getNewFacilityInfo(String custcod){
        Utilization_Entity utilization_entity= new Utilization_Entity();
        //随机给定一个贷款编号
        Random random = new Random();
        String loanref = "LN"+String.valueOf(random.nextInt(1000000))+String.valueOf(random.nextInt(100000));
        utilization_entity.setLoanref(loanref);
        return utilization_entity;
    }

    /*通过id删除抵押品信息*//*
    @ResponseBody
    @RequestMapping(value = "/deleteFacilityInfo",method = RequestMethod.POST)
    public Map<String,String> deleteById(String custcod,String lineno){
        Map<String, String> resultMap = new HashMap<>();
        facility_service.deleteFacilityInfo(custcod,lineno);
        resultMap.put("message","删除成功");
        return resultMap;
    }*/

}
