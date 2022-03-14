<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>

	

</head>
<body>

	<h1>el : ${loginresult }</h1>
	<h1>내장객체 : <%=request.getAttribute("loginresult") %></h1>
	<h1>el(dto 내용) : ${dto.id } 회원님 암호는 ${dto.password } 입니다.</h1>

</body>
</html>