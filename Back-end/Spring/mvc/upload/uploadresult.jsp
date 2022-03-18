<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="resources/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
	</script>

</head>
<body>

	<h1>${dto.name }님 ${dto.file1.originalFilename } 파일과 ${dto.file2.originalFilename } 파일을 업로드 하셨습니다.</h1>

</body>
</html>