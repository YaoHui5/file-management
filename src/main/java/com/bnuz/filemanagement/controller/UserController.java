package com.bnuz.filemanagement.controller;


import com.alibaba.fastjson.JSONObject;
import com.bnuz.filemanagement.annotation.UserLoginToken;
import com.bnuz.filemanagement.common.BaseController;
import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.common.Result;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.UserService;
import com.bnuz.filemanagement.service.impl.TokenService;
import com.bnuz.filemanagement.util.TokenUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@Api(tags = "用户数据接口")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @Override
    public BaseService<User> getService(){
        return userService;
    }

    @ApiOperation(value = "登录",notes = "登录")
    @GetMapping("/login")
    public Object login(User user, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();

        User userForBase = new User();

        userForBase.setId(userService.findByUsername(user).getId());
        userForBase.setUsername(userService.findByUsername(user).getUsername());
        userForBase.setPassword(userService.findByUsername(user).getPassword());

        if(!userForBase.getPassword().equals(user.getPassword())){
            jsonObject.put("message","登陆失败，密码错误");
            return jsonObject;
        }else{
            String token = tokenService.getToken(userForBase);
            jsonObject.put("token",token);

            Cookie cookie = new Cookie("token",token);
            cookie.setPath("/");
            response.addCookie(cookie);

            return jsonObject;
        }

    }

    @UserLoginToken
    @ApiOperation(value = "获取信息",notes = "获取信息")
    @GetMapping("/getMessage")
    public String getMessage(){

        //取出token中带的用户id，进行操作
        System.out.println(TokenUtil.getTokenUserId());

        return "您已通过验证，成功登录系统！";
    }










//    @GetMapping("/query")
//    public Result query(@Validated User user){
//        return Result.success(getService().findAll(user));
//    }

//    @ApiOperation(value = "用户注册",notes = "输入新的用户名和密码以完成注册")
//    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
//    public String register(@RequestParam("username")String username, @RequestParam("password")String password,
//                           HttpServletRequest request){
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//
//        if(userService.register(user)>0){
//            request.getSession().setAttribute("session_user",user);
//            return "注册成功,Welcome!!";
//        }
//        else{
//            return "注册失败";
//        }
//    }
//
//
//    @ApiOperation(value = "用户登录",notes = "输入正确的用户名以及密码即登录成功")
//    @GetMapping(value = "/loginUser")
//    public String login(@RequestParam("username")String username,@RequestParam("password")String password,
//                        HttpServletRequest request){
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//
//        User user2 = userService.login(user);
//
//        if(user2 == null){
//            return "用户名或密码错误!!";
//        }else{
//            request.getSession().setAttribute("session_user",user);
//            return "登陆成功!!";
//        }
//    }

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
