package com.test.utils;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLutil {
//    public
private  static Properties properties;
    static {
        properties = new Properties();
        try {
            properties.load(SQLutil.class.getResourceAsStream("/mysql.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //"jdbc:mysql://127.0.0.1:3306/school?serverTimezone=GMT%2B8&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
//
//    "root";"123456";
    private  static final String URL =properties.getProperty("url");
    private  static  final  String USERNAME =properties.getProperty("username");
    private  static  final  String PASSWORD =properties.getProperty("password");
public static Connection getCon(){
    Connection connection = null;
    try {
        connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return  connection;
}

}
