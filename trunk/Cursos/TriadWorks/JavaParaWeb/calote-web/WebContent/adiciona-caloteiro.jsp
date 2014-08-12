<%@ include file="/includes.jsp" %>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
	<title>Adiciona Caloteiro</title>
</head>
<body>
<c:import url="cabecalho.jsp"/>
<form action="sistema" method="post" id="formAdicionaCaloteiro" class="elegant-aero">
    <h1>Novo Caloteiro:
        <span>Digite os dados do caloteiro.</span>
    </h1>
        <triadTag:campoTexto campoName="nome" type="text" label="Nome:" id="labelNome" margin="60"/>
        <triadTag:campoTexto campoName="email" type="text" label="Email:" id="labelEmail" margin="61"/> 
        <triadTag:campoTexto campoName="devendo" type="text" label="Devendo:" id="labelDevendo" margin="43"/>
        <triadTag:campoTexto campoName="dataDivida" type="text" label="Data da Dívida:" id="labelData" margin="10"/>    
     	<triadTag:campoTexto campoName="salvar" label="&nbsp;" type="submit" margin="-27" id="button" value="Salvar"/>
        <a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button" style="margin-top:-60; margin-left: 80"/></a>    
</form>
	<c:import url="rodape.jsp"/>
</body>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/jquery.inputmask.bundle.min.js"></script>
<script src="js/jquery.maskMoney.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/mascara-validacoes.js"></script>
</html>