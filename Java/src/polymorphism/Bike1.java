package polymorphism;

public class Bike1 extends Vehical {
	// override 4 methods
	@Override
	void start()
	{
		System.out.println("Bike started");
	}
	@Override
	void accelerate()
	{
		System.out.println("Accelerate the bike.");
	}
	@Override
	void gearup()
	{
		System.out.println("Now gear up");
	}
	@Override
	void stop()
	{
		System.out.println("Stop the bike");
		System.out.println("---------------");
	}
}
