<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title> Caloteiro Excluido </title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br/>
		<form action="sistema" method="post" class="elegant-aero">
			<h1>Caloteiro Exclu�do:
        		<span>Dados do caloteiro exclu�do.</span>
    		</h1>
    		<label>
    			Caloteiro ${param.nome} exclu�do com sucesso!
    		</label>
    		</br>
			<label>
				<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button"></a>
			</label>
			<br/>
		</form>			
		<c:import url="rodape.jsp"/>
	</body>
</html>
