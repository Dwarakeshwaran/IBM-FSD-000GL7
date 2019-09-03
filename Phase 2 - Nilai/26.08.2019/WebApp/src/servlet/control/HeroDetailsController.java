package servlet.control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.database.DatabaseConnection;
import servlet.model.Hero;

/**
 * Servlet implementation class HeroDetailsController
 */
@WebServlet("/hero_controller.do")
public class HeroDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name, hero;
	private String power;
	private List<String> err;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HeroDetailsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			processHero(request, response);
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			processHero(request, response);
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void processHero(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NamingException, SQLException {
		response.setContentType("text/html");

		name = request.getParameter("name");
		hero = request.getParameter("hero");
		power = request.getParameter("power");
		
		err = new LinkedList<String>();
		
		if(name == null) {
			err.add("<h2 style='color:red'>Enter your name da! *Hero it seems*</h2>");
		}
		
		if(hero.toString().length() >=20) {
			err.add("<h2 style='color:red'>Hero names should be below 20 Characters<h2>");
		}
		
		if(Integer.parseInt(power) <= 100) {
			err.add("<h2 style='color:red'>Power Level is below 100'a?!??! Go f**k urself!</h2>");
		}
		
		if(err.isEmpty()) {
			Connection connection=DatabaseConnection.connectDatabase();
			PreparedStatement pst=connection.prepareStatement("insert into public.herolist values(?,?,?)");
			pst.setString(1, name);
			pst.setString(2, hero);
			pst.setString(3, power);
			
			pst.executeUpdate();
			
			
			request.setAttribute("SUCCESS", new Hero(name,hero,Integer.parseInt(power)));
			RequestDispatcher view = request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else {
			request.setAttribute("ERROR",err);
			RequestDispatcher view = request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}

	}

}
