<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.sym"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP脚本表达式（expression）：
		1.将程序数据输出到客户端。
		2.JSP引擎在翻译脚本表达式时，会将程序数据转成字符串，
		然后在相应位置用out.print(…) 将数据输给客户端。
		3.JSP脚本表达式中的变量或表达式后面不能有分号（;）
	 -->
	<%=new Date()%>

	<!-- JSP脚本片断(scriptlet)：
		1.用于在JSP页面中编写多行Java代码，可以定义变量、编写语句，不能定义方法。
		2.JSP脚本片断中只能出现java代码，不能出现其它模板元素， JSP引擎在翻译JSP页面中，
			会将JSP脚本片断中的Java代码将被原封不动地放到Servlet的_jspService方法中。
		3.在一个JSP页面中可以有多个脚本片断，在两个或多个脚本片断之间可以嵌入文本、HTML标记和其他JSP元素
		4.单个脚本片断中的Java语句可以是不完整的，但是，多个脚本片断组合后的结果必须是完整的Java语句
	 -->
	<%
	    int s = 999;
	    s = s + 1;
	%>

	<%
	    out.println(s);
	%>

	<%
	    for (int i = 0; i < 2; i++) {
	%>
	<p>JSP初识</p>
	<%
	    }
	%>

    <% 
    	method1("调用方法");
    %>
	<!-- JSP声明 
		1.JSP页面中编写的所有代码，默认会翻译到servlet的service方法中， 
			而Jsp声明中的java代码被翻译到_jspService方法的外面
		2.JSP声明可用于定义JSP页面转换成的Servlet程序的静态代码块、成员变量和方法
	-->
	<%!static {
        System.out.println("JSP初始化...");
    }

    public void method1(String str) {
        System.out.println(str);
    }%>
</body>
</html>