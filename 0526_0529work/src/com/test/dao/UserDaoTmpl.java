package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Usedao实现类 注册
 */
public class UserDaoTmpl implements  UserDao {
    //连接数据库
    private  static final String URL ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=GMT%2B8&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
    private  static  final  String USERNAME ="root";
    private  static  final  String PASSWORD ="123456";
//密码应该加密 Base64 MD5
    @Override
    public void regsiter(String username, String psw) {
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        try {
             connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql = "insert into user(username,psw) values(?,?)";
             preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,psw);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (null != preparedStatement){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
