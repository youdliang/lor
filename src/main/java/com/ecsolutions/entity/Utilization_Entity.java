package com.ecsolutions.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class Utilization_Entity {
    private String loanref;
    private String lineno;
    private String custcod;
    private String bpm_no;
    private String linedesc;
    private String lineccy;
    private Integer lineamt;
    private Integer avliamt;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date drawdate;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date anndate;
    private String schetype;
    private String drawccy;
    private Integer drawamt;
    private String ratetype;
    private String rate;
    private String spread;
    private String percent;
    private String schemarate;
    private String overdurate;
    private String paymentmethod;
    private String tenor;
    private String fixflag;
    private String payfreq;
    private String payper;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date firstpaydate;
    private String collflag;
    private String docflag;
    private String dircflag1;
    private String dircflag2;
    private String dircflag3;
    private String dircflag4;
    private String dircdesc;
    private String loanfreq;
    private String micprod;
    private Integer eduyear;
    private String marginamt;
    private String chgtype;
    private String chgamt;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date chgdate;
    private String accoffic;
    private String accofname;
    private String contractsymbol;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date signeddate;
    private String inaccname;
    private String inaccno;
    private String outacname;
    private String outaccno;
    private String fluserid;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date Duedate;

    //额度号类型
    List<HashMap<String, String>> linenoList;
    //方案类型
    List<HashMap<String, String>> fanganList;
    //利率类型
    List<HashMap<String, String>> lilvList;
    //币种
    List<HashMap<String, String>> ccyList;
    //门类
    List<HashMap<String, String>> meileiList;
    //大类
    List<HashMap<String, String>> daleiList;
    //中类
    List<HashMap<String, String>> zhongleiList;
    //小类
    List<HashMap<String, String>> xiaoleiList;
    //文档标识
    List<HashMap<String, String>> biaoshiList;
    //客户经理
    List<HashMap<String, String>> jinliList;

    public String getLoanref() {
        return loanref;
    }

    public void setLoanref(String loanref) {
        this.loanref = loanref;
    }

    public String getLineno() {
        return lineno;
    }

    public void setLineno(String lineno) {
        this.lineno = lineno;
    }

    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getBpm_no() {
        return bpm_no;
    }

    public void setBpm_no(String bpm_no) {
        this.bpm_no = bpm_no;
    }

    public String getLinedesc() {
        return linedesc;
    }

    public void setLinedesc(String linedesc) {
        this.linedesc = linedesc;
    }

    public String getLineccy() {
        return lineccy;
    }

    public void setLineccy(String lineccy) {
        this.lineccy = lineccy;
    }

    public Integer getLineamt() {
        return lineamt;
    }

    public void setLineamt(Integer lineamt) {
        this.lineamt = lineamt;
    }

    public Integer getAvliamt() {
        return avliamt;
    }

    public void setAvliamt(Integer avliamt) {
        this.avliamt = avliamt;
    }

    public Date getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(Date drawdate) {
        this.drawdate = drawdate;
    }

    public Date getAnndate() {
        return anndate;
    }

    public void setAnndate(Date anndate) {
        this.anndate = anndate;
    }

    public String getSchetype() {
        return schetype;
    }

    public void setSchetype(String schetype) {
        this.schetype = schetype;
    }

    public String getDrawccy() {
        return drawccy;
    }

    public void setDrawccy(String drawccy) {
        this.drawccy = drawccy;
    }

    public Integer getDrawamt() {
        return drawamt;
    }

    public void setDrawamt(Integer drawamt) {
        this.drawamt = drawamt;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getSchemarate() {
        return schemarate;
    }

    public void setSchemarate(String schemarate) {
        this.schemarate = schemarate;
    }

    public String getOverdurate() {
        return overdurate;
    }

    public void setOverdurate(String overdurate) {
        this.overdurate = overdurate;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getFixflag() {
        return fixflag;
    }

    public void setFixflag(String fixflag) {
        this.fixflag = fixflag;
    }

    public String getPayfreq() {
        return payfreq;
    }

    public void setPayfreq(String payfreq) {
        this.payfreq = payfreq;
    }

    public String getPayper() {
        return payper;
    }

    public void setPayper(String payper) {
        this.payper = payper;
    }

    public Date getFirstpaydate() {
        return firstpaydate;
    }

    public void setFirstpaydate(Date firstpaydate) {
        this.firstpaydate = firstpaydate;
    }

    public String getCollflag() {
        return collflag;
    }

    public void setCollflag(String collflag) {
        this.collflag = collflag;
    }

    public String getDocflag() {
        return docflag;
    }

    public void setDocflag(String docflag) {
        this.docflag = docflag;
    }

    public String getDircflag1() {
        return dircflag1;
    }

    public void setDircflag1(String dircflag1) {
        this.dircflag1 = dircflag1;
    }

    public String getDircflag2() {
        return dircflag2;
    }

    public void setDircflag2(String dircflag2) {
        this.dircflag2 = dircflag2;
    }

    public String getDircflag3() {
        return dircflag3;
    }

    public void setDircflag3(String dircflag3) {
        this.dircflag3 = dircflag3;
    }

    public String getDircflag4() {
        return dircflag4;
    }

    public void setDircflag4(String dircflag4) {
        this.dircflag4 = dircflag4;
    }

    public String getDircdesc() {
        return dircdesc;
    }

    public void setDircdesc(String dircdesc) {
        this.dircdesc = dircdesc;
    }

    public String getLoanfreq() {
        return loanfreq;
    }

    public void setLoanfreq(String loanfreq) {
        this.loanfreq = loanfreq;
    }

    public String getMicprod() {
        return micprod;
    }

    public void setMicprod(String micprod) {
        this.micprod = micprod;
    }

    public Integer getEduyear() {
        return eduyear;
    }

    public void setEduyear(Integer eduyear) {
        this.eduyear = eduyear;
    }

    public String getMarginamt() {
        return marginamt;
    }

    public void setMarginamt(String marginamt) {
        this.marginamt = marginamt;
    }

    public String getChgtype() {
        return chgtype;
    }

    public void setChgtype(String chgtype) {
        this.chgtype = chgtype;
    }

    public String getChgamt() {
        return chgamt;
    }

    public void setChgamt(String chgamt) {
        this.chgamt = chgamt;
    }

    public Date getChgdate() {
        return chgdate;
    }

    public void setChgdate(Date chgdate) {
        this.chgdate = chgdate;
    }

    public String getAccoffic() {
        return accoffic;
    }

    public void setAccoffic(String accoffic) {
        this.accoffic = accoffic;
    }

    public String getAccofname() {
        return accofname;
    }

    public void setAccofname(String accofname) {
        this.accofname = accofname;
    }

    public String getContractsymbol() {
        return contractsymbol;
    }

    public void setContractsymbol(String contractsymbol) {
        this.contractsymbol = contractsymbol;
    }

    public Date getSigneddate() {
        return signeddate;
    }

    public void setSigneddate(Date signeddate) {
        this.signeddate = signeddate;
    }

    public String getInaccname() {
        return inaccname;
    }

    public void setInaccname(String inaccname) {
        this.inaccname = inaccname;
    }

    public String getInaccno() {
        return inaccno;
    }

    public void setInaccno(String inaccno) {
        this.inaccno = inaccno;
    }

    public String getOutacname() {
        return outacname;
    }

    public void setOutacname(String outacname) {
        this.outacname = outacname;
    }

    public String getOutaccno() {
        return outaccno;
    }

    public void setOutaccno(String outaccno) {
        this.outaccno = outaccno;
    }

    public String getFluserid() {
        return fluserid;
    }

    public void setFluserid(String fluserid) {
        this.fluserid = fluserid;
    }

    public Date getDuedate() {
        return Duedate;
    }

    public void setDuedate(Date duedate) {
        Duedate = duedate;
    }

    public List<HashMap<String, String>> getLinenoList() {
        return linenoList;
    }

    public void setLinenoList(List<HashMap<String, String>> linenoList) {
        this.linenoList = linenoList;
    }

    public List<HashMap<String, String>> getFanganList() {
        return fanganList;
    }

    public void setFanganList(List<HashMap<String, String>> fanganList) {
        this.fanganList = fanganList;
    }

    public List<HashMap<String, String>> getLilvList() {
        return lilvList;
    }

    public void setLilvList(List<HashMap<String, String>> lilvList) {
        this.lilvList = lilvList;
    }

    public List<HashMap<String, String>> getCcyList() {
        return ccyList;
    }

    public void setCcyList(List<HashMap<String, String>> ccyList) {
        this.ccyList = ccyList;
    }

    public List<HashMap<String, String>> getMeileiList() {
        return meileiList;
    }

    public void setMeileiList(List<HashMap<String, String>> meileiList) {
        this.meileiList = meileiList;
    }

    public List<HashMap<String, String>> getDaleiList() {
        return daleiList;
    }

    public void setDaleiList(List<HashMap<String, String>> daleiList) {
        this.daleiList = daleiList;
    }

    public List<HashMap<String, String>> getZhongleiList() {
        return zhongleiList;
    }

    public void setZhongleiList(List<HashMap<String, String>> zhongleiList) {
        this.zhongleiList = zhongleiList;
    }

    public List<HashMap<String, String>> getXiaoleiList() {
        return xiaoleiList;
    }

    public void setXiaoleiList(List<HashMap<String, String>> xiaoleiList) {
        this.xiaoleiList = xiaoleiList;
    }

    public List<HashMap<String, String>> getBiaoshiList() {
        return biaoshiList;
    }

    public void setBiaoshiList(List<HashMap<String, String>> biaoshiList) {
        this.biaoshiList = biaoshiList;
    }

    public List<HashMap<String, String>> getJinliList() {
        return jinliList;
    }

    public void setJinliList(List<HashMap<String, String>> jinliList) {
        this.jinliList = jinliList;
    }
}