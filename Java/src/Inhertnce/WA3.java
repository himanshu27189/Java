package Inhertnce;

public class WA3 extends WA2 {
	@Override
	void message()
	{
		System.out.println("Single tick");
		System.out.println("double tick");
		System.out.println("Blue tick");
	}
	@Override
	void call()
	{
		System.out.println("voice message");
		System.out.println("Voice call");
		System.out.println("Video call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WA3 w = new WA3();
		w.message();
		w.call();
	}

}
