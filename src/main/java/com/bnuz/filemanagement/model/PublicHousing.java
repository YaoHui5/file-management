package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.util.Date;

@ApiModel("个人购单位公房档案")
public class PublicHousing extends BaseBean {

    @ApiParam("id")
    private  int id;

    @ApiParam("产权证号")
    private  String uid;

    @ApiParam("申请人姓名")
    private String applicantName;

    @ApiParam("身份证号")
    private String idCard;

    @ApiParam("工作单位")
    private String workingAddress;

    @ApiParam("购房日期")
    private Date entryDate;

    @ApiParam("售房单位")
    private String salesUnit;

    @ApiParam("房屋类型")
    private String houseType;



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

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
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


}
