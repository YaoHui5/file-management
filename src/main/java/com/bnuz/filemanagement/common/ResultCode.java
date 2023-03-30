package com.bnuz.filemanagement.common;

public enum ResultCode {

    SUCCESS(200,"成功"),
    FAILED(400,"失败"),
    ;

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    ResultCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }

//    public Integer code(){
//        return this.code;
//    }
//
//    public String message(){
//        return this.message;
//    }
}
