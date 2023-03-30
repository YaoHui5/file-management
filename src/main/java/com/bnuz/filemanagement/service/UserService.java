package com.bnuz.filemanagement.service;

import com.bnuz.filemanagement.model.User;

import java.util.List;

public interface UserService {

    public boolean insert(User user);

//    public User findUserByUid(int uid);
//
//    public List<User> findAll();

    public int register(User user);

    public User login(User user);
}
