package Collection;

import java.util.TreeSet;

public class Car {
	//4 costs in tree set
	//use for each loop
	
	public static void main(String[] args) {
		TreeSet<Long> price = new TreeSet<Long>();
		
		price.add(300000L);
		price.add(4000000L);
		price.add(5000000L);
		price.add(7000000L);
		
		for(Long c: price)
		{
			System.out.println(c);
		}
	}
}
