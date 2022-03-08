<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>

	${ true }<br>
	${ 100 }<br>
	${ 100.99 }<br>
	${ '백' }<br>
	${ "100" }<br>
	${ null }<br>
	${ "100" }<br>
	
	<!-- el 연산자 -->
	\${ 100 + 1 } = ${ 100 + 1 }<br>
	\${ '100' + 1 } = ${ '100' + 1 }<br>	<!-- 자동형변환 '0-9 숫자들' -->
	\${ '백' + 1 } = ${ '백' + 1 }<br>	<!-- 자동형변환 '0-9 숫자들' -->
	\${ null + 1 } = ${ null + 1 }<br>	<!-- null 자동 0 취급 -->
	
	<!-- 실수몫 -->
	\${ 10 / 2 } = ${ 10 / 2 }<br>
	\${ 10 % 3 } = ${ 10 % 3 }<br>
	
	<!-- 비교 -->
	\${ 10 > 2 } = ${ 10 > 2 }<br>
	\${ 10 < 2 } = ${ 10 < 2 }<br>
	\${ 10 == 2 } = ${ 10 eq 2 }<br>
	\${ 10 != 2 } = ${ 10 ne 2 }<br>
	
	<!-- &&, ||, ! -->
	
	<!-- += 문자열 결합 연산자 -->
	
	<!-- empty 연산자 -->
	${ empty null ? "null 입니다." : "null이 아닙니다." }<br>	<!-- 공백 -->
	
	<!-- String id = requset.getParameter(id);
		id.equals("java"); -->
	파라미터값 출력 = ${ empty param.id ? "id를 입력하세요" : param.id }<br>

</body>
</html>