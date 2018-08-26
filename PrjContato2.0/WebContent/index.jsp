<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.LinkedList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contato</title>
</head>
<body>
	<h3>Buscar</h3>
	<form action="buscar">
		Nome: <input type="text" name="nomeContato"><br>
		<input type="submit" value="Buscar">
	</form>
	
	<h3>Adicionar</h3>
	<form action="adicionar" method="POST">
		Nome: <input type="text" name="nome"><br>
		Endereco: <input type="text" name="endereco"><br>
		E-mail: <input type="text" name="email"><br>
		Data de nascimento: <input type="text" name="nascimento"><br>
		<input type="submit" value="Adicionar">
	</form>
	
	<h3>Buscas recentes</h3>
	<table>
		<%
			LinkedList<String> listaBuscados = (LinkedList<String>)request.getSession().getAttribute("listaBuscas");
			if(listaBuscados != null){
				for( String busca : listaBuscados ){
		%>
		<tr>
			<td><%=busca%></td>
		</tr>
		<%
				}
			}
			else{
				out.println("Nenhuma busca recente.");
			}
		%>
	</table>
</body>
</html>