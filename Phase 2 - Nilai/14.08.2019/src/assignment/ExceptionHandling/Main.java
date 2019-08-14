package assignment.ExceptionHandling;

public class Main {

	public static void main(String[] args) throws DuplicateAccountFound {
		Account acc1 = new Account("Dwaki", 1000);
		Account acc2 = new Account("Suman", 1000);
 
		//System.out.println(acc1 == acc2);
		try {
			if(acc1.equals(acc2)) 
			{
				throw new DuplicateAccountFound("Account Already Found");
			}
			else
				System.out.println("Account Added");
		}
		catch(DuplicateAccountFound e)
		{
			System.err.println(e.getMessage());
		}
		
	}

}
