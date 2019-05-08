<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext获取属性值</title>
</head>
<body>
	<%
	    //赋值
	    pageContext.setAttribute("name1", "value1");
	    request.setAttribute("name2", "value2");
	    session.setAttribute("name3", "value3");
	    application.setAttribute("name4", "value4");
	%>
	<%
	    String name1 = (String)pageContext.findAttribute("name1");
	    String name2 = (String)pageContext.findAttribute("name2");
	    String name3 = (String)pageContext.findAttribute("name3");
	    String name4 = (String)pageContext.findAttribute("name4");
	    String name5 = (String)pageContext.findAttribute("name5");
	%>
	name1=<%= name1 %><br/>
	name2=<%= name2 %><br/>
	name3=<%= name3 %><br/>
	name4=<%= name4 %><br/>
	name5=<%= name5 %><br/>
</body>
</html>