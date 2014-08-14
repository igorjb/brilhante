<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title> Caloteiro Adicionado </title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br/>
		<form action="sistema" method="post" class="elegant-aero">
			<h1>Caloteiro Adicionado:
        		<span>Dados do caloteiro adicionado.</span>
    		</h1>
    		<label>
    			Caloteiro ${param.nome} adicionado com sucesso!
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