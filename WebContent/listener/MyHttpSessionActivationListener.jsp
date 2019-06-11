<%@page import="com.jicl.listener.JavaBean2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>监听实现了HttpSessionBindingListener接口的JavaBean对象在session中的绑定和移除</title>
</head>
<body>
	<%
	    session.setAttribute("name", new JavaBean2("javaBean2"));
	%>
</body>
</html>