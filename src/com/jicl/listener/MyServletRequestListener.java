/**  
 * @Title: MyServletRequestListener.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月4日 上午8:29:36
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName: MyServletRequestListener
 * @Description: 自定义ServletRequest监听器
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:29:36
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    /* (non Javadoc)
     * @Title: requestDestroyed
     * @Description: ServletRequest创建
     * @param sre
     * @see javax.servlet.ServletRequestListener#requestDestroyed(javax.servlet.ServletRequestEvent)
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequest创建...");

    }

    /* (non Javadoc)
     * @Title: requestInitialized
     * @Description: ServletRequest销毁
     * @param sre
     * @see javax.servlet.ServletRequestListener#requestInitialized(javax.servlet.ServletRequestEvent)
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequest销毁...");

    }
}
