package Sorting;

import java.util.TreeSet;

import polymorphism.Car;

public class SortCar {
	public static void main(String[] args) {
		Car c1 = new Car(10000);
		Car c2 = new Car(20000);
		Car c3 = new Car(30000);
		
		TreeSet<Car> t = new TreeSet<Car>();	
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car c : t)
		{
			System.out.println(c);
		}
	}
}
