package com.jicl.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext学习3：获取上下文属性；获取初始化参数
 * --是一个全局的储存信息的空间，服务器开始，其就存在，服务器关闭，其才释放。request，一个用户可有多个；session，一个用户一个；而servletContext，所有用户共用一个。所以，为了节省空间，提高效率，ServletContext中，要放必须的、重要的、所有用户需要共享的线程又是安全的一些信息。
 * @function ServletContextLearning3
 * @author xianzilei
 * @date 2019/04/18
 */
@WebServlet("/ServletContextLearning3")
public class ServletContextLearning3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextLearning3() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = getServletContext();
        PrintWriter writer = response.getWriter();
        //1.获取上下文属性
        Enumeration<String> attributeNames = servletContext.getAttributeNames();
        writer.println("<h1>---------------------上下文属性----------------------</h1>");
        while (attributeNames.hasMoreElements()) {
            String name = attributeNames.nextElement();
            writer.println("<h1>" + name + "=" + servletContext.getAttribute(name) + "</h1>");
        }
        
        //2.获取初始化参数
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        writer.println("<h1>---------------------初始化参数----------------------</h1>");
        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            writer.println("<h1>" + name + "=" + servletContext.getInitParameter(name) + "</h1>");
        }
        
        //3.获取转发信息
        writer.println("<h1>---------------------转发信息----------------------</h1>");
        Object info = request.getAttribute("转发人");
        writer.println(info);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
