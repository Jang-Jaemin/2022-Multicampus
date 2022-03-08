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
	String id = "member";
	// member 회원의 정보를 db select해서 address 컬럼의 값 가져온다.
	String address = "서울시 역삼동";
	request.setAttribute("id", id);
	request.setAttribute("address", address);
	MemberDTO dto = new MemberDTO("멤버", "1234", "김회원", "010-1234-4321", "kim@a.com", "강원");
	request.setAttribute("member_info", id);
	%>
	<jsp:forward page="forward2.jsp" />

</body>
</html>