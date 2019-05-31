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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

/**
 * @ClassName: JdbcCRUD4PreparedStatementTest
 * @Description: jdbc增删改查测试二：使用预编译
 * @author: xianzilei
 * @date: 2019年5月29日 上午8:22:00
 */
public class JdbcCRUD4PreparedStatementTest {
    
    @Test
    public void testInsert() {
        Connection connection=null;
        PreparedStatement prepareStatement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //创建sql
            String sql="insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
            //获取sql执行器
            prepareStatement = connection.prepareStatement(sql);
            //设置参数
            prepareStatement.setInt(1, 5);//id是int类型的
            prepareStatement.setString(2, "白虎神皇");//name是varchar(字符串类型)
            prepareStatement.setString(3, "123");//password是varchar(字符串类型)
            prepareStatement.setString(4, "bhsh@sina.com");//email是varchar(字符串类型)
            prepareStatement.setDate(5, new java.sql.Date(new Date().getTime()));//birthday是date类型
            //执行sql
            int num = prepareStatement.executeUpdate();
            if(num>0) {
                System.out.println("数据插入成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,prepareStatement , null);
        }
    }
    
    @Test
    public void testDelete() {
        Connection connection=null;
        PreparedStatement prepareStatement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //创建sql
            String sql="delete from users where id=?";
            //预编译sql
            prepareStatement = connection.prepareStatement(sql);
            //设置参数
            prepareStatement.setInt(1, 4);
            //执行sql
            int num = prepareStatement.executeUpdate();
            if(num>0) {
                System.out.println("数据删除成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,prepareStatement , null);
        }
    }
    
    @Test
    public void testUpdate() {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            //获取数据库连接
            connection = JdbcUtils.getConnection();
            //创建sql
            String sql="update users set name=?,email=? where id=?";
            //预编译sql
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1, "jicl");
            preparedStatement.setString(2, "jicl@sina.com");
            preparedStatement.setInt(3, 1);
            //执行sql
            int num = preparedStatement.executeUpdate();
            if(num>0) {
                System.out.println("数据更新成功！");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            //释放资源
            JdbcUtils.release(connection,preparedStatement , null);
        }
    }
}
