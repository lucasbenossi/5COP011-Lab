<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora TOP</title>
</head>
<body>
Resultado: 
<%
	double valor1 = Double.parseDouble(request.getParameter("valor1"));
	double valor2 = Double.parseDouble(request.getParameter("valor2"));
	String operacao = request.getParameter("operacao");
	double resultado = 0;
	
	if( operacao.compareTo("somar") == 0 ){
		resultado = valor1 + valor2;
	}
	else if( operacao.compareTo("subtrair") == 0 ){
		resultado = valor1 - valor2;
	}
	else if( operacao.compareTo("multiplicar") == 0 ){
		resultado = valor1 * valor2;
	}
	else if( operacao.compareTo("dividir") == 0 ){
		resultado = valor1 / valor2;
	}
	
	out.println(resultado);
%>
</body>
</html>