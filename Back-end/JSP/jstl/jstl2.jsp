<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<!-- 
	1. jstl2.html
	- 이름입력
	- 나이입력
	jstl2.jsp 파일로 post 방식으로 전달
	
	2. jstl2.jsp
	이름, 나이가 입력되었다면
	- 이름 : OOO, 나이 OOO 입니다.
	나이에 따라서
	- 15세 이하 - 이름 : OOO, 가격 : 10,000원 입니다.
	- 16~19세 - 이름 : OOO, 가격 : 15,000원 입니다.
	- 20세 이상 - 이름 : OOO, 가격 : 20,000원 입니다.
	나이가 입력되지 않거나 음수 입력시 - 계산할 수 없습니다.
	이름이 입력되지 않으면 - 이름을 확인할 수 없습니다.
	 -->
	 
	<% boolean result = request.getParameter("age").matches("\\d+"); %>
	
	<c:if test="${!empty param.name && !empty param.age }">
		<c:if test="<%=result %>">
			<c:choose>
				<c:when test="${param.age <= 15 && param.age >= 0 }">
					<h1>이름 : %{param.name }, 가격 : 10,000원 입니다.</h1>
				</c:when>
				<c:when test="${param.age <= 19 && param.age >= 16 }">
					<h1>이름 : ${param.name }, 가격 : 15,000원 입니다.</h1>
				</c:when>
				<c:when test="${param.age >= 20 }">
					<h1>이름 : ${param.name }, 가격 : 20,000원 입니다.</h1>
				</c:when>
				<c:otherwise>
					<h1>계산할 수 없습니다.</h1>
				</c:otherwise>
			</c:choose>
		</c:if>
	</c:if>
	
	<c:if test="${empty param.name }">
		<h1>이름을 확인할 수 없습니다.</h1>
	</c:if>
	<c:if test="${empty param.age }">
		<h1>계산할 수 없습니다.</h1>
	</c:if>
	
	<c:forEach items="${paramValues.movie}" var="m">
		<h1>${m }</h1>
	</c:forEach>

</body>
</html>