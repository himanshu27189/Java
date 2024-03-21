package Inhertnce;

public class Karnataka extends Bharat {
	String cm="DK";
	public static void main(String[] args) {
		
		Bharat b = new Karnataka(); //Upcasting
		
		Karnataka k = (Karnataka) b; // Downcasting
		
		System.out.println(k.pm);
		System.out.println(k.cm);
	}
}
