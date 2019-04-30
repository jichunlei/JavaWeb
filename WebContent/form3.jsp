<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- 使用token对重复提交进行处理 --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单重复提交练习</title>
</head>
<body>
	<form action="SubmitFormServlet" method=POST>
	<input type="hidden" name="token" value="${token}"/>
	用户名：<input type="text" name="username">
	<br />
	密码：<input type="text" name="password" />
	<br />
	<input type="submit" value="提交" />
	</form>
</body>
</html>