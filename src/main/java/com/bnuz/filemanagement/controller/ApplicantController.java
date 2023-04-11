package com.bnuz.filemanagement.controller;

import com.bnuz.filemanagement.common.ResultCode;
import com.bnuz.filemanagement.common.Result;
import com.bnuz.filemanagement.model.Applicant;
import com.bnuz.filemanagement.service.ApplicantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Api(tags = "申请人数据接口")
@RestController
@RequestMapping("/applicant")
@ResponseBody
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @ApiOperation(value = "获取所有申请人列表",notes="获取所有申请人的信息")
//    @GetMapping("/list")
    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    public Result getAllApplicant(){
        return Result.success(applicantService.getAll());
    }


//    @ApiImplicitParams({
//            @ApiImplicitParam(name="id",value="用户id",dataType="int", paramType = "query"),
//            @ApiImplicitParam(name="name",value="用户姓名",dataType="String", paramType = "query")})
    @ApiOperation(value = "添加申请人",notes = "添加一名申请人,并传入申请人信息")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addApplicant(@RequestBody Applicant applicant){
        int count = applicantService.addApplicant((applicant));
        if(count == 1){
            return Result.success(applicant);
        }
        return Result.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }

    @ApiOperation(value = "获取申请人",notes = "根据ID获取申请人信息")
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Result getApplicantById(@PathVariable("id") int id){
        return Result.success(applicantService.getApplicantById(id));
    }

    @ApiOperation(value = "修改申请人信息",notes = "修改申请人信息，并传入更新内容")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public Result updateApplicantById(@PathVariable("id") int id, @RequestBody Applicant applicantDto,BindingResult bindingResult){
        Result result;
        int count = applicantService.updateApplicantById(id,applicantDto);
        if(count == 1){
            return Result.success(applicantDto);
        }
        return Result.fail("操作失败");
    }

    @ApiOperation(value = "删除申请人", notes = "根据ID删除申请人")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public Result deleteApplicant(@PathVariable("id") int id){
        int count = applicantService.deleteApplicantById(id);
        if(count == 1){
            return Result.success(null);
        }
        return Result.fail("操作失败");
    }


//    @ApiOperation(value = "测试",notes = "测试")
//    @GetMapping("/ceshi")
//    public Result ceshi(){
//       return Result.success(applicantService.getAll());
//
//    }

//    @ApiOperation(value = "获取申请人ByName",notes = "根据申请人姓名获取申请人信息")
//    @RequestMapping(value = "/get/{name}",method = RequestMethod.GET)
//    public Result getApplicantByName(Applicant applicant){
//        return Result.success(applicantService.getApplicantByName(applicant));
//    }
//
//    @ApiOperation(value = "获取申请人ByIdCard",notes = "根据申请人身份证号获取申请人信息")
//    @RequestMapping(value = "/get/{idCard}",method = RequestMethod.GET)
//    public Result getApplicantByIdCard(@PathVariable("idCard") String idCard){
//        return Result.success(applicantService.getApplicantByIdCard(idCard));
//    }
//
//    @ApiOperation(value = "获取申请人ByMateName",notes = "根据申请人配偶姓名获取申请人信息")
//    @RequestMapping(value = "/{mateName}",method = RequestMethod.GET)
//    public Result getApplicantByMateName(@PathVariable("mateName") String mateName){
//        return Result.success(applicantService.getApplicantByMateName(mateName));
//    }
//
//    @ApiOperation(value = "获取申请人ByMateIdCard",notes = "根据申请人配偶身份证获取申请人信息")
//    @RequestMapping(value = "/by/{mateIdCard}",method = RequestMethod.GET)
//    public Result getApplicantByMateIdCard(@PathVariable("mateIdCard") String mateIdCard){
//        return Result.success(applicantService.getApplicantByMateIdCard(mateIdCard));
//    }

    @ApiOperation(value = "条件查询/模糊查询申请人信息",notes = "根据申请人姓名/身份证/配偶姓名/配偶身份证任一条件查询申请人信息")
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Result selectApplicantByExample(Applicant applicant){
        return Result.success(applicantService.selectApplicantByExample(applicant));
    }

}
