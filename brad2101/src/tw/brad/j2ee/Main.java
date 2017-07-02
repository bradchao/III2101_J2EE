package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

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
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "");
			
			Connection conn =
				DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/iii", prop);
			PreparedStatement pstmt = 
				conn.prepareStatement(
					"SELECT * FROM cust");
			rs = pstmt.executeQuery();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.println("<a href='AddAccount'>Add</a>");
		out.println("<hr />");
		out.println("<table border='1' width='100%'>");
		out.println("<tr>\r\n" + 
				"		<th>ID</th>\r\n" + 
				"		<th>Name</th>\r\n" + 
				"		<th>Password</th>\r\n" + 
				"	</tr>");
		try {
			if (rs != null) {
				while (rs.next()) {
					out.print("<tr>");
					out.print("<td>" + rs.getString("id") + "</td>");
					out.print("<td>" + rs.getString("account") + "</td>");
					out.print("<td>" + rs.getString("passwd") + "</td>");
					out.print("</tr>");
				}
			}
		}catch(Exception e) {
		}
		
		out.println("</table>");
	}
}
