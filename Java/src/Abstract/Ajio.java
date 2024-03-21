package Abstract;

public class Ajio implements Shopping {
// override all 3 methods
	@Override
	public void man() {
				System.out.println("SHop for man's cloth");
	}

	@Override
	public void woman() {
				System.out.println("Shop for women's cloth");
	}

	@Override
	public void buy() {
				System.out.println("Product bought");
}
}
