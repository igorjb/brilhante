<% String msg = "Minha segunda p�gina JSP"; %>
<html>
	<head>
		<title><% out.println(msg); %></title>
	</head>
	<body>
		<%=msg %>
	</body>
</html>