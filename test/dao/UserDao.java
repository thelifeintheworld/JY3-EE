package com.test.dao;

import com.test.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
 //   User selectbyid();
}
