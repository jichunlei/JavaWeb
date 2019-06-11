/**  
 * @Title: JavaBean1.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月11日 上午7:56:23
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @ClassName: JavaBean1
 * @Description:实现了HttpSessionBindingListener接口的JavaBean对象可以感知自己被绑定到Session中和 Session中删除的事件
 * @author: xianzilei
 * @date: 2019年6月11日 上午7:56:23
 */
public class JavaBean1 implements HttpSessionBindingListener {

    private String name;
    /* (non Javadoc)
     * @Title: valueBound
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.http.HttpSessionBindingListener#valueBound(javax.servlet.http.HttpSessionBindingEvent)
     */
    @Override
    public void valueBound(HttpSessionBindingEvent arg0) {
        System.out.println(name+"被绑定到session中！");
    }

    /* (non Javadoc)
     * @Title: valueUnbound
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.http.HttpSessionBindingListener#valueUnbound(javax.servlet.http.HttpSessionBindingEvent)
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        System.out.println(name+"从session中被移除！");
    }

    public JavaBean1(String name) {
        super();
        this.name = name;
    }
}
