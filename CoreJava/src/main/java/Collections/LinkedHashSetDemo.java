package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		LinkedHashSet ls=new LinkedHashSet();
		lhs.add(10);
		lhs.add(10);
		lhs.add("Ojas");
		lhs.add(null);
		lhs.add(true);
		lhs.add(false);
		System.out.println("The LinkedHashSet are" + lhs);
		System.out.println(ls.clone());
		System.out.println(ls);
		System.out.println(lhs.contains(null));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(null));
		System.out.println(lhs);
		System.out.println(lhs.hashCode());
		System.out.println(lhs);
	
	}

}
