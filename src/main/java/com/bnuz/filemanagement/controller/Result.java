package com.bnuz.filemanagement.controller;

import com.bnuz.filemanagement.common.ResultCode;

public class Result{

    private int code;       //状态码

    private String message;

    private Object data;         //数据


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Result(){

    }

    public Result(int code,String message,Object data){

    }

    public Result(int code,String message){

    }

    public static Result success(Object data){
       Result result = new Result();
       result.setCode(ResultCode.SUCCESS.getCode());
       result.setMessage(ResultCode.SUCCESS.getMessage());
       result.setData(data);
       return result;
    }

    public static Result success(){
        return success(null);
    }


    public static Result fail(int code,String message){
        return new Result(code,message,null);
    }


    public static Result fail(String message){
        return new Result(ResultCode.FAILED.getCode(),message);
    }

    public static Result fail(){
        return new Result(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage());
    }



}
