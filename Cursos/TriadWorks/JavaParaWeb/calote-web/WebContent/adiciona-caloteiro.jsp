<%@ include file="/includes.jsp" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title>Adiciona Caloteiro</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		<br/>
		<form action="sistema" method="post" id="formAdiciona" class="elegant-aero">
		<h1>Novo Caloteiro:
			<span>Adicione os dados do caloteiro.</span>
		</h1>
		
			<triadTag:campoTexto type="text" margin="10" campoName="nome" label="Nome:" id="labelNome"/>
			<triadTag:campoTexto type="text" margin="10" campoName="email" label="Email:" id="labelEmail"/>
			<triadTag:campoTexto type="text" margin="10" campoName="devendo" label="Devendo:" id="labelDevendo"/>
			<triadTag:campoTexto type="text" margin="10" campoName="dataDivida" label="Data da Dívida" id="labelData"/>
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