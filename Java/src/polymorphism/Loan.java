package polymorphism;

public class Loan {
	public static void main(String[] args) 
	{
		Bank b = new ICICI();
		b.roi();
		Bank v = new SBI();
		v.roi();
	}
}
