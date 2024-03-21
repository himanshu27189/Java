package Practice;

public class Fashion implements Clothing {
	@Override 
	public void products()
	{
		System.out.println("All the clothes are displayed");
	}
	@Override
	public void man()
	{
		System.out.println("All the men's cloths are displayed");
	}
}
