package com.ecsolutions.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Pledge_Entity {
    //通用信息
    private String line_no;
    private String custcod;
    private String id;
    private String contractnumber;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   signeddate;
    private String mode1;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   begindate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   enddate;
    private String originalvalueccy;
    private String originalvalue;
    private String marketvalueccy;
    private String marketvalue;
    private String assessedvalueccy;
    private String assessedvalue;
    private String amountccy;
    private String amount;
    private String scale;
    private String owner;
    private String isinsurance;
    private String assessmentagencies;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   assessmentdate;
    private String assessmentreportno;
    private String organizationcode;

    //权属情况
    private String ethnic;
    private String pidtypeid;
    private String pidno;
    private String mortgagorname;
    private String contactaddress;
    private String contactphone;
    private String landuserightsno;
    private Integer landarea;
    private String landareaunit;
    private String landaddress;
    private Integer landaccessmethod;
    private Integer landnature;
    private Integer landhaveattachment;
    private Integer landhaveattachmentcertificate;
    private Integer landattachmentisconsistent;
    private Integer landisreg;
    private String landregorgans;
    private String landotherrightsno;
    private String landotherremark;
    private String estateno;
    private Integer estatearea;
    private String estateaddress;
    private Integer estatebuildingstructure;
    private Integer estatefloors;
    private Integer estateatfloor;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   estatebuildingdate;
    private Integer estateisreg;
    private String estateregorgans;
    private String estateotherrightsno;
    private String estaterightsaddress;
    private String estateattatichmentowner;
    private String estateremark;
    private String devicename;
    private String devicetype;
    private String deviceunit;
    private String devicenumber;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   deviceexfactorydate;
    private Integer deviceusedyears = 0;
    private Integer deviceretirementyears = 0;
    private String deviceremark;
    private String vehiclebrand;
    private String vehicleenginenumber;
    private String vehicletype;
    private String vehiclechassisnumber;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   vehiclebuydate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   vehicleexpectedretirementdate;
    private String vehiclelicensenumber;
    private String vehicleremark;
    private String projectname;
    private Integer projectattathimentarea;
    private Integer projectbuildingarea;
    private String projectaddress;
    private String projectbuildingorg;
    private Integer projectbuildingfloors;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   projectbuildingdate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   projectexpectedcompletiondate;
    private String projectconstructionunit;
    private String projectremark;
    private String shipbrand;
    private String shiptype;
    private String shiplicenenumber;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   shipexfactorydate;
    private Integer shipnavmil;
    private Integer shiprights;
    private Integer shipuse;
    private String shipremark;
    private String miningperson;
    private String mininglicencenumber;
    private String miningaddress;
    private String miningtype;
    private String miningname;
    private String miningworktype;
    private Integer miningproductionscale;
    private Integer miningarea;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   mininglastdate;
    private String miningremark;
    private String othername;
    private String otherunit;
    private Integer othernumber;
    private String otheraddress;
    private String otherremark;
    private String insuranceno;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   insuranceeffectivedate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   insurancematuritydate;
    private String insurancetype;
    private String insurancecompany;
    private String insuranceamountccy;
    private Integer insuranceamount;
    private String insurancebeneficiaries;
    private String deviceaddress;
    private Integer vehiclerunlong = 0;
    private Integer shipnumber;
    private String estatefloorsandatfloor;
    private String mortgagecustcod;
    private Integer num;
    private Integer stateid;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date   createtime;
    private String refid;

    //popup
    List<HashMap<String,String>> idTypeList;
    List<HashMap<String,String>> ccyList;
    //保险公司名称
    List<HashMap<String,String>> insuranceList;

    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationcode() {
        return organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode;
    }

    public String getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }

    public Date getSigneddate() {
        return signeddate;
    }

    public void setSigneddate(Date signeddate) {
        this.signeddate = signeddate;
    }

    public String getMode1() {
        return mode1;
    }

    public void setMode1(String mode1) {
        this.mode1 = mode1;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getOriginalvalueccy() {
        return originalvalueccy;
    }

    public void setOriginalvalueccy(String originalvalueccy) {
        this.originalvalueccy = originalvalueccy;
    }

    public String getOriginalvalue() {
        return originalvalue;
    }

    public void setOriginalvalue(String originalvalue) {
        this.originalvalue = originalvalue;
    }

    public String getMarketvalueccy() {
        return marketvalueccy;
    }

    public void setMarketvalueccy(String marketvalueccy) {
        this.marketvalueccy = marketvalueccy;
    }

    public String getMarketvalue() {
        return marketvalue;
    }

    public void setMarketvalue(String marketvalue) {
        this.marketvalue = marketvalue;
    }

    public String getAssessedvalueccy() {
        return assessedvalueccy;
    }

    public void setAssessedvalueccy(String assessedvalueccy) {
        this.assessedvalueccy = assessedvalueccy;
    }

    public String getAssessedvalue() {
        return assessedvalue;
    }

    public void setAssessedvalue(String assessedvalue) {
        this.assessedvalue = assessedvalue;
    }

    public String getAmountccy() {
        return amountccy;
    }

    public void setAmountccy(String amountccy) {
        this.amountccy = amountccy;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIsinsurance() {
        return isinsurance;
    }

    public void setIsinsurance(String isinsurance) {
        this.isinsurance = isinsurance;
    }

    public String getAssessmentagencies() {
        return assessmentagencies;
    }

    public void setAssessmentagencies(String assessmentagencies) {
        this.assessmentagencies = assessmentagencies;
    }

    public Date getAssessmentdate() {
        return assessmentdate;
    }

    public void setAssessmentdate(Date assessmentdate) {
        this.assessmentdate = assessmentdate;
    }

    public String getAssessmentreportno() {
        return assessmentreportno;
    }

    public void setAssessmentreportno(String assessmentreportno) {
        this.assessmentreportno = assessmentreportno;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getPidtypeid() {
        return pidtypeid;
    }

    public void setPidtypeid(String pidtypeid) {
        this.pidtypeid = pidtypeid;
    }

    public String getPidno() {
        return pidno;
    }

    public void setPidno(String pidno) {
        this.pidno = pidno;
    }

    public String getMortgagorname() {
        return mortgagorname;
    }

    public void setMortgagorname(String mortgagorname) {
        this.mortgagorname = mortgagorname;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getLanduserightsno() {
        return landuserightsno;
    }

    public void setLanduserightsno(String landuserightsno) {
        this.landuserightsno = landuserightsno;
    }

    public Integer getLandarea() {
        return landarea;
    }

    public void setLandarea(Integer landarea) {
        this.landarea = landarea;
    }

    public String getLandareaunit() {
        return landareaunit;
    }

    public void setLandareaunit(String landareaunit) {
        this.landareaunit = landareaunit;
    }

    public String getLandaddress() {
        return landaddress;
    }

    public void setLandaddress(String landaddress) {
        this.landaddress = landaddress;
    }

    public Integer getLandaccessmethod() {
        return landaccessmethod;
    }

    public void setLandaccessmethod(Integer landaccessmethod) {
        this.landaccessmethod = landaccessmethod;
    }

    public Integer getLandnature() {
        return landnature;
    }

    public void setLandnature(Integer landnature) {
        this.landnature = landnature;
    }

    public Integer getLandhaveattachment() {
        return landhaveattachment;
    }

    public void setLandhaveattachment(Integer landhaveattachment) {
        this.landhaveattachment = landhaveattachment;
    }

    public Integer getLandhaveattachmentcertificate() {
        return landhaveattachmentcertificate;
    }

    public void setLandhaveattachmentcertificate(Integer landhaveattachmentcertificate) {
        this.landhaveattachmentcertificate = landhaveattachmentcertificate;
    }

    public Integer getLandattachmentisconsistent() {
        return landattachmentisconsistent;
    }

    public void setLandattachmentisconsistent(Integer landattachmentisconsistent) {
        this.landattachmentisconsistent = landattachmentisconsistent;
    }

    public Integer getLandisreg() {
        return landisreg;
    }

    public void setLandisreg(Integer landisreg) {
        this.landisreg = landisreg;
    }

    public String getLandregorgans() {
        return landregorgans;
    }

    public void setLandregorgans(String landregorgans) {
        this.landregorgans = landregorgans;
    }

    public String getLandotherrightsno() {
        return landotherrightsno;
    }

    public void setLandotherrightsno(String landotherrightsno) {
        this.landotherrightsno = landotherrightsno;
    }

    public String getLandotherremark() {
        return landotherremark;
    }

    public void setLandotherremark(String landotherremark) {
        this.landotherremark = landotherremark;
    }

    public String getEstateno() {
        return estateno;
    }

    public void setEstateno(String estateno) {
        this.estateno = estateno;
    }

    public Integer getEstatearea() {
        return estatearea;
    }

    public void setEstatearea(Integer estatearea) {
        this.estatearea = estatearea;
    }

    public String getEstateaddress() {
        return estateaddress;
    }

    public void setEstateaddress(String estateaddress) {
        this.estateaddress = estateaddress;
    }

    public Integer getEstatebuildingstructure() {
        return estatebuildingstructure;
    }

    public void setEstatebuildingstructure(Integer estatebuildingstructure) {
        this.estatebuildingstructure = estatebuildingstructure;
    }

    public Integer getEstatefloors() {
        return estatefloors;
    }

    public void setEstatefloors(Integer estatefloors) {
        this.estatefloors = estatefloors;
    }

    public Integer getEstateatfloor() {
        return estateatfloor;
    }

    public void setEstateatfloor(Integer estateatfloor) {
        this.estateatfloor = estateatfloor;
    }

    public Date getEstatebuildingdate() {
        return estatebuildingdate;
    }

    public void setEstatebuildingdate(Date estatebuildingdate) {
        this.estatebuildingdate = estatebuildingdate;
    }

    public Integer getEstateisreg() {
        return estateisreg;
    }

    public void setEstateisreg(Integer estateisreg) {
        this.estateisreg = estateisreg;
    }

    public String getEstateregorgans() {
        return estateregorgans;
    }

    public void setEstateregorgans(String estateregorgans) {
        this.estateregorgans = estateregorgans;
    }

    public String getEstateotherrightsno() {
        return estateotherrightsno;
    }

    public void setEstateotherrightsno(String estateotherrightsno) {
        this.estateotherrightsno = estateotherrightsno;
    }

    public String getEstaterightsaddress() {
        return estaterightsaddress;
    }

    public void setEstaterightsaddress(String estaterightsaddress) {
        this.estaterightsaddress = estaterightsaddress;
    }

    public String getEstateattatichmentowner() {
        return estateattatichmentowner;
    }

    public void setEstateattatichmentowner(String estateattatichmentowner) {
        this.estateattatichmentowner = estateattatichmentowner;
    }

    public String getEstateremark() {
        return estateremark;
    }

    public void setEstateremark(String estateremark) {
        this.estateremark = estateremark;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getDeviceunit() {
        return deviceunit;
    }

    public void setDeviceunit(String deviceunit) {
        this.deviceunit = deviceunit;
    }

    public String getDevicenumber() {
        return devicenumber;
    }

    public void setDevicenumber(String devicenumber) {
        this.devicenumber = devicenumber;
    }

    public Date getDeviceexfactorydate() {
        return deviceexfactorydate;
    }

    public void setDeviceexfactorydate(Date deviceexfactorydate) {
        this.deviceexfactorydate = deviceexfactorydate;
    }

    public Integer getDeviceusedyears() {
        return deviceusedyears;
    }

    public void setDeviceusedyears(Integer deviceusedyears) {
        this.deviceusedyears = deviceusedyears;
    }

    public Integer getDeviceretirementyears() {
        return deviceretirementyears;
    }

    public void setDeviceretirementyears(Integer deviceretirementyears) {
        this.deviceretirementyears = deviceretirementyears;
    }

    public String getDeviceremark() {
        return deviceremark;
    }

    public void setDeviceremark(String deviceremark) {
        this.deviceremark = deviceremark;
    }

    public String getVehiclebrand() {
        return vehiclebrand;
    }

    public void setVehiclebrand(String vehiclebrand) {
        this.vehiclebrand = vehiclebrand;
    }

    public String getVehicleenginenumber() {
        return vehicleenginenumber;
    }

    public void setVehicleenginenumber(String vehicleenginenumber) {
        this.vehicleenginenumber = vehicleenginenumber;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getVehiclechassisnumber() {
        return vehiclechassisnumber;
    }

    public void setVehiclechassisnumber(String vehiclechassisnumber) {
        this.vehiclechassisnumber = vehiclechassisnumber;
    }

    public Date getVehiclebuydate() {
        return vehiclebuydate;
    }

    public void setVehiclebuydate(Date vehiclebuydate) {
        this.vehiclebuydate = vehiclebuydate;
    }

    public Date getVehicleexpectedretirementdate() {
        return vehicleexpectedretirementdate;
    }

    public void setVehicleexpectedretirementdate(Date vehicleexpectedretirementdate) {
        this.vehicleexpectedretirementdate = vehicleexpectedretirementdate;
    }

    public String getVehiclelicensenumber() {
        return vehiclelicensenumber;
    }

    public void setVehiclelicensenumber(String vehiclelicensenumber) {
        this.vehiclelicensenumber = vehiclelicensenumber;
    }

    public String getVehicleremark() {
        return vehicleremark;
    }

    public void setVehicleremark(String vehicleremark) {
        this.vehicleremark = vehicleremark;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Integer getProjectattathimentarea() {
        return projectattathimentarea;
    }

    public void setProjectattathimentarea(Integer projectattathimentarea) {
        this.projectattathimentarea = projectattathimentarea;
    }

    public Integer getProjectbuildingarea() {
        return projectbuildingarea;
    }

    public void setProjectbuildingarea(Integer projectbuildingarea) {
        this.projectbuildingarea = projectbuildingarea;
    }

    public String getProjectaddress() {
        return projectaddress;
    }

    public void setProjectaddress(String projectaddress) {
        this.projectaddress = projectaddress;
    }

    public String getProjectbuildingorg() {
        return projectbuildingorg;
    }

    public void setProjectbuildingorg(String projectbuildingorg) {
        this.projectbuildingorg = projectbuildingorg;
    }

    public Integer getProjectbuildingfloors() {
        return projectbuildingfloors;
    }

    public void setProjectbuildingfloors(Integer projectbuildingfloors) {
        this.projectbuildingfloors = projectbuildingfloors;
    }

    public Date getProjectbuildingdate() {
        return projectbuildingdate;
    }

    public void setProjectbuildingdate(Date projectbuildingdate) {
        this.projectbuildingdate = projectbuildingdate;
    }

    public Date getProjectexpectedcompletiondate() {
        return projectexpectedcompletiondate;
    }

    public void setProjectexpectedcompletiondate(Date projectexpectedcompletiondate) {
        this.projectexpectedcompletiondate = projectexpectedcompletiondate;
    }

    public String getProjectconstructionunit() {
        return projectconstructionunit;
    }

    public void setProjectconstructionunit(String projectconstructionunit) {
        this.projectconstructionunit = projectconstructionunit;
    }

    public String getProjectremark() {
        return projectremark;
    }

    public void setProjectremark(String projectremark) {
        this.projectremark = projectremark;
    }

    public String getShipbrand() {
        return shipbrand;
    }

    public void setShipbrand(String shipbrand) {
        this.shipbrand = shipbrand;
    }

    public String getShiptype() {
        return shiptype;
    }

    public void setShiptype(String shiptype) {
        this.shiptype = shiptype;
    }

    public String getShiplicenenumber() {
        return shiplicenenumber;
    }

    public void setShiplicenenumber(String shiplicenenumber) {
        this.shiplicenenumber = shiplicenenumber;
    }

    public Date getShipexfactorydate() {
        return shipexfactorydate;
    }

    public void setShipexfactorydate(Date shipexfactorydate) {
        this.shipexfactorydate = shipexfactorydate;
    }

    public Integer getShipnavmil() {
        return shipnavmil;
    }

    public void setShipnavmil(Integer shipnavmil) {
        this.shipnavmil = shipnavmil;
    }

    public Integer getShiprights() {
        return shiprights;
    }

    public void setShiprights(Integer shiprights) {
        this.shiprights = shiprights;
    }

    public Integer getShipuse() {
        return shipuse;
    }

    public void setShipuse(Integer shipuse) {
        this.shipuse = shipuse;
    }

    public String getShipremark() {
        return shipremark;
    }

    public void setShipremark(String shipremark) {
        this.shipremark = shipremark;
    }

    public String getMiningperson() {
        return miningperson;
    }

    public void setMiningperson(String miningperson) {
        this.miningperson = miningperson;
    }

    public String getMininglicencenumber() {
        return mininglicencenumber;
    }

    public void setMininglicencenumber(String mininglicencenumber) {
        this.mininglicencenumber = mininglicencenumber;
    }

    public String getMiningaddress() {
        return miningaddress;
    }

    public void setMiningaddress(String miningaddress) {
        this.miningaddress = miningaddress;
    }

    public String getMiningtype() {
        return miningtype;
    }

    public void setMiningtype(String miningtype) {
        this.miningtype = miningtype;
    }

    public String getMiningname() {
        return miningname;
    }

    public void setMiningname(String miningname) {
        this.miningname = miningname;
    }

    public String getMiningworktype() {
        return miningworktype;
    }

    public void setMiningworktype(String miningworktype) {
        this.miningworktype = miningworktype;
    }

    public Integer getMiningproductionscale() {
        return miningproductionscale;
    }

    public void setMiningproductionscale(Integer miningproductionscale) {
        this.miningproductionscale = miningproductionscale;
    }

    public Integer getMiningarea() {
        return miningarea;
    }

    public void setMiningarea(Integer miningarea) {
        this.miningarea = miningarea;
    }

    public Date getMininglastdate() {
        return mininglastdate;
    }

    public void setMininglastdate(Date mininglastdate) {
        this.mininglastdate = mininglastdate;
    }

    public String getMiningremark() {
        return miningremark;
    }

    public void setMiningremark(String miningremark) {
        this.miningremark = miningremark;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getOtherunit() {
        return otherunit;
    }

    public void setOtherunit(String otherunit) {
        this.otherunit = otherunit;
    }

    public Integer getOthernumber() {
        return othernumber;
    }

    public void setOthernumber(Integer othernumber) {
        this.othernumber = othernumber;
    }

    public String getOtheraddress() {
        return otheraddress;
    }

    public void setOtheraddress(String otheraddress) {
        this.otheraddress = otheraddress;
    }

    public String getOtherremark() {
        return otherremark;
    }

    public void setOtherremark(String otherremark) {
        this.otherremark = otherremark;
    }

    public String getInsuranceno() {
        return insuranceno;
    }

    public void setInsuranceno(String insuranceno) {
        this.insuranceno = insuranceno;
    }

    public Date getInsuranceeffectivedate() {
        return insuranceeffectivedate;
    }

    public void setInsuranceeffectivedate(Date insuranceeffectivedate) {
        this.insuranceeffectivedate = insuranceeffectivedate;
    }

    public Date getInsurancematuritydate() {
        return insurancematuritydate;
    }

    public void setInsurancematuritydate(Date insurancematuritydate) {
        this.insurancematuritydate = insurancematuritydate;
    }

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public String getInsurancecompany() {
        return insurancecompany;
    }

    public void setInsurancecompany(String insurancecompany) {
        this.insurancecompany = insurancecompany;
    }

    public String getInsuranceamountccy() {
        return insuranceamountccy;
    }

    public void setInsuranceamountccy(String insuranceamountccy) {
        this.insuranceamountccy = insuranceamountccy;
    }

    public Integer getInsuranceamount() {
        return insuranceamount;
    }

    public void setInsuranceamount(Integer insuranceamount) {
        this.insuranceamount = insuranceamount;
    }

    public String getInsurancebeneficiaries() {
        return insurancebeneficiaries;
    }

    public void setInsurancebeneficiaries(String insurancebeneficiaries) {
        this.insurancebeneficiaries = insurancebeneficiaries;
    }

    public String getDeviceaddress() {
        return deviceaddress;
    }

    public void setDeviceaddress(String deviceaddress) {
        this.deviceaddress = deviceaddress;
    }

    public Integer getVehiclerunlong() {
        return vehiclerunlong;
    }

    public void setVehiclerunlong(Integer vehiclerunlong) {
        this.vehiclerunlong = vehiclerunlong;
    }

    public Integer getShipnumber() {
        return shipnumber;
    }

    public void setShipnumber(Integer shipnumber) {
        this.shipnumber = shipnumber;
    }

    public String getEstatefloorsandatfloor() {
        return estatefloorsandatfloor;
    }

    public void setEstatefloorsandatfloor(String estatefloorsandatfloor) {
        this.estatefloorsandatfloor = estatefloorsandatfloor;
    }

    public String getMortgagecustcod() {
        return mortgagecustcod;
    }

    public void setMortgagecustcod(String mortgagecustcod) {
        this.mortgagecustcod = mortgagecustcod;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid;
    }

    public List<HashMap<String, String>> getIdTypeList() {
        return idTypeList;
    }

    public void setIdTypeList(List<HashMap<String, String>> idTypeList) {
        this.idTypeList = idTypeList;
    }

    public List<HashMap<String, String>> getCcyList() {
        return ccyList;
    }

    public void setCcyList(List<HashMap<String, String>> ccyList) {
        this.ccyList = ccyList;
    }

    public List<HashMap<String, String>> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<HashMap<String, String>> insuranceList) {
        this.insuranceList = insuranceList;
    }
}