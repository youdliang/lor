package com.ecsolutions.entity;

/**
 * Created by ecs on 2017/8/17.
 */
public class LoanBusinessPersonInfo_Entity {
    private String custCode;
    private String BusinessCerficateID;
    private String BusinessDescription;
    private String BusinessOpeningDate;
    private String BusinessRegisterDate;
    private String BusinessRegisterLocation;
    private String InformationChannelCategory;
    private String InformationChannelDescription;
    private String NumberOfEmployee;

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getBusinessCerficateID() {
        return BusinessCerficateID;
    }

    public void setBusinessCerficateID(String businessCerficateID) {
        BusinessCerficateID = businessCerficateID;
    }

    public String getBusinessDescription() {
        return BusinessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        BusinessDescription = businessDescription;
    }

    public String getBusinessOpeningDate() {
        return BusinessOpeningDate;
    }

    public void setBusinessOpeningDate(String businessOpeningDate) {
        BusinessOpeningDate = businessOpeningDate;
    }

    public String getBusinessRegisterDate() {
        return BusinessRegisterDate;
    }

    public void setBusinessRegisterDate(String businessRegisterDate) {
        BusinessRegisterDate = businessRegisterDate;
    }

    public String getBusinessRegisterLocation() {
        return BusinessRegisterLocation;
    }

    public void setBusinessRegisterLocation(String businessRegisterLocation) {
        BusinessRegisterLocation = businessRegisterLocation;
    }

    public String getInformationChannelCategory() {
        return InformationChannelCategory;
    }

    public void setInformationChannelCategory(String informationChannelCategory) {
        InformationChannelCategory = informationChannelCategory;
    }

    public String getInformationChannelDescription() {
        return InformationChannelDescription;
    }

    public void setInformationChannelDescription(String informationChannelDescription) {
        InformationChannelDescription = informationChannelDescription;
    }

    public String getNumberOfEmployee() {
        return NumberOfEmployee;
    }

    public void setNumberOfEmployee(String numberOfEmployee) {
        NumberOfEmployee = numberOfEmployee;
    }
}
