package practice.ExceptionHandling;

public class NameNotValidException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 407536084538059985L;
	
	private String message;

	public NameNotValidException(String message) {
		super();
		this.setMessage(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public NameNotValidException() {
		super();
	}
	
	
}
