package Scannerclass;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int f1 = s.nextInt();
		
		System.out.println("Enter second number:");
		int f2 = s.nextInt();
		
		System.out.println("Prime numbers between "+ f1 +" and "+ f2 +" are");
		for(int i =f1;i<=f2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
				if(count == 2)
				{
					System.out.print(i+", ");
				}		
		}
	}
}
