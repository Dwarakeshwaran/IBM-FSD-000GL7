package com.spring.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Long id;
	private String fName;
	private String lName;
	private String email;
	/*
	private int salary;
	private int commition;
	private int hourlyPaid;
	private int contractPeriod;
	*/
	
	
	public Long getId() {
		return id;
	}
	public Employee() {
		super();
	}
	public Employee(Long id, String fName, String lName, String email) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
