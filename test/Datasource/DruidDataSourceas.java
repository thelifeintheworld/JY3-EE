package com.test.Datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/*
* 连接池配置
* */
public class DruidDataSourceas {
    private static Properties properties;
private static DruidDataSourceas ds =null;
private  DruidDataSourceas(){

}

    public static DruidDataSourceas getDs() {
    if (null == ds){
        ds = new DruidDataSourceas();
    }
        return ds;
    }
    public Connection getConn(){
    Connection connection = null;
        try {
            properties.load(DruidDataSourceas.class.getResourceAsStream("/mysqlprop"));
           DataSource dataSource =  DruidDataSourceFactory.createDataSource(properties);
           connection=dataSource.getConnection();
           return connection;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
public static  void  main(String[] args) {
DruidDataSourceas druidDataSource = new DruidDataSourceas();
Connection connection = druidDataSource.getConn();
System.out.println(connection);
}

}
