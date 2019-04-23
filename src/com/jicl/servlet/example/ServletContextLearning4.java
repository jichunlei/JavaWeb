package com.jicl.servlet.example;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext学习4：获取资源文件
 * --是一个全局的储存信息的空间，服务器开始，其就存在，服务器关闭，其才释放。request，一个用户可有多个；session，一个用户一个；而servletContext，所有用户共用一个。所以，为了节省空间，提高效率，ServletContext中，要放必须的、重要的、所有用户需要共享的线程又是安全的一些信息。
 * @function ServletContextLearning3
 * @author xianzilei
 * @date 2019/04/18
 */
@WebServlet("/ServletContextLearning4")
public class ServletContextLearning4 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextLearning4() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("image/apng;charset=utf-8");
        ServletContext servletContext = getServletContext();
        //获取资源文件
        InputStream inputStream = servletContext.getResourceAsStream("/1.jpg");
        byte[] bs=new byte[100];
        ServletOutputStream outputStream = response.getOutputStream();
        int len=0;
        while((len=inputStream.read(bs))>0) {
            outputStream.write(bs, 0, len);
        }
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
