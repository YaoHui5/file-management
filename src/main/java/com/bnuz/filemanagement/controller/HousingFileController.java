package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.model.PropertyRight;
import com.bnuz.filemanagement.service.HousingFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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

    @ApiOperation(value = "条件查询个人住房档案id",notes = "根据条件查询到个人住房档案信息，拿到该id")
    @RequestMapping(value = "/findid",method = RequestMethod.GET)
    public Result findId(HousingFile housingFile){

        return Result.success(housingFileService.findId(housingFile));
    }

    @ApiOperation(value = "根据id修改个人住房档案",notes = "通过id找到对应的个人住房档案，根据条件修改档案信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(@Validated HousingFile housingFile){
        return Result.success(housingFileService.updateByExample(housingFile));
    }

}
