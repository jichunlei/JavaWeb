/**  
 * @Title: SimpleTagDemo1.java
 * @Prject: JavaWeb
 * @Package: com.jicl.tag.simpletag
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年5月27日 上午8:00:36
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.tag.simpletag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @ClassName: SimpleTagDemo1
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月27日 上午8:00:36
 */
public class SimpleTagDemo6 extends SimpleTagSupport {
    /**
     * count属性
     */
    private Date date;
    
    /**
     * 设置date值
     * @Title: setDate
     * @Description: TODO
     * @param date
     * @return: void
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /* (non Javadoc)
     * @Title: doTag
     * @Description: 
     * @throws JspException
     * @throws IOException
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     */
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write(date.toString());
    }
}
