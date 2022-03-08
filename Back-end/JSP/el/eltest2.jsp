<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	<h1>
		<!-- el 내장객체 -->
		${ param.id } 회원님 환영합니다.<br>
		${ param.password } 암호를 입력하였습니다.
	</h1>
	<h3>
		${ paramValues.lunch[0] }<br>
		${ paramValues.lunch[1] }<br>
		${ paramValues.lunch[2] }<br>
		${ paramValues.lunch[3] }<br>
		${ paramValues.lunch[4] }<br>
	</h3>
	
	request.getHeader("host");
	서버 정보 = { header.post }<br>
	
	request.getHeader("user-agent");
	브라우저 정보 = ${ header.['user-agent'] }

</body>
</html>