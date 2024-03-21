package Collection;

import java.util.Vector;

public class VectorInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.add(10);
		v.add(10);
		v.add(1);
		v.add(1.0);
		v.add(null);
		v.add("work");
		v.add('h');
		v.add("nine");
		v.add("give");
		v.add(10);
		System.out.println(v);
		System.out.println(v.size());
	}

}
