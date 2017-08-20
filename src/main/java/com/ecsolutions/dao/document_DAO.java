package com.ecsolutions.dao;

import com.ecsolutions.entity.document_entity;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ecs on 2017/7/28.
 */
public interface document_DAO{

        // select lineDesc
        @Select("SELECT distinct lineDesc FROM loanapplicantfacilityinfo where rownum = 1")
        @ResultType(String.class)
        String getLineDesc();

        //check line_no
        @Select("SELECT count(*) FROM loanapplicantfacilityinfo WHERE custcod = #{custcode} and lineno = #{line_no}")
        @ResultType(String.class)
        String checklineno(@Param("line_no") String line_no, @Param("custcode") String custcode);

        // select by custcode
        @Select("SELECT * FROM LoanDocumentationDetailsInfo WHERE TRIM(custcode) = TRIM(#{custcode})")
        @ResultType(document_entity.class)
        List<document_entity> getDocInfo(String custcode);

        //根据文档号docNo删除文档信息
        @Delete("delete from LoanDocumentationDetailsInfo where docNo=#{docNo}")
        void delete(String docNo);

        @Insert("insert into LoanDocumentationDetailsInfo(custcode,line_no,lineDesc,docNo,doctype,descripe,docName,imageTag,physicalAddr,recieveInd,reciveDate,effectivedate,ExpiryDate,requesttype,approvaldate,loanId,docDirName,fileName,isScanUploadId,receiveddate) "
                +"values(#{custcode,jdbcType=VARCHAR},#{line_no,jdbcType=VARCHAR},#{lineDesc,jdbcType=VARCHAR},#{docNo,jdbcType=VARCHAR},#{doctype,jdbcType=NUMERIC},#{descripe,jdbcType=VARCHAR},#{docName,jdbcType=VARCHAR},#{imageTag,jdbcType=VARCHAR},#{physicalAddr,jdbcType=VARCHAR},"
                +"#{recieveInd,jdbcType=VARCHAR},to_date(#{reciveDate,jdbcType=VARCHAR},'yyyymmdd'),to_date(#{effectivedate,jdbcType=VARCHAR},'yyyymmdd'),to_date(#{expirydate,jdbcType=VARCHAR},'yyyymmdd'),#{requesttype,jdbcType=NUMERIC},to_date(#{approvaldate,jdbcType=VARCHAR},'yyyymmdd'),#{loanId,jdbcType=NUMERIC},"
                +"#{docDirName,jdbcType=VARCHAR},#{fileName,jdbcType=VARCHAR},#{isScanUploadId,jdbcType=NUMERIC},to_date(#{receiveddate,jdbcType=VARCHAR}))")
        void insert(document_entity document_entity);
}
