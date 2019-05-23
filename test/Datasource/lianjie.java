package com.test.Datasource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class lianjie {
        private static Properties prop;
        private static Connection connection ;
       static{
           prop = new Properties();
           try {
               prop.load(lianjie.class.getResourceAsStream("/dataset.properties"));
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
private  static final String URL = prop.getProperty("url");
    private  static final String USERNAME = prop.getProperty("username");
    private  static final String PASSWORD = prop.getProperty("password");

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
