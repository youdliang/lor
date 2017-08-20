package com.ecsolutions.dao;

import com.ecsolutions.entity.LoanCorporateCertificates_Entity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ecs on 2017/7/27.
 */
@Repository
public interface LoanCorporateCertificates_DAO {

    @Insert("insert into LoanCorporateCertificates(" +
            "CustCode," +
            "NTRegistraCertificateNum," +
            "NTRegistraCertificatePeriod," +
            "NTRegistraCertificateStartDate," +
            "NTRegistraCertificateEndDate," +
            "GRRegistraCertificateNumber," +
            "GRRegistraCertificatePeriod," +
            "GRRegistraCertificateStartDate," +
            "GRRegistraCertificateEndDate," +
            "OCCertificateNumber," +
            "OCCertificateRegisterNumber," +
            "OCCertificateExpiryDate," +
            "BAOpenPermissionNumber," +
            "BAOpenPermissionApprovalNumber," +
            "BAOpenPermissionIssueDate," +
            "BAOpenPermissionBank," +
            "BAOpenPermissionAccountNumber," +
            "PSUAPCertificateNumber," +
            "PSUAPCertificateIssuedBy," +
            "PSUAPCertificateCertificateNum," +
            "PSUAPCertificateLegalRepresen," +
            "PSUAPCertificateFundSource," +
            "PSUAPCertificateInitialFund," +
            "PSUAPCertificateOrganizer," +
            "PSUAPCertificateAddress," +
            "PSUAPCertificateRMOrganization," +
            "PSUAPCertificatePeriod," +
            "PSUAPCertificateStartDate," +
            "PSUAPCertificateEndDate," +
            "PSUAPCertificatePurposeASOfB," +
            "FCompanyCertificateNumber," +
            "FCApprovalNumber," +
            "FCImportExportEnterpriseCode," +
            "FCApprovalDate," +
            "FCYearsOfBusiness," +
            "FCTotalInvestment," +
            "IExportLicenceNumber," +
            "IExportRecordNumber," +
            "IExportEnterpriseCode," +
            "IExportRegistrationAuthority," +
            "FERegistrationCertificateNum," +
            "FERegistrationNumber," +
            "FERegistrationDate," +
            "FERegistrationOrganization," +
            "FExchangeAccountType," +
            "FExchangeCeilingAmount," +
            "FExchangeApprovalNumber," +
            "FExchangeBankOfAccount," +
            "FExchangeOpenDate " +
            ") " +
            "values (" +
            "#{CustCode,jdbcType=VARCHAR}," +
            "#{NTRegistraCertificateNum,jdbcType=VARCHAR}," +
            "#{NTRegistraCertificatePeriod,jdbcType=VARCHAR}," +
            "#{NTRegistraCertificateStartDate,jdbcType=VARCHAR}," +
            "#{NTRegistraCertificateEndDate,jdbcType=VARCHAR}," +
            "#{GRRegistraCertificateNumber,jdbcType=VARCHAR}," +
            "#{GRRegistraCertificatePeriod,jdbcType=VARCHAR}," +
            "#{GRRegistraCertificateStartDate,jdbcType=VARCHAR}," +
            "#{GRRegistraCertificateEndDate,jdbcType=VARCHAR}," +
            "#{OCCertificateNumber,jdbcType=VARCHAR}," +
            "#{OCCertificateRegisterNumber,jdbcType=VARCHAR}," +
            "#{OCCertificateExpiryDate,jdbcType=VARCHAR}," +
            "#{BAOpenPermissionNumber,jdbcType=VARCHAR}," +
            "#{BAOpenPermissionApprovalNumber,jdbcType=VARCHAR}," +
            "#{BAOpenPermissionIssueDate,jdbcType=VARCHAR}," +
            "#{BAOpenPermissionBank,jdbcType=VARCHAR}," +
            "#{BAOpenPermissionAccountNumber,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateNumber,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateIssuedBy,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateCertificateNum,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateLegalRepresen,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateFundSource,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateInitialFund,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateOrganizer,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateAddress,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateRMOrganization,jdbcType=VARCHAR}," +
            "#{PSUAPCertificatePeriod,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateStartDate,jdbcType=VARCHAR}," +
            "#{PSUAPCertificateEndDate,jdbcType=VARCHAR}," +
            "#{PSUAPCertificatePurposeASOfB,jdbcType=VARCHAR}," +
            "#{FCompanyCertificateNumber,jdbcType=VARCHAR}," +
            "#{FCApprovalNumber,jdbcType=VARCHAR}," +
            "#{FCImportExportEnterpriseCode,jdbcType=VARCHAR}," +
            "#{FCApprovalDate,jdbcType=VARCHAR}," +
            "#{FCYearsOfBusiness,jdbcType=VARCHAR}," +
            "#{FCTotalInvestment,jdbcType=VARCHAR}," +
            "#{IExportLicenceNumber,jdbcType=VARCHAR}," +
            "#{IExportRecordNumber,jdbcType=VARCHAR}," +
            "#{IExportEnterpriseCode,jdbcType=VARCHAR}," +
            "#{IExportRegistrationAuthority,jdbcType=VARCHAR}," +
            "#{FERegistrationCertificateNum,jdbcType=VARCHAR}," +
            "#{FERegistrationNumber,jdbcType=VARCHAR}," +
            "#{FERegistrationDate,jdbcType=VARCHAR}," +
            "#{FERegistrationOrganization,jdbcType=VARCHAR}," +
            "#{FExchangeAccountType,jdbcType=VARCHAR}," +
            "#{FExchangeCeilingAmount,jdbcType=VARCHAR}," +
            "#{FExchangeApprovalNumber,jdbcType=VARCHAR}," +
            "#{FExchangeBankOfAccount,jdbcType=VARCHAR}," +
            "#{FExchangeOpenDate,jdbcType=VARCHAR}" +
            ")")
    @ResultType(Boolean.class)
    public boolean save(LoanCorporateCertificates_Entity entity);

