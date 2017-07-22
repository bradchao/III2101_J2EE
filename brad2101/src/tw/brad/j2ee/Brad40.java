package tw.brad.j2ee;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Brad40", 
	urlPatterns={"/Brad40","/Brad40.php","/Brad40.aspx"},
	initParams={
		@WebInitParam(name="x", value="123"),
		@WebInitParam(name="y", value="456")
	}
)
public class Brad40 extends HttpServlet {
	private ServletConfig servletConfig;
	private ServletContext servletContext;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		servletConfig = getServletConfig();
		servletContext = getServletContext();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		super.service(req, resp);	// doGet or doPost
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = servletConfig.getInitParameterNames();
		while (params.hasMoreElements()) {
			String param = params.nextElement();
			System.out.println(param + " = " + 
					servletConfig.getInitParameter(param));
		}
	
	
	}

}
