<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title> Excluir Caloteiro </title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br/>
		Excluir Caloteiro: <br/>
		<c:forEach var="caloteiro" items="${caloteiro}" varStatus="id">
			Deseja realmente excluir o(a) caloteiro(a) ${caloteiro.nome}?
		</c:forEach>
		<form action="sistema" method="post">
			<input type="hidden" name="id" value="${param.id}"/>
				<input type="hidden" name="logica" value="ExcluiCaloteiro"/>
			<input type="submit" value="SIM" id="button"/>
			<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="NÃO" id="button"></input></a>
		</form>
		<c:import url="rodape.jsp"/>
	</body>
</html>