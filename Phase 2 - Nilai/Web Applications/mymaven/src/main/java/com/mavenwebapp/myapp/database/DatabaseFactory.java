package com.mavenwebapp.myapp.database;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DatabaseFactory {
	

	
		private static SessionFactory factory=null;
		private static Session session=null;
		static
		{
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		public static Session getMySession()
		{
			session=factory.getCurrentSession();
			return session;
		}

	
}
