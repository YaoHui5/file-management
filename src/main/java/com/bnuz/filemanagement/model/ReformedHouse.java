package com.bnuz.filemanagement.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("单位公房房改简况")
public class ReformedHouse {

    @ApiParam("id")
    private int id;

    @ApiParam("房产证号")
    private String uid;     //房产证号

    @ApiParam("房产单位")
    private String realtyName;      //房产单位

    @ApiParam("房屋坐落")
    private String houseLocation;   //房屋座落

    @ApiParam("房屋面积")
    private BigDecimal houseArea;   //面积

    @ApiParam("房屋类型")
    private String houseType;   //房改类型

    @ApiParam("房屋售价")
    private BigDecimal housePrice;  //售价

    @ApiParam("房屋成本")
    private BigDecimal houseCost;   //成本

    @ApiParam("房改日期")
    private Date reformedDate;      //房改日期

    @ApiParam("是否超出标准数据")
    private Boolean outStandard;    //是否超出标准数据



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRealtyName() {
        return realtyName;
    }

    public void setRealtyName(String realtyName) {
        this.realtyName = realtyName;
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

    public BigDecimal getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(BigDecimal housePrice) {
        this.housePrice = housePrice;
    }

    public BigDecimal getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(BigDecimal houseCost) {
        this.houseCost = houseCost;
    }

    public Date getReformedDate() {
        return reformedDate;
    }

    public void setReformedDate(Date reformedDate) {
        this.reformedDate = reformedDate;
    }

    public Boolean getOutStandard() {
        return outStandard;
    }

    public void setOutStandard(Boolean outStandard) {
        this.outStandard = outStandard;
    }





}
