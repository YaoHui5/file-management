package com.bnuz.filemanagement.config;

import com.bnuz.filemanagement.interceptor.AdminInterceptor;
import com.bnuz.filemanagement.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/swagger-resources/**","/swagger-ui/**", "/v3/**", "/error");    // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(adminInterceptor())
                .addPathPatterns("/user/**")
                .addPathPatterns("/**/delete/**");
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }


    @Bean
    public AdminInterceptor adminInterceptor(){
        return new AdminInterceptor();
    }


	
}