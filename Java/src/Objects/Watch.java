package Objects;
	
public class Watch {
	static double price=10000;
	String brand;
	
	static void start()
	{
		System.out.println("Start");
	}
	void stop()
	{
		System.out.println("Stop");
	}
	static
	{
		System.out.println("Welcome to watch store");
	}
	{
		System.out.println("I am buying the watch");
	}
	Watch (String brand)
	{
		this.brand=brand;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Watch.price);
		Watch.start();
		Watch w = new Watch("Rolex");
		System.out.println(w.brand);
		w.stop();
	}

}
