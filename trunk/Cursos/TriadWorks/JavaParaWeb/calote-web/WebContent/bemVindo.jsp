<% String msg = "seja bem vindo ao meu JSP!";%>
<html>
	<head>
		<title><% out.println(msg); %></title>
	</head>
	<body>
		Ol� <%=request.getParameter("nome") %>, <%=msg %>
	</body>
</html> 