<%@ page import="dto.MemberDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    <%-- session="false" session 속성 사용 불가능 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<%
	MemberDTO dto = (MemberDTO)session.getAttribute("dto");
	%>
	
	<table>
		<tr>
			<td><%=dto.getId() %></td><td><%=dto.getName() %></td><td><%=dto.getPhone() %></td>
			<td><%=dto.getEmail() %></td><td><%=dto.getAddress() %></td>
		</tr>
	</table>

</body>
</html>