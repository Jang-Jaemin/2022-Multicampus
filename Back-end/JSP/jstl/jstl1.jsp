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

	<% String jspvar = "자바변수"; %>
	<c:set var="i" value="100" />
	<c:set var="j" value="문자열" />
	<c:set var="k" value="${i + 200 }" />
	<c:set var="m" value="<%=jspvar %>추가" />
	
	<!-- 표현 -->
	<h3>${i }</h3>
	<h3>${j }</h3>
	<h3>${k }</h3>
	<h3>${m }</h3>
	
	<!-- 변수삭제 -->
	<c:remove var="i" />
	<h3>${i }</h3>
	
	<!-- 조건문 -->
	<c:if test="${empty i }">
		<h1>i는 더이상 사용이 불가능합니다.</h1>
	</c:if>
	<c:if test="${!empty i }">
		<h1>i는 계속 사용이 가능합니다.</h1>
	</c:if>
	
	
	<!-- if 블록 -->
	<%-- <c:if test="${param.password == '1234' }">
		<c:if test="${param.id == 'admin' && password == '1234' }">
			<h1>관리자입니다.</h1>
		</c:if>
		<c:if test="${param.id != 'admin' && password == '1234' }">
			<h1>일반 사용자입니다.</h1>
		</c:if>
	</c:if>
	
	<c:if test="${param.password != '1234' }">
		<h1>암호를 다시 입력하세요</h1>
	</c:if> --%>
	
	<!-- switch-case 블록 -->
	<c:choose>
		<c:when test="${param.id == 'dbadmin' }">
			<h1>db 관리자입니다.</h1>
		</c:when>
		<c:when test="${param.id == 'webadmin' }">
			<h1>서버 관리자입니다.</h1>
		</c:when>
		<c:when test="${param.id == 'admin' }">
			<h1>총괄 관리자입니다.</h1>
		</c:when>
		<c:otherwise>
			<h1>관리자가 아닙니다.</h1>
		</c:otherwise>
	</c:choose>
	
	<!-- ${new String("java")} -->
	admin 포함여부(t/f) = ${param.id.contains("admin") }<br>
	admin 포함여부(위치) = ${param.id.indexOf("admin") >= 0 }<br>
	admin 포함여부(위치) = ${param.id.equalsIgnoreCase("admin") }<br>

</body>
</html>