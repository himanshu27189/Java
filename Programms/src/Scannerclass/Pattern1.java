package Scannerclass;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
	
		for(int i =1; i<=n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if (i==n || i== 1 || i+j==n+1 || j == n || j == 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
