<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="prjProdutosDBSession.Produto" %>
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
		<%
			LinkedList<Produto> carrinho = (LinkedList<Produto>)request.getSession().getAttribute("carrinho");
			if(carrinho != null && carrinho.size() > 0 ){
		%>
	<table>
		<%
				for( Produto produto : carrinho ){
		%>
		<tr>
			<td><%=produto.getNome()%></td>
			<td><a href="remover-carrinho?id=<%=produto.getId()%>">Remover</a></td>
		</tr>
		<%
				}
		%>
	</table>
		<%
			}
			else{
				out.println("Nenhum produto no carrinho.");
			}
		%>
	
	<h2><a href="limpar-carrinho">Limpar carrinho</a></h2>
</body>
</html>