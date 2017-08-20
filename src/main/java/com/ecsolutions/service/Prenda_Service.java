package com.ecsolutions.service;

import com.ecsolutions.entity.Prenda_Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */
public interface Prenda_Service {

    public Prenda_Entity getPopupInfo();

    public Prenda_Entity getByEthnic(String ethnic);

    public List<Prenda_Entity> getByCustcod(String custcod);

    public Prenda_Entity getById(String id);

    public List<Prenda_Entity> getByLine_no(String line_no);

    public int getByLineno(String line_no);

    public String getByLine_noAndNum(String line_no, int num);

    public void savePrendaInfo(Prenda_Entity prenda_entity);

    public void updatePrendaInfo(Prenda_Entity prenda_entity);

    public void deletePrendaInfo(String id);
}

