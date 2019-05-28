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
public class SimpleTagDemo2 extends SimpleTagSupport {
    /* (non Javadoc)
     * @Title: doTag
     * @Description: 重写doTag方法，控制标签执行10次
     * @throws JspException
     * @throws IOException
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     */
    @Override
    public void doTag() throws JspException, IOException {
        //得到代表jsp标签体的JspFragment
        JspFragment jspFragment = getJspBody();
        //将标签体的内容输出到浏览器10次
        for (int i = 0; i < 10; i++) {
            jspFragment.invoke(null);
        }
        
    }
}
