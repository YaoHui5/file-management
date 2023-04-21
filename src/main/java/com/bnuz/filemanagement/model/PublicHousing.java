package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("个人购单位公房档案")
public class PublicHousing extends BaseBean {

    @ApiParam("产权证号")
    private  String houseId;

    @ApiParam("申请人姓名")
    private String applicantName;

    @ApiParam("身份证号")
    private String idCard;

    @ApiParam("工作单位")
    private String workingAddress;

    @ApiParam("购单位公房日期: yyyy-MM-dd")
    private String entryDate;

    @ApiParam("售房单位")
    private String salesUnit;

    @ApiParam("房屋类型")
    private String houseType;

    @ApiParam("购房价格")
    private BigDecimal housePrice;

    @ApiParam("产权过渡状态：0代表未完成，1代表已完成")
    private short propertyTransitionStatus;



    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public BigDecimal getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(BigDecimal housePrice) {
        this.housePrice = housePrice;
    }

    public short getPropertyTransitionStatus() {
        return propertyTransitionStatus;
    }

    public void setPropertyTransitionStatus(short propertyTransitionStatus) {
        this.propertyTransitionStatus = propertyTransitionStatus;
    }
}
