package Collection;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<Double> car = new ArrayList();
		
		car.add(10.0);
		car.add(20.20);
		car.add(0.22);
		car.add(00.00);
		car.add(1.1);
		
		for(int i = 0 ; i<= car.size()-1;i++)
		{
			System.out.println(i);
		}
		
		for(Double d: car)
		{
			System.out.println(d);
		}
	}
}
