package com.bnuz.filemanagement.controller;

import com.bnuz.filemanagement.common.BaseController;
import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "管理员数据接口")
@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController<Admin> {

    @Autowired
    private AdminService adminService;

    @Override
    public BaseService<Admin> getService() {
        return adminService;
    }
}
