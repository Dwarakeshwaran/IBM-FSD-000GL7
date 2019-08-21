package assignment.practice;

import java.util.Date;

//A class to represent a student. 
class Student implements Comparable<Object> {
	int rollno;
	String name, address;
	Date date;
	

	// Constructor
	public Student(int rollno, String name, String address,Date date) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.date = date;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address + " " + this.date;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.date.compareTo(s.date);
	}
}