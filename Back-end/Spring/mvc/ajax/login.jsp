<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="<%=request.getContextPath() %>/resources/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			// 로그인
			$("#ajaxbtn").on("click", function() {
				$.ajax({
					url: '<%=request.getContextPath() %>/ajax/login',
					data: {"id" : $("#id").val(), "password" : $("password").val()},
					type: 'post',
					dataType: 'json',
					success: function(a) {
						alert(JSON.stringify(a));
						$("#loginresult").html("<h3>" + a.role + "로 로그인</h3>");
						$("#loginresult").append("<h3>관리자 역할로" + a.process + "</h3>");
					}
				});
			});
			
			// 내정보 조회
			$("#ajaxbtn2").on("click", function() {
				$.ajax({
					url: '<%=request.getContextPath() %>/ajax/myinform',
					data: {"id" : $("#id").val(), "password" : $("#password").val()},
					type: 'get',
					dataType: 'json',
					success: function(dto) {
						if(dto.id == "new") {
							$("#informresult").html("<h3>회원 정보를 찾지 못하였습니다.</h3>";
						} else if(dto.password = "new") {
							$("#informresult").html("<h3>회원 암호가 다릅니다.</h3>";
						} else {
							$("#informresult").html("<h3>회원 아이디 : " + dto.id + "</h3>");
							$("#informresult").append("<h3>회원 이름 : " + dto.name + "</h3>");
							$("#informresult").append("<h3>회원 번호 : " + dto.phone + "</h3>");
							$("#informresult").append("<h3>회원 이메일 : " + dto.email + "</h3>");
							$("#informresult").append("<h3>회원 주소 : " + dto.address + "</h3>");
						}
					}
				});
			});
			
			// 로그인 정보 상관없이 회원리스트 조회
			$("#allbtn").on("click", function() {
				$.ajax({
					url: '<%=request.getContextPath() %>/ajax/memberlist',
					type: 'get',
					dataType: 'json',
					success: function(list) {
						var table = "<table border=1>";
						for(var i = 0; i < list.length; i++) {
							table += "<tr><td>" + list[i].id + "</td><td>" + list[i].name + "</td><td>" + list[i].address + "</td></tr>";
						}
						table += "</table>";
						$("#listresult").html(table);
					}
				});
			});
		});
	</script>

</head>
<body>

	아이디 <input type="text" name="id" id="id"><br>
	암호 <input type="password" name="password" id="password"><br>
	<input type="button" id="ajaxbtn" value="ajax로그인">
	<input type="button" id="ajaxbtn2" value="내정보 조회">
	
	<br>
	<div id="loginresult" style="background-color: yellow">로그인 결과는 여기에 표시됩니다.</div>
	<br>
	<div id="informresult" style="background-color: skyblue">내정보 조회는 여기에 표시됩니다.</div>
	
	<!-- 로그인 정보 상관없이 회원리스트 조회 -->
	<input type="button" id="allbtn" value="회원리스트"><br>
	
	<div id="listresult" style="background-color: yellow">회원리스트 조회는 여기에 표시됩니다.</div>

</body>
</html>