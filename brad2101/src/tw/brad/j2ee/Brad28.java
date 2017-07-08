package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad28")
public class Brad28 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String account="", passwd="";
		boolean isRemember = false;
		
		Cookie[] cookies = request.getCookies();
		HashMap<String,String> map = new HashMap<>();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				String value = cookie.getValue();
				map.put(name, value);
			}
		}

		if (map.containsKey("remember")) {
			if (map.get("remember").equals("true")) {
				out.println(map.get("account") + " : " + map.get("passwd"));
			}else {
				out.print("no remember");
			}
		}else {
			out.print("no cookie");
		}
		
	}

}
