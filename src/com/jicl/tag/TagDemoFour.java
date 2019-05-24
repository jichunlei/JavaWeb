/**  
 * @Title: TagDemoFour.java
 * @Prject: JavaWeb
 * @Package: com.jicl.tag
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年5月24日 上午8:49:51
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

/**
 * @ClassName: TagDemoFour
 * @Description: tag案例四：修改标签内容
 * @author: xianzilei
 * @date: 2019年5月24日 上午8:49:51
 */
public class TagDemoFour extends BodyTagSupport{

    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /* (non Javadoc)
     * @Title: doStartTag
     * @Description: 修改标签内容
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.BodyTagSupport#doStartTag()
     */
    @Override
    public int doStartTag() throws JspException {
         return BodyTag.EVAL_BODY_BUFFERED;
    }
    
    /* (non Javadoc)
     * @Title: doEndTag
     * @Description: 修改标签内容
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.BodyTagSupport#doEndTag()
     */
    @Override
    public int doEndTag() throws JspException {
        //得到代表标签体的bodyContent对象
        BodyContent bodyContent = getBodyContent();
        //拿到标签体
        String content = bodyContent.getString();
        String upperCaseContent = content.toUpperCase();
        try {
            pageContext.getOut().write(upperCaseContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Tag.EVAL_PAGE;
    }
}
