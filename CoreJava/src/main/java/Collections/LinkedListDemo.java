package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList  ls=new LinkedList();
		ls.add(null);
		ls.add(10);
		ls.add(30);
		ls.add("Ojas");
		ls.add(50);
		ls.add(10);
		System.out.println(ls);
		LinkedList ls1=new LinkedList();
		ls1.add(100);
		ls1.add(200);
		ls1.add(ls);
		System.out.println(ls1);
		ls1.addFirst(ls);
		System.out.println(ls1);

	}

}
