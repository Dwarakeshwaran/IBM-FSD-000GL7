package com.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerDAO dao;
	
	@Override
	public List<Customer> getCustomer() {
		
		return dao.getCustomer();
	}

}
