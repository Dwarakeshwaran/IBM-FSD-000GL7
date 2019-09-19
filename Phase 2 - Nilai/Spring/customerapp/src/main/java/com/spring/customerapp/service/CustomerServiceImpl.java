package com.spring.customerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.customerapp.dao.CustomerDaoImpl;
import com.spring.customerapp.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerServcie {
 
	@Autowired
	private CustomerDaoImpl dao;
	public CustomerDaoImpl getDao() {
		return dao;
	}
	public void setDao(CustomerDaoImpl dao) {
		this.dao = dao;
	}
	public void createCustomer(Customer customer) {
		dao.createCustomer(customer);

	}

}
