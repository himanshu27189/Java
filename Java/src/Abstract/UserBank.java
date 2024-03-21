package Abstract;

public class UserBank {
// have main method achieve upcasting for all the classes and call all 4 methods with different references.
public static void main(String[] args) {
	Bank icici = new ICICI();
	Bank sbi = new SBI();
	Bank syndicate = new Syndicate();
	Bank canera = new Canera();
	icici.payment();
	icici.loan();
	icici.fd();
	icici.support();
	sbi.payment();
	sbi.loan();
	sbi.fd();
	sbi.support();
	syndicate.payment();
	syndicate.loan();
	syndicate.fd();
	syndicate.support();
	canera.payment();
	canera.loan();
	canera.fd();
	canera.support();
}
}
