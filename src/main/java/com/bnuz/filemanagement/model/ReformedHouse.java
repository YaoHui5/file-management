package com.bnuz.filemanagement.model;

import java.math.BigDecimal;
import java.util.Date;

public class ReformedHouse {

    private int id;

    private String uid;     //房产证号

    private String realtyName;      //房产单位

    private String houseLocation;   //房屋座落

    private BigDecimal houseArea;   //面积

    private String houseType;   //房改类型

    private BigDecimal housePrice;  //售价

    private BigDecimal houseCost;   //成本

    private Date reformedDate;      //房改日期

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
