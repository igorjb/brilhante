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
    <label>
        <triadTag:campoTexto campoName="nome" type="text" label="Nome:" id="labelNome" margin="60"/>
    </label>
    <br/>
    <label>
        <triadTag:campoTexto campoName="email" type="text" label="Email:" id="labelEmail" margin="61"/>
    </label>
    <br/>
    <label>
        <triadTag:campoTexto campoName="devendo" type="text" label="Devendo:" id="labelDevendo" margin="43"/>
    </label>
    <br/>
     <label>
        <triadTag:campoTexto campoName="dataDivida" type="text" label="Data da Dívida:" id="labelData" margin="10"/>
    </label>
    <br/>    
     <label>
        <span>&nbsp;</span>
        <input type="submit" value="Salvar" id="button"/>
        <a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button"></input></a>
    </label>    
</form>
	<c:import url="rodape.jsp"/>
</body>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/jquery.inputmask.bundle.min.js"></script>
<script src="js/jquery.maskMoney.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/mascara-validacoes.js"></script>
</html>