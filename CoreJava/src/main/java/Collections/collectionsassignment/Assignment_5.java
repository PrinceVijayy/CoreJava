package collectionsassignment;

import java.util.Scanner;
import java.util.Stack;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter course");
		String course1=s.next();
		String course2=s.next();
		String course3=s.next();
		Stack st=new Stack();
		st.push(course1);
		st.push(course2);
		st.push(course3);
		System.out.println("stack courses:"+st);
		st.remove(course2);
		System.out.println("stack after removing courses:"+st);

	}

}
