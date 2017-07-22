package tw.brad.j2ee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Brad46")
public class Brad46 extends HttpServlet {
	private ServletContext context;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		try {
			Connection conn1 = (Connection)context.getAttribute("conn");
			Statement stmt = conn1.createStatement();
			
			ResultSet rs = 
				stmt.executeQuery(
					"select * from member where account='brad' and islogin=0");
			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(60);
				stmt.executeUpdate(
						"update member set islogin=1 where account='brad'");
				session.setAttribute("dbid", "1");
				System.out.println("new Login");
			}else {
				System.out.println("Login already!");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	
	
	}

}
