/**  
 * @Title: MyServletContextAttributeListener.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年6月4日 上午8:47:19
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.listener;

import java.text.MessageFormat;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName: MyServletContextAttributeListener
 * @Description: 自定义ServletContext属性监听器
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:47:19
 */
@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    /* (non Javadoc)
     * @Title: attributeAdded
     * @Description: TODO
     * @param scae
     * @see javax.servlet.ServletContextAttributeListener#attributeAdded(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String msg = MessageFormat.format("ServletContext域对象中添加了属性:{0}，属性值是:{1}", scae.getName(),scae.getValue());
        System.out.println(msg);
    }

    /* (non Javadoc)
     * @Title: attributeRemoved
     * @Description: TODO
     * @param scae
     * @see javax.servlet.ServletContextAttributeListener#attributeRemoved(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        String msg = MessageFormat.format("ServletContext域对象中移除了属性:{0}，属性值是:{1}", scae.getName(),scae.getValue());
        System.out.println(msg);
    }

    /* (non Javadoc)
     * @Title: attributeReplaced
     * @Description: TODO
     * @param scae
     * @see javax.servlet.ServletContextAttributeListener#attributeReplaced(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        String msg = MessageFormat.format("ServletContext域对象中修改了属性:{0}，现属性值是:{1}", scae.getName(),scae.getValue());
        System.out.println(msg);
    }

}
