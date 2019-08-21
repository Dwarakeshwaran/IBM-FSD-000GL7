package assignment.employee;

import java.util.Date;

public class Employee implements Comparable<Object>{
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private String age;
	private String salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String department, Date dateOfJoining, String age, String salary) {
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
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return this.id+""+this.name+""+this.department+""+this.dateOfJoining+""+this.age+""+this.salary+"\n";
		
	}
	@Override
	public int compareTo(Object obj) {
		
		Employee emp = (Employee) obj;
		
		return Integer.parseInt(this.getSalary()) - Integer.parseInt(emp.getSalary());
	}
	

}
