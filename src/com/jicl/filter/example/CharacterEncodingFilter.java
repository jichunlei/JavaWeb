package com.jicl.filter.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @ClassName: CharacterEncodingFilter
 * @Description: 编号过滤器
 * @author: xianzilei
 * @date: 2019年6月1日 上午8:01:19
 */
@WebFilter(filterName = "CharacterEncodingFilter", urlPatterns = "/*",
    initParams = {@WebInitParam(name = "encoding", value = "utf-8")})
public class CharacterEncodingFilter implements Filter {
    /**
     * 编码格式
     */
    private String encoding;

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        request.setCharacterEncoding(this.encoding);
        //response.setCharacterEncoding(this.encoding);
        response.setContentType("text/html;charset="+encoding); 
        chain.doFilter(request, response);
    }

    /**
     * 初始化 如果设置编码，则以设置的编码为主，否则默认为utf-8
     */
    public void init(FilterConfig fConfig) throws ServletException {
        String initParameterEncoding = fConfig.getInitParameter("encoding");
        encoding = initParameterEncoding == null ? "utf-8" : initParameterEncoding;
    }

    /* (non Javadoc)
     * @Title: destroy
     * @Description: TODO
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
         
    }
}
