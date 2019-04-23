package com.jicl.servlet.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 设置浏览器刷新时间间隔refresh
 * @function RefreshServlet
 * @author xianzilei
 * @date 2019/04/16
 */
@WebServlet("/RefreshServlet")
public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //设置刷新时间间隔(每隔三秒刷新一次)
	    //response.setHeader("refresh", "3");
	    //设置浏览器3秒后跳转到http://www.baidu.com页面
	    response.setHeader("refresh", "20;url='http://www.baidu.com'");
	    response.getWriter().write("xianzilei");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
