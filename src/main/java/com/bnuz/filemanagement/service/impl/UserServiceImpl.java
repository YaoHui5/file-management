package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.common.BaseService;
import com.bnuz.filemanagement.common.BaseServiceImpl;
import com.bnuz.filemanagement.mapper.UserMapper;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserMapper> implements UserService{


    @Autowired
    private UserMapper userMapper;

    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUsername());
    }


//    public User login(String username,String password){
//        User user = getMapper().findByUserName(username);
//        if(user == null || !user.getPassword().equals(password)){
//            return null;
//        }else{
//            Role role = roleMapper.findById(user.getRole().getId());
//            user.setRole(role);
//            return user;
//        }
//    }
//
//    public void register(User user){
//        getMapper().insert(user);
//    }
//
//    public User findByUserName(String username){
//        return getMapper().findByUserName(username);
//    }


}
