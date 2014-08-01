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
				    	<input type="hidden" name="id" value="${caloteiro.id}">
				        <span>Nome: </span>
				        <input type="text" name="nome" value="${caloteiro.nome}" size="50">
				    </label>
				    <br/>
				    <label>
				        <span>Email: </span>
				        <input type="text" name="email" value="${caloteiro.email}" size="50">
				    </label>
				    <br/>
				    <label>
				        <span>Devendo: </span>
				        <input type="text" name="devendo" value="${caloteiro.devendo}" size="50">
				    </label>
				    <br/>
				     <label>
				        <span>Data da Dívida: </span>
				        <input type="text" name="dataDivida" size="50" value="<fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/>">
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