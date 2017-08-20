package com.ecsolutions.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/8/9.
 */
public class LoanCorporateLitigationInfo_Entity {
    private String Id;
    private String custCode;
    private String EnforcementResult;
    private String JudgmentEnforcementccy;
    private String JudgmentEnforcementAmount;
    private String JudgmentEnforcementDate;
    private String Prosecutor;
    private String IndictedReason;
    private String IndictedRecordSeqNo;
    private List<HashMap<String, String>> ccyInfoList;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getEnforcementResult() {
        return EnforcementResult;
    }

    public void setEnforcementResult(String enforcementResult) {
        EnforcementResult = enforcementResult;
    }

    public String getJudgmentEnforcementccy() {
        return JudgmentEnforcementccy;
    }

    public void setJudgmentEnforcementccy(String judgmentEnforcementccy) {
        JudgmentEnforcementccy = judgmentEnforcementccy;
    }

    public String getJudgmentEnforcementAmount() {
        return JudgmentEnforcementAmount;
    }

    public void setJudgmentEnforcementAmount(String judgmentEnforcementAmount) {
        JudgmentEnforcementAmount = judgmentEnforcementAmount;
    }

    public String getJudgmentEnforcementDate() {
        return JudgmentEnforcementDate;
    }

    public void setJudgmentEnforcementDate(String judgmentEnforcementDate) {
        JudgmentEnforcementDate = judgmentEnforcementDate;
    }

    public String getProsecutor() {
        return Prosecutor;
    }

    public void setProsecutor(String prosecutor) {
        Prosecutor = prosecutor;
    }

    public String getIndictedReason() {
        return IndictedReason;
    }

    public void setIndictedReason(String indictedReason) {
        IndictedReason = indictedReason;
    }

    public String getIndictedRecordSeqNo() {
        return IndictedRecordSeqNo;
    }

    public void setIndictedRecordSeqNo(String indictedRecordSeqNo) {
        IndictedRecordSeqNo = indictedRecordSeqNo;
    }

    public List<HashMap<String, String>> getCcyInfoList() {
        return ccyInfoList;
    }

    public void setCcyInfoList(List<HashMap<String, String>> ccyInfoList) {
        this.ccyInfoList = ccyInfoList;
    }
}
