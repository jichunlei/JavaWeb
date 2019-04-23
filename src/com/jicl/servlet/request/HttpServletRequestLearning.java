package com.jicl.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @function HttpServletRequestLearning
 * @author xianzilei
 * @date 2019/04/10
 */
@WebServlet("/HttpServletRequestLearning")
public class HttpServletRequestLearning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpServletRequestLearning() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //设置响应内容类型
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    String tableTitle="请求体信息";
	    out.println("<!DOCTYPE html>\n");
	    out.println("<html>\n"+"<head>\n"+"<body>\n"+"<table border=\"1\">\n"+"<caption>"+tableTitle+"</caption>\n");
	    //获取请求方法(POST、SET等等)
	    String requestMethod = request.getMethod();
	    out.println("<tr>"+"<td>请求类型</td>\n"+"<td>"+requestMethod+"</td>\n"+"</tr>\n");
	    //获取头部信息
	    Enumeration<String> headerNames = request.getHeaderNames();//获取头部信息
	    String headerNamesString="";
	    while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            headerNamesString+=headerName+"="+headerValue+";\n";
        }
	    out.println("<tr>"+"<td>请求头信息</td>\n"+"<td>"+headerNamesString+"</td>\n"+"</tr>\n");
	    //获取统一资源定位符(URL)
	    StringBuffer requestURL = request.getRequestURL();
	    out.println("<tr>"+"<td>统一资源定位符(URL)</td>\n"+"<td>"+requestURL+"</td>\n"+"</tr>\n");
	    //获取统一资源标记符(URI)
	    String requestURI = request.getRequestURI();
        out.println("<tr>"+"<td>统一资源标记符(URI)</td>\n"+"<td>"+requestURI+"</td>\n"+"</tr>\n");
        //获取请求行中的参数部分
        String queryString = request.getQueryString();
        out.println("<tr>"+"<td>请求参数</td>\n"+"<td>"+queryString+"</td>\n"+"</tr>\n");
        //获取请求URL中的额外路径信息
        String pathInfo = request.getPathInfo();
        out.println("<tr>"+"<td>请求URL中的额外路径信息</td>\n"+"<td>"+pathInfo+"</td>\n"+"</tr>\n");
        //获取请求的客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        out.println("<tr>"+"<td>客户机的IP地址</td>\n"+"<td>"+remoteAddr+"</td>\n"+"</tr>\n");
        //获取请求的客户机的完整主机名
        String remoteHost = request.getRemoteHost();
        out.println("<tr>"+"<td>客户机的完整主机名</td>\n"+"<td>"+remoteHost+"</td>\n"+"</tr>\n");
        //获取客户机所使用的网络端口号
        int remotePort = request.getRemotePort();
        out.println("<tr>"+"<td>客户机所使用的网络端口号</td>\n"+"<td>"+remotePort+"</td>\n"+"</tr>\n");
        //获取客户机用户名
        String remoteUser = request.getRemoteUser();
        out.println("<tr>"+"<td>客户机用户名</td>\n"+"<td>"+remoteUser+"</td>\n"+"</tr>\n");
        //获取WEB服务器的IP地址
        String localAddr = request.getLocalAddr();
        out.println("<tr>"+"<td>WEB服务器的IP地址</td>\n"+"<td>"+localAddr+"</td>\n"+"</tr>\n");
        //获取WEB服务器的主机名
        String localName = request.getLocalName();
        out.println("<tr>"+"<td>WEB服务器的主机名</td>\n"+"<td>"+localName+"</td>\n"+"</tr>\n");
        //获取WEB服务器的网络端口号
        int localPort = request.getLocalPort();
        out.println("<tr>"+"<td>WEB服务器的网络端口号</td>\n"+"<td>"+localPort+"</td>\n"+"</tr>\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
