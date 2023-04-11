package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.common.BaseController;
import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.model.HousingFile;
import com.bnuz.filemanagement.service.HousingFileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "个人住房档案数据接口")
@RestController
@RequestMapping("/housingfile")
public class HousingFileController extends BaseController<HousingFile> {

    @Autowired
    private HousingFileService housingFileService;

    @Override
    public BaseService<HousingFile> getService() {
        return housingFileService;
    }

//    @Autowired
//    private HousingFileService housingFileService;
//
//
//    @ApiOperation(value = "个人住房档案录入",notes = "插入一条个人住房档案信息")
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public Result addHousingFile(@RequestBody HousingFile housingFile){
//        int count = housingFileService.add(housingFile);
//
//        if(count == 1){
//            return Result.success(housingFile);
//        }
//        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
//    }
//
//    @ApiOperation(value = "条件查询个人住房档案id",notes = "根据条件查询到个人住房档案信息，拿到该id")
//    @RequestMapping(value = "/findid",method = RequestMethod.GET)
//    public Result findId(HousingFile housingFile){
//
//        return Result.success(housingFileService.findOne(housingFile);
//    }
//
//    @ApiOperation(value = "根据id修改个人住房档案",notes = "通过id找到对应的个人住房档案，根据条件修改档案信息")
//    @RequestMapping(value = "/update",method = RequestMethod.POST)
//    public Result update(@Validated HousingFile housingFile){
//        return Result.success(housingFileService.updateByExample(housingFile));
//    }

}
