<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<% request.setCharacterEncoding("utf-8"); %>
	<!-- 1. 입력 전달 -->
	<%-- <%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	%> --%>
	
	<!-- 2. 6개 파라미터들을 MemberDTO 객체로 생성 -->
	<jsp:useBean id="dto" class="dto.MemberDTO" />
	<jsp:setProperty property="*" name="dto" />
	
	<%-- <jsp:setProperty property="id" name="dto" />
	<jsp:setProperty property="password" name="dto" />
	<jsp:setProperty property="name" name="dto" />
	<jsp:setProperty property="phone" name="dto" />
	<jsp:setProperty property="email" name="dto" />
	<jsp:setProperty property="address" name="dto" /> --%>
	
	<%-- <jsp:setProperty property="id" name="dto" param="id" />
	<jsp:setProperty property="password" name="dto" param="pw" />
	<jsp:setProperty property="name" name="dto" param="name" />
	<jsp:setProperty property="phone" name="dto" param="phone" />
	<jsp:setProperty property="email" name="dto" param="email" />
	<jsp:setProperty property="address" name="dto" param="address" /> --%>
	
	<%-- <jsp:setProperty property="id" name="dto" value="<%=id %>" />
	<jsp:setProperty property="password" name="dto" value="<%=password %>" />
	<jsp:setProperty property="name" name="dto" value="<%=name %>" />
	<jsp:setProperty property="phone" name="dto" value="<%=phone %>" />
	<jsp:setProperty property="email" name="dto" value="<%=email %>" />
	<jsp:setProperty property="address" name="dto" value="<%=address %>" /> --%>
	
	<!-- 3. DB 전송 -->
	<jsp:useBean id="dao" class="dao.MemberDAO" />
	<% dao.insertMember(dto); %>
	
	<!-- 4. 응답 -->
	입력한 아이디 <jsp:getProperty property="id" name="dto" /><br>
	입력한 암호 <jsp:getProperty property="password" name="dto" /><br>
	입력한 이름 <jsp:getProperty property="name" name="dto" /><br>
	입력한 번호 <jsp:getProperty property="phone" name="dto" /><br>
	입력한 이메일 <jsp:getProperty property="email" name="dto" /><br>
	입력한 주소 <jsp:getProperty property="address" name="dto" /><br>

</body>
</html>