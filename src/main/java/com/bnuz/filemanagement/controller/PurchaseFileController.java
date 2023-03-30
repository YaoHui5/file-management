package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.PurchaseFile;
import com.bnuz.filemanagement.service.PurchaseFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "购房档案数据接口")
@RestController
@RequestMapping("/purchasefile")
@ResponseBody
public class PurchaseFileController {

    @Autowired
    private PurchaseFileService purchaseFileService;


    @ApiOperation(value = "插入购房档案数据",notes = "录入一名屋主的个人购房档案相关信息")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertPurchaseFile(@RequestBody PurchaseFile purchaseFile){

        int count = purchaseFileService.insertPurchaseFile(purchaseFile);

        if(count == 1){
            return Result.success(purchaseFile);
        }
        return Result.fail(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage());
    }


}
