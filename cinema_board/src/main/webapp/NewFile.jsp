<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="crawlingData.Data" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h1>시작!</h1>


<%
	Data aa = new Data();
	String dis = aa.crawl();
	out.println(dis);
%>



</body>
</html>