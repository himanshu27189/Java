package meraprogramming;
import java.util.*;
public class AsciiAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner option= new Scanner(System.in);
	    System.out.println("Enter your option:"); 
	    System.out.println("1: Want to find ascii value of a character?");
	    System.out.println("2: Want to find charachter of a ascii value ?");
	    System.out.println("3: To print all the UPPERCASE ALPHABETS with their respective ASCII values");
	    System.out.println("4: To print all the LOWECASE ALPHABETS with their respective ASCII values");
	    System.out.println("5: To print all the numbers(0-9) with their respective ASCII values");
	    System.out.println("6: To print all the SPECIAL characters with their respective ASCII values");
	    int options= option.nextInt();
	    switch (options)
	    	{
	    		case 1:
	    		{
	    			System.out.println("You have chosen option 1");
	    			System.out.println("Enter a character!");
	    			char optionss= option.next().charAt(0);
	    			char a = optionss;
	    			int b = a;
	    			System.out.println("The ASCII value of character ("+a+") is-> "+b);
	    		}
	    		break;
	    		case 2:
	    		{
	    			System.out.println("You have chosen option 2");
	    			System.out.println("Enter a number between 32 and 122");
	    			int optionsss= option.nextInt();
	    			int c = optionsss;
	    			char d = (char)c;
	    			System.out.println("The ASCII character of ("+c+") is ---> "+d);
	    		}
	    		break;
	    		case 3:
	    		{	
	    			int i = 65;
	    			char j= (char)i;
	    			while(i<=90 && j<=90) 
	    		    {
	    				System.out.print(j+++"  --->");
	    				System.out.println(" "+i++);
	    		    }
	    		}
	    	    break;
	    		case 4:
	    		{	
	    			int i = 97;
	    			char j= (char)i;
	    			while(i<=122 && j<=122) 
	    		    {
	    				System.out.print(j+++"  --->");
	    				System.out.println(" "+i++);
	    		    }
	    		}
	    		break;
	    		case 5:
	    		{	
	    			int i = 48;
	    			char j= (char)i;
	    			while(i<=57 && j<=57) 
	    		    {
	    				System.out.print(j+++"  --->");
	    				System.out.println(" "+i++);
	    		    }
	    		}
	    		break;
	    		case 6:
	    		{	
	    			int i = 32;
	    			char j= (char)i;
	    			while(i<=47 && j<=47) 
	    		    {
	    				System.out.print(j+++"  --->");
	    				System.out.println(" "+i++);
	    		    }
	    			int k = 58;
	    			char l= (char)k;
	    			while(k<=64 && l<=64) 
	    		    {
	    				System.out.print(l+++"  --->");
	    				System.out.println(" "+k++);
	    		    }
	    			int m = 91;
	    			char n= (char)m;
	    			while(m<=96 && n<=96) 
	    		    {
	    				System.out.print(n+++"  --->");
	    				System.out.println(" "+m++);
	    		    }
	    		}
	    		break;
	    	}
	
	}
}
