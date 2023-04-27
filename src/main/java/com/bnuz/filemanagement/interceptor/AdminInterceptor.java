package com.bnuz.filemanagement.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.bnuz.filemanagement.annotation.PassToken;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AdminInterceptor implements HandlerInterceptor {

    @Autowired
    AdminService adminService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
//        String url = request.getRequestURI();      //获取当前请求的url和管理员的权限信息

//        boolean isAdmin = false;                   //假设管理员权限为false

        HandlerMethod handlerMethod=(HandlerMethod)handler;
        Method method=handlerMethod.getMethod();

        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }

        String token = request.getHeader("authorization").substring(7);// 从 http 请求头中取出 token

        //判断当前请求的url是否是对用户进行增删改查的操作
            // 获取 token 中的 adminId
            String adminId;
            try {
                adminId = JWT.decode(token).getAudience().get(0);
            } catch (JWTDecodeException j) {
                throw new RuntimeException("401");
            }

            Admin admin = adminService.findById(Integer.valueOf(adminId));

            if (admin == null) {
                throw new RuntimeException("管理员不存在，请重新登录");
            }
//            // 验证 token
//            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(admin.getPassword())).build();
//            try {
//                jwtVerifier.verify(token);
//            } catch (JWTVerificationException e) {
//                throw new RuntimeException("401");
//            }
            return true;

//        //判断管理员是否具有相应权限
//        if(!isAdmin){
//            response.sendRedirect("/no_permission");
//            return false;
//        }
    }
}
