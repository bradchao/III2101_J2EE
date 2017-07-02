package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Brad13")
@MultipartConfig
public class Brad13 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String uploadPath = getServletContext().getInitParameter("upload-path");
		Part part = request.getPart("upload");
		
		String header = part.getHeader("Content-Disposition");
		out.print(header + "<br>");
		out.print(BradAPI.getHeaderFileName(header));
		
//		String filename = part.getSubmittedFileName();
//		part.write(uploadPath + "/" + filename);
		
//		out.print(uploadPath + "<br>");
//		out.print(filename + "<br>");
//		out.print("Upload Success");
	}

}
