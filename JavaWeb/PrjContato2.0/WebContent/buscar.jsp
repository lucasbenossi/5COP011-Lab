<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="contato2.Contato" %>
<%@page import="java.text.SimpleDateFormat" %>
<%! @SuppressWarnings("unchecked") %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Buscar</title>
</head>
<body>
	<table>
		<tr>
			<th>Nome</th>
			<th>Endereco</th>
			<th>E-mail</th>
			<th>Data de nascimento</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
<%
	
	List<Contato> listaContatos = (List<Contato>)request.getAttribute("listaContatos");
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	for( Contato contato : listaContatos ){
%>
		<tr>
			<td><%=contato.getNome() %></td>
			<td><%=contato.getEndereco() %></td>
			<td><%=contato.getEmail() %></td>
			<td><% out.print(formatter.format(contato.getDataNascimento().getTime())); %></td>
			<td><a href="alterar?id=<%=contato.getId()%>">Alterar</a></td>
			<td><a href="excluir?id=<%=contato.getId()%>">Excluir</a></td>
		</tr>
<%
	}
%>
	</table>
</body>
</html>