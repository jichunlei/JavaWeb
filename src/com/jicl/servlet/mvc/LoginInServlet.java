package com.jicl.servlet.mvc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

import com.jicl.javabean.User;

/**
 * @function LoginInServlet
 * @author xianzilei
 * @date 2019/05/13
 */
@WebServlet("/LoginInServlet")
public class LoginInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求体编码
	    request.setCharacterEncoding("utf-8");
	    //收集请求参数
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    //封装到模型中
	    User user = new User();
	    user.setPassword(password);
	    user.setUsername(username);
	    response.setCharacterEncoding("utf-8");
	    String errormsg=null;
	    if((errormsg=validateBeforeLogin(user))==null) {
	        request.getRequestDispatcher("/mvc/success.jsp").forward(request, response);
	    }else {
	        request.setAttribute("user", user);
	        request.setAttribute("errormsg",errormsg);
	        request.getRequestDispatcher("/mvc/login.jsp").forward(request, response);
	    }
	}
	
	/**
	 * 校验
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 * @throws IOException
	 */
	private String validateBeforeLogin(User user) throws IOException {
	    String username = user.getUsername();
	    String password = user.getPassword();
	    if(StringUtils.isBlank(username)||StringUtils.isBlank(password)) {
	        return "用户名或密码不能为空！";
        }
	    Properties properties=new Properties();
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\eclipse_workspace\\JavaWeb\\config\\userinfo.properties"));
        properties.load(bufferedReader);
        String usernameLocal = properties.getProperty("username");
        String passwordLocal = properties.getProperty("password");
	    if(!username.equals(usernameLocal)||!password.equals(passwordLocal)) {
	        return "用户名或密码不正确！";
	    }
	    return null;
	}
}
