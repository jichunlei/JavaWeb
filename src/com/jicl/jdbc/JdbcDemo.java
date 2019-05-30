/**  
 * @Title: JdbcDemo.java
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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @ClassName: JdbcDemo
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月29日 上午8:22:00
 */
public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        //1.定义数据库参数（以后写法为配置在proprities文件里面）
        String url="jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false";
        String username="root";
        String password="123";
        String driver="com.mysql.cj.jdbc.Driver";
        
        //2.加载驱动
        Class.forName(driver);
        
        //3.获取与数据库连接
        Connection connection = DriverManager.getConnection(url, username, password);
        
        //4.获取用于向数据库发送sql语句的statement
        Statement statement = connection.createStatement();
        
        //5.定义SQL语句
        String sql="select * from users";
        
        //6.执行sql，并获取结果
        ResultSet resultSet = statement.executeQuery(sql);
        
        //7.取出结果集数据
        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("name"));
            System.out.println("password=" + resultSet.getObject("password"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birthday=" + resultSet.getObject("birthday"));
        }
        
        //8.关闭连接，释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
