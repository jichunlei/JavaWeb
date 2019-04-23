package com.jicl.servlet.response;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @function ServletOutputStreamLearning
 * @author xianzilei
 * @date 2019/04/22
 */
@WebServlet("/ServletOutputStreamLearning")
public class ServletOutputStreamLearning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOutputStreamLearning() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应内容的类型
	    response.setContentType("text/html;");
		
		//设置字符以utf-8的编码输出到浏览器
		response.setCharacterEncoding("utf-8");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write("贤子磊".getBytes("utf-8"));
		outputStream.write("输出数字：".getBytes("utf-8"));
		//直接输出数字
		//outputStream.write(666);
		outputStream.write((666+"").getBytes());
	}
	/**
	 * response注意点
	 * --1.getOutputStream和getWriter这两个方法互相排斥，调用了其中的任何一个方法后，就不能再调用另一方法。  
	 * --2.Serlvet的service方法结束后，Servlet引擎将检查getWriter或getOutputStream方法返回的输出流对象是
	 *     否已经调用过close方法，如果没有，Servlet引擎将调用close方法关闭该输出流对象，我们无需自己关闭流。
	 */
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
