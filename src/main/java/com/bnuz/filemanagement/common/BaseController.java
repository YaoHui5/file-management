package com.bnuz.filemanagement.common;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BaseController<T extends BaseBean,E extends BaseService<T>> {

    @Autowired
    private E e;

//    @ApiOperation("")
//    @PostMapping("/add")
//    Result add(@Validated T t){
//        e.add(t)
//        return Result.success();
//    }

    @ApiOperation("id查询")
    @GetMapping("/find/{id}")
    Result findById(@PathVariable("id") Integer id){
        return Result.success(e.findById(id));
    }

}
