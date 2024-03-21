package meraprogramming;

public class typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 100;
		int b = a;
		float c = 20000.2444f;
		double d = c;
		char e = 'B';
		int f = e;
		char g = (char) f;
		System.out.println("   Byte's initial value          "+a);
		System.out.println(a+"(byte) converted to int:      "+b);
		System.out.println("   Float's initial value:        "+c);
		System.out.println(c+"(float) converted to double : "+d);
		System.out.println("   Char's initial value :        "+e);
		System.out.println(e+"(Char) coverted to int :      "+f);
		System.out.println(f+" (int) coverted to char :      "+g);
	}

}
