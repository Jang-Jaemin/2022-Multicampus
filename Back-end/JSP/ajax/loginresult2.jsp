<%@page import="org.json.simple.JSONArray"%>
<%@page import="dto.MemberDTO"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String id = request.getParameter("id");
String password = request.getParameter("password");

JSONArray array = new JSONArray();
if(id.equals("ajax") && password.equals("ajax")) {
	// 다른 회원 이름전송
	JSONObject o1 = new JSONObject();
	o1.put("name", "김회원");
	JSONObject o2 = new JSONObject();
	o2.put("name", "박회원");
	JSONObject o3 = new JSONObject();
	o3.put("name", "최회원");
	array.add(o1);
	array.add(o2);
	array.add(o3);
} else {
	
}
%>

<%=array.toString() %>


<!-- test 2 -->

<%-- <%
String id = request.getParameter("id");
String password = request.getParameter("password");

JSONObject obj = new JSONObject();

if(id.equals("ajax") && password.equals("ajax")) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new Date();
	String time = sdf.format(now);
	obj.put("login", true);
	obj.put("time", time);
	
	// 현재사용자 정보(id, password, name, phone, email, address -> MemberDTO)
	MemberDTO me = new MemberDTO("mem1", "1", "회원1", "010-1111-3333", "AAA@a.com", "경기");
	obj.put("id", me.getId());
	obj.put("name", me.getName());
	obj.put("phone", me.getPhone());
	obj.put("email", me.getEmail());
	obj.put("address", me.getAddress());
	
} else {
	obj.put("login", false);
}
%>

<%=obj.toString() %> --%>

<!-- test1 -->

<%-- <%
// id = ajax 이고, password = ajax 이면 "정상적인 로그인 사용자입니다." 출력
String id = request.getParameter("id");
String password = request.getParameter("password");
String result = "";
if(id.equals("ajax") && password.equals("ajax")) {
	result = "{\"login\" : true, \"time\" : \"2022-03-08 11:47:50\"}";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new Date();
	String time = sdf.format(now);
	result = "{\"login\" : true, \"time\" : \"" + time + "\"}";
} else {
	result = "{\"login\" : false}";
}
%> --%>

<%-- <%=result %> --%>