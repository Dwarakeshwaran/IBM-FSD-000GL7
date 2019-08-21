package assignment.employee;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		
		if(Integer.parseInt(emp1.getAge()) != Integer.parseInt(emp2.getAge())) {
			return Integer.parseInt(emp1.getAge()) - Integer.parseInt(emp2.getAge());
		}
		else
			return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());
		
	}
	

	

}
