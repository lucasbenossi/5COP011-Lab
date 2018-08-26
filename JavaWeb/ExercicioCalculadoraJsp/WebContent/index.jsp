<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora TOP</title>
</head>
<body>
<form action="calculadora.jsp" method="POST">
	Valor 1: <input type="text" name="valor1"><br>
	Valor 2: <input type="text" name="valor2"><br>
	Operação: 
		<select name="operacao">
			<option value="somar">Somar</option>
			<option value="subtrair">Subtrair</option>
			<option value="multiplicar">Multiplicar</option>
			<option value="dividir">Dividir</option>
		</select>
	<input type="submit" value="Calcular" />
</form>
</body>
</html>