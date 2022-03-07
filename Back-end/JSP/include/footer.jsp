<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
		img {float: right;}
	</style>
</head>
<body>

	<h3>회원정보 - <%=request.getAttribute("dto") %></h3>
	<h3>
		배송 및 반품 연락처
		010-1111-2222
		010-2222-3333
	</h3>
	<h3>오시는 길 - 경기도</h3>
	<img src="/html/images/<%=request.getParameter("image") %>">

</body>
</html>