package polymorphism;

public class Car1 extends Vehical {
	//inherit override 4 methods
	@Override
	void start()
	{
		System.out.println("Car started");
	}
	@Override
	void accelerate()
	{
		System.out.println("Accelerate the car.");
	}
	@Override
	void gearup()
	{
		System.out.println("Now gear up");
	}
	@Override
	void stop()
	{
		System.out.println("Stop the car");
		System.out.println("---------------");
	}
}
