package com.bnuz.filemanagement;


import com.bnuz.filemanagement.interceptor.UserInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginInterceptorTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInterceptor() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/toIndex"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/user/loginUser"));

    }



    @Configuration
    public class WebConfigTest implements WebMvcConfigurer {
//        @Autowired
//        private UserInterceptor userInterceptor;
//        @Override
//        public void addInterceptors(InterceptorRegistry registry) {
//            registry.addInterceptor(userInterceptor)
//                    .addPathPatterns("/user");
//        }

        @Override
        public void addInterceptors(InterceptorRegistry registry){
            List list = new ArrayList();
            list.add("/user/toIndex");
            list.add("/user/loginUser");
            list.add("/user/registerUser");
            registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);

        }
    }


}
