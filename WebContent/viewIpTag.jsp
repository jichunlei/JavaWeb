<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 使用taglib指令引用gacl标签库，标签库的前缀(prefix)可以随便设置，如这里设置成 prefix="xdp" -->
    <%@taglib uri="/xianzilei" prefix="xdp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看远程服务器的IP</title>
</head>
<body>
	服务器IP地址为(自定义标签输出)：
	<xdp:viewIP/>
</body>
</html>