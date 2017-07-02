package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.println("<a href='AddAccount'>Add</a>");
		out.println("<hr />");
		out.println("<table border='1' width='100%'>");
		out.println("<tr>\r\n" + 
				"		<th>ID</th>\r\n" + 
				"		<th>Name</th>\r\n" + 
				"		<th>Password</th>\r\n" + 
				"	</tr>");
		out.println("</table>");
	}
}
