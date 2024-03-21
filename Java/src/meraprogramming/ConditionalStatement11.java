package meraprogramming;

public class ConditionalStatement11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b= 5, c =0,ch =7;
		switch(ch)
		{
		case 1 : c = a+b;
				System.out.println("Addition of a and b is "+ c);
				break;
		case 2 : c = a-b;
				System.out.println("Substraction of a and b is "+ c);
				break;
		case 3 : c = a*b;
				System.out.println("Multiplication of a and b is "+ c);
				break;
		case 4 : c = a/b;
				System.out.println("Division of a and b is "+ c);
				break;
		case 5 : c = a%b;
				System.out.println("Modulous of a and b is "+ c);
				break;
		default:
				System.err.println("No operation can be performed");
		}
		
	}

}
