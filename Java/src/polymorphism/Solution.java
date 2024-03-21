package polymorphism;

public class Solution {
	//main method
	// achieve upcasting for vehicle and bike, vehicle and car, vehicle and truck.
	public static void main(String[] args) {
		
	
	Vehical v1 = new Car1();
	Vehical v2 = new Truck();
	Vehical v3 = new Bike1();
	v1.start();
	v1.accelerate();
	v1.gearup();
	v1.stop();
	v2.start();
	v2.accelerate();
	v2.gearup();
	v2.stop();
	v3.start();
	v3.accelerate();
	v3.gearup();
	v3.stop();
	}
}
