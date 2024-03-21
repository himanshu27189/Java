package polymorphism;

public class Himanshu extends Facebook {
	@Override
	void login()
	{
		System.out.println("Logic for login");
	}
	@Override
	void logout()
	{
		System.out.println("Logic for logout");
	}
}
