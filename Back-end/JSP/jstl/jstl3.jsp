<%@page import="java.util.HashMap"%>
<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<%
	MemberDTO dto1 = new MemberDTO("member1", "1", "멤버1", "010-1111-2222", "mem1@mem1.com", "서울");
	MemberDTO dto2 = new MemberDTO("member2", "2", "멤버2", "010-1111-3333", "mem2@mem2.com", "강원");
	MemberDTO dto3 = new MemberDTO("member3", "3", "멤버3", "010-1111-4444", "mem3@mem3.com", "제주");
	HashMap<String, MemberDTO> memberMap = new HashMap<String, MemberDTO>();
	memberMap.put(dto1.getId(), dto1);
	memberMap.put(dto2.getId(), dto2);
	memberMap.put(dto3.getId(), dto3);
	pageContext.setAttribute("memberMap", memberMap);
	%>
	
	<c:forEach items="${memberMap }" var="dto" varStatus="vs">
		${vs.count } 번째 회원 조회중 - ${dto.key } - ${dto.value.address }<br>
	</c:forEach>
	
	<!-- jstl1.jsp 파일 이동 -->
	<c:url var="mypage" value="http://localhost:8080/jsp/jstl/jstl1.jsp" />
	<%-- <c:redirect url="${mypage }" /> --%>
	
	<!-- jstl1.jsp 파일 포함 이동 -->
	<c:import url="${mypage }" />
	

</body>
</html>