package Practice;

import java.util.Scanner;

public class Calculator {
	public static double add(double num1, double num2)
	{
		return num1+num2;
	}
	public static double subtract(double num1, double num2)
	{
		return num1-num2;
	}
	public static double multiplication(double num1, double num2)
	{
		return num1*num2;
	}
	public static double division(double num1, double num2)
	{
		if(num2!=0)
		{
			return num1/num2;
		}
		else
		{
			System.err.println("Error! can not divide by 0.");
			return Double.NaN;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number:");
		double num2 = sc.nextDouble();
		
		double sum = add(num1, num2);
		double subtract = subtract(num1, num2);
		double multiplication = multiplication(num1, num2);
		double division = division(num1, num2);
		
		System.out.println("Sum is "+sum);
		System.out.println("Difference is "+ subtract);
		System.out.println("Multiplication is "+ multiplication);
		System.out.println("Division is "+ division);
		
	}
}
