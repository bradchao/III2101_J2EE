<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String method = request.getMethod();
	// pageContext
	HttpServletRequest req = 
		(HttpServletRequest)pageContext.getRequest();
	
	String queryString = req.getQueryString();
	String user = req.getParameter("user");
	String passwd = req.getParameter("passwd");
	
	String ip = req.getRemoteAddr();
	
	
	
%>
Method: <%= method %><br>
Query: <%= queryString %><br>
user: <%= user %><br>
passwd: <%= passwd %><br>
ip: <%= ip %><br>
<hr>
Method: ${pageContext.request.method }<br>
Query: ${pageContext.request.queryString }<br>




</body>
</html>