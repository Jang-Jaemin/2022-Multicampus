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
			
			$("#alluserbtn").on('click', function() {
				requestAjax2();
			});
		});
		
		function requestAjax(){
			$.ajax({
				url:'loginresult2.jsp',
				type:'get',
				data : {'id': $("#id").val() , 'pw':$("#pw").val()}, 
				
				dataType:"json",
				success : function(server_response){//배열(3개객체저장)
					//JSON.parse(server_response )
					alert(server_response.length);
					//server_response =[ {"name", ""} , {"name", ""} ,{"name", ""} ]
					for(var i = 0; i < server_response.length; i++){
						$("#here").append("<h3>" + server_response[i].name + "</h3>");
					}	
						$("#here").css("color", "green");
				},
				error : function(err){
					alert(err);
				}
			});
		}
		
		function requestAjax2() {
			$.ajax({
				url:'loginresult3.jsp',
				type:'get',
				data : {'id': $("#id").val() , 'pw':$("#pw").val()}, 
				
				dataType:"json",
				success : function(server_response) {
					alert(server_response.length);
					$("#alluserdiv").html("<table border=3>");
					for(var i = 0; i < server_response.length; i++){
						var rows = "<tr><td>" + server_response[i].id +"</td><td>" + server_response[i].name +"</td>"
						+ "<td>" + server_response[i].phone + "</td><td>" + server_response[i].email + "</td><td>"
						+ server_response[i].address + "</td></tr>";
						$("#alluserdiv").append(rows);
					}
					$("#alluserdiv").append("</table>");
				},
				error : function(err) {
					alert(err);
				}
			});
	</script>

</head>
<body>

	<h1>로그인 폼</h1>
	<form action="loginresult2.jsp" method="post">
		아이디 <input type="text" id="id" name="id"><br>
		암호 <input type="password" id="password" name="password"><br>
		<input type="submit" id="ajaxbtn" value="비동기적통신로그인"><br>
		<input type="button" id="alluserbtn" value="회원리스트보기">
	</form>
	
	<div id="here"></div>
	<div id="alluserdiv" style="border: 2px solid pink; width: 800px; height: 800px;, overflow: hidden"></div>
	<h3>로그인 결과는 윗줄에 출력 예정입니다.</h3>

</body>
</html>