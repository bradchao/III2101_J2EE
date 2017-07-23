package tw.brad.j2ee;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="BradFilter", urlPatterns={"/iii/*"})
public class MyFilter implements Filter{
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("filter init");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("doFilter: before");
		
		String user = req.getParameter("user");
		if (user != null && user.equals("brad")) {
			chain.doFilter(req, resp);
		}
		
		System.out.println("doFilter: after");
	}

	@Override
	public void destroy() {
		System.out.println("Filter destory");
		
	}


}
