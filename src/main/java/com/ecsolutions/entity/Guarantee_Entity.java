package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Guarantee_Entity {
    public Guarantee_Entity(){};
    public Guarantee_Entity(String custcode){
        this.custcod=custcode;
    };
    public Guarantee_Entity(String custcode, String personlFlag){
        this.custcod=custcode;
        this.personalFlag=personlFlag;
    };
    private String id;
    private String custcod;
    private String personalFlag;
    private String line_no ;
    private String ContractSymbol;
    private String SignedDate;
    private String Ethnic;
    private String lastName;//企业中代表保证人名称，个人中代表保证人中文名称
    private String bizRegNo;//企业独有属性
    private String pIdNo;//企业中代表营业执照号码，个人中代表保证人证件代码
    private String registeredAMLCCY;//企业独有属性
    private String registeredAML;//企业独有属性
    private String custType;//企业中代表企业规模，个人中代表保证人证件类型
    private String Mode1;
    private String AmountCCY;
    private String Amount;
    private String Type;
    private String BeginDate;
    private String EndDate;
    private String ShareScale;
    private String Remark;
    private String WorkUnits;//个人独有属性，代表保证人工作单位
    private String WorkUnitsCharacter;//个人独有属性，代表保证人工作单位性质

    public List<HashMap<String,String>> PidTypeList;
    public List<HashMap<String,String>> line_noList;
    public List<HashMap<String,String>> dataTable;

    public List<HashMap<String, String>> getPidTypeList() {
        return PidTypeList;
    }

    public void setPidTypeList(List<HashMap<String, String>> pidTypeList) {
        PidTypeList = pidTypeList;
    }



    public List<HashMap<String, String>> getDataTable() {
        return dataTable;
    }

    public void setDataTable(List<HashMap<String, String>> dataTable) {
        this.dataTable = dataTable;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCustcod() {
        return custcod;
    }

    public void setCustcod(String custcod) {
        this.custcod = custcod;
    }

    public List<HashMap<String, String>> getLine_noList() {
        return line_noList;
    }

    public void setLine_noList(List<HashMap<String, String>> line_noList) {
        this.line_noList = line_noList;
    }

    public String getWorkUnits() {
        return WorkUnits;
    }

    public void setWorkUnits(String workUnits) {
        WorkUnits = workUnits;
    }

    public String getWorkUnitsCharacter() {
        return WorkUnitsCharacter;
    }

    public void setWorkUnitsCharacter(String workUnitsCharacter) {
        WorkUnitsCharacter = workUnitsCharacter;
    }

    public String getPersonalFlag() {
        return personalFlag;
    }

    public void setPersonalFlag(String personalFlag) {
        this.personalFlag = personalFlag;
    }

    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    public String getContractSymbol() {
        return ContractSymbol;
    }

    public void setContractSymbol(String contractSymbol) {
        ContractSymbol = contractSymbol;
    }

    public String getSignedDate() {
        return SignedDate;
    }

    public void setSignedDate(String signedDate) {
        SignedDate = signedDate;
    }

    public String getEthnic() {
        return Ethnic;
    }

    public void setEthnic(String ethnic) {
        Ethnic = ethnic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBizRegNo() {
        return bizRegNo;
    }

    public void setBizRegNo(String bizRegNo) {
        this.bizRegNo = bizRegNo;
    }

    public String getpIdNo() {
        return pIdNo;
    }

    public void setpIdNo(String pIdNo) {
        this.pIdNo = pIdNo;
    }

    public String getRegisteredAMLCCY() {
        return registeredAMLCCY;
    }

    public void setRegisteredAMLCCY(String registeredAMLCCY) {
        this.registeredAMLCCY = registeredAMLCCY;
    }

    public String getRegisteredAML() {
        return registeredAML;
    }

    public void setRegisteredAML(String registeredAML) {
        this.registeredAML = registeredAML;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getMode1() {
        return Mode1;
    }

    public void setMode1(String mode1) {
        Mode1 = mode1;
    }

    public String getAmountCCY() {
        return AmountCCY;
    }

    public void setAmountCCY(String amountCCY) {
        AmountCCY = amountCCY;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(String beginDate) {
        BeginDate = beginDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getShareScale() {
        return ShareScale;
    }

    public void setShareScale(String shareScale) {
        ShareScale = shareScale;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }


}
