package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.mapper.UserMapper;
import com.bnuz.filemanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService extends BaseService<User> {

    User findByUsername(User user);


//
//     void deleteById(int id);
//
//     User findOne(User user);
//
//     User findById(Integer id);
//
//     List<User> findAll(User user);

//     void add(User user);
//
//     User login(String username,String password);
//
//     User findByUserName(String username);


}
