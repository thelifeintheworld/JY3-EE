package com.test.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.test.pojo.Product;
import com.test.utils.DataSourceSql;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class ProDaoTmpl implements ProDao {
    private DataSourceSql dss;
    private QueryRunner qr;
    public  ProDaoTmpl(){
        this.dss = DataSourceSql.getDss();
        qr = new QueryRunner();
    }

    @Override
    public void addOnePro(Product product) {
        Connection connection = dss.getConn();
        String sql = "insert into product values(?,?,?,?,?,?,?,?,?)";
        try{
             qr.update(connection, sql, product.getPro_id(), product.getPro_name(), product.getPro_price(), product.getPro_img(), product.getPro_des(), product.getPro_stock(), product.getPro_date(), product.getPro_cate_id(), product.getPro_factory());

        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                DbUtils.close(connection);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}
