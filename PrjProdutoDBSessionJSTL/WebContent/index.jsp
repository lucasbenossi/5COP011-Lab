<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produtos</title>
</head>
<body>
	<h1>Buscar</h1>
	<form action="buscar">
		Digite o nome do produto: 
		<input type="text" name="nome" />
		<br />
		<input type="submit" value="Buscar" />
	</form>
	
	<h2>Inserir</h2>
	<form action="inserir" method="POST">
		Nome: <input type="text" name="nome" /><br>
		Preco: <input type="text" name="preco" /><br>
		Quantidade: <input type="text" name="quantidade" /><br>
		<input type="submit" value="Inserir" />
	</form>
	
	<h2>Carrinho</h2>
	<c:if test="${not empty sessionScope.carrinho}">
	<table>
		<c:forEach var="produto" items="${sessionScope['carrinho']}">
		<tr>
			<td>${produto.getNome()}</td>
			<td><a href="remover-carrinho?id=${produto.getId().toString()}">Remover</a></td>
		</tr>
		</c:forEach>
	</table>
	</c:if>
	<c:if test="${empty sessionScope.carrinho}">
			Carrinho vazio.
	</c:if>
	
	<h2><a href="limpar-carrinho">Limpar carrinho</a></h2>
</body>
</html>