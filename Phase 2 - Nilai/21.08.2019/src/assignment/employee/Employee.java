package assignment.employee;

import java.util.Date;

public class Employee implements Comparable{
	private int id;
	private String name;
	private String department;
	private String dateOfJoining;
	private int age;
	private int salary;
	
	public Employee(int id, String name, String department, String dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+"\n"+"Department: "+this.department+"\n"+"Date Of Joining: "+this.dateOfJoining+"\n"+"Age: "+this.age+"Salary: "+"\n"+this.salary;
		
	}
	

}
