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
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @ClassName: SimpleTagDemo1
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月27日 上午8:00:36
 */
public class SimpleTagDemo4 extends SimpleTagSupport {
    /* (non Javadoc)
     * @Title: doTag
     * @Description: 重写doTag方法，控制jsp是否执行
     * @throws JspException
     * @throws IOException
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     */
    @Override
    public void doTag() throws JspException, IOException {
        //抛出SkipPageException异常来结束jsp页面
        throw new SkipPageException();
    }
}
