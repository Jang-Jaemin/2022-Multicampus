<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
		table {margin: auto; text-align: center;}
		tr:nth-child(2n) {background-color: yellow;}
		tr:nth-child(2n+1) {background-color: skyblue;}
	</style>
	
</head>
<body>

	<table border="1">
	<% 
	// 사용자 파라미터 2-9 하나이면 해당 단 출력
	// 사용자 파라미터 -1 100 백단 출력할 수 없습니다.
	String start = request.getParameter("start");
	String end = request.getParameter("end");
	try {
		int startInt = Integer.parseInt(start);
		int endInt = Integer.parseInt(end);
		if(startInt >= 2 && startInt <= 9 && endInt >= 2 && endInt <= 9 && startInt <= endInt) {
			for(int i = 1; i <=9; i++) {
	%>
	<tr>
	<%
				for(int j = startInt; j <= endInt; j++) {
	%>
				<%="<td>" + j + " * " + i + " = " + j * i + "</td>" %>
	<%
				}
	%>
	</tr>
	<%
			}
	%>
	</table>
	<%
		} else {
	%>
			<%="출력할 수 없습니다." %>
			
	<%	}
	} catch(NumberFormatException nfe) {
	%>	
		<%="출력할 수 없습니다." %>
	<%
	}
	%>

</body>
</html>