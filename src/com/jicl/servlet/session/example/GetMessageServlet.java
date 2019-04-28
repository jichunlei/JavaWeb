package com.jicl.servlet.session.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 获取信息
 * @function SetMessageServlet
 * @author xianzilei
 * @date 2019/04/27
 */
@WebServlet("/GetMessageServlet")
public class GetMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    response.setContentType("text/html;charset=utf-8");
	    String username = (String)session.getAttribute("username");
	    String password = (String)session.getAttribute("password");
        PrintWriter writer = response.getWriter();
        writer.println("用户名："+username+"<br/>");
        writer.println("密    码："+password+"<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
