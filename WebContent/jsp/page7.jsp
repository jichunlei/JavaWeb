<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext属性范围</title>
</head>
<body>
	<h1>接收传递过来的参数</h1><br /> 
	name:<%=request.getParameter("name")%><br /> 
	age:<%=request.getParameter("age")%><br />
</body>
</html>