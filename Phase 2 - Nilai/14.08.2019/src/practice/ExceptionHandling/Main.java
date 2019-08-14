package practice.ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		Name name;
		try {
			name = new Name("Dwaki","Magesh");
			System.out.println(name.getFname());
			System.out.println(name.getLname());
		} catch (NameNotValidException e) {
			
			System.err.println(e.getMessage());
		}
		
		
		
		

	}

}
