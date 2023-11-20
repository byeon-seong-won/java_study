<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="parkData.Data" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>


<style>
	h1 {font-family : 'Noto sans KR', sans-serif; letter-spacing : -0.03em; font-weight : bold; font-size : 30px;color : crimson;}
	p {font-family : 'Noto sans KR', sans-serif; letter-spacing : -0.03em; font-weight : bold; font-size : 20px;color : green;}
	
</style>

</head>
<body>

<%	
	Data aa = new Data();
	String dis = aa.crawl();
%>

<h1>와 가장 가까운 곳은?</h1>
<p><%=dis %></p>










</body>
</html>