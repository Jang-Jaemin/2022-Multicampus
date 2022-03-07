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

	<h1>쇼핑 리스트를 보여줄 화면입니다.</h1>
	<%
	String image = request.getParameter("image");
	%>
	<h2>=====include directive tag(정적 인클루드)=====</h2>
	<%@ include file="footer.jsp" %>
	
	<h2>=====include action tag(동적 인클루드)=====</h2>
	<%
	request.setAttribute("dto", new MemberDTO("include", "1234", "포함", "010-1111-2222", "a@a.com", "서울"));
	%>
	<jsp:include page="footer.jsp" >
		<jsp:param name="image" value="drinks.jpg" />
	</jsp:include>

</body>
</html>