package com.ecsolutions.entity;

/**
 * Created by ecs on 2017/8/9.
 */
public class LoanCorporateMajorIssues_Entity {
    private String id;
    private String custCode;
    private String IssueRecordSeqNo;
    private String IssueDescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getIssueRecordSeqNo() {
        return IssueRecordSeqNo;
    }

    public void setIssueRecordSeqNo(String issueRecordSeqNo) {
        IssueRecordSeqNo = issueRecordSeqNo;
    }

    public String getIssueDescription() {
        return IssueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        IssueDescription = issueDescription;
    }
}
