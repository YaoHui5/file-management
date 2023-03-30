package com.bnuz.filemanagement.config;

import com.bnuz.filemanagement.interceptor.UserInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

public class SessionInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        List list = new ArrayList();
        list.add("/user/toIndex");
        list.add("/user/loginUser");
        list.add("/user/registerUser");
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);

    }

}
