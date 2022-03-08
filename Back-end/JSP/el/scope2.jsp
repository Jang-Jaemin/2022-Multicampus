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

	<%=pageContext.getAttribute("i") %>
	<%=request.getAttribute("i") %>
	<%=session.getAttribute("i") %>
	<%=application.getAttribute("i") %>
	<br>
	현재페이지전달 = ${i}<br>
	요청객체전달 = ${requestScope.i }<br>
	세션객체전달 = ${sessionScope.i }<br>
	어플리케이션객체전달 = ${applicationScope.i }<br>

</body>
</html>