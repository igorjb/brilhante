
<%@ include file="/includes.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Adiciona caloteiro</title>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	<form action="sistema" method="post" id="formAdicionaCaloteiro">
		<input type="hidden" name="logica" value="AdicionaCaloteiro"/>
		<triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"/>
		<triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"/>
		<triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"/>
		<triadTag:campoTexto campoName="dataDivida" label="Data da Dívida" id="labelData"/>
		
		<input type="submit" value="Salvar"/>
	</form>
	<c:import url="rodape.jsp"/>
</body>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery.maskMoney.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/mascara-validacoes.js"></script>
</html>