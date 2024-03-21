package Scannerclass;

import java.util.Scanner;

public class Prime {
	int  b;
	int i;
	void prime()
	{
		int count = 0;
		for(int j = 1; j<=i ;j++)
		{
			if(i%j == 0)
			{
				 count++;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int count = 0;
		
		Prime p = new Prime();
		for(int i= 1; i<=num;i++)
		{
					if(count == 2) 
					{	
						System.out.println(i);
					}
		}
	}
}
