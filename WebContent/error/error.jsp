<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!-- 如果某一个jsp页面是作为系统的错误处理页面，那么建议将page指令的isErrorPage属性(默认为false)设置为"true"来显式声明这个Jsp页面是一个错误处理页面 -->
	<!-- 将error.jsp页面显式声明为错误处理页面后，有什么好处呢，好处就是Jsp引擎在将jsp页面翻译成Servlet的时候，在Servlet的 _jspService方法中会声明一个exception对象，
		  然后将运行jsp出错的异常信息存储到exception对象中,由于Servlet的_jspService方法中声明了exception对象，那么就可以在error.jsp页面中使用exception对象，
		  这样就可以在Jsp页面中拿到出错的异常信息了-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error-page</title>
</head>
<body>
	页面出错！请联系管理员解决！<br/>
	错误信息：<%= exception.getMessage() %>
</body>
</html>