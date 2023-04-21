package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.annotation.UserLoginToken;
import com.bnuz.filemanagement.common.BaseController;
import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.common.Result;
import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.model.ReformedHouse;
import com.bnuz.filemanagement.service.ReformedHouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "单位公房房改简况数据接口")
@RestController
@RequestMapping("/reformedhouse")
@ResponseBody
public class ReformedHouseController extends BaseController<ReformedHouse> {

    @Autowired
    private ReformedHouseService reformedHouseService;

    @Override
    public BaseService<ReformedHouse> getService(){
        return reformedHouseService;
    }

    @ApiOperation(value = "按时间统计各单位房改情况",notes = "按时间，按各单位")
    @GetMapping("/count/{date}")
    public Result countByDate(@PathVariable("date") String reformedDate){
        return Result.success(reformedHouseService.countByDate(reformedDate));
    }

//    @ApiOperation(value = "单位公房房改简况录入",notes = "插入一条公房房改简况")
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public Result addReformedHouse(@RequestBody ReformedHouse reformedHouse){
//        int count = reformedHouseService.addReformedHouse(reformedHouse);
//
//        if(count == 1){
//            return Result.success(reformedHouse);
//        }
//        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
//    }
//
//    @ApiOperation(value = "单位公房房改简况修改",notes = "根据产权证号Uid,修改一条公房房改简况信息")
//    @RequestMapping(value = "/update/{uid}",method = RequestMethod.POST)
//    public Result updateReformedHouseByUid(@PathVariable("uid")String uid,@RequestBody ReformedHouse reformedHouse){
//
//        int count = reformedHouseService.updateReformedHouseByUid(uid,reformedHouse);
//
//        if(count == 1){
//            return Result.success(reformedHouse);
//        }
//        return Result.fail("操作失败");
//    }
//
//    @ApiOperation(value = "单位公房房改简况查询",notes = "根据产权证号Uid,查询一条公房房改简况信息")
//    @RequestMapping(value = "/get/{uid}",method = RequestMethod.GET)
//    public Result getReformedHouseByUid(@PathVariable("uid") String uid){
//        return Result.success(reformedHouseService.getReformedHouseByUid(uid));
//    }



}
