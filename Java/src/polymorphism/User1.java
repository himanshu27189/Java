package polymorphism;

public class User1 {
// upcasting for your name and insta, father's name and insta, mother's name and insta
	public static void main(String[] args) {
		
	Instagram i1 = new Himansh();
	Instagram i2 = new Vishnu();
	Instagram i3 = new Seema();
	i1.login();
	i1.post();
	i1.story();
	i2.login();
	i2.post();
	i2.story();
	i3.login();
	i3.post();
	i3.story();
	
	}
}
