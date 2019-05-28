<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>国际化(i18n)测试</title>
</head>
<body>
	<%
		ResourceBundle resourceBundle=ResourceBundle.getBundle("com.jicl.i18n.properities.myproperties", request.getLocale());
	%>
	
	<form action="" method="get">
		<%=resourceBundle.getString("username") %><input type="text" name="username"/><br/>
		<%=resourceBundle.getString("password") %><input type="password" name="password"/><br/>
		<input type="submit" value="<%= resourceBundle.getString("submit")%>"><br/>
	</form>
</body>
</html>