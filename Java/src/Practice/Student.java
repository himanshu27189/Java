package Practice;

import java.util.TreeSet;

import Sorting.Car;

public class Student implements Comparable<Student>{
//age and student percentage
	int sage;
	public Student(int sage)
	{
		this.sage= sage;
	}
	@Override
	public int compareTo(Student s) {
		return this.sage-s.sage;
	}
	@Override
	public String toString() {
		return "Age "+sage;
	}
		
	
}
