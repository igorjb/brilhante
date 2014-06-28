<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Adiciona caloteiro</title>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	<form action="adicionaCaloteiro">
		Nome: <input type="text" name="nome"/></br>
		E-mail: <input type="text" name="email"/></br>
		Devendo R$: <input type="text" name="devendo"/></br>
		Data: <input type="text" name="dataDivida"/></br>
		
		<input type="submit" value="Salvar"/>
	</form>
	<c:import url="rodape.jsp"/>
</body>
</html>