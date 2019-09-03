package servlet.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Hero;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/success.view")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		Hero hero = (Hero)request.getAttribute("SUCCESS");
		write.println("<h2>Name: </h2>"+ hero.getName()+"<br/>"+
				"<h2>Hero Name: </h2>"+ hero.gethName()+"<br/>"+
				"<h2>Power Level: </h2>"+ hero.getPower()+"<br/>");
	}

}
