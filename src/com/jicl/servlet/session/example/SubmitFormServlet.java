package com.jicl.servlet.session.example;

import java.io.IOException;

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
@WebServlet("/SubmitFormServlet")
public class SubmitFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
	    System.out.println("提交表单信息:"+"username="+username+";password="+password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//判断token是否一致
		if(isRepeatSubmit(request)) {
		    System.out.println("请不要重复提交！");
		    return;
		}
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("提交表单信息:"+"username="+username+";password="+password);
        request.getSession().removeAttribute("token");
	}
	
	private boolean isRepeatSubmit(HttpServletRequest request) {
	    String client_token = request.getParameter("token");
	    if(client_token==null) {
	        return true;
	    }
	    
	    HttpSession session = request.getSession();
        String server_token = (String)session.getAttribute("token");
	    if(server_token==null) {
	        return true;
	    }
	    
	    if(!server_token.equals(client_token)) {
	        return true;
	    }
	    return false;
	}

}
