package com.app.mymavenapp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CRUD {

	private SessionFactory factory = null;
	private Session session = null;
	
	public void createSession() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(App.class).buildSessionFactory();
		session = factory.openSession();
	}
	
	public void InsertData(Object o) {
		App hero = (App)o;
		session.getTransaction().begin();
		session.persist(hero);
		session.getTransaction().commit();
	}
	
	public void deleteData(int id) {
		session.beginTransaction();
		System.out.println("Delete id: "+id);
		
		App hero = session.get(App.class, id);
		session.delete(hero);
		
		session.getTransaction().commit();
	}
	
	public void viewData() {
		List<App> theHeroes = session.createQuery("from herolist").getResultList();
		displayStudents(theHeroes);
	}

	private void displayStudents(List<App> theHeroes) {
		for (App tempHero : theHeroes) {
			System.out.println(tempHero);
		}
		
	}

}
