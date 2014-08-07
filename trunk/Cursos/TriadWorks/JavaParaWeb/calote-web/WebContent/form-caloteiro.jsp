<%@ include file="/includes.jsp" %>
<!--<jsp:useBean id="dao" class="br.triadworks.javaweb.dao.CaloteiroDAO"/>-->
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title>Editar Caloteiro</title>
	</head>
	<body>
		
		<c:import url="cabecalho.jsp"/><br/>
			<c:forEach var="caloteiro" items="${caloteiro}" varStatus="id">
				<form action="sistema" method="post" id="formEditaCaloteiro" class="elegant-aero">
					<h1>Editar Caloteiro:
        				<span>Edite os dados do caloteiro.</span>
    				</h1>
					<label>
				    	<triadTag:campoTexto campoName="id" margin="10" id="labelId" type="hidden" value="${caloteiro.id}"/>
				        <triadTag:campoTexto campoName="nome" type="text" label="Nome:" id="labelNome" margin="60" value="${caloteiro.nome}"/>
				    </label>
				    <br/>
				    <label>
				        <triadTag:campoTexto campoName="email" type="text" label="Email:" id="labelEmail" margin="61" value="${caloteiro.email}"/>
				    </label>
				    <br/>
				    <label>
				        <triadTag:campoTexto campoName="devendo" type="text" label="Devendo:" id="labelDevendo" margin="43" value="${caloteiro.devendo}"/>
				    </label>
				    <br/>
				     <label>
				        <span>Data da Dívida: </span>
				        <input type="text" name="dataDivida" size="41" style="margin-left:111" value="<fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/>">
				    	<input type="hidden" name="logica" value="AlteraCaloteiro"/>
				    </label>
				     
				    <br/>    
				     <label>
				        <span>&nbsp;</span>
				        <input type="submit" value="Salvar" id="button"/>
						<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button"></input></a>
				    </label>
				</form>
			</c:forEach>
		<c:import url="rodape.jsp"/>
	</body>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/jquery.inputmask.bundle.min.js"></script>
	<script src="js/jquery.maskMoney.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/mascara-validacoes.js"></script>
</html>