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
			})
		})
		
		function requestAjax() {
			$.ajax({
				url: 'loginresult2.jsp',
				type: 'get',
				data: {'id' : $("id").val(), 'password' : $("#password").val()},
			
				dataType: 'json',
				success: function(server_response) {
					alert(server_response.login);
					if(server_response.login) {
						$("#here").html("<h1>" + server_response.time + " 시각에 정상 로그인 하였습니다.</h1>");
						$("#here").append("<h3>" + server_response.id + "</h3>");
						$("#here").append("<h3>" + server_response.name + "</h3>");
						$("#here").append("<h3>" + server_response.phone + "</h3>");
						$("#here").append("<h3>" + server_response.email + "</h3>");
						$("#here").append("<h3>" + server_response.address + "</h3>");
						$("#here").css("color", "green");
					} else {
						$("#here").html("<h1>로그인정보를 확인해주세요.</h1>");
						$("#here").css("color", "red");
					}
				},
				error: function(err) {
					alert(err);
				}
			});
		}
	</script>

</head>
<body>

	<h1>로그인 폼</h1>
	<form action="loginresult.jsp" method="post">
		아이디 <input type="text" id="id" name="id"><br>
		암호 <input type="password" id="password" name="password"><br>
		<input type="submit" value="동기적통신로그인"><br>
		<input type="button" id="ajaxbtn" value="비동기적통신로그인">
	</form>
	
	<div id="here"></div>
	<h3>로그인 결과는 윗줄에 출력 예정입니다.</h3>

</body>
</html>