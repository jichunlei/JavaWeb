package com.jicl.servlet.request.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request中的乱码问题
 * @function Request4Encoding
 * @author xianzilei
 * @date 2019/04/23
 */
@WebServlet("/Request4EncodingServlet")
public class Request4EncodingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request4EncodingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //request.setCharacterEncoding("utf-8");
        System.out.println("username:"+request.getParameter("username"));
        System.out.println("password:"+request.getParameter("password"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//客户端是以UTF-8编码传输数据到服务器端的，所以需要设置服务器端以UTF-8的编码进行接收，否则对于中文数据就会产生乱码
	    request.setCharacterEncoding("utf-8");
	    System.out.println("username:"+request.getParameter("username"));
		System.out.println("password:"+request.getParameter("password"));
	}

}
