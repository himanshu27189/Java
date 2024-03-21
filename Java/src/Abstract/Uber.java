package Abstract;

public class Uber extends Taxi 
{
	@Override
void starttrip()
{
	System.out.println("Starting trip with Uber");
}
@Override
	void endtrip()
{
	System.out.println("Ending trip with Uber");
}
}
