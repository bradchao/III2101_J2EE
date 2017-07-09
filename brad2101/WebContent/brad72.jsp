<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] names = {"brad", "iii", "OK", "world"};
	pageContext.setAttribute("names", names);
	pageContext.setAttribute("step", 1);
%>
<table border='1' width='100%'>
	<tr>
		<th>index</th>
		<th>Name</th>
		<th>Count</th>
		<th>First</th>
		<th>Last</th>
	</tr>
	<c:forEach items="${names }" var="name" varStatus="status"
		begin="0" end="3" step="${step }">
		<tr>
			<td>${status.index }</td>
			<td>${name }</td>
			<td>${status.count }</td>
			<td>${status.first }</td>
			<td>${status.last }</td>
		</tr>
	</c:forEach>
	
</table>
<hr />
<%
	String line = "1,brad,male,0912-123456,2000-01-02,台中市西屯區";
	pageContext.setAttribute("line", line);
%>
<c:forTokens delims="," items="${line }" var="field"
	varStatus="status" >
${status.count} : ${field }<br>
</c:forTokens>
<hr>
<c:import var = "data" url = "http://www.tutorialspoint.com"/>
<c:import url="brad73.jsp" var="data2">
	<c:param name="x" value="1"/>
	<c:param name="y" value="2"/>
</c:import>
<c:out value = "${data2}"/>




</body>
</html>