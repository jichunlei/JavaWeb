package com.jicl.servlet.construction;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet实现方式一：实现Servlet接口（最底层）
 * @function MyServlet
 * @author xianzilei
 * @date 2019/04/08
 */
@WebServlet(urlPatterns="/MyAServlet",loadOnStartup=-1)
public class MyAServlet implements Servlet {

	/**
	 * 初始化：当Servlet刚开始创建时调用该方法，且只调用一次，整个生命周期只执行一次
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化MyAServlet：init()...");
	}

	/**
	 * 销毁：当Servlet被销毁时调用此方法，该方法不是销毁Servlet，而是在销毁前的调用，可以理解为最后的挣扎
	 */
	public void destroy() {
	    System.out.println("销毁MyAServlet：destroy()...");
	}

	/**
	 * 获取Servlet配置信息
	 */
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * 获取Servlet基本信息
	 */
	public String getServletInfo() {
		return null; 
	}

	/**
	 * 服务：对请求的响应，每次请求都会调用一次
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("MyAServlet执行服务：service()...");
	}

}
