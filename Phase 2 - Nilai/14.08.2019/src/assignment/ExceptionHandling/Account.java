package assignment.ExceptionHandling;

public class Account {
	private static Account acc;
	private String name;
	private int salary;
	
	
	
	public Account() {
		super();
	}
	

	public static Account createAccount(String name, int salary) {
		if(acc == null)
		{
			acc = new Account(name,salary);
		}
		return acc;
		
	}
	public Account(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	
	
}
