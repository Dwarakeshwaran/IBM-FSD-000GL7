package com.spring.myspringwebapp.model;

public class Student {
	private String fname;
	private String lname;
	private String dept;
	public Student(String fname, String lname, String dept) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
