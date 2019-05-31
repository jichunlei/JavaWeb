package com.jicl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName: FilterDemo
 * @Description: 过滤器学习
 * @author: xianzilei
 * @date: 2019年5月31日 上午8:00:01
 */
public class FilterDemo2 implements Filter {
    
    /**
     * 初始化过滤器
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("初始化过滤器FilterDemo2...");
    }
    

	/**
	 * 过滤操作
	 */
    @Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    System.out.println("过滤开始2...");
		//让目标资源执行，放行
		chain.doFilter(request, response);
		System.out.println("过滤结束2...");
	}
	
	/**
	 * 销毁Filter
	 */
    @Override
	public void destroy() {
	    System.out.println("销毁过滤器FilterDemo2...");
	}
}
