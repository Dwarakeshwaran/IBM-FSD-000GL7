package com.spring.boot;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
private EntityManager em;
	
	@Autowired
	public CustomerDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	
	private Session session;
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		session = em.unwrap(Session.class);
		List<Customer> lc = new ArrayList<Customer>();
		Query rc = session.createQuery("from Customer",Customer.class);
		lc = rc.getResultList();
		return lc;
		

	}
	
	@PreDestroy
	public void destroy() {
		session.close();
	}

}
