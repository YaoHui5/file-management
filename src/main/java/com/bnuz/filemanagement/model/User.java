package com.bnuz.filemanagement.model;

import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

public class User extends BaseBean {

    @ApiParam("用户名")
    private String username;
    @ApiParam("密码")
    private String password;

    @ApiParam("性别")
    private short gender;

    @ApiParam("身份信息")
    private String identity;

    @ApiParam("账号状态：0代表正常状态，1代表停用状态")
    private short status;

    @ApiParam("组别")
    private int group;

    @ApiParam("备注")
    private String note;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    //    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + super.getId() +
//                ", username='" + username + '\'' +
//                ", password='" + password +
//                '}';
//    }


}
