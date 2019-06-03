package com.jicl.filter.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: CharacterEncodingServlet
 * @Description: 乱码处理
 * @author: xianzilei
 * @date: 2019年6月1日 上午8:18:32
 */
@WebServlet("/CharacterEncodingServlet")
public class CharacterEncodingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String requestCharacterEncoding = request.getCharacterEncoding();
	    String method = request.getMethod();
	    String responseCharacterEncoding = response.getCharacterEncoding();
	    PrintWriter out = response.getWriter();
	    out.println("method="+method);
	    out.println("requestCharacterEncoding="+requestCharacterEncoding);
	    out.println("responseCharacterEncoding="+responseCharacterEncoding);
	    //out.println("name="+name);
	    out.println(name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
