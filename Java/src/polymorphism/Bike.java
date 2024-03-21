package polymorphism;

public class Bike extends Vehicle {
	@Override
	void start()
	{
		System.out.println("Start with key");
	}
	void stop()
	{
		System.out.println("Stop with key");
	}
}
