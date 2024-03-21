package Inhertnce;

public class DC extends UC{
	int b1=20;
	void sub()
	{
		System.out.println("Login failed");
	}
	public static void main(String[] args) {
		UC u = new DC(); // Upcasting
		DC d = (DC) u; // Downcasting
		System.out.println(d.a1);
		d.login();
		System.out.println(d.b1);
		d.sub();
	}
}
