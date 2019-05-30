/**  
 * @Title: JdbcUtils.java
 * @Prject: JavaWeb
 * @Package: com.jicl.jdbc
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年5月30日 上午8:03:13
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @ClassName: JdbcUtils
 * @Description: jdbc工具类
 * @author: xianzilei
 * @date: 2019年5月30日 上午8:03:13
 */
public class JdbcUtils {
    /**
     * 数据库连接参数
     */
    private static String DB_URL=null;
    private static String DB_USERNAME=null;
    private static String DB_PASSWORD=null;
    private static String DB_DRIVER=null;
    
    static {
        try {
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("config/db.properties");
            Properties properties=new Properties();
            properties.load(inputStream);
            DB_URL=properties.getProperty("db_url");
            DB_USERNAME=properties.getProperty("db_username");
            DB_PASSWORD=properties.getProperty("db_password");
            DB_DRIVER=properties.getProperty("db_driver");
            Class.forName(DB_DRIVER);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    
    /**
     * @Title: getConnection
     * @Description: 获取数据库连接
     * @return
     * @throws SQLException
     * @return: Connection
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
    
    /**
     * @Title: release
     * @Description: 释放数据库资源
     * @param conn
     * @param st
     * @param rs
     * @return: void
     */
    public static void release(Connection conn,Statement st,ResultSet rs) {
        //关闭存储查询结果的ResultSet对象
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                 e.printStackTrace();
            }
        }
        //关闭负责执行SQL命令的Statement对象
        if(st!=null) {
            try {
                st.close();
            } catch (SQLException e) {
                 e.printStackTrace();
            }
        }
        //关闭Connection数据库连接对象
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                 e.printStackTrace();
            }
        }
    }
}
