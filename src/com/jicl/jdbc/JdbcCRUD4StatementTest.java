/**  
 * @Title: JdbcCRUDDemo.java
 * @Prject: JavaWeb
 * @Package: com.jicl.jdbc
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年5月29日 上午8:22:00
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * @ClassName: JdbcCRUD4StatementTest
 * @Description: jdbc增删改查测试一：普通sql执行
 * @author: xianzilei
 * @date: 2019年5月29日 上午8:22:00
 */
public class JdbcCRUD4StatementTest {
    
    @Test
    public void testInsert() {
        Connection connection=null;
        Statement statement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //获取sql执行器
            statement = connection.createStatement();
            //创建sql
            String sql="insert into users(id,name,password,email,birthday) values(4,'白虎神皇','123','bhsh@sina.com','1980-09-09')";
            //执行sql
            int num = statement.executeUpdate(sql);
            if(num==1) {
                System.out.println("数据插入成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,statement , null);
        }
    }
    
    @Test
    public void testDelete() {
        Connection connection=null;
        Statement statement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //获取sql执行器
            statement = connection.createStatement();
            //创建sql
            String sql="delete from users where id=3";
            //执行sql
            int num = statement.executeUpdate(sql);
            if(num==1) {
                System.out.println("数据删除成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,statement , null);
        }
    }
    
    @Test
    public void testUpdate() {
        Connection connection=null;
        Statement statement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //获取sql执行器
            statement = connection.createStatement();
            //创建sql
            String sql="update users set name='贤子磊',email='xianzilei@sina.com' where id=1";
            //执行sql
            int num = statement.executeUpdate(sql);
            if(num==1) {
                System.out.println("数据更新成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,statement , null);
        }
    }
}
