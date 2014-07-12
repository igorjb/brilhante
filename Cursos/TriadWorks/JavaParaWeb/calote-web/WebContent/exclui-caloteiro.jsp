<html>
	<head>
		<title> Excluir Caloteiro </title>
	</head>
	<body>
		
		Deseja excluir caloteiro de id ${param.id}?
		<form action="sistema" method="post">
			<input type="hidden" name="id" value="${param.id}"/>
				<input type="hidden" name="logica" value="ExcluiCaloteiro"/>
			<input type="submit" value="Sim"/>
			<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Não"></input></a>
		</form>
		
	</body>
</html>