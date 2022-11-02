package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(null);
		v.add(10);
		v.add("Ojas");
		v.add(20);
		v.add(true);
		System.out.println(v);
		System.out.println(v.get(2));
		System.out.println(v.elementAt(4));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

	}

}
