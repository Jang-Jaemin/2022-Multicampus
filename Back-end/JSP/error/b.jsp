<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>=====toString 내용=====</h1>
	<%=exception.toString() %>
	
	<h1>=====getMessage 내용=====</h1>
	<%=exception.getMessage() %>
	
	<h1>=====printStackTrace 내용=====</h1>
	<% exception.printStackTrace(); %>
	
</body>
</html>