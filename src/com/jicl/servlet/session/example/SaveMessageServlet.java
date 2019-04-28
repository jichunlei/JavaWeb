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
 * 保存信息
 * @function SetMessageServlet
 * @author xianzilei
 * @date 2019/04/27
 */
@WebServlet("/SaveMessageServlet")
public class SaveMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveMessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //注意：在往session中存数据的时候需要先设置request的编码为utf-8，否则从session中取数据时会导致中文乱码
	    request.setCharacterEncoding("Utf-8");
	    HttpSession session = request.getSession();
	    session.setAttribute("username", request.getParameter("username"));
	    session.setAttribute("password", request.getParameter("password"));
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter writer = response.getWriter();
	    writer.println("<h1>保存成功！</h1><br/>");
	    String url=request.getContextPath()+"/GetMessageServlet";
	    writer.print("<a href='"+url+"'>点击查看详情</a><br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    HttpSession session = request.getSession();
	    session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password"));
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>保存成功！</h1></br>");
        String url=request.getContextPath()+"/GetMessageServlet";
        url=response.encodeURL(url);
        System.out.println(url);
        writer.println("<a href='"+url+"'>点击查看详情</a><br/>");
	}

}
