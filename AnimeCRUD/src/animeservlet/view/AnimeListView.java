package animeservlet.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import animeservlet.model.AnimeList;
import animeservlet.model.services.Service;

/**
 * Servlet implementation class AnimeListView
 */
@WebServlet("/animelist.view")
public class AnimeListView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimeListView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NamingException {
		response.setContentType("text/html");
		String row ="";
		
		Service list = (Service) request.getAttribute("SUCCESS");
		ResultSet rs = list.showData();
		Service s = new Service();
		PrintWriter write = response.getWriter();
		while(rs.next()) {
			String name = rs.getString("name");
			String genre = rs.getString("genre");
			int year = rs.getInt("year");
			int rating = rs.getInt("rating");
			
			row += "<tr><td>"+name+"</td>"+"<td>"+genre+"</td>"+"<td>"+year+"</td>"+"<td>"+rating+"</td><td><a href='delete.data?name="+name+" '>Delete</a></td><td><a href='index.html'>Edit</a></td></tr>";
		}
		
		write.println("<table><tr><th>ANIME</th><th>GENRE</th><th>RATING</th><th>YEAR</th></tr>"+row+"</table>");
		
	}
}
