package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("单位公房房改简况")
public class ReformedHouse extends BaseBean {

    @ApiParam("原产权单位")
    private String originalUnit;

    @ApiParam("房产证号")
    private String houseId;

    @ApiParam("售房单位")
    private String salesUnit;

    @ApiParam("房屋坐落")
    private String houseLocation;

    @ApiParam("房屋面积")
    private BigDecimal houseArea;

    @ApiParam("房屋类型")
    private String houseType;

    @ApiParam("房屋售价")
    private BigDecimal housePrice;

    @ApiParam("房屋成本")
    private BigDecimal houseCost;

    @ApiParam("房改日期: yyyy-MM-dd")
    private String reformedDate;

    @ApiParam("是否超出标准数据：0代表未超出，1代表已超出")
    private short outStandard;

    @ApiParam("产权过渡数据")
    private String propertyTransitionData;


    public String getOriginalUnit() {
        return originalUnit;
    }

    public void setOriginalUnit(String originalUnit) {
        this.originalUnit = originalUnit;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
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

    public String getReformedDate() {
        return reformedDate;
    }

    public void setReformedDate(String reformedDate) {
        this.reformedDate = reformedDate;
    }

    public short getOutStandard() {
        return outStandard;
    }

    public void setOutStandard(short outStandard) {
        this.outStandard = outStandard;
    }

    public String getPropertyTransitionData() {
        return propertyTransitionData;
    }

    public void setPropertyTransitionData(String propertyTransitionData) {
        this.propertyTransitionData = propertyTransitionData;
    }
}
