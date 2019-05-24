package com.test.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * 连接池配置
 */
public class DataSourceSql {
    private static Properties proerties;
    private static  DataSourceSql ds ;
    private  DataSourceSql(){

    }
    public  static  DataSourceSql getDss(){

        if (null == ds){
            ds = new DataSourceSql();
        }
        return  ds;
    }
public Connection getConn(){
Connection connection =null;
proerties =new Properties();
    try {
        proerties.load(DataSourceSql.class.getResourceAsStream("/shop.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(proerties);
        connection = dataSource.getConnection();
        return  connection;
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return  null;
}

}
