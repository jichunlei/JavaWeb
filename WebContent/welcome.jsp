<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	使用普通方式取出存储在request对象中的参数：
	<%-- <h3 style="color:red;"><%=request.getParameter("username")%></h3> --%>
	<h1>
		Welcome to My WebInternet，<%=request.getParameter("username")%>！
	</h1>
	使用EL表达式取出存储在request对象中的参数：
	<%-- <h3 style="color:red;">${param.username}</h3> --%>
	<h1>Welcome to My WebInternet，${param.username}！</h1>
</body>
</html>