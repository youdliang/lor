package com.ecsolutions.controller;


import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-7-25.
 */
@RestController
public class ManagerAndMajorContact_Controller {
//    @RequestMapping(method = RequestMethod.GET, value = "/mamc")
//    public List<DEPOSIT_INFO_SEARCH_Entity> getDEPOSIT_INFO_SEARCH(@RequestParam(value="dp_account_no", defaultValue = "", required = false) String dp_account_no,
//                                                                   @RequestParam(value="ln_account_no", defaultValue = "", required = false) String ln_account_no,
//                                                                   @RequestParam(value="customer_code", defaultValue = "", required = false) String customer_code,
//                                                                   @RequestParam(value="customer_full_name", defaultValue = "", required = false) String customer_full_name,
//                                                                   @RequestParam(value="identity_no", defaultValue = "", required = false) String identity_no,
//                                                                   @RequestParam(value="userid", defaultValue = "", required = true) String userid
//    ){
//        //@RequestParam(value="pageNum") Integer pageNum,
//        //@RequestParam(value="pageSize") Integer pageSize){
//        // pageNum = pageNum == null ? 1 : pageNum;
//        // pageSize = pageSize == null ? 10 : pageSize;
//        // PageHelper.startPage(pageNum, pageSize);
//        List<DEPOSIT_INFO_SEARCH_Entity> dEPOSIT_INFO_SEARCH_Entity = dEPOSIT_INFO_SEARCH_Service.searchInfoByCustCode(dp_account_no,ln_account_no,customer_code,customer_full_name,identity_no,userid);
//        // Page page = (Page) dEPOSIT_INFO_SEARCH_Entity;
//        // List<DEPOSIT_INFO_SEARCH_Entity> dEPOSIT_INFO_SEARCH_Entitys = dEPOSIT_INFO_SEARCH_Service.findTutorByNameAndEmailSql(deposit_info_search_entity.getDp_account_no(),deposit_info_search_entity.getLn_account_no(),deposit_info_search_entity.getCustomer_code(),deposit_info_search_entity.getCustomer_full_name(),deposit_info_search_entity.getIdentity_no() );
//        //     return page;
//        return dEPOSIT_INFO_SEARCH_Entity;
//    }
}
