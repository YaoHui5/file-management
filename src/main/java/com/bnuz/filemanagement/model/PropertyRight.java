package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("产权产籍数据")
public class PropertyRight extends BaseBean {

    @ApiParam(value = "产权证号")
    private String houseId;

    @ApiParam("产权人姓名")
    private String ownerName;

    @ApiParam("原产权单位")
    private String originalUnit;


    @ApiParam("房屋面积")
    private BigDecimal houseArea;

    @ApiParam("房屋类型")
    private String houseType;

    @ApiParam("房屋坐落")
    private String location;

    @ApiParam("部分产权转全部产权数据")
    private String partToFull;

//    @ApiParam("产权过渡数据")
//    private String propertyRightData;

    @ApiParam("返还公产数据")
    private String propertyRightRetract;

    @ApiParam("产权证日期: yyyy-MM-dd")
    private String property_right_date;



    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPartToFull() {
        return partToFull;
    }

    public void setPartToFull(String partToFull) {
        this.partToFull = partToFull;
    }

    public String getPropertyRightRetract() {
        return propertyRightRetract;
    }

    public void setPropertyRightRetract(String propertyRightRetract) {
        this.propertyRightRetract = propertyRightRetract;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOriginalUnit() {
        return originalUnit;
    }

    public void setOriginalUnit(String originalUnit) {
        this.originalUnit = originalUnit;
    }

    public String getProperty_right_date() {
        return property_right_date;
    }

    public void setProperty_right_date(String property_right_date) {
        this.property_right_date = property_right_date;
    }
}
