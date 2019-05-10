<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:setProperty标签学习</title>
</head>
<body>
	<%-- jsp:useBean标签用于在指定的域范围内查找指定名称的JavaBean对象，如果存在则直接返回该JavaBean对象的引用，
		如果不存在则实例化一个新的JavaBean对象并将它以指定的名称存储到指定的域范围中
		1.id:实例化对象的引用名称
		2.class:实例化对象类路径
		3.scope:作用域
	 --%>
	<jsp:useBean id="person" class="com.jicl.javabean.Person" scope="page" />
	
	<%-- 格式一：<jsp:setProperty name="beanName" property="propertyName" value="string字符串"/> 
		1.name:指定JavaBean对象的名称
		2.property:JavaBean实例对象的属性名。
		3.value:指定JavaBean对象的某个属性的值，value的值可以是字符串，也可以是表达式。为字符串时，该值会自动转化为JavaBean属性相应的类型
	--%>
	<jsp:setProperty property="name" name="person" value="贤子磊"/>
	<jsp:setProperty property="age" name="person" value="19"/>
	<jsp:setProperty property="gender" name="person" value="男"/>
	<jsp:setProperty property="married" name="person" value="false"/>
	姓名：<%= person.getName() %><br/>
	年龄：<%= person.getAge() %> <br/>
	性别：<%= person.getGender() %><br/>
	婚姻状况：<%= person.isMarried() %><br/>
</body>
</html>