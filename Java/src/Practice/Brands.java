package Practice;

public class Brands implements Electronics {
	@Override
	public void products()
	{
		System.out.println("All the products are displayed");
	}
	@Override 
	public void mobile()
	{
		System.out.println("All the mobiles are displayed");
	}
}
