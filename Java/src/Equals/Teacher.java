package Equals;

public class Teacher {
	double sal;
	String sub;
	
	Teacher(double sal, String sub)
	{
		this.sal= sal;
		this.sub= sub;
	}
	@Override
	public boolean equals(Object obj)
	{
		Teacher t = (Teacher) obj;
		return this.sal == t.sal && this.sub.equals(t.sub);
	}
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher(20000,"kim");
		Teacher t2 = new Teacher(30000,"tim");
		Teacher t3 = new Teacher(20000,"kim");
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		System.out.println(t3.equals(t2));
	}
	
}
