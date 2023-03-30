package com.bnuz.filemanagement.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket docket(){
       return new Docket(DocumentationType.OAS_30)
               .apiInfo(apiInfo())
               .enable(true)
               .groupName("MELO")
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.bnuz.filemanagement.controller"))
               .paths(PathSelectors.any())
               .build();
    }


    @SuppressWarnings("all")
    public ApiInfo apiInfo(){
        return new ApiInfo(
                "MELO's Api接口文档",
                "File-Management个人住房档案管理系统",
                "v1.0",
                "jditwyh@163.com",
                "MELO",
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0"
        );
    }



}
