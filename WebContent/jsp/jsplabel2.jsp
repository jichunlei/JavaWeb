<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:param标签</title>
<%-- 当使用<jsp:include>和<jsp:forward>标签引入或将请求转发给其它资源时，可以使用<jsp:param>标签向这个资源传递参数。 --%>
</head>
<body>
	<% 
		//解决乱码问题:在设置参数前先设置编码为utf-8
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:forward page="/jsp/page7.jsp">
		<jsp:param name="name" value="贤子磊"/>
		<jsp:param name="age" value="23"/>
	</jsp:forward>
</body>
</html>