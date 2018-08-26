<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="prjProdutosDBSession.*" %>
<%@ page import="java.util.List" %>
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
<%
	
	List<Produto> produtos = (List<Produto>)request.getAttribute("produtos");
	for( Produto produto : produtos ){
%>
		<tr>
			<td><%=produto.getNome() %></td>
			<td><%=produto.getPreco() %></td>
			<td><%=produto.getQuantidade() %></td>
			<td><a href="alterar?id=<%=produto.getId()%>">Alterar</a></td>
			<td><a href="excluir?id=<%=produto.getId()%>">Excluir</a></td>
			<td><a href="inserir-carrinho?id=<%=produto.getId()%>">Inserir no carrinho</a></td>
		</tr>
<%
	}
%>
	</table>
</body>
</html>