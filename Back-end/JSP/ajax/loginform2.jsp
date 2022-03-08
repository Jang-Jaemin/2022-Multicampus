<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="jquery-3.6.0.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#ajaxbtn").on('click', function() {
				alert("버튼 클릭");
				requestAjax();
			});
		});
		
		function requestAjax() {
			$.ajax({
				url: 'loginresult2.jsp',
				type: 'get',
				data: {'id' : $("id").val(), 'password' : $("#password").val()},
			
				dataType: 'json',
				success: function(server_response) {
					alert(server_response.length);
					for(var i = 0; i < server_response.length; i++){
						$("#here").append("<h3>" + server_response[i].name + "</h3>");
					}
					$("#here").css("color", "green");
				},
				error: function(err) {
					alert(err);
				}
			});
		}
	</script>

</head>
<body>

	<h1>로그인폼</h1>
	<form action="loginresult2.jsp" method="post">
		아이디 <input type=text id="id" name="id"><br>
		암호 <input type="password" id="password" name="password"><br>
		<input type=submit value="동기적통신로그인">
		<input type=button id="ajaxbtn" value="비동기적통신로그인">
	</form>
	
	<div id="here"></div>
	<h3>로그인 결과는 윗줄에 출력 예정입니다.</h3>

</body>
</html>