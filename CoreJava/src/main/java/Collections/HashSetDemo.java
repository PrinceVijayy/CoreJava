package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(21);
		hs.add("Ojas");
		hs.add('a');
		hs.add(true);
		hs.add(21);
		hs.add(5);
		hs.add(null);
		System.out.println("HashSet Elements are :"+hs);
		System.out.println(hs.contains("Ojas"));
		System.out.println(hs.contains("you"));
		System.out.println(hs.remove(5));
		System.out.println("elements "+hs);
		System.out.println(hs.size());
		HashSet hs1=new HashSet();
		hs1.add(100);
		hs1.add(200);
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
		System.out.println(hs1.containsAll(hs));
		System.out.println(hs1.isEmpty());
		//hs.clear();
		System.out.println(hs);
		System.out.println(hs1);
		//hs1.clear();
		System.out.println(hs1);
		System.out.println(hs);
		System.out.println(hs1.containsAll(hs));
		System.out.println(hs1.iterator());
		Iterator Itr=hs1.iterator();
		while(Itr.hasNext()){
			System.out.println(Itr.next());
		}
		
		

	}

}
