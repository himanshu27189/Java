package errorHandling;

public class IncorrectPassword extends RuntimeException{
	private String message;
	IncorrectPassword(String message)
	{
		this.message= message;
	}
	public String getMessage() {
		return message;
	}
}
