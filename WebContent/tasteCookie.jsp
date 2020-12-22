<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taste Cookie</title>
</head>
<body>
	<h1>Example Cookie</h1>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i = 0; i <cookies.length; ++i) {
				if(cookies[i].getName().equals("myCookie")) {
	%>
					cookie Name : <%=cookies[i].getName() %><br/>
					cookie Value : <%= cookies[i].getValue() %><br/>
	<% 
				}
			}
		}
	%>
</body>
</html>