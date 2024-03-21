package String;

public class Bike {
	String brand;
	double cost;
	Bike(String brand, int cost)
	{
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString()
	{
		return "THe cost of bike is---- " + cost + " and the brand is---- " + brand;
	}
	public static void main(String[] args) {
		Bike b = new Bike("BMW",2000000);
		Bike c = new Bike("Kawasaki",3000000);
		Bike d = new Bike("Yamaha",8000000);
		System.out.println(b.toString());
		System.out.println(c);
		System.out.println(d);
	}
}
