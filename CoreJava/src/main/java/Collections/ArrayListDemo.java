package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(null);
		al.add(50);
		al.add(false);
		al.add("Ojas");
		al.add(50);
		al.add(60);
		System.out.println("The ArrayList Elements are :"+al);
		System.out.println(al.contains(null));		
        ArrayList a2=new ArrayList();
        a2.add(90);
        a2.add(200);
        System.out.println(a2);
       // al.add(3,a2);
        //.System.out.println(al);
        System.out.println("after adding a2 in a1");
        al.addAll(a2);
        System.out.println(al);
        Iterator It=a2.iterator(); 
        while(It.hasNext()){
        	System.out.println(It.next());
        }
	}

}
