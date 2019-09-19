package com.spring.employee.ui;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.employee.entity.Employee;
import com.spring.employee.repository.EmployeeRepository;

@Component
public class UI implements ApplicationListener<ContextRefreshedEvent>{
	
	private EmployeeRepository employeeRepository;
	
	public UI(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	
	private void init() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId((long) 1);
		employee.setfName("Dwaki");
		employee.setlName("Suman");
		employee.setEmail("dwaki98@gmail.com");
		
		employeeRepository.save(employee);
		
	}

}
