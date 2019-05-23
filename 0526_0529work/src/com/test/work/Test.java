package com.test.work;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
private static Connection connection;
private static Properties properties;
static{
    properties = new Properties();
    try {
        properties.load(Test.class.getResourceAsStream("mysql.properties"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    private  static final String URL = properties.getProperty("url");
    private  static final String USERNAME = properties.getProperty("username");
    private  static final String PASSWORD = properties.getProperty("password");

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
