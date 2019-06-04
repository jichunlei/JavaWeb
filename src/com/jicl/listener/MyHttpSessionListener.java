/**  
 * @Title: MyHttpSessionListener.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月4日 上午8:18:26
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName: MyHttpSessionListener
 * @Description: 自定义HttpSession监听器
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:18:26
 */
public class MyHttpSessionListener implements HttpSessionListener {

    /* (non Javadoc)
     * @Title: sessionCreated
     * @Description: HttpSession创建
     * @param se
     * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
       System.out.println("MyHttpSessionListener创建...");
    }

    /* (non Javadoc)
     * @Title: sessionDestroyed
     * @Description: HttpSession销毁
     * @param se
     * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("MyHttpSessionListener销毁...");
    }

}
