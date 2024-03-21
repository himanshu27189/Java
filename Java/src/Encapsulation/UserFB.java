package Encapsulation;

public class UserFB {
	public static void main(String[] args) {
		Facebook f = new Facebook();
		
		f.setmobno(738492389);
		System.out.println(f.getmobno());
		
		f.setpassword("Hello 1234");
		System.out.println(f.getpassword());
		
		f.setemail("134234@gmail.com");
		System.out.println(f.getemail());
	}
}
