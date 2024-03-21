package Scannerclass;

import java.util.Scanner;

public class EvenReverse {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int f1 = s.nextInt();
		
		System.out.println("Enter second number:");
		int f2 = s.nextInt();
		
		for (int i = f2; i>=f1; i--)
		{
			if(i%2==0) 
			{
			System.out.println(i);
			}
		}
	}
}
