<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar</title>
</head>
<body>
	<form action="confirmar-alteracao" method="post">
		<input type="hidden" name="id" value="<%=request.getAttribute("id")%>">
		Nome: <input type="text" name="nome" value="<%=request.getAttribute("nome")%>"><br>
		Endereco: <input type="text" name="endereco"  value="<%=request.getAttribute("endereco")%>"><br>
		E-mail: <input type="text" name="email" value="<%=request.getAttribute("email")%>"><br>
		Nascimento: <input type="text" name="nascimento" value="<%=request.getAttribute("nascimento")%>"><br>
		<input type="submit" value="Alterar">
	</form>
</body>
</html>