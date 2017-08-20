package com.ecsolutions.controller;

import com.ecsolutions.Validators.LoanCorporateTopExecutives_Validate;
import com.ecsolutions.entity.LoanCorporateTopExecutives_Entity;
import com.ecsolutions.service.LoanCorporateTopExecutives_Service;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
@Controller
public class LoanCorporateTopExecutives_Controller {
    private String CustCode;
    @Autowired
    private LoanCorporateTopExecutives_Service loanCorporateTopExecutives_service;

    public LoanCorporateTopExecutives_Service getLoanCorporateTopExecutives_Service() {
        return loanCorporateTopExecutives_service;
    }

    @InitBinder("loancorporatetopexecutives_entity")
    public void initBuilder(WebDataBinder binder) {
        binder.setValidator(new LoanCorporateTopExecutives_Validate());
    }

    @GetMapping("/LoanCorporateTopExecutives")
    public String getLoanCorporateTopExecutives(Model model) {
        CustCode = "000001";
        model.addAttribute("loancorporatetopexecutives_entity", new LoanCorporateTopExecutives_Entity());
        model.addAttribute("CODTypeList", loanCorporateTopExecutives_service.getCODTYPEInfo());
        return "ClientInformation/LoanCorporateTopExecutives";
    }

    @PostMapping("/LoanCorporateTopExecutives")
    public String saveLoanCorporateTopExecutives(@Valid @ModelAttribute("loancorporatetopexecutives_entity") LoanCorporateTopExecutives_Entity loancorporatetopexecutives_entity, BindingResult result, Model model) {
        model.addAttribute("loancorporatetopexecutives_entity", loancorporatetopexecutives_entity);
        model.addAttribute("CODTypeList", loanCorporateTopExecutives_service.getCODTYPEInfo());
        if (!result.hasErrors()) {
            loancorporatetopexecutives_entity.setCustCode(CustCode);
            if (loancorporatetopexecutives_entity.getId().equals("")) {
                loanCorporateTopExecutives_service.save(loancorporatetopexecutives_entity);
            } else {
                loanCorporateTopExecutives_service.update(loancorporatetopexecutives_entity);
            }
        }
        return "ClientInformation/LoanCorporateTopExecutives";
    }

    @ResponseBody
    @GetMapping("/LoanCorporateTopExecutives/getHistoryList")
    public String getHistoryList(int pageSize, int pageIndex) {
        Gson gson = new Gson();
        int total = loanCorporateTopExecutives_service.countAll(CustCode);
        PageHelper.startPage(pageIndex, pageSize);
        List<LoanCorporateTopExecutives_Entity> list = loanCorporateTopExecutives_service.findAll(CustCode);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setBirthday(list.get(i).getBirthday().substring(0, 10));
        }
        String historyList = gson.toJson(list);
        String errorCode = "0";
        return "{\"rowDatas\":" + historyList + ",\"dataLength\":" + total + ",\"errCode\":" + errorCode + "}";
    }

    @ResponseBody
    @RequestMapping(value = "/LoanCorporateTopExecutives/delete", method = RequestMethod.GET)
    public String deleteLoanCorporateTopExecutives(
            @RequestParam String Id
    ) {
        if (loanCorporateTopExecutives_service.delete(Integer.parseInt(Id)))
            return "success";
        else return "fail";
    }

}
