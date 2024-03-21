package polymorphism;

public class Car extends Vehicle {
	public Car(int cost) {
		// TODO Auto-generated constructor stub
	}
	@Override
	void start()
	{
		System.out.println("Start with button");
	}
	void stop()
	{
		System.out.println("Stop with button");
	}
}
