package Abstract;

public class UserShop {

public static void main(String[] args) {
	

	Shopping smy = new Myntra();
	Shopping sa = new Ajio();
	Shopping sme = new Mesho();

	smy.man();
	smy.woman();
	smy.buy();
	sa.man();
	sa.woman();
	sa.buy();
	sme.man();
	sme.woman();
	sme.buy();
	}
}