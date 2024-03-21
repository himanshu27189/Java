package Practice;

public class Ab1 {
public static void main(String[] args) {
	int a = 21;
	int b = 22;
	int c = 25;
	
	boolean d = a++ + b-- + --c > a++ - --b - ++c + b-- - --c - --a - --c;
	
	System.out.println(d);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
