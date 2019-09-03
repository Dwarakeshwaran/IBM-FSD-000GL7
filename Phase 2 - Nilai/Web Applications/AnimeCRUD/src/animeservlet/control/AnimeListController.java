package animeservlet.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import animeservlet.model.AnimeList;
import animeservlet.model.DatabaseConnection;
import animeservlet.model.services.Service;

/**
 * Servlet implementation class AnimeListController
 */
@WebServlet("/list_control.do")
public class AnimeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimeListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NamingException, SQLException {
		response.setContentType("text/html");
		
		PrintWriter write = response.getWriter();
		//write.println("<h1>Check</h1>");
		
		String name = request.getParameter("anime");
		String genre = request.getParameter("genre");
		String year = request.getParameter("year");
		String rating = request.getParameter("rate");
		
		Service s = new Service();
		s.insertData(name, genre, Integer.parseInt(year), Integer.parseInt(rating));
		
		
		request.setAttribute("SUCCESS", s );
		
		RequestDispatcher view = request.getRequestDispatcher("animelist.view");
		
		view.forward(request, response);
		
	}

}
