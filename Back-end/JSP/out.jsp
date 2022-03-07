<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<%= "총 버퍼크기 : " + out.getBufferSize() %>
	<%
	String name = request.getParameter("name");
	out.println(name);
	%>
	<br>
	<%=name %>
	<br>
	사용자입력값 : <input type=text value=<%=name %>>
	<br>
	<%-- <% "남아있는 버퍼크기 : " + out.getRemaining() %> --%>
	

</body>
</html>