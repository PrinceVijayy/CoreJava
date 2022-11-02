package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(null);
		s.add(10);
		s.add(250);
		s.add("Ojas");
		s.add(80);
		s.add(60);
		s.add(10);
		System.out.println("Stack Elements are :"+s);
		Stack s1=new Stack();
		s1.add(55);
		s1.add(65);
		System.out.println(s1);
		s1.add(s);
		System.out.println(s1);
		s1.remove(1);
		System.out.println(s1);
		s1.push(45);
		s1.push(99);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
	
	System.out.println(s1.peek());
	System.out.println(s1);
		
		
		

	}

}
