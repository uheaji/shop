<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setHeader("Pragma", "no-cache");
	if(request.getProtocol().equals("HTTP/1.1")) {
		response.setHeader("Cache-Control", "no-store");
	}
%>
	<h1>Response Example1</h1>
	http://localhost/myapp/ch07/response1.jsp가<p/>
	http://localhost/myapp/ch07/response1_1.jsp로 변경되었습니다.