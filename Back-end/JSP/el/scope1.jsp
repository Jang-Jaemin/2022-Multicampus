<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<%
	pageContext.setAttribute("i", 1);
	request.setAttribute("i", 10);
	session.setAttribute("i", 100);
	application.setAttribute("i", 1000);
	%>
	
	<jsp:forward page="scope2.jsp" />

</body>
</html>