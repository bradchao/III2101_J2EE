package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad07")
public class Brad07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int result = x + y;
		System.out.println(result);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(x + " + " + y + " = " + result);
//		pw.write(97);
		pw.flush();
		pw.close();
		
	}
}
