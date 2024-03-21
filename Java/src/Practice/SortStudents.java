package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class SortStudents {
//create 5 student objects store it inside treeset and sort by age and by percentage
	public static void main(String[] args) {
		Student sa1 = new Student(12);
		Student sa2 = new Student(15);
		Student sa3 = new Student(13);
		Student sa4 = new Student(14);
		Student sa5 = new Student(16);
		
		TreeSet<Student> age = new TreeSet<Student>();
		age.add(sa1);
		age.add(sa2);
		age.add(sa3);
		age.add(sa4);
		age.add(sa5);
		
		for(Student si : age)
		{
			System.out.println(si);
		}
	}
}
