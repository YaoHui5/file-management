package com.bnuz.filemanagement.model;

import java.math.BigDecimal;

public class PropertyRight {

    private int id;

    private String uid;

    private BigDecimal houseArea;

    private String houseType;

    private String location;

    private String partToFull;

    private String propertyRightData;

    private String propertyRightRetract;

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
