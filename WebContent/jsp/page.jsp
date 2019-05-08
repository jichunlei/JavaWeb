<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext访问其他域</title>
</head>
<body>
	<%
	    //通过pageContext在session中存放属性name
	    pageContext.setAttribute("name", "贤子磊", PageContext.SESSION_SCOPE);
	%>
	<%
		//取name属性的三种方式
	    String name1 = (String)pageContext.findAttribute("name");
	    String name2 = (String)pageContext.getAttribute("name", PageContext.SESSION_SCOPE);
	    String name3 = (String)session.getAttribute("name");
	%>
	name1=<%=name1%><br /> 
	name2=<%=name2%><br /> 
	name3=<%=name3%><br />
</body>
</html>