/**
 * @Title: TagDemoOne.java
 * @Prject: JavaWeb
 * @Package: com.jicl.tag
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月24日 上午7:55:55
 * @version: V1.0 Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @ClassName: TagDemoOne
 * @Description: tag案例一：控制标签是否执行
 * @author: xianzilei
 * @date: 2019年5月24日 上午7:55:55
 */
public class TagDemoOne extends TagSupport {
    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /* (non Javadoc)
     * @Title: doStartTag
     * @Description: 重新doStartTag方法：控制标签是否执行
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
     */
    @Override
    public int doStartTag() throws JspException {
        // 执行标签体
        return Tag.EVAL_BODY_INCLUDE;
        // 不执行标签体
        // return Tag.SKIP_BODY;
    }
}
