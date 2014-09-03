<%@ include file="/includes.jsp" %>
<!--<jsp:useBean id="dao" class="br.triadworks.javaweb.dao.CaloteiroDAO"/>-->
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/meuEstilo.css">
		<title>Lista de Caloteiros</title>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/><br>
		<b> CALOTEIROS DA WEB</b>
		<table border="1">
			<tr>
				<td><b>Editar</b></td>
				<td><b>Excluir</b></td>
				<td><b>ID</b></td>
				<td><b>Caloteiro</b></td>
				<td><b>Email</b></td>
				<td><b>Devendo</b></td>
				<td><b>Data da D�vida</b></td>
			</tr>	
			<c:forEach var="caloteiro" items="${lista}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'FFCC66' : 'FFFFCC'}">
				<td><div align="center"><a href="/calote-web/sistema?logica=FormEditaCaloteiro&id=${caloteiro.id}"><img alt="editar" width="25" 
																												height="25" src="imagens/lapis.png"/></a></div></td>
				<td><div align="center"><a href="/calote-web/sistema?logica=FormExcluiCaloteiro&id=${caloteiro.id}"><img alt="editar" width="25" 
																													height="25" src="imagens/lixeira.png"/></a></div></td>
					<td>${id.count}</td>
					<c:choose>
						<c:when test="${not empty caloteiro.nome}">
							<td>${caloteiro.nome}</td>
						</c:when>
						<c:otherwise>
							<td>Nome n�o cadastrado.</td>
						</c:otherwise>
					</c:choose> 
					<c:choose>
						<c:when test="${not empty caloteiro.email}">
							<td><a href="mailto:${caloteiro.email}">${caloteiro.email}</a></td>
						</c:when>
						<c:otherwise>
							<td>E-mail n�o preenchido.</td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${not empty caloteiro.devendo}">
							<td><div align="center">${caloteiro.devendo}</div></td>
						</c:when>
						<c:otherwise>
							<td>Valor da d�vida n�o preenchida.</td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${not empty caloteiro.dataDivida}">
							<td><div align="center"><fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/></div></td>
						</c:when>
						<c:otherwise>
							<td>Data da d�vida n�o preenchida.</td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</table>
		<div>Total de Registros: ${contador}<br/></div>
		
		<a href="/calote-web/sistema?logica=FormAdicionaCaloteiro"><input type="button" value="NOVO" id="button"/></a><br/>
		<c:import url="rodape.jsp"/>
	</body>
</html>