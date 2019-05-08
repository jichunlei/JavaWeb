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
		pageContext.setAttribute("name", "贤子磊");
		pageContext.setAttribute("age", 23);
		request.setAttribute("name2", "贤子磊2");
		request.setAttribute("age2", 24);
	%>
	<!-- 服务器跳转 -->
	<jsp:forward page="/jsp/page6.jsp"></jsp:forward>
</body>
</html>