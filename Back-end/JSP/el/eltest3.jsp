<%@page import="java.util.HashMap"%>
<%@page import="dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
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
	int i = 10;
	pageContext.setAttribute("ii", i);
	%>
	i = <%=i %> 입니다.<br>
	i = ${ii } 입니다.<br>
	
	${jj = 20 }<br>
	<%=pageContext.getAttribute("jj") %><br>
	
	<jsp:useBean id="dto" class="dto.MemberDTO" />
	<jsp:setProperty property="id" name="dto" value="eltest" />
	
	dto 객체 id값 = ${dto.id }<br>
	
	<!-- 배열이나 ArrayList 타입 자바 객체(인덱스 순서대로 관리) - el 전달 -->
	<%
	String[] array = {"red", "black", "white", "green", "blue"};
	for(int j = 0; j < array.length; j++) {
		out.println(array[j] + "<br>");
	}
	pageContext.setAttribute("cols", array);
	%>
	
	${cols[0] }<br>
	${cols[1] }<br>
	${cols[2] }<br>
	${cols[3] }<br>
	${cols[4] }<br>
	
	<hr>
	
	<%
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	list.add(new MemberDTO("MEM1", "1", "회원1", "번호1", "이메일1", "주소1"));
	list.add(new MemberDTO("MEM2", "2", "회원2", "번호2", "이메일2", "주소2"));
	list.add(new MemberDTO("MEM3", "3", "회원3", "번호3", "이메일3", "주소3"));
	list.add(new MemberDTO("MEM4", "4", "회원4", "번호4", "이메일4", "주소4"));
	list.add(dto);
	
	pageContext.setAttribute("memberlist", list);
	%>
	
	${memberlist[0].id }-${memberlist[0].name }-${memberlist[0].email }<br>
	${memberlist[1].id }-${memberlist[1].name }-${memberlist[1].email }<br>
	${memberlist[2].id }-${memberlist[2].name }-${memberlist[2].email }<br>
	${memberlist[3].id }-${memberlist[3].name }-${memberlist[3].email }<br>
	${memberlist[4].id }-${memberlist[4].name }-${memberlist[4].email }<br>
	
	<!-- map 타입 자바 객체(키와 값의 쌍으로 관리) - el 전달 -->
	<%
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("빨강색", "red");
	map.put("노랑색", "yellow");
	map.put("검정색", "black");
	map.put("보라색", "purple");
	map.put("파랑색", "blue");
	
	pageContext.setAttribute("colmap", map);
	%>
	
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<c:forEach items="${colmap }" var="col">
		${col.key } - ${col.value }<br>
	</c:forEach>

</body>
</html>