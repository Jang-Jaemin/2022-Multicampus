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
	session.setAttribute("session_dto", dto);
	out.println("<h1>세션정보를 저장하였습니다.</h1>");
	//RequestDispatcher rd = request.getRequestDispatcher("request2.jsp");
	//out.println("이동 직전(무시)");
	//rd.forward(request, response);
	%>

</body>
</html>