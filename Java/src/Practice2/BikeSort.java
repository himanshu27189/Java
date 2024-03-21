package Practice2;

import java.util.TreeSet;

public class BikeSort {
public static void main(String[] args) {
	Bike b1 = new Bike("Yamaha");
	Bike b2 = new Bike("Ducati");
	Bike b3 = new Bike("Bajaj");
	Bike b4 = new Bike("Banelli");
	Bike b5 = new Bike("Husqvarna");
	Bike b6 = new Bike("BMW");
	
	TreeSet<Bike> bt = new TreeSet<Bike>();
	bt.add(b6);
	bt.add(b5);
	bt.add(b4);
	bt.add(b3);
	bt.add(b2);
	bt.add(b1);
	
	for(Bike k : bt)
	{
		System.out.println(k);
	}
	}
}
