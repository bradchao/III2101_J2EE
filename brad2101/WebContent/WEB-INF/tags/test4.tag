<%@ tag dynamic-attributes="product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	out.println("<h1>Brad Big Company</h1>");
%>
<table border="1" width="100%">
	<tr>
		<th>Item</th>
		<th>Value</th>
	</tr>
	<c:forEach var="prod" items="${product }">
		<tr>
			<td>${prod.key }</td>
			<td>${prod.value }</td>
		</tr>
	</c:forEach>

</table>
