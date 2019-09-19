package com.spring.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.employee.entity.Employee;
import com.spring.employee.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/")
	public String viewEmployees(Model model) {
		List<Employee> employee = service.getEmployees();
		model.addAttribute("e", employee);
		return "/list";
		
	}

}
