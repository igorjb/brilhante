<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% String msg = "Minha segunda página JSP";%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><% out.println(msg); %></title>
</head>
<body>
	<%=msg %>
</body>
</html>