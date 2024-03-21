package meraprogramming;

public class ConditionalStatement9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sal = 3000000l;
		int age = 16;
		if (age >= 18)
		{
			if( sal >= 300000)
			{
				System.out.println("Raju is eligible for credit card");
			}
			else
			{
				System.err.println("Raju is not eleigible for credit card");
			}
		}
		else
		{
			System.err.println("Raju's age is not 18 yet so he is not eligible for credit card");
		}
	}

}
