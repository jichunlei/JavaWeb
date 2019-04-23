package com.jicl.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig学习
 * 
 * @function ServletConfigLearning
 * @author xianzilei
 * @date 2019/04/17
 */
/**
 * --@WebServlet常用属性 ----asyncSupported：指定Servlet是否支持异步操作模式，类型boolean ----displayName：指定Servlet显示名称，类型String
 * ----initParams： 配置初始化参数，类型WebInitParam[] ----loadOnStartup：标记容器是否在应用启动时就加载这个Servlet，类型int
 * ----name：指定Servlet名称，类型String ----urlPatterns：指定Servlet处理的url，类型String[] ----value：指定Servlet处理的url，类型String[]
 */
@WebServlet(name = "ServletConfigLearning-贤子磊", urlPatterns = {"/ServletConfigLearning", "/ServletConfigLearning2"},
    loadOnStartup = 1,
    initParams = {@WebInitParam(name = "username", value = "xianzilei"),
        @WebInitParam(name = "password", value = "123"),
        @WebInitParam(name = "charset", value = "UTF-8")},
    description = "这是一篇关于ServletConfig的学习笔记", displayName = "xianzilei的Servlet")
public class ServletConfigLearning extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * 定义一个ServletConfig来接收配置
     */
    private ServletConfig config;

    /**
     * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时， 会自动将这些初始化参数封装到ServletConfig对象中， 并在调用servlet的init方法时，
     * 将ServletConfig对象传递给servlet。 进而，程序员通过ServletConfig对象就可以 得到当前servlet的初始化参数信息。
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        //servletName:对于注解中name属性，如果name未定义，则表示为该Servlet类的限定名
        String servletName = config.getServletName();
        writer.println("<h1>" + "servletName" + "=" + servletName + "</h1>");
        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            String value = config.getInitParameter(name);
            writer.println("<h1>" + name + "=" + value + "</h1>");
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
