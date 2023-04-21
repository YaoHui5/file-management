package com.bnuz.filemanagement.swagger;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.HttpAuthenticationScheme;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

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


    @Bean
    public Docket api() {

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .securitySchemes(Collections.singletonList(HttpAuthenticationScheme.JWT_BEARER_BUILDER
//                        显示用
                        .name("JWT")
                        .build()))
                .securityContexts(Collections.singletonList(SecurityContext.builder()
                        .securityReferences(Collections.singletonList(SecurityReference.builder()
                                .scopes(new AuthorizationScope[0])
                                .reference("JWT")
                                .build()))
                        // 声明作用域
                        .operationSelector(o -> o.requestMappingPattern().matches("/.*"))
                        .build()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }




}
