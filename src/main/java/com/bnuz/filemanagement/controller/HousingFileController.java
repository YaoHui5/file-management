package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.model.PropertyRight;
import com.bnuz.filemanagement.service.HousingFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "个人住房档案数据接口")
@RestController
@RequestMapping("/housingfile")
@ResponseBody
public class HousingFileController {

    @Autowired
    private HousingFileService housingFileService;


    @ApiOperation(value = "个人住房档案录入",notes = "插入一条个人住房档案信息")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addHousingFile(@RequestBody HousingFile housingFile){
        int count = housingFileService.addHousingFile(housingFile);

        if(count == 1){
            return Result.success(housingFile);
        }
        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }
}
