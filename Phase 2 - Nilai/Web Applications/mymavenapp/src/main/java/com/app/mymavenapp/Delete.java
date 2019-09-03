package com.app.mymavenapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(App.class).buildSessionFactory();
		Session session = factory.openSession();
		
		int id = 5;
		
		session.beginTransaction();
		System.out.println("Delete id: "+id);
		
		App hero = session.get(App.class, id);
		session.delete(hero);
		
		session.getTransaction().commit();

	}

}
