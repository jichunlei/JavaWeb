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

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @ClassName: SimpleTagDemo1
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月27日 上午8:00:36
 */
public class SimpleTagDemo5 extends SimpleTagSupport {
    /**
     * count属性
     */
    private int count;
    
    /**
     * 设置count属性值
     * @Title: setCount
     * @Description: TODO
     * @param count
     * @return: void
     */
    public void setCount(int count) {
        this.count = count;
    }

    /* (non Javadoc)
     * @Title: doTag
     * @Description: 重写doTag方法，控制标签执行count次
     * @throws JspException
     * @throws IOException
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     */
    @Override
    public void doTag() throws JspException, IOException {
        JspFragment jspFragment = getJspBody();
        for (int i = 0; i < count; i++) {
            jspFragment.invoke(null);
        }
    }
}
