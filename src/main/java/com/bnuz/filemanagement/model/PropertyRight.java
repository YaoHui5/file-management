package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;

@ApiModel("产权产籍数据")
public class PropertyRight extends BaseBean {

    @ApiParam("id")
    private int id;

    @ApiParam(value = "产权证号")
    private String uid;

    @ApiParam("房屋面积")
    private BigDecimal houseArea;

    @ApiParam("房屋类型")
    private String houseType;

    @ApiParam("房屋坐落")
    private String location;

    @ApiParam("部分产权转全部产权数据")
    private String partToFull;

    @ApiParam("产权过渡数据")
    private String propertyRightData;

    @ApiParam("返还公产数据")
    private String propertyRightRetract;

    @ApiParam("原产权单位")
    private String ownerUnit;

    public String getOwnerUnit() {
        return ownerUnit;
    }

    public void setOwnerUnit(String ownerUnit) {
        this.ownerUnit = ownerUnit;
    }

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

    public String getPropertyRightData() {
        return propertyRightData;
    }

    public void setPropertyRightData(String propertyRightData) {
        this.propertyRightData = propertyRightData;
    }

    public String getPropertyRightRetract() {
        return propertyRightRetract;
    }

    public void setPropertyRightRetract(String propertyRightRetract) {
        this.propertyRightRetract = propertyRightRetract;
    }


}
