<%@ include file="/includes.jsp" %>
<html>
	<head>
		<title>Adiciona Caloteiro</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		
		<form action="sistema" method="post" id="formAdicionaCaloteiro">
			<triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"/>
			<triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"/>
			<triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"/>
			<triadTag:campoTexto campoName="dataDivida" label="Data da Dívida" id="labelData"/>
				<input type="hidden" name="logica" value="AdicionaCaloteiro"/>
			<input type="submit" value="Salvar"/>
			<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar"></input></a> 
		</form>
		<c:import url="rodape.jsp"/>
	</body>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/jquery.inputmask.bundle.min.js"></script>
	<script src="js/jquery.maskMoney.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/mascara-validacoes.js"></script>
</html>