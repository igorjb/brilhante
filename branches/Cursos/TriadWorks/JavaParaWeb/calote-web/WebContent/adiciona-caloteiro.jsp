
<%@ include file="/includes.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta />
<title>Adiciona caloteiro</title>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	<form action="sistema" method="post">
		<input type="hidden" name="logica" value="AdicionaCaloteiro"/>
		<triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"/>
		<triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"/>
		<triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"/>
		<triadTag:campoTexto campoName="dataDivida" label="Data da Dívida" id="labelData"/>
		
		<input type="submit" value="Salvar"/>
	</form>
	<c:import url="rodape.jsp"/>
</body>
</html>