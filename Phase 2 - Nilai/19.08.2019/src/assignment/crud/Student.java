package assignment.crud;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Student {
	public int id;
	public String name;
	public double gpa;
	public Map obj;

	public Student() {
		super();

	}

	public void viewOptions() {

		System.out.println("1 Add Student");
		System.out.println("2 Delete Student");
		System.out.println("3 Search Student");
		System.out.println("4 Modify Student");
		System.out.println("5 Display All Student Details");
	}

	public void addStudents() {
		Scanner sc = new Scanner(System.in);

		System.out.println("To add Student fill out the following details");
		System.out.print("Enter ID	: ");
		this.id = sc.nextInt();
		System.out.print("Enter Name: ");
		this.name = sc.next();
		System.out.print("Enter GPA	: ");
		this.gpa = sc.nextDouble();
		// Create the given details of the student as a single object
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ID", this.id);
		map.put("NAME", this.name);
		map.put("GPA", this.gpa);
		this.obj = (Map<String, Object>) map;

		// Add the object in an Array List using a collection
		Collection<Object> studentList = new ArrayList<Object>();
		studentList.add(map);
	

	}

	public void deleteStudent(int sid) {

		if ((int) obj.get("ID") == sid) {
			obj.put("ID", null);
			obj.put("NAME", null);
			obj.put("GPA", null);
		} else
			System.out.println("Not Found");

		

	}

	public void modifyStudent(int sid) {
		if ((int) obj.get("ID") == sid) {
			Scanner sc = new Scanner(System.in);
			System.out.println("To add Student fill out the following details");
			System.out.print("Enter ID	: ");
			this.id = sc.nextInt();
			System.out.print("Enter Name: ");
			this.name = sc.next();
			System.out.print("Enter GPA	: ");
			this.gpa = sc.nextDouble();
			// Create the given details of the student as a single object
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ID", this.id);
			map.put("NAME", this.name);
			map.put("GPA", this.gpa);
			this.obj = (Map<String, Object>) map;
		} else
			System.out.println("Not Found");


	}

	public void searchStudent(int sid) {
		if ((int) obj.get("ID") == sid) {
			System.out.println(obj);
		} else
			System.out.println("Not Found");


	}

	public void displayDetails() {
		System.out.println(obj);
	}

}
