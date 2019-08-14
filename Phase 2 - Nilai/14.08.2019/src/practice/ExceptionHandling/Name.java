package practice.ExceptionHandling;

public class Name extends Throwable {
	
	private String fname;
	private String lname;
	public boolean flag1;
	public boolean flag2;
	
	public Name(String fname, String lname) throws NameNotValidException {
		super();
		this.fname = fname;
		this.lname = lname;
		
		char[] arr;
		arr = new char[50];
		//System.out.println(fname.charAt(0));
		
		for(int i=0;i<26;i++)
		{
			arr[i] = (char) ('A'+i);
		}
//		for(int i=0;i<=26;i++)
//		{
//			System.out.print(arr[i]);
//		}
		
		
		for(int i=0;i<26;i++)
		{
			if(fname.charAt(0) == arr[i])
				this.flag1 = true;
				

				
				
			if(lname.charAt(0) == arr[i])
				this.flag2 = true;
				
		}
		
		if(!this.flag1 && !this.flag2)
			throw new NameNotValidException("First and Last Names are Invalid");
		
		
	}
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
