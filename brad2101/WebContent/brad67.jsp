<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.*" %>
<%
	String[] names = {"Brad", "III", "OK"};
	request.setAttribute("usernames", names);

	LinkedList<String> list = new LinkedList<>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	request.setAttribute("list", list);
	
	HashMap<String, String> map = new HashMap<>();
	map.put("name", "Brad");
	map.put("account", "brad");
	map.put("passwd", "123456");
	request.setAttribute("map", map);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Name1: ${usernames[0]}<br>
List1: ${list[param.i] }<br>
Account: ${map["account"] }<br/>

${10 + 3 / 7}<br />
${(param.i=="1") ? "Yes" : "No" }<br>
${ 1 > 3 }<br>
${ "a" < "b" }<br>
${ "12" > 3 }<br>







</body>
</html>