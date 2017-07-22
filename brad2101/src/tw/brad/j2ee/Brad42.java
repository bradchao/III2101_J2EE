package tw.brad.j2ee;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad42")
public class Brad42 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.getAttribute("key3"));
		if (servletContext.getAttribute("key1") != null) {
			servletContext.removeAttribute("key1");
		}
	}
}
