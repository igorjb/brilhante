<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title> Caloteiro Alterado </title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br/>
		<form action="sistema" method="post" class="elegant-aero">
			<h1>Caloteiro Alterado:
        		<span>Dados do caloteiro alterado.</span>
    		</h1>
    		<label>
    			Caloteiro ${param.nome} alterado com sucesso!
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