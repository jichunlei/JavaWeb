package com.jicl.servlet.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @function PrintWriterLearning
 * @author xianzilei
 * @date 2019/04/22
 */
@WebServlet("/PrintWriterLearning")
public class PrintWriterLearning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintWriterLearning() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应内容的类型
	    response.setContentType("text/html;");
		
		//1.设置字符以utf-8的编码输出到浏览器
		response.setCharacterEncoding("utf-8");
		//2.获取PrintWriter输出流
		//1和2步骤不能颠倒
		PrintWriter writer = response.getWriter();
		writer.println("贤子磊");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
