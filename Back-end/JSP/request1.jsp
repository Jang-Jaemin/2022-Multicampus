<%@ page import="dto.MemberDTO" %>
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
	MemberDTO dto = new MemberDTO("id", "pw", "name", "010-1111-2222", "a@a.com", "서울");
	request.setAttribute("dto", dto);
	RequestDispatcher rd = request.getRequestDispatcher("request2.jsp");
	out.println("이동 직전(무시)");
	rd.forward(request, response);
	%>
	<%=dto %>

</body>
</html>