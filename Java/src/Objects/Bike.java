package Objects;

public class Bike {
	String brand;
	String model_name;
	int mileage;
	String color;
	Bike(String brand, String model_name, int mileage, String color)
	{
		this.brand= brand;
		this.model_name=model_name;
		this.mileage=mileage;
		this.color=color;
	}
	void display()
	{
	System.out.println("Brand of the bike is -> |"+brand+"|");
	System.out.println("Model name of the bike is -> |"+model_name+"|");
	System.out.println("Mileage of the bike is -> |"+mileage+"kmpl|");
	System.out.println("Color of the bike is -> |"+color+"|");
	System.err.println("-----------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1= new Bike("Yamaha","R-15",35,"Black");
		Bike b2= new Bike("TVS","Apache RR 310",30,"White");
		Bike b3= new Bike("Harley Davidson","Fat Bob",25,"Black");
		Bike b4= new Bike("Royal Enfield", "Himalayan",35,"White");
		Bike b5= new Bike("Hero", "Karizma",30,"Yellow");
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		b5.display();
	}

}
