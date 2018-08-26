<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora de consumo</title>
</head>
<body>
Calcule o rendimento do seu carro
<form action=calcular.jsp method="POST">
	Quantidade de combustível consumido: <input type="text" name="qtdeComb"><br>
	Quantidade de km rodados: <input type="text" name="kmsRodados">
	<input type="submit" value="Calcular">
</form>
</body>
</html>