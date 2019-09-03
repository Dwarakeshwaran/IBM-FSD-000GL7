package com.app.mymavenapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BatchInsert {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(App.class).buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(new App("Dwaki","Saiyan",9000));
		session.save(new App("Arun","Playboy",10000));
		session.save(new App("Teja","Dancer",11000));
		
		session.getTransaction().commit();
		
		factory.close();

	}

}
