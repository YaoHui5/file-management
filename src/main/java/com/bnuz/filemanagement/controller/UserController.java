package com.bnuz.filemanagement.controller;


import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "用户数据接口")
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户注册",notes = "输入新的用户名和密码以完成注册")
    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    public String register(@RequestParam("username")String username, @RequestParam("password")String password,
                           HttpServletRequest request){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if(userService.register(user)>0){
            request.getSession().setAttribute("session_user",user);
            return "注册成功,Welcome!!";
        }
        else{
            return "注册失败";
        }
    }


    @ApiOperation(value = "用户登录",notes = "输入正确的用户名以及密码即登录成功")
    @GetMapping(value = "/loginUser")
    public String login(@RequestParam("username")String username,@RequestParam("password")String password,
                        HttpServletRequest request){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        User user2 = userService.login(user);

        if(user2 == null){
            return "用户名或密码错误!!";
        }else{
            request.getSession().setAttribute("session_user",user);
            return "登陆成功!!";
        }
    }

//    @ApiOperation(value = "获取用户",notes = "根据id获取用户名")
//    @RequestMapping(value = "/find/{uid}",method = RequestMethod.GET)
//    public Result findUserByUid(@PathVariable("uid") int uid){
//        return Result.success(userService.findUserByUid(uid));
//    }
//
//
//    @ApiOperation(value = "获取用户列表",notes = "获取全部用户信息")
//    @RequestMapping(value = "findAll",method = RequestMethod.GET)
//    public Result getAllApplicant(){
//        return Result.success(userService.findAll());
//    }

//    @ApiOperation(value = "测试跳转",tags = "测试测试测试")
//    @RequestMapping(value = "/toIndex",method = RequestMethod.GET)
//    public String toIndex(){
//        return "index";
//    }



}
