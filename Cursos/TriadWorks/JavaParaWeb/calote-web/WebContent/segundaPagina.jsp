<% String msg = "Minha segunda página JSP"; %>
<html>
	<head>
		<title><% out.println(msg); %></title>
	</head>
	<body>
		<%=msg %>
	</body>
</html>