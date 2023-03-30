package com.bnuz.filemanagement.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@ApiModel("申请人")
@Component
public class Applicant {
    private int id;

//    @ApiModelProperty("申请人姓名")
    private String name;

    private String  idCard;

    private String phone;

    private short gender;

    private String workingAddress;

    private String mateName;

    private String mateIdCard;

//    private String uid;
//
//    private String salesUnit;




//    public String getUid() {
//        return uid;
//    }
//
//    public void setUid(String uid) {
//        this.uid = uid;
//    }
//
//
//    public String getSalesUnit() {
//        return salesUnit;
//    }
//
//    public void setSalesUnit(String salesUnit) {
//        this.salesUnit = salesUnit;
//    }


    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public String getMateIdCard() {
        return mateIdCard;
    }

    public void setMateIdCard(String mateIdCard) {
        this.mateIdCard = mateIdCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getMateName() {
        return mateName;
    }

    public void setMateName(String mateName) {
        this.mateName = mateName;
    }


}
