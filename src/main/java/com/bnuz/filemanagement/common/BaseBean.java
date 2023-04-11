package com.bnuz.filemanagement.common;

import io.swagger.annotations.ApiParam;

public class BaseBean {

    @ApiParam(value = "id")
    int id;

//    String uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getUid() {
//        return uid;
//    }
//
//    public void setUid(String uid) {
//        this.uid = uid;
//    }
}
