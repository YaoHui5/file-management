package com.bnuz.filemanagement.model;


import com.bnuz.filemanagement.common.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Component;

@ApiModel("管理员")
@Component
public class Admin extends BaseBean {


    private String adminName;

    private String password;

    @ApiParam("帐号状态：0代表正常，1代表停用")
    private short status;

    @ApiParam("身份")
    private String identity;

    @ApiParam("备注")
    private String note;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
