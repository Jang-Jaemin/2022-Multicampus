<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%=request.getParameter("id") + " 관리자님" %>
	<h3>메뉴는 다음과 같습니다.</h3>
	<ul>
		<%
			String[] adminmenu = (String[])request.getAttribute("adminmenu");
			for(int i = 0; i < adminmenu.length; i++) {
		%>
		<li><%=(i + 1) + "번째 메뉴" + adminmenu[i] %></li>
		<%
			}
		%>
	</ul>

</body>
</html>