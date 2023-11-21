<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="parkData.Parkdata" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘의 영화</title>


<style>
	h1 {font-family : 'Noto sans KR', sans-serif; letter-spacing : -0.03em; font-weight : bold; font-size : 30px;color : crimson;}
	p {font-family : 'Noto sans KR', sans-serif; letter-spacing : -0.03em; font-weight : bold; font-size : 20px;color : green;}
	
</style>

<script>
    function find(idx) {
    	Cgvdata.findShort(idx);
    }
</script>


</head>
<body>

<%-- <%
	Parkdata aa = new Parkdata();
	String dis = aa.crawl();
%> --%>

<h1>와 가장 가까운 곳은?</h1>
<%-- <p><%=dis %></p> --%>
<button>가장 가까운 곳 찾기</button>


		<input type="text" name="id">
		<button onclick="find(0);">북포항점</button>
		<button onclick="find(1);">김해점</button>
		<button onclick="find(2);">목동점</button>
		<button onclick="find(3);">창원더시티점</button>
		<button onclick="find(4);">압구정점</button>
		<button onclick="find(5);">왕십리점</button>
		<button onclick="find(6);">센텀시티점</button>
		<button onclick="find(7);">평택점</button>
		<button onclick="find(8);">송파점</button>
		<button onclick="find(9);">원주점</button>
		<button onclick="find(10);">성신여대입구점</button>







</body>
</html>