<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
<title>Lista de Caloteiros</title>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	Lista de Caloteiros: </br>
	<table border="1">
		<c:forEach var="caloteiro" items="${lista}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'ff0000' : 'ffffff' }">
				<td><a href="/sistema?logica=AlteraCaloteiro&id="${caloteiro.id}">Editar</a></td>
				<td>${id.count}</td>
				<td>${caloteiro.nome}</td>
				<c:choose>
					<c:when test="${not empty caloteiro.email}">
					<td><a href="mailto:${caloteiro.email}">${caloteiro.email}</a></td>
					</c:when>
					<c:otherwise>
						E-mail n�o preenchido.
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${not empty caloteiro.devendo}">
					<td>${caloteiro.devendo}</td>
					</c:when>
					<c:otherwise>
						Devedor n�o preenchido.
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${not empty caloteiro.dataDivida}">
					<td><fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/></td>
					</c:when>
					<c:otherwise>
						Data da D�vida n�o preenchida.
					</c:otherwise>
				</c:choose>
	
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp"/>
</body>
</html>