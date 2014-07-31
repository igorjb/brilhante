<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title>Adiciona Caloteiro</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		<br/>
		Novo Caloteiro: <br/><br/>
		<form action="sistema" method="post" id="formAdicionaCaloteiro">
			<triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"/>
			<triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"/>
			<triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"/>
			<triadTag:campoTexto campoName="dataDivida" label="Data da Dívida" id="labelData"/>
				<input type="hidden" name="logica" value="AdicionaCaloteiro"/>
			<br/>
			<input type="submit" value="Salvar" id="button"/>
			<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button"></input></a> 
		</form>
		<c:import url="rodape.jsp"/>
	</body>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/jquery.inputmask.bundle.min.js"></script>
	<script src="js/jquery.maskMoney.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/mascara-validacoes.js"></script>
</html>