package Inhertnce;

public class Son extends Father {
	@Override
	void bike()
	{
		String color = "Black";
		String mirror = "Round";
		String silencer = "dhug dhug dhug dhug";
		String horn="teeeeeee";
		System.out.println(color+" color");
		System.out.println(mirror+" mirrors");
		System.out.println(silencer);
		System.out.println(horn);
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
		
	}
}
