package Collection;

import java.util.ArrayList;

public class Employee {
	//store employee salaries using array list
	//fetch it using for loop and for each loop
	
	public static void main(String[] args) {
		ArrayList<Double> salary = new ArrayList<Double>();
		
		salary.add(20000.0);
		salary.add(30000.0);
		salary.add(40000.0);
		salary.add(50000.0);
		
		for(int i = 0 ; i<=salary.size()-1;i++)
		{
			System.out.println(salary.get(i));
		}
		
	}
}
