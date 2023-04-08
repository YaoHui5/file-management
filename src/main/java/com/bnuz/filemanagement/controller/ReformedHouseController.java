package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.ReformedHouse;
import com.bnuz.filemanagement.service.ReformedHouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Api(tags = "单位公房房改简况数据接口")
@RestController
@RequestMapping("/reformedhouse")
@ResponseBody
public class ReformedHouseController {

    @Autowired
    private ReformedHouseService reformedHouseService;

    @ApiOperation(value = "单位公房房改简况录入",notes = "插入一条公房房改简况")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addReformedHouse(@RequestBody ReformedHouse reformedHouse){
        int count = reformedHouseService.addReformedHouse(reformedHouse);

        if(count == 1){
            return Result.success(reformedHouse);
        }
        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }

    @ApiOperation(value = "单位公房房改简况修改",notes = "根据产权证号Uid,修改一条公房房改简况信息")
    @RequestMapping(value = "/update/{uid}",method = RequestMethod.GET)
    public Result updateReformedHouseByUid(@PathVariable("uid")String uid,ReformedHouse reformedHouseDto, BindingResult bindingResult){
        Result result;

        int count = reformedHouseService.updateReformedHouseByUid(uid,reformedHouseDto);

        if(count == 1){
            return Result.success(reformedHouseDto);
        }
        return Result.fail("操作失败");
    }

    @ApiOperation(value = "单位公房房改简况查询",notes = "根据产权证号Uid,查询一条公房房改简况信息")
    @RequestMapping(value = "/get/{uid}",method = RequestMethod.GET)
    public Result getReformedHouseByUid(@PathVariable("uid") String uid){
        return Result.success(reformedHouseService.getReformedHouseByUid(uid));
    }



}
