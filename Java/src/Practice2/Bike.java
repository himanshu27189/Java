package Practice2;

import Practice.Student;

public class Bike implements Comparable<Bike>{
// brand attribute override campare to method toString method and create 6 bike objects 
//	strore it inside treeset sort accordingly
	
	String brand;
	Bike(String brand)
	{
		this.brand = brand;
	}
	
	@Override 
	public String toString()
	{
		return "Brand name -> "+ brand;
	}
	
	@Override 
	public int compareTo(Bike b)
	{
		return this.brand. compareTo(b.brand);
	}
}
