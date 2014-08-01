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
        <span><triadTag:campoTexto campoName="nome" label="Nome:" id="labelNome"/></span>
    </label>
    <br/>
    <label>
        <span><triadTag:campoTexto campoName="email" label="Email:" id="labelEmail"/></span>
    </label>
    <br/>
    <label>
        <span><triadTag:campoTexto campoName="devendo" label="Devendo:" id="labelDevendo"/></span>
    </label>
    <br/>
     <label>
        <span><triadTag:campoTexto campoName="dataDivida" label="Data da Dívida:" id="labelData"/></span>
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