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
	String path = "";
	if(id.equalsIgnoreCase("super") || id.equalsIgnoreCase("admin")) {
		String[] menu = {"사용자 관리", "게시판 관리", "상품 관리"};
		path = "admin.jsp";
		request.setAttribute("", menu);
	} else {
		String[] menu = {"내 정보 관리", "내 글 관리", "구입 상품 관리"};
		path = "user.jsp";
		request.setAttribute("", menu);
	}
	%>
	<%="출력(무시)" %>
	<jsp:forward page="<%=path %>" />
	<%="출력(무시)" %>

</body>
</html>