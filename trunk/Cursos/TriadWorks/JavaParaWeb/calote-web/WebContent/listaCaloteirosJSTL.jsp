<%@ include file="/includes.jsp" %>
<jsp:useBean id="dao" class="br.triadworks.javaweb.dao.CaloteiroDAO"/>

<html>
	<head>
		<title>Lista de Caloteiros</title>
	</head>
	<body>
		Lista de Caloteiros: <br/>
		<table border="1">
			<c:forEach var="caloteiro" items="${dao.lista}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'ff0000' : 'ffffff' }">
					<td>${id.count}</td> <td>${caloteiro.nome}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>