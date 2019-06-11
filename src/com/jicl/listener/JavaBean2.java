/**  
 * @Title: JavaBean2.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月11日 上午8:04:01
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @ClassName: JavaBean2
 * @Description: 实现了HttpSessionActivationListener接口的JavaBean对象可以感知自己被活化(反序列化)和钝化(序列化)的事件
 * @author: xianzilei
 * @date: 2019年6月11日 上午8:04:01
 */
public class JavaBean2 implements HttpSessionActivationListener,Serializable  {

    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: 序列化ID
     */
    private static final long serialVersionUID = 1L;

    private String name;
    
    public JavaBean2(String name) {
        super();
        this.name = name;
    }

    /* (non Javadoc)
     * @Title: sessionDidActivate
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.http.HttpSessionActivationListener#sessionDidActivate(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println(name+"被序列化！，sessionID="+se.getSession().getId());
    }

    /* (non Javadoc)
     * @Title: sessionWillPassivate
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.http.HttpSessionActivationListener#sessionWillPassivate(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println(name+"被反序列化！，sessionID="+se.getSession().getId());
    }

}
