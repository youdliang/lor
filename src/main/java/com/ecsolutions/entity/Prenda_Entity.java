package com.ecsolutions.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
* Created by tim on 2017/6/27.
*/
public class Prenda_Entity extends BaseEnt {
    //通用信息
    private String line_no                        ;
    private String custcod                        ;
    private String id                             ;
    private Integer mode1;
    private String amountccy                      ;
    private Integer amount                         ;
    private String valueccy                       ;
    private Integer value                          ;
    private String contractnumber                 ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date signeddate                     ;
    private String bankaccountname                ;
    private String bankaccounttype                ;
    private String bankname                       ;
    private String bankaccount                    ;
    private String bankaccountccy                 ;
    private Integer bankaccountbalance             ;
    private Integer bankaccountistrust             ;
    private String bankpledgename                 ;
    private Integer bankpledgeownertype            ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date bankpledgeeffectivedate        ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date bankpledgelastdate             ;
    private Integer bankisfreezed                  ;
    private String ethnic                         ;
    private String pidtypeid                      ;
    private String pidno                          ;
    private String mortgagorname                  ;
    private String contactaddress                 ;
    private String contactphone                   ;
    private String cerorg                         ;
    private String cercustomer                    ;
    private String cerno                          ;
    private Integer ceraccount                     ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date cereffectivedate               ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date cerlastdate                    ;
    private String ceramount                      ;
    private String cdname                         ;
    private Integer cdtype                         ;
    private String cdno                           ;
    private String cdaccount                      ;
    private String cdbank                         ;
    private Integer cdisselfbank                   ;
    private Integer cdamount                       ;
    private Integer cdisstoppay                    ;
    private Integer notestype                      ;
    private String notesno                       ;
    private Integer notesamount                    ;
    private String notesbank                      ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date notessigneddate                ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date noteslastdate                  ;
    private String notesaddress                   ;
    private String wrowner                        ;
    private String wrorg                          ;
    private String wrno                           ;
    private String wrname                         ;
    private String wrstandard                     ;
    private String wrunit                         ;
    private Integer wrnumber                       ;
    private String wrdeliverystaff                ;
    private String wracceptancestaff              ;
    private Integer wrgoodsvalue                   ;
    private Integer wrstoragecosts                 ;
    private Integer wrhaveinsurance                ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date wrinsurancebegindate           ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date wrinsuranceenddate             ;
    private String ladorg                         ;
    private String ladno                          ;
    private String ladcontractno                  ;
    private String ladcommoditycoding             ;
    private String ladshippingunit                ;
    private String ladgoods                       ;
    private String ladrule                        ;
    private String ladcharacter                   ;
    private Integer laddeliverynumber              ;
    private String laddeliveryaddress             ;
    private String laddrawer                      ;
    private String stockownername                 ;
    private Integer stocknumber                    ;
    private String stockno                        ;
    private String stocknature                    ;
    private String stockholdersname               ;
    private String stocksecuritiesaccountno       ;
    private String stockinstitutions              ;
    private String stockregno                     ;
    private String stockinvestorsaccount          ;
    private String stockcode                      ;
    private String stockpledgeref                 ;
    private String stockpledgenumber              ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date stockpledgeregdate             ;
    private Integer intprotype                     ;
    private String intproownername                ;
    private Integer intproproveorg                 ;
    private String intpropatentnumber             ;
    private String intproregorg                   ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date intproregdate                  ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date intproteddate                  ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date intproprovedate                ;
    private String intpropledgeno                 ;
    private String intproorg                      ;
    private String chargeorg                      ;
    private String chargelicenceno                ;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date chargelastdate                 ;
    private String chargeregorg                   ;
    private String accrecproveperson              ;
    private String accrecowner                    ;
    private String accrecamountccy                ;
    private Integer accrecamount;
    private String carproveperson                 ;
    private String carproduction                  ;
    private String carno                          ;
    private String carbrand                       ;
    private String cartype                        ;
    private String carengineno                    ;
    private String carchassisno                   ;
    private Integer carprice                       ;
    private String accrec_remark                         ;
    private String car_remark                         ;
    private String bankaccount_remark                         ;
    private String cd_remark                         ;
    private String cer_remark                         ;
    private String charge_remark                         ;
    private String intpro_remark                         ;
    private String lad_remark                         ;
    private String notes_remark                         ;
    private String stock_remark                         ;
    private String wr_remark                         ;
    private String nd_remark                         ;
    private String other_remark                         ;
    private String chargeproject                  ;
    private String pledgecustcod                  ;
    private Integer nd_kind                        ;
    private String nd_id                          ;
    private Integer nd_rate                        ;
    private Integer nd_deadline                    ;
    private Integer nd_amount;
    private String nd_bank                        ;
    private String nd_begindate                   ;
    private String nd_enddate                     ;
    private String nd_address                     ;
    private String other_name                     ;
    private String other_unit                     ;
    private Integer other_number                   ;
    private String other_address                  ;
    private Integer num                   ;
    private Integer stateid;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date    createtime  ;
    private String  refid;

