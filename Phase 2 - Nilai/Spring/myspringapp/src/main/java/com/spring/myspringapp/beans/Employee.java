package com.spring.myspringapp.beans;

public class Employee implements Coach{
	private int id;
	private String fname;
	private String lname;
	private String email;
	private AddressImpl address;
	
	private String nick;
	private String power;
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Employee(int id, String fname, String lname, String email, AddressImpl address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}

	public Employee(AddressImpl address) {
		super();
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address="
				+ address + ", nick=" + nick + ", power=" + power + "]";
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return toString();
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address.getAddress();
	}
	
	
	public void initMethod() {
		System.out.println("Init Method Called");
	}
	
}
