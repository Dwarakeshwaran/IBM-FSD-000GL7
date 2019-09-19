package com.spring.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.employee.entity.Employee;
import com.spring.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepo;
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public List<Employee> getEmployees(Model theModel) {
		
		List<Employee> employee = new ArrayList<Employee>();
		
		for(Employee e : employeeRepo.findAll()) {
			employee.add(e);
		}
		return employee;
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
