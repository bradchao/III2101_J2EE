package tw.brad.j2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServerListener implements ServletContextListener {
	private ServletContext servletContext;
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("init");
		
		ServletContext servletContext = event.getServletContext();
		servletContext.setAttribute("key3", "value3");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:9487/brad",
					"root","root");
			servletContext.setAttribute("conn", conn);
			servletContext.setAttribute("isConnection", true);
			System.out.println("OK");
		}catch(Exception e) {
			servletContext.setAttribute("isConnection", false);
			System.out.println("XX");
		}
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("destroy");
		
		if ((Boolean)(servletContext.getAttribute("isConnection")) &&
				servletContext.getAttribute("conn") != null) {
			Connection conn = (Connection)servletContext.getAttribute("conn");
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("MySQL Close Error!");
			}
		}
		
	}
}
