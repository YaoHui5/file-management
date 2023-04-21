package com.bnuz.filemanagement.mapper;

import com.bnuz.filemanagement.common.BaseMapper;
import com.bnuz.filemanagement.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    public void insertUser(User user);
//
//    public User selectUserByUid(int uid);
//
//    public List<User> selectAll();

//    public User login(String username,String password);
//
//    public User findByUserName(String username);

    User findByUsername(String username);



}
