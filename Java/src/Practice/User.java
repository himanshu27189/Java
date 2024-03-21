package Practice;

public class User {
	
	public static void main(String[] args) {
		Electronics e = new Brands();
		Electronics el = new Laptops();
		Clothing c = new Fashion();
		Clothing w = new Women();
		e.products();
		e.mobile();
		el.products();
		el.mobile();
		c.products();
		c.man();
		w.products();
		w.man();
	}
}
