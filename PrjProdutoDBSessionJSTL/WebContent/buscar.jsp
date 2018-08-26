<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="prjProdutosDBSessionJSTL.Produto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produtos</title>
</head>
<body>
	<a href="index.jsp">Home</a>
	<table>
		<tr>
			<th>Nome</th>
			<th>Preco</th>
			<th>Quantidade</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach var="produto" items="${requestScope['produtos']}">
		<tr>
			<td>${produto.getNome()}</td>
			<td>${produto.getPreco().toString()}</td>
			<td>${produto.getQuantidade().toString()}</td>
			<td><a href="alterar?id=${produto.getId().toString()}">Alterar</a></td>
			<td><a href="excluir?id=${produto.getId().toString()}">Excluir</a></td>
			<td><a href="inserir-carrinho?id=${produto.getId().toString()}">Inserir no carrinho</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>