<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="brad" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<brad:test1/>
<hr>
<brad:test2 user="Brad"/>
<hr>
<brad:test3 x="10" y="3">
	10 + 3 = ${add }<br>
	10 - 3 = ${sub }<br>
	10 x 3 = ${multiply }<br>
	10 / 3 = ${divide }<br>
</brad:test3>
<hr>
<brad:test5 user="brad" name="Mouse" id="001" price="100"/>


</body>
</html>