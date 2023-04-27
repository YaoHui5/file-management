package com.bnuz.filemanagement.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.bnuz.filemanagement.annotation.PassToken;
import com.bnuz.filemanagement.annotation.UserLoginToken;
import com.bnuz.filemanagement.common.Identity;
import com.bnuz.filemanagement.model.Admin;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.AdminService;
import com.bnuz.filemanagement.service.UserService;
import com.bnuz.filemanagement.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;

    @Autowired
    AdminService adminService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception
    {
        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method=handlerMethod.getMethod();

        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }

        String token = httpServletRequest.getHeader("authorization").substring(7);// 从 http 请求头中取出 token

        // 如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }

        Integer tokenIdentity = TokenUtil.getTokenIdentity(token);

        //判断身份为管理员，根据Id查找管理员看是否存在
        if (Identity.ADMIN.getIdentity().equals(tokenIdentity)){

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
            return true;
        }

        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {

            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);

            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token，请重新登录");
                }

                // 获取 token 中的 userId
                String userId;
                try {
                    userId = JWT.decode(token).getAudience().get(0);
                } catch (JWTDecodeException j) {
                    throw new RuntimeException("401");
                }

                User user = userService.findById(Integer.valueOf(userId));

                if (user == null) {
                    throw new RuntimeException("用户不存在，请重新登录");
                }

                // 验证 token
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
                try {
                    jwtVerifier.verify(token);
                } catch (JWTVerificationException e) {
                    throw new RuntimeException("401");
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
