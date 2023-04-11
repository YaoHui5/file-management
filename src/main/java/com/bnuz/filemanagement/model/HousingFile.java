package com.bnuz.filemanagement.model;


import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("个人住房档案")
@Component
public class HousingFile extends BaseBean {

    @ApiParam("产权证号")
    private String uid;

    @ApiParam("房主姓名")
    private String ownerName;

    @ApiParam("性别:0代表男，1代表女")
    private short gender;

    @ApiParam("身份证号")
    private String idCard;

    @ApiParam("电话号码")
    private String phone;

    @ApiParam("工作单位")
    private String workingAddress;

    @ApiParam("房屋坐落")
    private String houseLocation;

    @ApiParam("房屋面积")
    private BigDecimal houseArea;

    @ApiParam("房屋类型")
    private String houseType;

    @ApiParam("购房日期: yyyy-MM-dd")
    private String entryDate;

    @ApiParam("售房单位")
    private String salesUnit;

    @ApiParam("产权过渡数据")
    private String propertyTransition;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
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

    public String getPropertyTransition() {
        return propertyTransition;
    }

    public void setPropertyTransition(String propertyTransition) {
        this.propertyTransition = propertyTransition;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

}
