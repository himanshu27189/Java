package Array;

import java.util.Scanner;

public class MarksArray {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Enter the size for the array");
	int size = s.nextInt();
	double marks[] = new double[size];
	
	for(int i=0; i<=size-1;i++)
	{
		System.out.println("Enter the marks for subjects");
		marks[i] = s.nextDouble();
	}
	
	System.out.println("Marks of the subjects are as follows");
	for(int i=0; i<=size-1;i++)
	{
		System.out.println(marks[i]);
	}
}
}
