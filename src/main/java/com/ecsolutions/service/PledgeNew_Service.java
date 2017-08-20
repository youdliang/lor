package com.ecsolutions.service;

import com.ecsolutions.entity.Pledge_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */
public interface PledgeNew_Service {

    public Pledge_Entity getPopupInfo();

    public Pledge_Entity getByEthnic(String ethnic);

    public List<Pledge_Entity> getByCustcod(String custcod);

    public Pledge_Entity getById(String id);

    public List<Pledge_Entity> getByLine_no(String line_no);

    public int getByLineno(String line_no);

    public String getByLine_noAndNum(String line_no,int num);

    public void savePledgeInfo(Pledge_Entity pledge_entity);

    public void updatePledgeInfo(Pledge_Entity pledge_entity);

    public void deletePledgeInfo(String id);
}

