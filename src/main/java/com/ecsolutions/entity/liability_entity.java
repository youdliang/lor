package com.ecsolutions.entity;

import java.util.Random;

/**
 * Created by ecs on 2017/8/16.
 */
public class liability_entity {
    private String custcode = "14942";
    private String loanamount;
    private String balance;
    private String creditorname;
    private String loandate;
    private String duedate;
    private String paymentmethod;
    private String installmentamount;
    private String isoverdue;
    private String overdueamount;
    private String memo1;

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount;
    }

    public String getCreditorname() {
        return creditorname;
    }

    public void setCreditorname(String creditorname) {
        this.creditorname = creditorname;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getInstallmentamount() {
        return installmentamount;
    }

    public void setInstallmentamount(String installmentamount) {
        this.installmentamount = installmentamount;
    }

    public String getIsoverdue() {
        return isoverdue;
    }

    public void setIsoverdue(String isoverdue) {
        this.isoverdue = isoverdue;
    }

    public String getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(String overdueamount) {
        this.overdueamount = overdueamount;
    }

    public String getMemo1() {
        return memo1;
    }

    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }
}
