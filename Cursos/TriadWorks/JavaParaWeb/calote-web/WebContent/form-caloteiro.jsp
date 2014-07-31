<%@ include file="/includes.jsp" %>
<!--<jsp:useBean id="dao" class="br.triadworks.javaweb.dao.CaloteiroDAO"/>-->
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title>Editar Caloteiro</title>
	</head>
	<body>
		
		<c:import url="cabecalho.jsp"/><br/>
		Editar Caloteiro: <br/>
		<table border="1">
			
			<c:forEach var="caloteiro" items="${caloteiro}" varStatus="id">
				<form action="sistema" method="post">
					<input type="hidden" name="id" value="${caloteiro.id}"><br/>
					Nome: <input type="text" name="nome" value="${caloteiro.nome}"><br/>
					Email: <input type="text" name="email" value="${caloteiro.email}" ><br/>
					Devendo: <input type="text" name="devendo" value="${caloteiro.devendo}"><br/>
					Data da D�vida: <input type="text" name="dataDivida" value="<fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/>"><br/> 
						<input type="hidden" name="logica" value="AlteraCaloteiro"/>
					<br/>
					<div align="left">
						<input type="submit" value="Salvar" id="button"/>
						<a href="/calote-web/sistema?logica=ListaCaloteiros"><input type="button" value="Voltar" id="button"></input></a>
					</div>
					
					 
				</form>
				
			</c:forEach>
		</table>
		<c:import url="rodape.jsp"/>
	</body>
</html>