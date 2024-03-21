package String;

public class Employee {

	String ename;
	double sal;
	int age;
	int id;
	
	Employee(String ename, double sal, int age, int id)
	{
		this.ename= ename;
		this.sal = sal;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return "Salary of (" + ename + ") is (" + sal + ") age is---> (" + age + ") and id is---> " + id;
	}
	public static void main(String[] args) {
		Employee e = new Employee("Ayan",2000000, 22, 1);
		Employee f = new Employee("Himu",2000000, 32, 2);
		Employee g = new Employee("Mayank",2000000, 42, 3);
		Employee h = new Employee("Priya",2000000, 52, 4);
	
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
