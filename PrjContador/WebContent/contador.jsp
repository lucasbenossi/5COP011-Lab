<%@page import="exemplo.contador.Contador" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contador</title>
</head>
<body style="background-color: fuchsia; color: #0000FF; font-size: 72px">
<marquee scrolldelay="1" scrollamount="100">
A contagem de acessos é igual a:
<%
	out.println(Contador.getContador());
%>
</marquee>
</body>
</html>