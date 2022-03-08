<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
// id = ajax 이고, password = ajax 이면 "정상적인 로그인 사용자입니다." 출력
String id = request.getParameter("id");
String password = request.getParameter("password");
String result = "";
if(id.equals("ajax") && password.equals("ajax")) {
	result = "{\"login\" : true, \"time\" : \"2022-03-08 11:47:50\"}";
} else {
	result = "{\"login\" : false}";
}
%>

<%=result %>