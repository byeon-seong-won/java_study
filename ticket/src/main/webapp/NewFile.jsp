<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
</head>
<body>

	<%
		int total = 0;
		for(int i = 0; i <=10; i++) {
			total = total + i;
		}
	%>
	
	<%=total %>
	<h1>jsp!</h1>
	
	
	
	
</body>
</html>