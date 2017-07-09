<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.brad.beans.BradUtil" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// Scope
	// 1. Page
	pageContext.setAttribute("name", "<h1>brad Big Company</h1>");
	// 2. request
	request.setAttribute("name", "request");
	// 3. session
	session.setAttribute("name", "session");
	// 4. application
	application.setAttribute("name", "app");

%>

Page: ${pageScope.name }<br>
Request: ${requestScope.name }<br>
Session: ${sessionScope.name }<br>
App: ${applicationScope.name }<br>
1. m1(): <%= BradUtil.m1("brad") %><br>
2. m1(): ${BradUtil.m1(param.name) } 




</body>
</html>