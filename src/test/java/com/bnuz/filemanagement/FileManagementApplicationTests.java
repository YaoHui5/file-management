package com.bnuz.filemanagement;

import com.bnuz.filemanagement.service.UserService;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FileManagementApplicationTests {

    @Autowired
    UserService userService;


    @Test
    public void contextLoads() {

    }

}
