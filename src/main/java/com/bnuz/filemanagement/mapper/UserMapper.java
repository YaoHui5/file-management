package com.bnuz.filemanagement.mapper;

import com.bnuz.filemanagement.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public void insertUser(User user);

    public User selectUserByUid(int uid);

    public List<User> selectAll();

    public int register(User user);

    public User login(User user);



}
