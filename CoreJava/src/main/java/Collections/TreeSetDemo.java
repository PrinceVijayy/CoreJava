package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		//ts.add(null); these are not allowed
		ts.add("Ojas");
		ts.add("Oja");
//		ts.add(25);   There should be only integers or strings
//		ts.add(100);
		System.out.println("TreeSet Elements are :"+ts);
		

	}

}
