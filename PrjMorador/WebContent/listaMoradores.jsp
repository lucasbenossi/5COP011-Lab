<%@page import="ex.morador.Morador" %>
<%@page import="java.util.LinkedList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	body {
		background-color: fuchsia;
		color: green;
		font-size: 5em;
	}
	table, th, td {
		border: 1px solid black;
	}
</style>
<title>Lista de moradores</title>
</head>
<body>
<marquee scrolldelay="1" scrollamount="30">
<%
	LinkedList<Morador> moradores = new LinkedList<Morador>();
	String nome;
	
	for( int i = 0; i < 100; i++ ){
		nome = "morador"+i;
		moradores.add( new Morador(nome, i) );
	}
%>
<table>
	<tr>
		<th>Nome</th>
		<th>Numero</th>
	</tr>
	<% for( Morador m: moradores ){ %>
	<tr>
		<td><% out.println(m.getNome()); %></td>
		<td><% out.println(m.getNumeroApto()); %></td>
	</tr>
	<% } %>
</table>
</marquee>
</body>
</html>