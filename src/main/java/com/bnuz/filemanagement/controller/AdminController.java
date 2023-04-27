package com.bnuz.filemanagement.controller;

import com.alibaba.fastjson.JSONObject;
import com.bnuz.filemanagement.annotation.PassToken;
import com.bnuz.filemanagement.common.BaseController;
import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.common.Result;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.AdminService;
import com.bnuz.filemanagement.service.UserService;
import com.bnuz.filemanagement.service.impl.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@Api(tags = "管理员数据接口")
@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController<Admin> {

    @Autowired
    private AdminService adminService;

    @Autowired
    private TokenService tokenService;

    @Override
    public BaseService<Admin> getService() {
        return adminService;
    }


    @PassToken
    @ApiOperation(value = "管理员登录",notes = "管理员登录")
    @GetMapping("/adminLogin")
    public Object login(Admin admin, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();


        Admin adminForBase = adminService.findByAdminName(admin);

        if(Objects.nonNull(adminForBase)){

            //        adminForBase.setId(adminService.findByUsername(user).getId());
//        adminForBase.setAdminName(adminService.findByUsername(user).getUsername());
//        adminForBase.setPassword(adminService.findByUsername(user).getPassword());

            if(!adminForBase.getPassword().equals(adminForBase.getPassword())){
                jsonObject.put("message","管理员登陆失败，密码错误");
                return jsonObject;
            }else{
                String token = tokenService.getTokenByAdmin(adminForBase);
                jsonObject.put("token",token);

                Cookie cookie = new Cookie("token",token);
                cookie.setPath("/");
                response.addCookie(cookie);

                return jsonObject;
            }

        }

        return Result.fail("错误，查无此人!!");



    }
}
