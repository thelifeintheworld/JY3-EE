package com.test.dao;

import com.test.pojo.User;
import com.test.utils.SQLutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Usedao实现类 注册
 */
public class UserDaoTmpl implements  UserDao {
    //连接数据库
//    private  static Properties properties;
//    static {
//        properties = new Properties();
//        try {
//            properties.load(UserDaoTmpl.class.getResourceAsStream("/mysql.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    //"jdbc:mysql://127.0.0.1:3306/school?serverTimezone=GMT%2B8&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
//
//    "root";"123456";
//    private  static final String URL =properties.getProperty("url");
//    private  static  final  String USERNAME =properties.getProperty("username");
//    private  static  final  String PASSWORD =properties.getProperty("password");
//密码应该加密 Base64 MD5
    @Override
    public void regsiter(String username, String psw) {
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        try {
            String sql = "insert into user(username,psw) values(?,?)";
             connection = SQLutil.getCon();
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

    @Override
    public void login() {

    }

    @Override
    public User select() {
        return null;
    }
}
