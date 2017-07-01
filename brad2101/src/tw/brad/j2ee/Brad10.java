package tw.brad.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad10")
public class Brad10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String gender = request.getParameter("gender");

		String[] hobby = request.getParameterValues("hobby");
		

		
		//response.getWriter().write(hobby);
		StringBuffer sb = new StringBuffer();
		for (String h : hobby) {
			sb.append(h + " ");
		}
		response.getWriter().write(sb.toString());
	
	}
}
