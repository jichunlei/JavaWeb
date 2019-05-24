package com.jicl.tag;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 * @ClassName: ViewIpTag
 * @Description: 获取远程服务器的IP（自定义标签）
 * @author: xianzilei
 * @date: 2019年5月23日 上午8:21:06
 */
public class ViewIpTag implements Tag {

    //介绍传递进来的pageContext对象
    private PageContext pageContext;

    /* (non Javadoc)
     * @Title: doEndTag
     * @Description: TODO
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.Tag#doEndTag()
     */
    @Override
    public int doEndTag() throws JspException {
        System.out.println("调用doEndTag()方法");
        return 0;
    }

    /* (non Javadoc)
     * @Title: doStartTag
     * @Description: TODO
     * @return
     * @throws JspException
     * @see javax.servlet.jsp.tagext.Tag#doStartTag()
     */
    @Override
    public int doStartTag() throws JspException {
        System.out.println("调用doStartTag()方法");
        ServletRequest request = pageContext.getRequest();
        String remoteAddr = request.getRemoteAddr();
        JspWriter jspWriter = pageContext.getOut();
        try {
            jspWriter.write(remoteAddr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* (non Javadoc)
     * @Title: getParent
     * @Description: TODO
     * @return
     * @see javax.servlet.jsp.tagext.Tag#getParent()
     */
    @Override
    public Tag getParent() {
        return null;
    }

    /* (non Javadoc)
     * @Title: release
     * @Description: TODO
     * @see javax.servlet.jsp.tagext.Tag#release()
     */
    @Override
    public void release() {
        System.out.println("调用release()方法");
    }

    /* (non Javadoc)
     * @Title: setPageContext
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.jsp.tagext.Tag#setPageContext(javax.servlet.jsp.PageContext)
     */
    @Override
    public void setPageContext(PageContext pageContext) {
        this.pageContext = pageContext;
    }

    /* (non Javadoc)
     * @Title: setParent
     * @Description: TODO
     * @param arg0
     * @see javax.servlet.jsp.tagext.Tag#setParent(javax.servlet.jsp.tagext.Tag)
     */
    @Override
    public void setParent(Tag arg0) {

    }
}
