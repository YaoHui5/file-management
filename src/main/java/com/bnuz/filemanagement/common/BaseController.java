package com.bnuz.filemanagement.common;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public abstract class BaseController<T extends BaseBean> {

    public abstract BaseService<T> getService();

    @ApiOperation("添加")
    @PostMapping("/add")
    Result add(@Validated T t){
        getService().add(t);
        return Result.success(t);
    }

//    @ApiOperation("删除")
//    @GetMapping("/delete")
//    Result delete(@Validated T t){
//        e.delete(t);
//        return Result.success(t);
//    }

    @ApiOperation("删除")
    @GetMapping("/delete/{id}")
    Result deleteById(@PathVariable("id") Integer id){
        getService().deleteById(id);
        return Result.success(id);
    }

    @ApiOperation("更新")
    @PostMapping("/update")
    Result update(@Validated T t){
        getService().update(t);
        return Result.success(t);
    }

    @ApiOperation("id查询")
    @GetMapping("/find/{id}")
    Result findById(@PathVariable("id") Integer id){
        return Result.success(getService().findById(id));
    }

    @ApiOperation("查询单个")
    @GetMapping("/findone")
    Result findOne(@Validated T t){
        return Result.success(getService().findOne(t));
    }

    @ApiOperation("查询所有")
    @GetMapping("/findall")
    Result findAll(@Validated T t){
        return Result.success(getService().findAll(t));
    }





}
