<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<%!
	public void multiply(PageContext p, int i, int j) throws IOException {
		p.getOut().println(i + " * " + j + " = " + i * j);
	}
	%>
	<%
	// _jspService 메소드 문장
	try {
		multiply(pageContext, 10, 20);		
	} catch(IOException e) {}
	%>

</body>
</html>