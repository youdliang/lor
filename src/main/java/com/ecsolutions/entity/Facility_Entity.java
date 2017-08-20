package com.ecsolutions.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class Facility_Entity {
    private String custcod;
    private String prodtype;
//    private BigDecimal HaveLoan;
//    private BigDecimal HaveAcceptance;
//    private BigDecimal HaveLG;
//    private BigDecimal HaveLC;
//    private BigDecimal HaveOtherLoan;
    private Integer haveloan;
    private Integer haveacceptance;
    private Integer havelg;
    private Integer havelc;
    private Integer haveotherloan;
    private String lineno;
    private String linedesc;
    private String linegrade;
    private String linestatus;
    private String lineccy;

    private Integer lineamt;
    private Integer usedamt;
    private Integer osamt;
    private Integer holdamt;
    private Integer avliamt;
    private Integer releaseamt;

    private String bondflag;

    private Integer acceptamt;
    private Integer letteramt;
    private Integer creditamt;

    private String collflag;
    private String docflag;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date createdate;

    private String revolflag;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date expirydate;

    private String countryrisk;
    private String remark;

    private Integer orgamt;

    private String fluserid;

    private String appflag;

    public Integer getHaveloan() {
        return haveloan;
    }

    public void setHaveloan(Integer haveloan) {
        this.haveloan = haveloan;
    }

    public Integer getHaveacceptance() {
        return haveacceptance;
    }

    public void setHaveacceptance(Integer haveacceptance) {
        this.haveacceptance = haveacceptance;
    }

    public Integer getHavelg() {
        return havelg;
    }

    public void setHavelg(Integer havelg) {
        this.havelg = havelg;
    }

    public Integer getHavelc() {
        return havelc;
    }

    public void setHavelc(Integer havelc) {
        this.havelc = havelc;
    }

    public Integer getHaveotherloan() {
        return haveotherloan;
    }

    public void setHaveotherloan(Integer haveotherloan) {
        this.haveotherloan = haveotherloan;
    }

    public String getCustcod() {
        return custcod;
    }

    //popup
    //额度等级
    List<HashMap<String, String>> linegradeList;
    //币种类型
    List<HashMap<String, String>> ccyList;
    //文档标识类型
    List<HashMap<String, String>> flagList;
    //国家风险
    List<HashMap<String, String>> countryList;

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public String getProdtype() {
        return prodtype;
    }

    public void setProdtype(String prodtype) {
        this.prodtype = prodtype;
    }

//    public BigDecimal getHaveLoan() {
//        return HaveLoan;
//    }
//
//    public void setHaveLoan(BigDecimal HaveLoan) {
//        this.HaveLoan = HaveLoan;
//    }
//
//    public BigDecimal getHaveAcceptance() {
//        return HaveAcceptance;
//    }
//
//    public void setHaveAcceptance(BigDecimal HaveAcceptance) {
//        this.HaveAcceptance = HaveAcceptance;
//    }
//
//    public BigDecimal getHaveLG() {
//        return HaveLG;
//    }
//
//    public void setHaveLG(BigDecimal HaveLG) {
//        this.HaveLG = HaveLG;
//    }
//
//    public BigDecimal getHaveLC() {
//        return HaveLC;
//    }

//    public void setHaveLC(BigDecimal HaveLC) {
//        this.HaveLC = HaveLC;
//    }
//
//    public BigDecimal getHaveOtherLoan() {
//        return HaveOtherLoan;
//    }
//
//    public void setHaveOtherLoan(BigDecimal HaveOtherLoan) {
//        this.HaveOtherLoan = HaveOtherLoan;
//    }

    public String getLineno() {
        return lineno;
    }

    public void setLineno(String lineno) {
        this.lineno = lineno;
    }

    public String getLinedesc() {
        return linedesc;
    }

    public void setLinedesc(String linedesc) {
        this.linedesc = linedesc;
    }

    public String getLinegrade() {
        return linegrade;
    }

    public void setLinegrade(String linegrade) {
        this.linegrade = linegrade;
    }

    public String getLinestatus() {
        return linestatus;
    }

    public void setLinestatus(String linestatus) {
        this.linestatus = linestatus;
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

    public Integer getUsedamt() {
        return usedamt;
    }

    public void setUsedamt(Integer usedamt) {
        this.usedamt = usedamt;
    }

    public Integer getOsamt() {
        return osamt;
    }

    public void setOsamt(Integer osamt) {
        this.osamt = osamt;
    }

    public Integer getHoldamt() {
        return holdamt;
    }

    public void setHoldamt(Integer holdamt) {
        this.holdamt = holdamt;
    }

    public Integer getAvliamt() {
        return avliamt;
    }

    public void setAvliamt(Integer avliamt) {
        this.avliamt = avliamt;
    }

    public Integer getReleaseamt() {
        return releaseamt;
    }

    public void setReleaseamt(Integer releaseamt) {
        this.releaseamt = releaseamt;
    }

    public String getBondflag() {
        return bondflag;
    }

    public void setBondflag(String bondflag) {
        this.bondflag = bondflag;
    }

    public Integer getAcceptamt() {
        return acceptamt;
    }

    public void setAcceptamt(Integer acceptamt) {
        this.acceptamt = acceptamt;
    }

    public Integer getLetteramt() {
        return letteramt;
    }

    public void setLetteramt(Integer letteramt) {
        this.letteramt = letteramt;
    }

    public Integer getCreditamt() {
        return creditamt;
    }

    public void setCreditamt(Integer creditamt) {
        this.creditamt = creditamt;
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getRevolflag() {
        return revolflag;
    }

    public void setRevolflag(String revolflag) {
        this.revolflag = revolflag;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public String getCountryrisk() {
        return countryrisk;
    }

    public void setCountryrisk(String countryrisk) {
        this.countryrisk = countryrisk;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrgamt() {
        return orgamt;
    }

    public void setOrgamt(Integer orgamt) {
        this.orgamt = orgamt;
    }

    public String getFluserid() {
        return fluserid;
    }

    public void setFluserid(String fluserid) {
        this.fluserid = fluserid;
    }

    public String getAppflag() {
        return appflag;
    }

    public void setAppflag(String appflag) {
        this.appflag = appflag;
    }

    public List<HashMap<String, String>> getLinegradeList() {
        return linegradeList;
    }

    public void setLinegradeList(List<HashMap<String, String>> linegradeList) {
        this.linegradeList = linegradeList;
    }

    public List<HashMap<String, String>> getCcyList() {
        return ccyList;
    }

    public void setCcyList(List<HashMap<String, String>> ccyList) {
        this.ccyList = ccyList;
    }

    public List<HashMap<String, String>> getFlagList() {
        return flagList;
    }

    public void setFlagList(List<HashMap<String, String>> flagList) {
        this.flagList = flagList;
    }

    public List<HashMap<String, String>> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<HashMap<String, String>> countryList) {
        this.countryList = countryList;
    }
}
