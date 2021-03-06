package tw.brad.j2ee;

import java.io.IOException;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Brad57", asyncSupported=true)
public class Brad57 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		List<AsyncContext> asyncs = (List)servletContext.getAttribute("asyncs");
		MyAsyncListener asyncListner =  (MyAsyncListener)servletContext.getAttribute("asyncListener");
		synchronized (asyncs) {
			AsyncContext async = request.startAsync();
			async.addListener(asyncListner);
			async.setTimeout(900000000);
			asyncs.add(async);
		}
	
	}

}
