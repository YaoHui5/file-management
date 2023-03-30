package com.bnuz.filemanagement.service.impl;


import com.bnuz.filemanagement.mapper.UserMapper;
import com.bnuz.filemanagement.model.User;
import com.bnuz.filemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean insert(User user){
        try {
            userMapper.insertUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

//    @Override
//    public User findUserByUid(int uid){
//        return userMapper.selectUserByUid(uid);
//    }
//
//    @Override
//    public List<User> findAll(){
//        return userMapper.selectAll();
//    }

    @Override
    public int register(User user){
        return userMapper.register(user);
    }

    @Override
    public User login(User user){
        return userMapper.login(user);
    }



}
