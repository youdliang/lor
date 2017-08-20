package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017-7-18.
 */
public class DanBao_Entity {
    //form data

    private String db_edh;    //额度号
    private String userInfo;

    //popup
    List<HashMap<String,String>> userInfoList;

    public String getDb_edh() {
        return db_edh;
    }

    public void setDb_edh(String db_edh) {
        this.db_edh = db_edh;
    }

    public List<HashMap<String, String>> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<HashMap<String, String>> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
}
