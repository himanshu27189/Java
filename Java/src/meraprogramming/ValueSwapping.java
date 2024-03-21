package meraprogramming;
import java.util.*;
public class ValueSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = sc1.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc1.nextInt();
		//int num1 = 20;
		//int num2 = 10;
		System.out.println("a "+num1+" "+"b "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("----After swapping----");
		System.out.println("a "+num1+" "+"b "+num2);
	}

}
