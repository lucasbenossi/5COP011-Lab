<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produto</title>
</head>
<body>
	<form action="confirmar-alteracao" method="post">
		<input type="hidden" name="id" value="${requestScope['id']}">
		Nome: <input type="text" name="nome" value="${requestScope['nome']}"><br>
		Preco: <input type="text" name="preco"  value="${requestScope['preco']}"><br>
		Quantidade: <input type="text" name="quantidade" value="${requestScope['quantidade']}"><br>
		<input type="submit" value="Alterar">
	</form>
</body>
</html>