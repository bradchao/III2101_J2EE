<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://127.0.0.1:9487/brad" 
	user="root" password="root" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:transaction>
	<sql:update var="n" sql="insert into member (account,passwd,realname) values (?,?,?)">
		<sql:param>tony</sql:param>		
		<sql:param>123</sql:param>		
		<sql:param>Tony</sql:param>		
	</sql:update>
	<sql:query var="lastid">
		select last_insert_id() as newid
	</sql:query>
</sql:transaction>

<c:if test="${n >= 1 }">
Last Id: ${lastid.rows[0].newid }
</c:if>



</body>
</html>