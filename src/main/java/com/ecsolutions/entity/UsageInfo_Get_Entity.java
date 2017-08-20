package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;


/**
 * Created by Administrator on 2017/6/29.
 */
public class UsageInfo_Get_Entity {
    private String Loan_RefNo;
    private String Line_No;
    private String Line_desc="test";
    private String Line_CCY="RMB";
    private String Line_AMT="10000.00";
    private String AvaLine_AMT="10000.00";
    private List<String> Prod_Type;
    private List<String> docFlag;
    private List<HashMap<String,String>> Officer;

    public String getLoan_RefNo() {
        return Loan_RefNo;
    }

    public void setLoan_RefNo(String loan_RefNo) {
        Loan_RefNo = loan_RefNo;
    }

    public String getLine_No() {
        return Line_No;
    }

    public void setLine_No(String line_No) {
        Line_No = line_No;
    }

    public String getLine_desc() {
        return Line_desc;
    }

    public void setLine_desc(String line_desc) {
        Line_desc = line_desc;
    }

    public String getLine_CCY() {
        return Line_CCY;
    }

    public void setLine_CCY(String line_CCY) {
        Line_CCY = line_CCY;
    }

    public String getLine_AMT() {
        return Line_AMT;
    }

    public void setLine_AMT(String line_AMT) {
        Line_AMT = line_AMT;
    }

    public String getAvaLine_AMT() {
        return AvaLine_AMT;
    }

    public void setAvaLine_AMT(String avaLine_AMT) {
        AvaLine_AMT = avaLine_AMT;
    }

    public List<String> getProd_Type() {
        return Prod_Type;
    }

    public void setProd_Type(List<String> prod_Type) {
        Prod_Type = prod_Type;
    }

    public List<String> getDocFlag() {
        return docFlag;
    }

    public void setDocFlag(List<String> docFlag) {
        this.docFlag = docFlag;
    }

    public List<HashMap<String, String>> getOfficer() {
        return Officer;
    }

    public void setOfficer(List<HashMap<String, String>> officer) {
        Officer = officer;
    }
}
