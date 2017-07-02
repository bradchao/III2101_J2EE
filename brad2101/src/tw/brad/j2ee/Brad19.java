package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * I am Controller
 */

@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		// 0. prepare
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		if (x == null) x = "0";
		if (y == null) y = "0";
		
		// 1. Model
		Brad20 model = new Brad20(x,y);
		int result = model.add();
		
		// 2. forward -> View 
		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("result", result);
		request.getRequestDispatcher("Brad21").forward(request, response);
	}
}
