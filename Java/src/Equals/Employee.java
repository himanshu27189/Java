package Equals;

public class Employee {
	int id;
	double sal;
	
	public Employee(int id, double sal) {
		this.id= id;
		this.sal= sal;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee e = (Employee) obj;
		return this.id == e.id || this.sal == e.sal;
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(12,20000);
		Employee e2 = new Employee(13,20000);
		System.out.println(e1.equals(e2));
	}
}
