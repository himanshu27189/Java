package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		/*for(int i = 0 ; i<= l.size() ; i++)
		{
			System.out.println("Enter the values");
			l.add(s);
		}*/
		l.add(10);
		l.add(10);
		l.add(2);
		l.add(null);
		l.add("Hi");
		l.add('j');
		l.add(22.22);
		l.add("Mine");
		l.add('K');
		l.add(11);
		System.out.println("Size of the array list is ("+ l.size() +")");
		System.out.println(l);
		l.add("kill");
		System.out.println("After adding (" + l.get(11) + ") size of the array list is ("+ l.size() +")");
		
	}

}
