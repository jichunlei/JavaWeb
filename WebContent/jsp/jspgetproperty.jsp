<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:getProperty标签学习</title>
</head>
<body>
	<jsp:useBean id="person" class="com.jicl.javabean.Person" scope="page" />
	
	<jsp:setProperty property="name" name="person" value="贤子磊"/>
	<jsp:setProperty property="age" name="person" value="27"/>
	<jsp:setProperty property="gender" name="person" value="男"/>
	<jsp:setProperty property="married" name="person" value="false"/>
	姓名：<jsp:getProperty property="name" name="person"/><br/>
	年龄：<jsp:getProperty property="age" name="person"/><br/>
	性别：<jsp:getProperty property="gender" name="person"/><br/>
	婚姻状况：<jsp:getProperty property="married" name="person"/><br/>
</body>
</html>