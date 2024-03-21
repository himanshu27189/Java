package Abstract;

import java.util.Scanner;

public class User1 extends Insta {

	@Override
public void login() {
		int name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username");
		name = s.nextInt();
		if(name == 10) 
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login failed");
		}
}
@Override
public void logout() {
	System.out.println("Logout successful");
}
}
