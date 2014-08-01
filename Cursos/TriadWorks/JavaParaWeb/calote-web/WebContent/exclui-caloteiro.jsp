<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title> Excluir Caloteiro </title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br/>
		<form action="sistema" method="post" class="elegant-aero">
			<h1>Excluir Caloteiro:
        		<span>Exclui dados do caloteiro.</span>
    		</h1>
    		<c:forEach var="caloteiro" items="${caloteiro}" varStatus="id">
    		<label>
    			<span>Deseja realmente excluir o(a) caloteiro(a) ${caloteiro.nome}?</span>
    		</label>
			</c:forEach>
			<br/>
			<label>
				<input type="hidden" name="id" value="${param.id}"/>
					<input type="hidden" name="logica" value="ExcluiCaloteiro"/>
				<input type="submit" value="SIM" id="button"/>
				<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="NÃO" id="button"></input></a>
			</label>
		</form>
		<c:import url="rodape.jsp"/>
	</body>
</html>