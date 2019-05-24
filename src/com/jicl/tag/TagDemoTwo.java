/**
 * @Title: TagDemoTwo.java
 * @Prject: JavaWeb
 * @Package: com.jicl.tag
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月24日 上午8:13:45
 * @version: V1.0 Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @ClassName: TagDemoTwo
 * @Description: Tag案例二：控制jsp页面是否执行
 * @author: xianzilei
 * @date: 2019年5月24日 上午8:13:45
 */
public class TagDemoTwo extends TagSupport {

    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /* (non Javadoc)
     * @Title: doEndTag
     * @Description: 控制jsp页面是否执行
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.TagSupport#doEndTag()
     */
    @Override
    public int doEndTag() throws JspException {
        // 执行
        //return Tag.EVAL_PAGE;
        // 不执行
         return Tag.SKIP_PAGE;
    }
}
