package String;

import java.util.Iterator;
import java.util.Scanner;

public class Cricketplayers {
// 3 attributes (pname, jno, hscore)
//	initialize with constructor and override tostring method and have a main method create 11 objects store it inside an array and fetch using for loop

	String pname;
	int jno;
	long hscore;
	
	public Cricketplayers(String pname, int jno, int hscore) {
		this.pname = pname;
		this.jno = jno;
		this.hscore = hscore;
	}
	public Cricketplayers(int jno)
	{
		this.jno= jno;
	}
	public Cricketplayers(long hscore)
	{
		this.hscore = hscore;
	}
	public String toString()
	{
		return "Player name is--> [" + pname + "] jersey no is--> [" + jno +"] highest score is--> [" + hscore + "] ";
	}
	public static void main(String[] args) {
		
		Cricketplayers c1 = new Cricketplayers(null,0,0);
		Cricketplayers c2 = new Cricketplayers("Gill",2,300);
		Cricketplayers c3 = new Cricketplayers("Kohli",3, 400);
		Cricketplayers c4 = new Cricketplayers("Rahul",4, 500);
		Cricketplayers c5 = new Cricketplayers("Shreyas",5, 600);
		Cricketplayers c6 = new Cricketplayers("Jadeja",6, 700);
		Cricketplayers c7 = new Cricketplayers("Surya",7, 800);
		Cricketplayers c8 = new Cricketplayers("Bumrah",8, 900);
		Cricketplayers c9 = new Cricketplayers("Kuldeep",9, 1000);
		Cricketplayers c10 = new Cricketplayers("Siraj",10, 1100);
		Cricketplayers c11 = new Cricketplayers("Shami",11, 1200);
				
		Cricketplayers []c = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11};
		for(int i=0; i<= c.length-1;i++) 
		{
			System.out.println(c[i]);
		}
		Cricketplayers team[] = null;
		Scanner s = new Scanner(System.in);
		/* 
		for(int i =0 ; i<=11; i++)
		{
		System.out.println("Enter name, jersey no and highest score of the players");
		team = new Cricketplayers[i];
		Cricketplayers b = new Cricketplayers(null, 0, 0);
		} 
		*/
		
	
	}
	
}
