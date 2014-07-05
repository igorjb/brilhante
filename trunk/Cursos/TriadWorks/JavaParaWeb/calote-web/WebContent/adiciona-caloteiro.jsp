<%@ include file="/includes.jsp" %>
<html>
	<head>
		<title>Adiciona Caloteiro</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		<form action="adicionaCaloteiro" method="post">
			Nome: <input type="text" name="nome"/><br/>
			E-mail: <input type="text" name="email"/><br/>
			Devendo R$: <input type="text" name="devendo"/><br/>
			Data: <input type="text" name="dataDivida"/><br/>
			
			<input type="submit" value="Salvar"/>
			<a href="/calote-web/listaCaloteiros.jsp"><input type="button" value="Voltar"></input></a> 
		</form>
		<c:import url="rodape.jsp"/>
	</body>
</html>