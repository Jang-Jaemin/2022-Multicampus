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

	<!-- 표현문 태그 -->
	<h1 style=color:green>
		<%=request.getAttribute("id") %>님의 주소는
		<%=request.getAttribute("address") %> 입니다.<br>
		<%=((MemberDTO)request.getAttribute("member_info")).getId() %>
	</h1>
	
	<!-- el -->
	<h1 style=color:blue>
		${id }님의 주소는 ${address } 입니다.<br>
		${member_info.id }
	</h1>

</body>
</html>