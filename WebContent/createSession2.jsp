<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션사용예제(세션생성)</title>
</head>
<body>
<%
	String id = "rorod";
	String pwd = "1234";
	
	session.setAttribute("idKey", id);
	session.setAttribute("pwdKey", pwd);
%>
세션이 생성되었습니다.</br>
<a href="viewCookieSessionInfo.jsp">쿠키 및 세션정보를 확인하는 페이지로 이동</a>
</body>
</html>