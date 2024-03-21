package Abstract;

public class ICICI extends Bank {
// override 4 methods
	@Override
	void payment()
	{
		System.out.print("ICICI BANK");
		System.out.println(" Payment done");
	}

	@Override
	void loan() {
		System.out.println("Loan processed");
		
	}

	@Override
	void fd() {
		System.out.println("Fixed deposit is done");
		
	}

	@Override
	void support() {
		System.out.println("Call 9232837838 for support");
		
	}
}
