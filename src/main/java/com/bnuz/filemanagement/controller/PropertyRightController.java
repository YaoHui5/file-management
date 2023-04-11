package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.Result;
import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.PropertyRight;
import com.bnuz.filemanagement.service.PropertyRightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Api(tags = "产权产籍数据接口")
@RestController
@RequestMapping("/propertyright")
@ResponseBody
public class PropertyRightController {

    @Autowired
    private PropertyRightService propertyRightService;

    @ApiOperation(value = "产权产籍数据录入",notes = "插入一条产权产籍信息")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addPropertyRight(@RequestBody PropertyRight propertyRight){
        int count = propertyRightService.addPropertyRight(propertyRight);

        if(count == 1){
            return Result.success(propertyRight);
        }
        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }



    @ApiOperation(value = "产权产籍修改",notes = "根据条件修改产权产籍中部分产权转全部产权数据以及原产权单位收回房改房数据")
    @RequestMapping(value = "/update/{uid}",method = RequestMethod.GET)
    public Result updatePropertyRightByUid(@PathVariable("uid")String uid, PropertyRight propertyRightDto, BindingResult bindingResult){
        Result result;

        int count = propertyRightService.updatePropertyRightByUid(uid,propertyRightDto);

        if(count == 1){
            return Result.success(propertyRightDto);
        }
        return Result.fail("操作失败");
    }


}
