package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          PrintWriter out=response.getWriter();
          String na=request.getParameter("name");
          out.println(na+"\n");
          String an=request.getParameter("author");
          out.println(an+"\n");
          String pr=request.getParameter("price");
          out.println(pr+"\n");
          String ap=request.getParameter("apart");
          out.println(ap);
    }
}
