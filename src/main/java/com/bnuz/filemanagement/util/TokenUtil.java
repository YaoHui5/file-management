package com.bnuz.filemanagement.util;

import com.auth0.jwt.JWT;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class TokenUtil {


    public static String getTokenId(){
        String token = getRequest().getHeader("authorization").substring(7); //从http请求头中取出
        String id = JWT.decode(token).getAudience().get(0);
        return id;
    }

    public static Integer getTokenIdentity(String token){
        Integer identity = JWT.decode(token).getClaim("identity").asInt();
        return identity;
    }


    /**
     * 获取 request
     *
     * @return
     */

    public static HttpServletRequest getRequest(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();

        return requestAttributes == null ? null : requestAttributes.getRequest();
    }
}
