<%@ tag dynamic-attributes="product" %>
<%@ attribute name="user" required="true" %>
<%@ tag import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	out.println("<h1>Brad Big Company</h1>");

		HashMap<String,String> ps = 
			(HashMap<String,String>)jspContext.getAttribute("product");
		
		if (ps.containsKey("name")){
			out.println(ps.get("name"));	
		}
		
//		out.println((String)ps[0].key);
%>
<table border="1" width="100%">
	<tr>
		<th>Item</th>
		<th>Value</th>
	</tr>
</table>
