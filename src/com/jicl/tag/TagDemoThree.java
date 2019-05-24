/**
 * @Title: TagDemoThree.java
 * @Prject: JavaWeb
 * @Package: com.jicl.tag
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年5月24日 上午8:24:54
 * @version: V1.0 Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @ClassName: TagDemoThree
 * @Description: Tag案例三：控制标签的执行次数
 * @author: xianzilei
 * @date: 2019年5月24日 上午8:24:54
 */
public class TagDemoThree extends TagSupport {

    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: 序列化ID
     */
    private static final long serialVersionUID = 1L;

    int num = 4;

    /* (non Javadoc)
     * @Title: doStartTag
     * @Description: TODO
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
     */
    @Override
    public int doStartTag() throws JspException {
        // 输出标签内容
        return Tag.EVAL_BODY_INCLUDE;
    }

    /* (non Javadoc)
     * @Title: doAfterBody
     * @Description: 控制标签的执行次数
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.TagSupport#doAfterBody()
     */
    @Override
    public int doAfterBody() throws JspException {
        if (num <= 0) {
            // 不重复执行
            return IterationTag.SKIP_BODY;
        }
        num--;
        // 重复执行
        return IterationTag.EVAL_BODY_AGAIN;
    }
}
