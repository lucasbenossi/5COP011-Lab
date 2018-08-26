<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora de consumo</title>
</head>
<body>
Consumo:
<%
	double comb = Double.parseDouble(request.getParameter("qtdeComb"));
	double km = Double.parseDouble(request.getParameter("kmsRodados"));
	double resultado = km/comb;
	
	out.println(resultado+" km/l");
%>
<br>
<marquee scrolldelay="1" scrollamount="50">
<p style="font-size: 200px">
<%
	if( resultado < 5.0 ){
		out.println("O carro bebe pra porra");
	}
%>
</p>
</marquee>
</body>
</html>