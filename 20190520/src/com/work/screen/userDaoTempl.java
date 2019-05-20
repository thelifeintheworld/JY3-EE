package com.work.screen;

import com.work.pojo.User;
import com.work.util.DButil;
import sun.security.pkcs11.Secmod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userDaoTempl implements userDao {

    @Override
    public void regsiter(String user, String psw) {
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        try {
            connection = DButil.getConnection();
            String sql = "insert into user (username,password) values(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user);
            preparedStatement.setString(2,psw);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closePst(preparedStatement);
            DButil.closeConnection(connection);
        }
    }

    @Override
    public User login(User user) {
    Connection connection = DButil.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet res = null;
    String sql1 = "Select username,password from user where username = ? and password = ?";
        try {
           preparedStatement= connection.prepareStatement(sql1);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            res = preparedStatement.executeQuery();
            if (null != res){
                return  user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeRes(res);
            DButil.closePst(preparedStatement);
            DButil.closeConnection(connection);
        }
        return null;
    }
}
