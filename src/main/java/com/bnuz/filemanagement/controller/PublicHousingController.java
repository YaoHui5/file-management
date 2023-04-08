package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.PublicHousing;
import com.bnuz.filemanagement.service.PublicHousingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "个人购单位公房档案数据接口")
@RestController
@RequestMapping("/publichousing")
@ResponseBody
public class PublicHousingController {

    @Autowired
    private PublicHousingService publicHousingService;


    @ApiOperation(value = "个人购单位公房档案录入",notes = "插入个人购单位公房档案信息")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertPublicHousing(@RequestBody PublicHousing publicHousing){

        int count = publicHousingService.insertPublicHousing(publicHousing);

        if(count == 1){
            return Result.success(publicHousing);
        }
        return Result.fail(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage());
    }


}
