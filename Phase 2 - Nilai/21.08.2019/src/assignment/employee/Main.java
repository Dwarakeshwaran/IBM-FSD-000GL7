package assignment.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws ParseException {
		sc = new Scanner(System.in);
		String noe;
		int id;
		String name;
		String department;
		String date;
		Date dateOfJoining;
		String age;
		String salary;

		System.out.println("Enter the number of employees: ");
		noe = sc.nextLine();

		List<Employee> list = new ArrayList<Employee>();
		for (int i = 1; i <= Integer.parseInt(noe); i++) {
			System.out.println("Enter the details for employee " + i + ": ");
			id = i;
			name = sc.nextLine();
			department = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			date = sc.nextLine();
			age = sc.nextLine();
			salary = sc.nextLine();
			dateOfJoining = sdf.parse(date);

			list.add(new Employee(id, name, department, dateOfJoining, age, salary));

		}

		// System.out.println(list.get(0));
		System.out.println("1. Sort Employees by salary");
		System.out.println("2. Sort employees by age and by date of joining");

		int choice;
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			Collections.sort(list);
			System.out.printf("%-15s %-30s %-30s %-30s %-10s %-10s\n", "Employee ID", "Name", "Department","Date Of Joining", "Age", "Salary");
			EmployeeBO.printEmployees(list);
			break;
		case 2:
			Collections.sort(list, new AgeComparator());
			System.out.printf("%-15s %-30s %-30s %-10s %-10s %-10s\n", "Employee ID", "Name", "Department",
					"Date Of Joining", "Age", "Salary");
			EmployeeBO.printEmployees(list);
			break;
		}

	}

}
