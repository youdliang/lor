package com.ecsolutions.service;


import java.util.List;
import com.ecsolutions.entity.PledgeEnt;

/**
 * Created by tim on 2017/6/27.
 */


public interface Pledge_Service {

    PledgeEnt getPledge(String id);
    List<PledgeEnt> getPledgeList(String line_no,String CUSTCOD);

}
