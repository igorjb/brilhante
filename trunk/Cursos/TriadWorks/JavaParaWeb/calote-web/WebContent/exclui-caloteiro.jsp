<%@ include file="/includes.jsp" %>
<html>
	<head>
		<title> Excluir Caloteiro </title>
	</head>
	<body>
		<c:forEach var="caloteiro" items="${caloteiro}" varStatus="id">
			Deseja realmente excluir o(a) caloteiro(a) ${caloteiro.nome}?
		</c:forEach>
		<form action="sistema" method="post">
			<input type="hidden" name="id" value="${param.id}"/>
				<input type="hidden" name="logica" value="ExcluiCaloteiro"/>
			<input type="submit" value="Sim"/>
			<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Não"></input></a>
		</form>
		
	</body>
</html>