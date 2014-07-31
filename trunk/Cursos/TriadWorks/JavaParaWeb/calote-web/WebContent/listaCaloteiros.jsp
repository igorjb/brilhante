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
				
			<c:forEach var="caloteiro" items="${lista}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'FFCC66' : 'FFFFCC'}">
				<td><a href="/calote-web/sistema?logica=FormCaloteiro&id=${caloteiro.id}"><img alt="editar" width="25" height="25" src="imagens/lapis.png"/></a></td>
				<td><a href="/calote-web/sistema?logica=Form2Caloteiro&id=${caloteiro.id}"><img alt="editar" width="25" height="25" src="imagens/lixeira.png"/></a></td>
					<td>${id.count}</td>
					<c:choose>
						<c:when test="${not empty caloteiro.nome}">
							<td>${caloteiro.nome}</td>
						</c:when>
						<c:otherwise>
							<td>Nome não cadastrado.</td>
						</c:otherwise>
					</c:choose> 
					<c:choose>
						<c:when test="${not empty caloteiro.email}">
							<td><a href="mailto:${caloteiro.email}">${caloteiro.email}</a></td>
						</c:when>
						<c:otherwise>
							<td>E-mail não preenchido.</td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${not empty caloteiro.devendo}">
							<td>${caloteiro.devendo}</td>
						</c:when>
						<c:otherwise>
							<td>Valor da dívida não preenchida.</td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${not empty caloteiro.dataDivida}">
							<td><fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/></td>
						</c:when>
						<c:otherwise>
							<td>Data da dívida não preenchida.</td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</table>
		Total de Registros: ${contador}<br/>
		<a href="/calote-web/adiciona-caloteiro.jsp"><input type="button" value="NOVO" id="button"/></a><br/>
		<c:import url="rodape.jsp"/>
	</body>
</html>