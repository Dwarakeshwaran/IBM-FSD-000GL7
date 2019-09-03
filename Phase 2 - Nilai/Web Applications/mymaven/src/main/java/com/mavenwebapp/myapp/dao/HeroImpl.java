package com.mavenwebapp.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mavenwebapp.myapp.database.DatabaseFactory;
import com.mavenwebapp.myapp.entity.HeroList;

public class HeroImpl implements HeroInterface{
	private static Session session = null;
	
	{
		session = DatabaseFactory.getMySession();
	}

	public void createHero(HeroList hero) {

		session.getTransaction().begin();
		session.persist(hero);
		session.getTransaction().commit();
	}
}
