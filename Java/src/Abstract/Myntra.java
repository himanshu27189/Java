package Abstract;

public class Myntra implements Shopping {

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
// override all three methods
	
}
