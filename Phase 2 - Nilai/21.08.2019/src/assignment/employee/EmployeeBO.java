package assignment.employee;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeBO {

	public static void printEmployees(List o) {
		Collections.sort(o);
		Iterator<Employee> iterator = o.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
