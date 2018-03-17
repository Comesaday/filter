package filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter{

	protected String targetencoding =null;
	protected String targetconfig=null;
	
	public void destroy() {
		 this.targetencoding=null;
	}
	
	public void init(FilterConfig config) throws ServletException {
		this.targetconfig=config.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if(targetencoding!=null){
			request.setCharacterEncoding(targetencoding);
			response.setContentType("text/html;charset="+targetencoding);
		}
		chain.doFilter(request,response);
	}
}
