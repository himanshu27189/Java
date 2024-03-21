package Abstract;

public class InstaImpl extends Instagram {
	@Override
	void login()
	{
		System.out.println("Login successful");
	}
	@Override 
	void post()
	{
		System.out.println("Post successful");
	}
	@Override
	void logout()
	{
		System.out.println("Logout successful");
	}
}