    @Select("SELECT COUNT(*) FROM LoanCorporateCertificates")
    @ResultType(Integer.class)
    Integer countAll();

    @Select("SELECT * FROM LoanCorporateCertificates")
    @ResultType(LoanCorporateCertificates_Entity.class)
    List<LoanCorporateCertificates_Entity> findAll();

    @Update("Update LoanCorporateCertificates " +
            "SET " +
            "CustCode="+"#{CustCode,jdbcType=VARCHAR}," +
            "NTRegistraCertificateNum="+"#{NTRegistraCertificateNum,jdbcType=VARCHAR}," +
            "NTRegistraCertificatePeriod="+"#{NTRegistraCertificatePeriod,jdbcType=VARCHAR}," +
            "NTRegistraCertificateStartDate="+"#{NTRegistraCertificateStartDate,jdbcType=VARCHAR}," +
            "NTRegistraCertificateEndDate="+"#{NTRegistraCertificateEndDate,jdbcType=VARCHAR}," +
            "GRRegistraCertificateNumber="+"#{GRRegistraCertificateNumber,jdbcType=VARCHAR}," +
            "GRRegistraCertificatePeriod="+"#{GRRegistraCertificatePeriod,jdbcType=VARCHAR}," +
            "GRRegistraCertificateStartDate="+"#{GRRegistraCertificateStartDate,jdbcType=VARCHAR}," +
            "GRRegistraCertificateEndDate="+"#{GRRegistraCertificateEndDate,jdbcType=VARCHAR}," +
            "OCCertificateNumber="+"#{OCCertificateNumber,jdbcType=VARCHAR}," +
            "OCCertificateRegisterNumber="+"#{OCCertificateRegisterNumber,jdbcType=VARCHAR}," +
            "OCCertificateExpiryDate="+"#{OCCertificateExpiryDate,jdbcType=VARCHAR}," +
            "BAOpenPermissionNumber="+"#{BAOpenPermissionNumber,jdbcType=VARCHAR}," +
            "BAOpenPermissionApprovalNumber="+"#{BAOpenPermissionApprovalNumber,jdbcType=VARCHAR}," +
            "BAOpenPermissionIssueDate="+"#{BAOpenPermissionIssueDate,jdbcType=VARCHAR}," +
            "BAOpenPermissionBank="+"#{BAOpenPermissionBank,jdbcType=VARCHAR}," +
            "BAOpenPermissionAccountNumber="+"#{BAOpenPermissionAccountNumber,jdbcType=VARCHAR}," +
            "PSUAPCertificateNumber="+"#{PSUAPCertificateNumber,jdbcType=VARCHAR}," +
            "PSUAPCertificateIssuedBy="+"#{PSUAPCertificateIssuedBy,jdbcType=VARCHAR}," +
            "PSUAPCertificateCertificateNum="+"#{PSUAPCertificateCertificateNum,jdbcType=VARCHAR}," +
            "PSUAPCertificateLegalRepresen="+"#{PSUAPCertificateLegalRepresen,jdbcType=VARCHAR}," +
            "PSUAPCertificateFundSource="+"#{PSUAPCertificateFundSource,jdbcType=VARCHAR}," +
            "PSUAPCertificateInitialFund="+"#{PSUAPCertificateInitialFund,jdbcType=VARCHAR}," +
            "PSUAPCertificateOrganizer="+"#{PSUAPCertificateOrganizer,jdbcType=VARCHAR}," +
            "PSUAPCertificateAddress="+"#{PSUAPCertificateAddress,jdbcType=VARCHAR}," +
            "PSUAPCertificateRMOrganization="+"#{PSUAPCertificateRMOrganization,jdbcType=VARCHAR}," +
            "PSUAPCertificatePeriod="+"#{PSUAPCertificatePeriod,jdbcType=VARCHAR}," +
            "PSUAPCertificateStartDate="+"#{PSUAPCertificateStartDate,jdbcType=VARCHAR}," +
            "PSUAPCertificateEndDate="+"#{PSUAPCertificateEndDate,jdbcType=VARCHAR}," +
            "PSUAPCertificatePurposeASOfB="+"#{PSUAPCertificatePurposeASOfB,jdbcType=VARCHAR}," +
            "FCompanyCertificateNumber="+"#{FCompanyCertificateNumber,jdbcType=VARCHAR}," +
            "FCApprovalNumber="+"#{FCApprovalNumber,jdbcType=VARCHAR}," +
            "FCImportExportEnterpriseCode="+"#{FCImportExportEnterpriseCode,jdbcType=VARCHAR}," +
            "FCApprovalDate="+"#{FCApprovalDate,jdbcType=VARCHAR}," +
            "FCYearsOfBusiness="+"#{FCYearsOfBusiness,jdbcType=VARCHAR}," +
            "FCTotalInvestment="+"#{FCTotalInvestment,jdbcType=VARCHAR}," +
            "IExportLicenceNumber="+"#{IExportLicenceNumber,jdbcType=VARCHAR}," +
            "IExportRecordNumber="+"#{IExportRecordNumber,jdbcType=VARCHAR}," +
            "IExportEnterpriseCode="+"#{IExportEnterpriseCode,jdbcType=VARCHAR}," +
            "IExportRegistrationAuthority="+"#{IExportRegistrationAuthority,jdbcType=VARCHAR}," +
            "FERegistrationCertificateNum="+"#{FERegistrationCertificateNum,jdbcType=VARCHAR}," +
            "FERegistrationNumber="+"#{FERegistrationNumber,jdbcType=VARCHAR}," +
            "FERegistrationDate="+"#{FERegistrationDate,jdbcType=VARCHAR}," +
            "FERegistrationOrganization="+"#{FERegistrationOrganization,jdbcType=VARCHAR}," +
            "FExchangeAccountType="+"#{FExchangeAccountType,jdbcType=VARCHAR}," +
            "FExchangeCeilingAmount="+"#{FExchangeCeilingAmount,jdbcType=VARCHAR}," +
            "FExchangeApprovalNumber="+"#{FExchangeApprovalNumber,jdbcType=VARCHAR}," +
            "FExchangeBankOfAccount="+"#{FExchangeBankOfAccount,jdbcType=VARCHAR}," +
            "FExchangeOpenDate="+"#{FExchangeOpenDate,jdbcType=VARCHAR}" +
            "  Where CustCode=" + "#{CustCode,jdbcType=VARCHAR}"
    )
    @ResultType(Boolean.class)
    boolean update(LoanCorporateCertificates_Entity entity);

    @Delete("DELETE FROM LoanCorporateCertificates Where custcode=" + "#{CustCode,jdbcType=VARCHAR}")
        boolean delete(String CustCode);

}
