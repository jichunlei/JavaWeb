/**  
 * @Title: MyServletContextListener.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月4日 上午8:12:49
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName: MyServletContextListener
 * @Description: 自定义ServletContext监听器
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:12:49
 */
public class MyServletContextListener implements ServletContextListener {

    /* (non Javadoc)
     * @Title: contextInitialized
     * @Description: ServletContext创建
     * @param sce
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象创建...");
    }

    /* (non Javadoc)
     * @Title: contextDestroyed
     * @Description: ServletContext销毁
     * @param sce
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象销毁...");
    }
}
