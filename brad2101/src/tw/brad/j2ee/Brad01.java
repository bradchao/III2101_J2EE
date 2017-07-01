package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/III01.php")
public class Brad01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		System.out.println("doGet");
		
		try (PrintWriter writer = response.getWriter()){
			writer.write("Hello, World");
			writer.flush();
		}
		
	}
}
