package Array;

import java.util.Scanner;

public class CricketTeam {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many players you want in your team?");
		int size = s.nextInt();
		
		String player [] = new String[size];
		
		for(int i =0; i<=size-1; i++)
		{
			System.out.println("Enter name of the player");
			player [i] = s.next();
		}
		System.out.println("Your selected team is below");
		System.out.println("**********");
		for(int i=0 ; i<=size-1;i++)
		{
			System.out.println(player[i]);
		}
	}
}
