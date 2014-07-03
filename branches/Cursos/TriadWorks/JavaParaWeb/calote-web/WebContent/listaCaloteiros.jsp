<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Caloteiros</title>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	Lista de Caloteiros: </br>
	<table border="1">
		<c:forEach var="caloteiro" items="${lista}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'ff0000' : 'ffffff' }">
				<td><a href="/sistema?logica=CarraegarCaloteiro&id=${caloteiro.id}">Editar</a></td>
				<td>${id.count}</td>
				<td>${caloteiro.nome}</td>
				<c:choose>
					<c:when test="${not empty caloteiro.email}">
					<td><a href="mailto:${caloteiro.email}">${caloteiro.email}</a></td>
					</c:when>
					<c:otherwise>
						E-mail não preenchido.
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${not empty caloteiro.devendo}">
					<td>${caloteiro.devendo}</td>
					</c:when>
					<c:otherwise>
						Devedor não preenchido.
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${not empty caloteiro.dataDivida}">
					<td><fmt:formatDate value="${caloteiro.dataDivida.time}" pattern="dd/MM/yyyy"/></td>
					</c:when>
					<c:otherwise>
						Data da Dívida não preenchida.
					</c:otherwise>
				</c:choose>
	
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp"/>
</body>
</html>