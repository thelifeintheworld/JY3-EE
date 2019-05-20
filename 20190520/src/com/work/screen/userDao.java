package com.work.screen;

import com.work.pojo.User;

public interface userDao {

void regsiter(String user,String psw);
    User login(User user);
}
