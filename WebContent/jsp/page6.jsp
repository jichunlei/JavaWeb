<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext属性范围</title>
</head>
<body>
	<%
	    String name = (String)pageContext.getAttribute("name");
	    int age = 0;
	    if (pageContext.getAttribute("age") != null) {
	        age = (int)pageContext.getAttribute("age");
	    }
	    String name2 = (String)request.getAttribute("name2");
	    int age2 = 0;
	    if (request.getAttribute("age2") != null) {
	        age2 = (int)request.getAttribute("age2");
	    }
	%>
	name:<%=name%><br /> 
	age:<%=age%><br />
	name2:<%=name2%><br /> 
	age2:<%=age2%><br />
</body>
</html>