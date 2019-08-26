package test.practice;

public class Calc {
	
	public int num1;
	public int num2;
	public Calc(int num1, int num2) {
		super();
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public boolean isGreater() {
		System.out.println("Checking isGreater");
		if(num1 > num2)
			return true;
		else
			return false;
	}
	
	public boolean isLesser() {
		System.out.println("Checking isLesser");
		if(num1 < num2)
			return true;
		else
			return false;
	}
	
	public boolean isEquals() {
		System.out.println("Checking isEquals");
		if(num1 == num2)
			return true;
		else
			return false;
	}

	
}
