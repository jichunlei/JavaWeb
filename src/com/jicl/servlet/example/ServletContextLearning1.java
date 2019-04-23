package com.jicl.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext学习1：WEB容器在启动时，它会为每个WEB应用程序都创建一个对应的ServletContext对象，它代表当前web应用
 * --即WEB应用程序一直开启则ServletContext一直存在
 * @function ServletContextLearning1
 * @author xianzilei
 * @date 2019/04/17
 */
@WebServlet("/ServletContextLearning1")
public class ServletContextLearning1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextLearning1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    ServletContext servletContext = this.getServletContext();
	    String password="xianzilei2";
	    servletContext.setAttribute("password", password);
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter writer = response.getWriter();
	    writer.println("密码已上传成功！");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
