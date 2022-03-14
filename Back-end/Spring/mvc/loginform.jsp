<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

	

</head>
<body>

	<form action="login" method="post">
		아이디 <input type="text" name="id"><br>
		암호 <input type="password" name="password"><br>
		나이 <input type="text" name="age"><br>
		<input type="checkbox" name="hobby" value="h1">h1<br>
		<input type="checkbox" name="hobby" value="h2">h2<br>
		<input type="checkbox" name="hobby" value="h3">h3<br>
		<input type="submit" value="로그인"><br>
	</form>

</body>
</html>