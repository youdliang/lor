package com.ecsolutions.entity;

/**
 * Created by tim on 2017/7/4.
 */
public class PIDTypeTextEnt {

    private Integer  localeId  ;
    private String  name       ;
    private Integer  pidTypeId ;

    public  Integer  getLocaleId()  { return localeId     ; }
    public  String   getName()      { return name         ; }
    public  Integer  getPidTypeId() { return pidTypeId    ; }

    public  void  setLocaleId (Integer tmpLocaleId ) {  localeId  = tmpLocaleId   ; }
    public  void  setName     ( String tmpName     ) {  name      = tmpName       ; }
    public  void  setPidTypeId( Integer tmpPidTypeId) {  pidTypeId = tmpPidTypeId  ; }


}
