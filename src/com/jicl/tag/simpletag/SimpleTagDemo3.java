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
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @ClassName: SimpleTagDemo1
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月27日 上午8:00:36
 */
public class SimpleTagDemo3 extends SimpleTagSupport {
    /* (non Javadoc)
     * @Title: doTag
     * @Description: 重写doTag方法，修改标签内容
     * @throws JspException
     * @throws IOException
     * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
     */
    @Override
    public void doTag() throws JspException, IOException {
        //得到代表jsp标签体的JspFragment
        JspFragment jspFragment = getJspBody();
        //将标签体的内容写入到stringWriter流中
        StringWriter stringWriter = new StringWriter();
        jspFragment.invoke(stringWriter);
        //获取标签内容
        String context = stringWriter.getBuffer().toString();
        //转成大写
        context=context.toUpperCase();
        //输出到浏览器
        getJspContext().getOut().write(context);
    }
}
