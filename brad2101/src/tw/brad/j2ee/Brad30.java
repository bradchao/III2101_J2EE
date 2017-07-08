package tw.brad.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Brad30")
public class Brad30 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = 
			request.getSession();	// 如果沒有存在,create a new one
		
//		HttpSession session = 
//			request.getSession(true);	// same as line 14
//		HttpSession session = 
	//		request.getSession(false);	// if not exist, that is
		
		Member member = new Member("brad", 51);
		session.setAttribute("who", member);
	
	}

}
