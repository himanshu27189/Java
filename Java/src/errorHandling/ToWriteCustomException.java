package errorHandling;

import java.util.Scanner;

public class ToWriteCustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		
		int pass = sc.nextInt();
		if(pass==123)
		{
			System.out.println("Login Done");
		}
		else {
			try {
				throw new IncorrectPassword("You have entered wrong password");
			}
			catch(IncorrectPassword e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
