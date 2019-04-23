package com.jicl.servlet.construction;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet实现方式二：继承GenericServlet类（极少用）
 * @function MyBServlet
 * @author xianzilei
 * @date 2019/04/08
 */
@WebServlet("/MyBServlet")
public class MyBServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * GenericServlet实现了 Servlet 接口除了 service 的方法，故不需要重新init()和destroy()方法
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("MyBServlet执行服务：service()...");
	}

}
