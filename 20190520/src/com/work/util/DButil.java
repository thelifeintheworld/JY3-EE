package com.work.util;


import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import static java.lang.Class.forName;

public class DButil {

    private  static Properties propties ;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            propties = new Properties();
            propties.load(DButil.class.getResourceAsStream("/resource/prop"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private  static  final String URL = propties.getProperty("url");
    private  static  final  String USERNAME = propties.getProperty("username");
    private  static  final  String PASSWORD = propties.getProperty("password");

     public static  Connection getConnection(){
         Connection connection = null;
         try {
             if (null != connection) {
                 connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
        return connection;
     }
     //关闭连接
    public static void closeConnection(Connection connection){
         if (null != connection){
             try {
                 connection.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
    }
    //关闭
    public  static void closePst(PreparedStatement preparedStatement){

         if (null != preparedStatement){
             try {
                 preparedStatement.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
    }
    //
    public  static void closeRes(ResultSet resultSet){

        if (null != resultSet){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
