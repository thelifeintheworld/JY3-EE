package com.test.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.test.Datasource.DruidDataSourceas;
import com.test.Datasource.lianjie;
import com.test.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoTempl implements UserDao {
private  QueryRunner qr = null;
private DruidDataSourceas dds = DruidDataSourceas.getDs();
private lianjie lian=new lianjie();
    public UserDaoTempl() {
    qr = new QueryRunner();
    }

    @Override
    public List<User> selectAll() {
        String sql="SELECT * FROM user";
        List<User> users = new ArrayList<>();
     //  Connection co = lian.getConnection();
        Connection co = dds.getConn();
        try {
            users=qr.query(co,sql,new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(co);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
}
