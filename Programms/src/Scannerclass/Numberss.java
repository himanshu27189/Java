package Scannerclass;

import java.util.Scanner;

public class Numberss {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n = sc.nextInt();
	
		System.out.println("Enter second number");
		int m = sc.nextInt();
		
			System.out.println("Second number is greater");
			System.out.println("System will print in reverse");
			for (int j = m; j>=n; j--)
			{
				System.out.println(j);
			}
		} 
		{
		System.out.println("Number from "+ n +" to "+ m +" are");
		
		for (int i = n; i<=m; i++)
		{
			System.out.println(i);
		}
		}
	}
}
