<%@ page import="dao.MemberDAO" %>
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
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDAO dao = new MemberDAO();
		int result = dao.selectMember(id, password);
		
		if(result == 0) {
			out.println("정상 로그인 사용자입니다.");
		} else if(result == 1) {
			out.println("암호를 확인하세요.");
		} else {
			out.println("회원가입이 필요합니다.");
		}
	%>

</body>
</html>