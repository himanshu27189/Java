package polymorphism;

public class Truck extends Vehical {
	// inherit and override 4 methods
	@Override
	void start()
	{
		System.out.println("Truck started");
	}
	@Override
	void accelerate()
	{
		System.out.println("Accelerate the Truck.");
	}
	@Override
	void gearup()
	{
		System.out.println("Now gear up");
	}
	@Override
	void stop()
	{
		System.out.println("Stop the truck");
		System.out.println("----------------");
	}
}
