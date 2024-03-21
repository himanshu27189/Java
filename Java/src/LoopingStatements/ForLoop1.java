package LoopingStatements;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for the table");
		int j= sc.nextInt();
		for (i=1;i<=10;i++)
		{
			System.out.println(j+" * "+i+" = "+j*i);
		}
		}
		

}
