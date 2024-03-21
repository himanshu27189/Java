package polymorphism;

public class Seema extends Instagram {
	// override all 3 methods
	@Override
	void login()
	{
		System.out.println("Logic for login");
	}
	@Override
	void post()
	{
		System.out.println("Logic for post");
	}
	@Override
	void story()
	{
		System.out.println("Logic for story");
	}
}
