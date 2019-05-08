<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext获取属性值</title>
</head>
<body>
	<%-- <%
	    //跳转
	    pageContext.forward("/jsp/page2.jsp");
	%> --%>
	<!-- jsp:forward标签 -->
	<jsp:forward page="/jsp/page.jsp"></jsp:forward>
</body>
</html>