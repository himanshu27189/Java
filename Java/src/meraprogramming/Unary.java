package meraprogramming;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 32, b = 34 , c = 33;
		boolean d=((--c > ++a || --b > ++a)) && ((a++ + b-- > c-- + c++) && (++c + a++ > c--));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
