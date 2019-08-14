package assignment.ExceptionHandling;

public class DuplicateAccountFound extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2750235163033766058L;
	
	private String message;

	public DuplicateAccountFound(String message) {
		super();
		this.message = message;
		setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
