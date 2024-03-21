package polymorphism;

public class Rider {
	public static void main(String[] args) {
		
		Vehicle v = new Bike();
		v.start();
		v.stop();
		Vehicle c = new Car();
		c.start();
		c.stop();
	}
}
