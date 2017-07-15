package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.beans.MemberV2;

@WebServlet("/LoginMember")
public class LoginMember extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		// 1. prepare
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");

		// 2. Model
		try {
			MemberV2 member = new MemberV2();
			member.setAccount(account);
			member.setPasswd(passwd);
			
			if (member.isValidMember()) {
				// Login Success
			}else {
				// Login Failure
			}
			
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
	}

}
