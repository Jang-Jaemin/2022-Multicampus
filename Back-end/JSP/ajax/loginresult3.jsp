<%@page import="org.json.simple.JSONObject"%>
<%@page import="dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDAO"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String id = request.getParameter("id");
String password = request.getParameter("password");

JSONArray array = new JSONArray();
if(id.equals("ajax") && password.equals("ajax")) {
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberDTO> list = dao.selectMember();
	for(int i = 0; i < list.size(); i++) {
		MemberDTO dto = list.get(i);
		JSONObject obj = new JSONObject();
		obj.put("id", dto.getId());
		obj.put("name", dto.getName());
		obj.put("phone", dto.getPhone());
		obj.put("email", dto.getEmail());
		obj.put("address", dto.getAddress());
		array.add(obj);
	}
} else {
	// 회원정보 리스트 개수 0
}
%>

<%=array.toString() %>
