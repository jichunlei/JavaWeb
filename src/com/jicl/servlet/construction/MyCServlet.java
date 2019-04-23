package com.jicl.servlet.construction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet实现方式二：继承HttpServlet类（最常用）
 * @function MyCServlet
 * @author xianzilei
 * @date 2019/04/08
 */
@WebServlet("/MyCServlet")
public class MyCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String message;
	/**
	 * 初始化
	 */
	@Override
	public void init() throws ServletException {
	     message="hello xianzilei!!!";
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码为utf-8
	    response.setCharacterEncoding("utf-8");
	    //设置响应内容类型
	    response.setContentType("text/html");
	    //打印信息
	    PrintWriter writer = response.getWriter();
	    writer.println("<h1>"+message+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doPost(request, response);
	}

}
