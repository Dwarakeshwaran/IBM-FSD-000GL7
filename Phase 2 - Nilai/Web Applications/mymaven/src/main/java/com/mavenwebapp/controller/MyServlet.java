package com.mavenwebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mavenwebapp.myapp.dao.HeroImpl;
import com.mavenwebapp.myapp.dao.HeroInterface;
import com.mavenwebapp.myapp.entity.Category;
import com.mavenwebapp.myapp.entity.HeroList;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HeroInterface dao;
	
	@Override
	public void init() throws ServletException{
		super.init();
		dao = new HeroImpl();
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		
		write.println("This is controller.do");
		String points = request.getParameter("points");
		
		HttpSession session = request.getSession();
		
		HeroList hero = (HeroList)session.getAttribute("I");
		hero.setCategory(new Category(Integer.parseInt(points)));
		dao.createHero(hero);
		RequestDispatcher view=request.getRequestDispatcher("success.jsp");
		view.include(request, response);
		

	}

}