    //证件类型
    List<HashMap<String,String>> idTypeList;
    //币种类型
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

    public Integer getMode1() {
        return mode1;
    }

    public void setMode1(Integer mode1) {
        this.mode1 = mode1;
    }

    public String getAmountccy() {
        return amountccy;
    }

    public void setAmountccy(String amountccy) {
        this.amountccy = amountccy;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getValueccy() {
        return valueccy;
    }

    public void setValueccy(String valueccy) {
        this.valueccy = valueccy;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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

    public String getBankaccountname() {
        return bankaccountname;
    }

    public void setBankaccountname(String bankaccountname) {
        this.bankaccountname = bankaccountname;
    }

    public String getBankaccounttype() {
        return bankaccounttype;
    }

    public void setBankaccounttype(String bankaccounttype) {
        this.bankaccounttype = bankaccounttype;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankaccountccy() {
        return bankaccountccy;
    }

    public void setBankaccountccy(String bankaccountccy) {
        this.bankaccountccy = bankaccountccy;
    }

    public Integer getBankaccountbalance() {
        return bankaccountbalance;
    }

    public void setBankaccountbalance(Integer bankaccountbalance) {
        this.bankaccountbalance = bankaccountbalance;
    }

    public Integer getBankaccountistrust() {
        return bankaccountistrust;
    }

    public void setBankaccountistrust(Integer bankaccountistrust) {
        this.bankaccountistrust = bankaccountistrust;
    }

    public String getBankpledgename() {
        return bankpledgename;
    }

    public void setBankpledgename(String bankpledgename) {
        this.bankpledgename = bankpledgename;
    }

    public Integer getBankpledgeownertype() {
        return bankpledgeownertype;
    }

    public void setBankpledgeownertype(Integer bankpledgeownertype) {
        this.bankpledgeownertype = bankpledgeownertype;
    }

    public Date getBankpledgeeffectivedate() {
        return bankpledgeeffectivedate;
    }

    public void setBankpledgeeffectivedate(Date bankpledgeeffectivedate) {
        this.bankpledgeeffectivedate = bankpledgeeffectivedate;
    }

    public Date getBankpledgelastdate() {
        return bankpledgelastdate;
    }

    public void setBankpledgelastdate(Date bankpledgelastdate) {
        this.bankpledgelastdate = bankpledgelastdate;
    }

    public Integer getBankisfreezed() {
        return bankisfreezed;
    }

    public void setBankisfreezed(Integer bankisfreezed) {
        this.bankisfreezed = bankisfreezed;
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

    public String getCerorg() {
        return cerorg;
    }

    public void setCerorg(String cerorg) {
        this.cerorg = cerorg;
    }

    public String getCercustomer() {
        return cercustomer;
    }

    public void setCercustomer(String cercustomer) {
        this.cercustomer = cercustomer;
    }

    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno;
    }

    public Integer getCeraccount() {
        return ceraccount;
    }

    public void setCeraccount(Integer ceraccount) {
        this.ceraccount = ceraccount;
    }

    public Date getCereffectivedate() {
        return cereffectivedate;
    }

    public void setCereffectivedate(Date cereffectivedate) {
        this.cereffectivedate = cereffectivedate;
    }

    public Date getCerlastdate() {
        return cerlastdate;
    }

    public void setCerlastdate(Date cerlastdate) {
        this.cerlastdate = cerlastdate;
    }

    public String getCeramount() {
        return ceramount;
    }

    public void setCeramount(String ceramount) {
        this.ceramount = ceramount;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public Integer getCdtype() {
        return cdtype;
    }

    public void setCdtype(Integer cdtype) {
        this.cdtype = cdtype;
    }

    public String getCdno() {
        return cdno;
    }

    public void setCdno(String cdno) {
        this.cdno = cdno;
    }

    public String getCdaccount() {
        return cdaccount;
    }

    public void setCdaccount(String cdaccount) {
        this.cdaccount = cdaccount;
    }

    public String getCdbank() {
        return cdbank;
    }

    public void setCdbank(String cdbank) {
        this.cdbank = cdbank;
    }

    public Integer getCdisselfbank() {
        return cdisselfbank;
    }

    public void setCdisselfbank(Integer cdisselfbank) {
        this.cdisselfbank = cdisselfbank;
    }

    public Integer getCdamount() {
        return cdamount;
    }

    public void setCdamount(Integer cdamount) {
        this.cdamount = cdamount;
    }

    public Integer getCdisstoppay() {
        return cdisstoppay;
    }

    public void setCdisstoppay(Integer cdisstoppay) {
        this.cdisstoppay = cdisstoppay;
    }

    public Integer getNotestype() {
        return notestype;
    }

    public void setNotestype(Integer notestype) {
        this.notestype = notestype;
    }

    public String getNotesno() {
        return notesno;
    }

    public void setNotesno(String notesno) {
        this.notesno = notesno;
    }

    public Integer getNotesamount() {
        return notesamount;
    }

    public void setNotesamount(Integer notesamount) {
        this.notesamount = notesamount;
    }

    public String getNotesbank() {
        return notesbank;
    }

    public void setNotesbank(String notesbank) {
        this.notesbank = notesbank;
    }

    public Date getNotessigneddate() {
        return notessigneddate;
    }

    public void setNotessigneddate(Date notessigneddate) {
        this.notessigneddate = notessigneddate;
    }

    public Date getNoteslastdate() {
        return noteslastdate;
    }

    public void setNoteslastdate(Date noteslastdate) {
        this.noteslastdate = noteslastdate;
    }

    public String getNotesaddress() {
        return notesaddress;
    }

    public void setNotesaddress(String notesaddress) {
        this.notesaddress = notesaddress;
    }

    public String getWrowner() {
        return wrowner;
    }

    public void setWrowner(String wrowner) {
        this.wrowner = wrowner;
    }

    public String getWrorg() {
        return wrorg;
    }

    public void setWrorg(String wrorg) {
        this.wrorg = wrorg;
    }

    public String getWrno() {
        return wrno;
    }

    public void setWrno(String wrno) {
        this.wrno = wrno;
    }

    public String getWrname() {
        return wrname;
    }

    public void setWrname(String wrname) {
        this.wrname = wrname;
    }

    public String getWrstandard() {
        return wrstandard;
    }

    public void setWrstandard(String wrstandard) {
        this.wrstandard = wrstandard;
    }

    public String getWrunit() {
        return wrunit;
    }

    public void setWrunit(String wrunit) {
        this.wrunit = wrunit;
    }

    public Integer getWrnumber() {
        return wrnumber;
    }

    public void setWrnumber(Integer wrnumber) {
        this.wrnumber = wrnumber;
    }

    public String getWrdeliverystaff() {
        return wrdeliverystaff;
    }

    public void setWrdeliverystaff(String wrdeliverystaff) {
        this.wrdeliverystaff = wrdeliverystaff;
    }

    public String getWracceptancestaff() {
        return wracceptancestaff;
    }

    public void setWracceptancestaff(String wracceptancestaff) {
        this.wracceptancestaff = wracceptancestaff;
    }

    public Integer getWrgoodsvalue() {
        return wrgoodsvalue;
    }

    public void setWrgoodsvalue(Integer wrgoodsvalue) {
        this.wrgoodsvalue = wrgoodsvalue;
    }

    public Integer getWrstoragecosts() {
        return wrstoragecosts;
    }

    public void setWrstoragecosts(Integer wrstoragecosts) {
        this.wrstoragecosts = wrstoragecosts;
    }

    public Integer getWrhaveinsurance() {
        return wrhaveinsurance;
    }

    public void setWrhaveinsurance(Integer wrhaveinsurance) {
        this.wrhaveinsurance = wrhaveinsurance;
    }

    public Date getWrinsurancebegindate() {
        return wrinsurancebegindate;
    }

    public void setWrinsurancebegindate(Date wrinsurancebegindate) {
        this.wrinsurancebegindate = wrinsurancebegindate;
    }

    public Date getWrinsuranceenddate() {
        return wrinsuranceenddate;
    }

    public void setWrinsuranceenddate(Date wrinsuranceenddate) {
        this.wrinsuranceenddate = wrinsuranceenddate;
    }

    public String getLadorg() {
        return ladorg;
    }

    public void setLadorg(String ladorg) {
        this.ladorg = ladorg;
    }

    public String getLadno() {
        return ladno;
    }

    public void setLadno(String ladno) {
        this.ladno = ladno;
    }

    public String getLadcontractno() {
        return ladcontractno;
    }

    public void setLadcontractno(String ladcontractno) {
        this.ladcontractno = ladcontractno;
    }

    public String getLadcommoditycoding() {
        return ladcommoditycoding;
    }

    public void setLadcommoditycoding(String ladcommoditycoding) {
        this.ladcommoditycoding = ladcommoditycoding;
    }

    public String getLadshippingunit() {
        return ladshippingunit;
    }

    public void setLadshippingunit(String ladshippingunit) {
        this.ladshippingunit = ladshippingunit;
    }

    public String getLadgoods() {
        return ladgoods;
    }

    public void setLadgoods(String ladgoods) {
        this.ladgoods = ladgoods;
    }

    public String getLadrule() {
        return ladrule;
    }

    public void setLadrule(String ladrule) {
        this.ladrule = ladrule;
    }

    public String getLadcharacter() {
        return ladcharacter;
    }

    public void setLadcharacter(String ladcharacter) {
        this.ladcharacter = ladcharacter;
    }

    public Integer getLaddeliverynumber() {
        return laddeliverynumber;
    }

    public void setLaddeliverynumber(Integer laddeliverynumber) {
        this.laddeliverynumber = laddeliverynumber;
    }

    public String getLaddeliveryaddress() {
        return laddeliveryaddress;
    }

    public void setLaddeliveryaddress(String laddeliveryaddress) {
        this.laddeliveryaddress = laddeliveryaddress;
    }

    public String getLaddrawer() {
        return laddrawer;
    }

    public void setLaddrawer(String laddrawer) {
        this.laddrawer = laddrawer;
    }

    public String getStockownername() {
        return stockownername;
    }

    public void setStockownername(String stockownername) {
        this.stockownername = stockownername;
    }

    public Integer getStocknumber() {
        return stocknumber;
    }

    public void setStocknumber(Integer stocknumber) {
        this.stocknumber = stocknumber;
    }

    public String getStockno() {
        return stockno;
    }

    public void setStockno(String stockno) {
        this.stockno = stockno;
    }

    public String getStocknature() {
        return stocknature;
    }

    public void setStocknature(String stocknature) {
        this.stocknature = stocknature;
    }

    public String getStockholdersname() {
        return stockholdersname;
    }

    public void setStockholdersname(String stockholdersname) {
        this.stockholdersname = stockholdersname;
    }

    public String getStocksecuritiesaccountno() {
        return stocksecuritiesaccountno;
    }

    public void setStocksecuritiesaccountno(String stocksecuritiesaccountno) {
        this.stocksecuritiesaccountno = stocksecuritiesaccountno;
    }

    public String getStockinstitutions() {
        return stockinstitutions;
    }

    public void setStockinstitutions(String stockinstitutions) {
        this.stockinstitutions = stockinstitutions;
    }

    public String getStockregno() {
        return stockregno;
    }

    public void setStockregno(String stockregno) {
        this.stockregno = stockregno;
    }

    public String getStockinvestorsaccount() {
        return stockinvestorsaccount;
    }

    public void setStockinvestorsaccount(String stockinvestorsaccount) {
        this.stockinvestorsaccount = stockinvestorsaccount;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public String getStockpledgeref() {
        return stockpledgeref;
    }

    public void setStockpledgeref(String stockpledgeref) {
        this.stockpledgeref = stockpledgeref;
    }

    public String getStockpledgenumber() {
        return stockpledgenumber;
    }

    public void setStockpledgenumber(String stockpledgenumber) {
        this.stockpledgenumber = stockpledgenumber;
    }

    public Date getStockpledgeregdate() {
        return stockpledgeregdate;
    }

    public void setStockpledgeregdate(Date stockpledgeregdate) {
        this.stockpledgeregdate = stockpledgeregdate;
    }

    public Integer getIntprotype() {
        return intprotype;
    }

    public void setIntprotype(Integer intprotype) {
        this.intprotype = intprotype;
    }

    public String getIntproownername() {
        return intproownername;
    }

    public void setIntproownername(String intproownername) {
        this.intproownername = intproownername;
    }

    public Integer getIntproproveorg() {
        return intproproveorg;
    }

    public void setIntproproveorg(Integer intproproveorg) {
        this.intproproveorg = intproproveorg;
    }

    public String getIntpropatentnumber() {
        return intpropatentnumber;
    }

    public void setIntpropatentnumber(String intpropatentnumber) {
        this.intpropatentnumber = intpropatentnumber;
    }

    public String getIntproregorg() {
        return intproregorg;
    }

    public void setIntproregorg(String intproregorg) {
        this.intproregorg = intproregorg;
    }

    public Date getIntproregdate() {
        return intproregdate;
    }

    public void setIntproregdate(Date intproregdate) {
        this.intproregdate = intproregdate;
    }

    public Date getIntproteddate() {
        return intproteddate;
    }

    public void setIntproteddate(Date intproteddate) {
        this.intproteddate = intproteddate;
    }

    public Date getIntproprovedate() {
        return intproprovedate;
    }

    public void setIntproprovedate(Date intproprovedate) {
        this.intproprovedate = intproprovedate;
    }

    public String getIntpropledgeno() {
        return intpropledgeno;
    }

    public void setIntpropledgeno(String intpropledgeno) {
        this.intpropledgeno = intpropledgeno;
    }

    public String getIntproorg() {
        return intproorg;
    }

    public void setIntproorg(String intproorg) {
        this.intproorg = intproorg;
    }

    public String getChargeorg() {
        return chargeorg;
    }

    public void setChargeorg(String chargeorg) {
        this.chargeorg = chargeorg;
    }

    public String getChargelicenceno() {
        return chargelicenceno;
    }

    public void setChargelicenceno(String chargelicenceno) {
        this.chargelicenceno = chargelicenceno;
    }

    public Date getChargelastdate() {
        return chargelastdate;
    }

    public void setChargelastdate(Date chargelastdate) {
        this.chargelastdate = chargelastdate;
    }

    public String getChargeregorg() {
        return chargeregorg;
    }

    public void setChargeregorg(String chargeregorg) {
        this.chargeregorg = chargeregorg;
    }

    public String getAccrecproveperson() {
        return accrecproveperson;
    }

    public void setAccrecproveperson(String accrecproveperson) {
        this.accrecproveperson = accrecproveperson;
    }

    public String getAccrecowner() {
        return accrecowner;
    }

    public void setAccrecowner(String accrecowner) {
        this.accrecowner = accrecowner;
    }

    public String getAccrecamountccy() {
        return accrecamountccy;
    }

    public void setAccrecamountccy(String accrecamountccy) {
        this.accrecamountccy = accrecamountccy;
    }

    public Integer getAccrecamount() {
        return accrecamount;
    }

    public void setAccrecamount(Integer accrecamount) {
        this.accrecamount = accrecamount;
    }

    public String getCarproveperson() {
        return carproveperson;
    }

    public void setCarproveperson(String carproveperson) {
        this.carproveperson = carproveperson;
    }

    public String getCarproduction() {
        return carproduction;
    }

    public void setCarproduction(String carproduction) {
        this.carproduction = carproduction;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarengineno() {
        return carengineno;
    }

    public void setCarengineno(String carengineno) {
        this.carengineno = carengineno;
    }

    public String getCarchassisno() {
        return carchassisno;
    }

    public void setCarchassisno(String carchassisno) {
        this.carchassisno = carchassisno;
    }

    public Integer getCarprice() {
        return carprice;
    }

    public void setCarprice(Integer carprice) {
        this.carprice = carprice;
    }

    public String getAccrec_remark() {
        return accrec_remark;
    }

    public void setAccrec_remark(String accrec_remark) {
        this.accrec_remark = accrec_remark;
    }

    public String getCar_remark() {
        return car_remark;
    }

    public void setCar_remark(String car_remark) {
        this.car_remark = car_remark;
    }

    public String getBankaccount_remark() {
        return bankaccount_remark;
    }

    public void setBankaccount_remark(String bankaccount_remark) {
        this.bankaccount_remark = bankaccount_remark;
    }

    public String getCd_remark() {
        return cd_remark;
    }

    public void setCd_remark(String cd_remark) {
        this.cd_remark = cd_remark;
    }

    public String getCer_remark() {
        return cer_remark;
    }

    public void setCer_remark(String cer_remark) {
        this.cer_remark = cer_remark;
    }

    public String getCharge_remark() {
        return charge_remark;
    }

    public void setCharge_remark(String charge_remark) {
        this.charge_remark = charge_remark;
    }

    public String getIntpro_remark() {
        return intpro_remark;
    }

    public void setIntpro_remark(String intpro_remark) {
        this.intpro_remark = intpro_remark;
    }

    public String getLad_remark() {
        return lad_remark;
    }

    public void setLad_remark(String lad_remark) {
        this.lad_remark = lad_remark;
    }

    public String getNotes_remark() {
        return notes_remark;
    }

    public void setNotes_remark(String notes_remark) {
        this.notes_remark = notes_remark;
    }

    public String getStock_remark() {
        return stock_remark;
    }

    public void setStock_remark(String stock_remark) {
        this.stock_remark = stock_remark;
    }

    public String getWr_remark() {
        return wr_remark;
    }

    public void setWr_remark(String wr_remark) {
        this.wr_remark = wr_remark;
    }

    public String getNd_remark() {
        return nd_remark;
    }

    public void setNd_remark(String nd_remark) {
        this.nd_remark = nd_remark;
    }

    public String getOther_remark() {
        return other_remark;
    }

    public void setOther_remark(String other_remark) {
        this.other_remark = other_remark;
    }

    public String getChargeproject() {
        return chargeproject;
    }

    public void setChargeproject(String chargeproject) {
        this.chargeproject = chargeproject;
    }

    public String getPledgecustcod() {
        return pledgecustcod;
    }

    public void setPledgecustcod(String pledgecustcod) {
        this.pledgecustcod = pledgecustcod;
    }

    public Integer getNd_kind() {
        return nd_kind;
    }

    public void setNd_kind(Integer nd_kind) {
        this.nd_kind = nd_kind;
    }

    public String getNd_id() {
        return nd_id;
    }

    public void setNd_id(String nd_id) {
        this.nd_id = nd_id;
    }

    public Integer getNd_rate() {
        return nd_rate;
    }

    public void setNd_rate(Integer nd_rate) {
        this.nd_rate = nd_rate;
    }

    public Integer getNd_deadline() {
        return nd_deadline;
    }

    public void setNd_deadline(Integer nd_deadline) {
        this.nd_deadline = nd_deadline;
    }

    public Integer getNd_amount() {
        return nd_amount;
    }

    public void setNd_amount(Integer nd_amount) {
        this.nd_amount = nd_amount;
    }

    public String getNd_bank() {
        return nd_bank;
    }

    public void setNd_bank(String nd_bank) {
        this.nd_bank = nd_bank;
    }

    public String getNd_begindate() {
        return nd_begindate;
    }

    public void setNd_begindate(String nd_begindate) {
        this.nd_begindate = nd_begindate;
    }

    public String getNd_enddate() {
        return nd_enddate;
    }

    public void setNd_enddate(String nd_enddate) {
        this.nd_enddate = nd_enddate;
    }

    public String getNd_address() {
        return nd_address;
    }

    public void setNd_address(String nd_address) {
        this.nd_address = nd_address;
    }

    public String getOther_name() {
        return other_name;
    }

    public void setOther_name(String other_name) {
        this.other_name = other_name;
    }

    public String getOther_unit() {
        return other_unit;
    }

    public void setOther_unit(String other_unit) {
        this.other_unit = other_unit;
    }

    public Integer getOther_number() {
        return other_number;
    }

    public void setOther_number(Integer other_number) {
        this.other_number = other_number;
    }

    public String getOther_address() {
        return other_address;
    }

    public void setOther_address(String other_address) {
        this.other_address = other_address;
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
