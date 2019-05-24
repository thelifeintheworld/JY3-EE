package com.test.dao;

import com.test.pojo.User;

/**
 * UserDao接口
 */
public interface UserDao {
  //注册方法
  void regsiter(String username,String psw);
//登录方法
void login();
//查询方法
User select();
//All

  //删除方法

  //修改方法

}
