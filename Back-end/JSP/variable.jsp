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
	String local = "지역변수 입니다.";
	out.println(local);
	String result = test();
	out.println(result);
	%>
	
	<%!
	String member = "멤버변수 입니다.";
	public String test() {
		return member;
	}
	%>

</body>
</html>